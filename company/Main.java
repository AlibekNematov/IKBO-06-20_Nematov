package com.company;
import java.util.Scanner;

public class Main extends Person{
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
        Scanner in = new Scanner(System.in);
            System.out.println("Введите ваше имя: ");
        name = in.nextLine();
        setName(name);
        if (setName(name)==false){
            System.out.print("Имя не введено");
            return;
        }
            System.out.println("Введите ваш рост: ");
        height = in.nextInt();
        setHeight(height);
        if(setHeight(height)==false) {
            System.out.print("Рост не введен, либо указан не в пределе от 45 до 250см");
            return;
        }
            System.out.println("Введите ваш возраст: ");
        age = in.nextInt();
        setAge(age);
        if(setAge(age)==false){
            System.out.print("возраст не введен, либо указан не в пределе от 0 до 160");
            return;
        }

            System.out.println("Ваше имя: " + getName());
            System.out.println("Ваш рост: " + getHeight());
            System.out.println("Ваш возраст: " + getAge());
    }
}