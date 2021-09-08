package com.company;
import java.util.Scanner;

public class Main {
   public static class Human {
       private static String name;
       private static  int height;
       private static  int age;

       public Human(int h, String n) {
           int height = h;
           String name = n;
       }

       public static void setHuman() {
           Scanner in = new Scanner(System.in);
           System.out.println("Введите имя: ");
           name = in.nextLine();
           System.out.println("Введите рост: ");
           height = in.nextInt();
           System.out.println("Введите возраст: ");
           age = in.nextInt();
           if (age <= 0) {
               System.out.println("Неправильный возраст");
           }
           else
           {
               System.out.println("Ваше имя: " + name);
               System.out.println("Ваш возраст: " + age);
               System.out.println("Ваш рост: " + height);
           }
       }
   }
    public static void main(String[] args) {
   Human.setHuman();
    }
}
