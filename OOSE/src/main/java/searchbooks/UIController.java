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

    private String textInput;
    private final SearchController searchController;
    private boolean searchByGenre;

    public UIController(SearchController searchController) {
        this.searchController = searchController;
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

    public String diplayResult() {
        // Display results logic here
        if (this.inputValidation()) {
            this.searchController.setQuery(textInput);
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
        return this.textInput != null && this.textInput.length() > 1;
    }

    /**
     * @return formatted message to display on the UI
     */
    public String displayMessage() {
        return new String();
    }

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

}
