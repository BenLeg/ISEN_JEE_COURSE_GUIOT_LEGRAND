package yncrea.lab06.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Id;
import java.util.List;
// TODO complete this implementation with the correct annotations, fields and methods.
// The @JsonIgnoreProperties annotation is mandatory in our case because it helps the JSON Serialization

@JsonIgnoreProperties({ "books" })
public class Tag implements Comparable<Tag> {

    @Id
    private Long id;

    private String name;

    private List<Book> books;


    @Override
    public int compareTo(final Tag o) {
        return name.compareTo(o.name);
    }
}
