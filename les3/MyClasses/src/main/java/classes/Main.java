package classes;

import java.util.Scanner;

class Main{
    public static final void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        //System.out.println("Hello world!");
        Student Vasya = new Student("Vasya",20,"ИП-325");
        Student Petya = new Student("Петя",29,"ИП-325");
        Teacher Ruban = new Teacher("Рубан",50,"Сложна");
        System.out.println("Student:");
        System.out.println(Vasya.getName());
        System.out.println(Vasya.getAge());
        System.out.println(Vasya.getGroup());
        System.out.println("fromCVS");
        Vasya.fromCSV("/home/nastya/Рабочий стол/Javalesons/les3/MyClasses/src/main/resources/students.csv");
        System.out.println(Vasya.getName());
        System.out.println(Vasya.getAge());
        System.out.println(Vasya.getGroup());

        System.out.println("toCVS");
        Petya.toCSV();
        System.out.println(Petya.getName());
        System.out.println(Petya.getAge());
        System.out.println(Petya.getGroup());

        System.out.println("Teacher:");
        System.out.println(Ruban.getName());
        System.out.println(Ruban.getAge());
        System.out.println(Ruban.getSubject());
        Ruban.fromCSV("/home/nastya/Рабочий стол/Javalesons/les3/MyClasses/src/main/resources/teachers.csv");
        System.out.println("fromCVS");
        System.out.println(Ruban.getName());
        System.out.println(Ruban.getAge());
        System.out.println(Ruban.getSubject());

        Ruban.setSubject("Алгоритмы алгоритмов");
        Ruban.setAge(49);
        Ruban.setName("Рубан Анатолий Альбертович");

        System.out.println("toCVS");
        Ruban.toCSV();
        System.out.println(Ruban.getName());
        System.out.println(Ruban.getAge());
        System.out.println(Ruban.getSubject());

    }
}