package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context con = new Context();
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter an operation (add/sub/multiply): ");
        String op = sc.next();

        if (op.equals("add")){
            con.setStrategy(new Add());
        } else if(op.equals("sub")){
            con.setStrategy(new Sub());
        } else if(op.equals("multiply")){
            con.setStrategy(new Multiply());
        }
        int result = con.executeStrategy(a, b);
        System.out.println(result);
    }
}
