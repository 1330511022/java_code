package package_CollectionAndMap.HomeWork;

public class Student {
    private String name;
    private String age;


    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        Student student =(Student) obj;
        return this.name.equals(student.name)&&this.age.equals(student.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
