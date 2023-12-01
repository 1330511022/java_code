package exceptionpackage;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] score = {10, 30, 22, 50};
        try {
            sumScore(score);
            System.out.println("成绩为:" + sumScore(score));
        } catch (NotCorrectScoreException e) {
            System.out.println(e.getMessage());
        }
    }

    static int sumScore(int  [] score) throws NotCorrectScoreException {
        int sum = 0;
        for (int n : score) {
            sum += n;
        }
        if (sum != 100) {
            throw new NotCorrectScoreException("试卷总分不是100分！");
        }
        return sum;
    }
}

class NotCorrectScoreException extends Exception {
    private final String message;

    public NotCorrectScoreException(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return this.message;
    }
}
