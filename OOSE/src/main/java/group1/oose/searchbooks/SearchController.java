package group1.oose.searchbooks;

import java.util.List;

/**
 *
 * @author Group 1
 */
public class SearchController {

    private String searchBy;
    private String query;
    private final BookCatalogue catalogue;

    public String getSearchBy() {
        return searchBy;
    }

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

    public String displaySearchResults() {
        List<Book> results = executeSearchQuery();
        // code to format results
        return results.toString();
    }

    public List<Book> executeSearchQuery() {

        switch (this.searchBy) {
            case "title":
                return catalogue.findByTitle(query);
            case "genre":
                return catalogue.findByGenre(query);
            case "ISBN":
                return catalogue.findByISBN(query);
            default:
                return null;
        }
    }
}
