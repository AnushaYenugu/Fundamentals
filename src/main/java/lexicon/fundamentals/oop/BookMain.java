package lexicon.fundamentals.oop;

public class BookMain {
    public static void main(String[] args) {
        Author[] authors = new Author[2];

        // create danbrown author and assign to authors[0]
        String authorName = "Dan Brown";
        Author danbrown = new Author(authorName);

        Book AD = new Book("Angels and Demons", danbrown);
        Book danvanciecode = new Book("Danvancie code", danbrown);

        danbrown.addBook(AD);
        danbrown.addBook(danvanciecode);

        for (Book book : danbrown.getBooks()) {
            System.out.println(book.getBookName());
        }
        authors[0] = danbrown;

        // create aynrand author and assign it to authors[1]
        Author ashwin = new Author("Ashwin");
        Book ram = new Book("Ram", ashwin);
        Book sita = new Book("Sita", ashwin);
        ashwin.addBook(ram);
        ashwin.addBook(sita);

        for (Book book : ashwin.getBooks()) {
            System.out.println(book.getBookName());
        }

        authors[1] = ashwin;

        for (int i = 0; i < authors.length; i++) {
            for (int j = 0; j < authors[i].getBooks().size(); j++)
                if (authors[i].getBooks().get(j).getBookName().equals("Angels and Demons")) {
                    String result = authors[i].getAuthorName();
                    System.out.println("Author is " + "" + result);
                    break;
                }

        }

        /* Rajesh code
        String input = "Angels and Demons";
        String resultAuthor = Arrays.stream(authors).map(author -> author.getBooks().stream().filter(book -> book.getBookName().equals(input)).findFirst().get().getAuthorName()).findFirst().get().getAuthorName();
        System.out.println("hi " + resultAuthor); */
    }


}