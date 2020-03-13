package classes;

public class Student extends User {
   private String group;
    public Student(String name, Integer age, String group) {
        super(name, age);
        this.group = group;
    }
    public String getGroup() { return group;}
    public void setGroup(String group) { this.group = group;}
}
