package lexicon.fundamentals.oop;

import java.util.ArrayList;

public class Author {

    private String authorName;
    private ArrayList<Book> books=new ArrayList<>();

    public Author(String authorName){
        this.authorName=authorName;


    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public String getAuthorName(){
        return authorName;
    }


}
