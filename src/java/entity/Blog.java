/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author kynhanht
 */
public class Blog {

    private int id;
    private String name, description, picture, quote, author, iconPicture, publishedDate, type;

    public Blog() {
    }

    public Blog(int id, String name, String description, String picture, String quote, String author, String iconPicture, String publishedDate, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.quote = quote;
        this.author = author;
        this.iconPicture = iconPicture;
        this.publishedDate = publishedDate;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIconPicture() {
        return iconPicture;
    }

    public void setIconPicture(String iconPicture) {
        this.iconPicture = iconPicture;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
