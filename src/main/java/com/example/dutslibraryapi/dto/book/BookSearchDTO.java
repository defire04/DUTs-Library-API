package com.example.dutslibraryapi.dto.book;



public class BookSearchDTO {
    private String title;
    private String author;
    private String language;
    private String classification;
    private String subCategory;
    private String globalCategory;

    public BookSearchDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getGlobalCategory() {
        return globalCategory;
    }

    public void setGlobalCategory(String globalCategory) {
        this.globalCategory = globalCategory;
    }
}
