package package_CollectionAndMap.Collection.Set.TreeSet;

public class Student1 {
    private final String id;
    private final String name;

    public Student1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Student1 stu = (Student1) obj;
        return this.name.equals(stu.name);


    }

    @Override
    public String toString() {
        return "Student1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

