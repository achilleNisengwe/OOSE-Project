
package group1.oose.searchbooks;

/**
 *
 * @author Group1
 */
public class Book {
    private String ISBN;
    private String title;
    private String genre;
    private String author;
    private boolean price;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }
   
    
    
}
