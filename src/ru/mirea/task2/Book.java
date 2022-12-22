package ru.mirea.task2;

public class Book {
    private String author;
    private String title;
    private int pages;
    public Book(){
        author=null;
        title=null;
        pages=0;
    }
    public Book(String author){
        this();
        this.author=author;
    }
    public Book(String author,String title){
        this(author);
        this.title=title;
    }
    public Book(String author,String title, int pages){
        this(author,title);
        this.pages=pages;
    }
    @Override
    public String toString(){
        return "Автор: "+author+"Название: "+title+"Количество страниц: "+pages;
    }

}