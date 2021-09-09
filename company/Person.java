package com.company;
import java.util.Scanner;
public class Person {
   public static String  name;
   public static int age;
   public static int height;

    public Person(){}

   public static String getName(){
       return name;
    }

    public static boolean setName(String name){
        if(name == ""){
            return false;
        }
        return true;
    }

    public static int getHeight(){
        return height;
    }

    public static boolean setHeight(int height){
        if (height > 250 || height <= 45)
            return false;
        return true;
    }

    public static int getAge(){
        return age;
    }

    public static boolean setAge(int age){
        if (age > 160 || age <=0)
            return false;
        return true;
    }

    
    public enum Gender {
        Male(1, "Мужчина"),
        Female(2, "Женщина"),
        Helicopter(8, "Вертолетик");

        private int value;
        private String strvalue;

        private Gender(int value, String strvalue) {
            this.value = value;
            this.strvalue = strvalue;
        }
        int getValue() {
            return value;
        }

            String getStrvalue() {
            return strvalue;
            }
        }
}
