package classes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Student extends User implements CSV {
   private String group;
    public Student(String name, Integer age, String group) {
        super(name, age);
        this.group = group;
    }
    public String getGroup() { return group;}
    public void setGroup(String group) { this.group = group;}

    @Override
    public String toCSV()  {
        //FileWriter fw = null;
            try(FileWriter fw = new FileWriter("/home/nastya/Рабочий стол/Javalesons/les3/MyClasses/src/main/resources/students.csv")){
                String str =this.getName()+";"+this.getAge().toString()+";"+this.group;
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
            //System.out.println(str);
            String fields[] = str.split(";");
            //System.out.println(fields[0]);
            //System.out.println(Integer.parseInt(fields[1]));
            //System.out.println(fields[2]);
            this.setName(fields[0]);
            this.setAge(Integer.parseInt(fields[1]));
            this.setGroup(fields[2]);
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
