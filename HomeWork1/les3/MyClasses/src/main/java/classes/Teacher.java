package classes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teacher extends User implements CSV {
    private String subject;
    public Teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String getSubject() { return subject;}
    public void setSubject(String subject) { this.subject = subject;}

    @Override
    public String toCSV() throws Exception {
        try(FileWriter fw = new FileWriter("/home/nastya/Рабочий стол/Javalesons/les3/MyClasses/src/main/resources/teachers.csv")){
            String str =this.getName()+";"+this.getAge().toString()+";"+this.subject;
            fw.write(str);
            fw.close();
            //System.out.println(str);
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void fromCSV(String file) {
        try(FileReader fr = new FileReader(file)) {
            Scanner in = new Scanner(fr);
            String str = in.nextLine();
           // System.out.println(str);
            String fields[] = str.split(";");
            //System.out.println(fields[0]);
            //System.out.println(Integer.parseInt(fields[1]));
            //System.out.println(fields[2]);
            this.setName(fields[0]);
            this.setAge(Integer.parseInt(fields[1]));
            this.setSubject(fields[2]);
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
