package classes;

import java.util.Scanner;

class Main{
    public static final void main(String[] args){
        Scanner in = new Scanner (System.in);
        //System.out.println("Hello world!");
        Student Vasya = new Student("Vasya",20,"ИП-325");
        Teacher Ruban = new Teacher("Рубан",50,"Сложна");
        System.out.println("Student:");
        System.out.println(Vasya.getName());
        System.out.println(Vasya.getAge());
        System.out.println(Vasya.getGroup());
        Vasya.setGroup("ИП-320");
        Vasya.setAge(21);
        Vasya.setName("Вася");
        System.out.println(Vasya.getName());
        System.out.println(Vasya.getAge());
        System.out.println(Vasya.getGroup());
        System.out.println("Teacher:");
        System.out.println(Ruban.getName());
        System.out.println(Ruban.getAge());
        System.out.println(Ruban.getSubject());
        Ruban.setSubject("Алгоритмы алгоритмов");
        Ruban.setAge(49);
        Ruban.setName("Рубан Анатолий Альбертович");
        System.out.println(Ruban.getName());
        System.out.println(Ruban.getAge());
        System.out.println(Ruban.getSubject());
    }
}