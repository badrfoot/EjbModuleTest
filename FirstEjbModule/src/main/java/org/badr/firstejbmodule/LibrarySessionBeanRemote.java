package org.badr.firstejbmodule;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author oussama
 */
@Remote
public interface LibrarySessionBeanRemote {

    void addBook(String bookName);

    List<String> getBooks();
    
}
