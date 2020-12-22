package searchbooks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Group 1
 */
public class SearchController {
    //a search option(genre or tiltle)
    private String searchBy;
    
    //a search query from the user
    private String query;
    
    //instance varibale of book catalogue that is connected to the database
    private final BookCatalogue catalogue;

    public String getSearchBy() {
        return searchBy;
    }
    //contructor that initialiases catalogue
    public SearchController(BookCatalogue cataloque) {
        this.catalogue = cataloque;
    }

    public void setSearchBy(String searchBy) {
        this.searchBy = searchBy;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    /**
     * returns the search results as JSON
     * @return 
     */
    
    public String displaySearchResults() {
        List<Book> results = executeSearchQuery();
        //logic  code to format results here
        return results.toString();
    }
    
    /**
     * executes the search of book(s) according the user query and the search mode(title or genre)
     * @return a list of books or null if no results is found.
     */
    public List<Book> executeSearchQuery() {

        switch (this.searchBy) {
            case "title":
                return catalogue.findByTitle(query);
            case "genre":
                return catalogue.findByGenre(query);
            case "ISBN":
                return catalogue.findByISBN(query);
            default:
                return new ArrayList<>();
        }
    }
}
