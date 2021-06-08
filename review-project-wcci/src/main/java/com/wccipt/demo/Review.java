package com.wccipt.demo;

import javax.persistence.*;


public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private String reviewTitle;
    private String imageUrl;
    private String reviewContent;

    public Review(long id, String reviewTitle, String imageUrl, String reviewContent) {
        this.id = id;
        this.reviewTitle = reviewTitle;
        this.imageUrl = imageUrl;
        this.reviewContent = reviewContent;
    }



    public Long getId() {
        return id;
    }


    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewContent() {
        return reviewContent;
    }


    @Override
    public String toString() {
        return String.format(
                "Review[id=%d, reviewTitle=%s, imageUrl=%s, reviewContent=%s]",
                id, reviewTitle, imageUrl, reviewContent);
    }

}

