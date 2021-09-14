package com.company;

public class Book {
    private String  name;
    private String genre;
    private String author;

    public Book()
    {
        name = "Unknown";
        author = "Unknown";
        genre = "Unknown";
    }

    public Book (String n)
    {
        name = n;
        author = "Unknown";
        genre = "Unknown";
    }

    public Book (String n, String a)
    {
        name = n;
        author = a;
        genre = "Unknown";
    }

    public Book (String n, String a, String g)
    {
        name = n;
        author = a;
        genre = g;
    }

    public String getName(String name)
    {
        return name;
    }

    public String setName(String name)
    {
        return this.name = name;
    }

    public String getAuthor(String author)
    {
        return author;
    }

    public String setAuthor(String author)
    {
        return this.author = author;
    }

    public String getGenre(String genre)
    {
        return genre;
    }

    public String setGenre(String genre)
    {
        return this.genre = genre;
    }

    public String toString()
    {
        return "Name of book - " + this.name + ", genre is: " + this.genre + ", author of book is - " + this.author;
    }

    public void choice()
    {
        if (genre == "roman" || genre == "detective")
            System.out.println("I like this genre!)");
        else
            System.out.println("I don't like this genre!(");
    }

}
