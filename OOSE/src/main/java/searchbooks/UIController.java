/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchbooks;

/**
 *
 * @author achil
 */
public class UIController {
    //user input text
    private String searchQuery;
    
    //search contoller instance variable
    private final SearchController searchController;
    
    //search mode false => search by title, true => search by genre
    private boolean searchByGenre;

    //contructor that initialise the search controller
    public UIController(SearchController searchController) {
        this.searchController = searchController;
        //search by tilte by default.
        this.searchByGenre = false;
    }

    public void setSearchByGenre(boolean searchByGenre) {
        this.searchByGenre = searchByGenre;
    }

    public SearchController getSearchController() {
        return searchController;
    }

    public boolean isSearchByGenre() {
        return searchByGenre;
    } 

    /**
     * Validates the input then calls the appropriate search function
     * according the value of searchByGenre
     * @return a textual result according the type of UI (ex: html) 
     */
    public String diplayResult() {
        // Display results logic here
        if (this.inputValidation()) {
            this.searchController.setQuery(searchQuery);
            if (this.searchByGenre) {
                this.searchController.setSearchBy("genre");
            } else {
                this.searchController.setSearchBy("title");
            }
            return this.searchController.displaySearchResults();
        } else {
            return new String();
        }
    }

    /**
     *
     * @return true if the input is valid otherwise returns false
     */
    public boolean inputValidation() {
        //input validation logic
        return this.searchQuery != null && this.searchQuery.length() > 1;
    }

    /**
     * formats the message and display it on the UI
     */
    public void displayMessage() {
        
        String message = diplayResult();
        // logic code to diplay the message here
        
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

}
