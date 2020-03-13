package classes;

public class Teacher extends User {
    private String subject;
    public Teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String getSubject() { return subject;}
    public void setSubject(String subject) { this.subject = subject;}
}
