package lexicon.fundamentals.oop;

public class Book {
    private String bookName;
    private Author author;
    public Book(String bookName, Author author){
        this.bookName =bookName;
        this.author=author;

    }
    public String getBookName(){
        return bookName;
    }
    public Author getAuthorName(){
        return author;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setAuthorName(Author author){
        this.author=author;
    }







}
