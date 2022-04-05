package proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The dog likes names that start with C");
        System.out.println("Enter your name: ");
        String name = sc.next();
        Dog a = new ProxyDog(name);
        a.play();
    }
}
