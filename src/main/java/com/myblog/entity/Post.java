package com.myblog.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Data
//@Data  //used instead for getters and setters
@AllArgsConstructor //used to initialize all variables..
@NoArgsConstructor //used for default constructor..
@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title",nullable = false,unique = true)
    private String title;
    @Column(name = "description",nullable = false,unique = true)
    private String description;
    @Column(name = "content",nullable = false,unique = true)
    private String content;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
