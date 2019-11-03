package org.badr.firstejbmodule;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author oussama
 */
@Stateless
@LocalBean
public class LibrarySessionBean implements LibrarySessionBeanRemote {

    List<String> bookShelf;    
   
   public LibrarySessionBean() {
      bookShelf = new ArrayList<>();
   }
    
    @Override
   public void addBook(String bookName) {
      bookShelf.add(bookName);
   }    
 
    @Override
   public List<String> getBooks() {
      return bookShelf;
   }
}
