package main.java.com.example;

public class Employee extends Person {
    private String position;
    private String id;

    public Employee(String position, String id, int age, String sex, double height, String name, double weight) {
        super(age, sex, height, name, weight);
        this.position = position;
        this.id = id;
    }

    public String getposition() {
        return this.position;
    }

    public String getid() {
        return this.id;
    }

    public void setposition(String newposition) {
        this.position = newposition;
    }

    public void setid(String newid) {
        this.id = newid;
    }

}
