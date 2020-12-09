/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1.oose.searchbooks;

import java.util.List;

/**
 *
 * @author achil
 */
public class BookCatalogue {
    
    Object connection;

    public void dataSourceConnection(String url){
        
    }
    
   
    public List<Book> findByTitle(String query){
       List<Book> books = null;
       //logic code 
       return books;
    }
    
    public List<Book> findByISBN(String query){
        List<Book> books = null;
       //logic code 
       return books;
    }
    
    public List<Book> findByGenre(String query){
        List<Book> books = null;
       //logic code 
       return books;
    }

}
