package chapter03_rework6yue8;

public class Managers extends Employees{
	   private String garder;

       public String getGarderString() {
               return garder;
       }

       public void setGarderString(String garder) {
               this.garder = garder;
       }
       public float  changeSalary() {
       float changeSalary= getWorkSalary()*1.2f;
        return changeSalary;
       
       
}

}
