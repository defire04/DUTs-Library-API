package com.example.dutslibraryapi.models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "lang")
    private String language;

    @Column(name = "document_size")
    private String documentSize;

    @Column(name = "year_of_publication")
    private String yearOfPublication;

    @Column(name = "publishing_house")
    private String publishingHouse;

    @Column(name = "country")
    private String country;

    @Column(name = "number_of_pages")
    private String numberOfPages;

    @Column(name = "availability_in_the_library")
    private String availabilityInTheLibrary;

    @Column(name = "availability_in_electronic_form")
    private String availabilityInElectronicForm;

    @Column(name = "added")
    private String added;

    @Column(name = "classification_id")
    private String classification;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "link_to_book")
    private String link;

    @Column(name = "sub_category")
    private String subCategory;

    @Column(name = "global_category")
    private String globalCategory;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDocumentSize() {
        return documentSize;
    }

    public void setDocumentSize(String documentSize) {
        this.documentSize = documentSize;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAvailabilityInTheLibrary() {
        return availabilityInTheLibrary;
    }

    public void setAvailabilityInTheLibrary(String availabilityInTheLibrary) {
        this.availabilityInTheLibrary = availabilityInTheLibrary;
    }

    public String getAvailabilityInElectronicForm() {
        return availabilityInElectronicForm;
    }

    public void setAvailabilityInElectronicForm(String availabilityInElectronicForm) {
        this.availabilityInElectronicForm = availabilityInElectronicForm;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
