/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchbooks;

import java.util.List;

/**
 *
 * @author Group1
 */
public class BookCatalogue {

    //database connection instance varibale
    private Object connection;

    /**
     * Connect to the database represented by the URL parameter
     *
     * @param url
     */
    public void dataSourceConnection(String url) {
        //logic to connect to the database supplied by url
        this.connection = url;
    }

    /**
     * returns a list of books or null if no book is found
     *
     * @param query
     * @return List
     */
    public List<Book> findByTitle(String query) {
        List<Book> books = null;
        //logic code here
        return books;
    }

    /**
     * returns a list with one book or null if no book is found
     *
     * @param query
     * @return List
     */
    public List<Book> findByISBN(String query) {
        List<Book> books = null;
        //logic code here
        return books;
    }

    /**
     * returns a list of books or null if no book is found
     * @param query
     * @return List
     */
    public List<Book> findByGenre(String query) {
        List<Book> books = null;
        //logic code here
        return books;
    }

}
