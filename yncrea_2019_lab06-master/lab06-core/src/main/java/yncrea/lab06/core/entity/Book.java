package yncrea.lab06.core.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;
// TODO complete this implementation with the correct annotations, fields and methods.
// The @ManyToMany annotation is provided because it is not that easy ;)
// Another @ManyToMany annotation is needed !
// Hint : https://www.baeldung.com/jpa-many-to-many
// Hint 2 : https://tomee.apache.org/examples-trunk/jpa-enumerated/

public class Book implements Comparable<Book> {

    @Id
    private Long id;

    private String title;

    //TODO annotate this field in order to inject the value of the enumeration as a string in the DB.
    private Language language;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    private String image;

    private Set<Tag> tags;

    private Set<Review> reviews;


    @Override public int compareTo(final Book o) {
        return title.compareTo(o.title);
    }
}
