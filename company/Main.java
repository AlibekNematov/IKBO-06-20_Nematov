package com.company;

public class Main extends Book {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Война и Мир");
        Book b3 = new Book("Бедная Лиза", "Карамзин Николай Михайлович");
        Book b4 = new Book("Убийство в восточном экспрессе", "Агата Кристи", "detective");

        b1.setName("Мастер и Маргарита");
        b1.setAuthor("Михаил Булгаков");
        b1.setGenre("roman");
        b2.setAuthor("Лев Толстой");
        b2.setGenre("russian classic");
        b3.setGenre("novella");

        System.out.println(b1);
        b1.choice();
        System.out.println(b2);
        b2.choice();
        System.out.println(b3);
        b3.choice();
        System.out.println(b4);
        b4.choice();
    }
}
