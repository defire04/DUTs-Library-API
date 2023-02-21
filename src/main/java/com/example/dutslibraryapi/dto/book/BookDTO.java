package com.example.dutslibraryapi.dto.book;


public class BookDTO {
    private String title;
    private String author;
    private String language;
    private String documentSize;
    private String yearOfPublication;
    private String publishingHouse;
    private String country;
    private String numberOfPages;
    private String availabilityInTheLibrary;
    private String availabilityInElectronicForm;
    private String added;
    private String classification;
    private String documentType;
    private String link;
    private String subCategory;
    private String globalCategory;

    public BookDTO() {
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
