package calc;

import java.util.Scanner;

class Calc{
    public static final void main(String[] args){
        //Scanner in = new Scanner (System.in);
        //System.out.println("Hello world!");
        Integer a = new Integer(0);
        Integer b = new Integer(0);
        String op = new String();
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        op = in.next();
        switch(op){
            case "+": {
                System.out.println(a+b);
            }break;
            case "-": {
                System.out.println(a-b);
            }break;
            case "*": {
                System.out.println(a*b);
            }break;
            case "/": {
                if(b==0) System.out.println("b can't have a value of zero");
                else System.out.println(a/b);
            }break;
            default: {
                System.out.print("The calculator does not have an operation: ");
                System.out.println(op);
            }
        }
    }
}