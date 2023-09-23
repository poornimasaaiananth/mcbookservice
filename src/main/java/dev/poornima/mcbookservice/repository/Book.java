package dev.poornima.mcbookservice.repository;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Book {
    @Id
    private long id;
    private String title;
    private String author;

    private String price;

}
