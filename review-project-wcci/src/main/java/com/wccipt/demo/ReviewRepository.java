package com.wccipt.demo;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

   public ReviewRepository(){
       Review reviewOne = new Review(1L, "Xbox Series X", "/images/XboxseriesX-image.jpg",
               "It sucks, that's why scalpers aren't hording them");

       Review reviewTwo = new Review(2L, "Playstation 5", "/images/PS5.jpg",
               "Is better than Xbox Series X. That's why you can't buy one!");

       Review reviewThree = new Review(3L, "Gaming Computer", "/images/istockphotoCPURig.jpg",
               "The only way to go. The Master Console!");

       reviewList.put(reviewOne.getId(), reviewOne);
       reviewList.put(reviewTwo.getId(), reviewTwo);
       reviewList.put(reviewThree.getId(), reviewThree);
   }
   
    public ReviewRepository(Review... reviewToAdd) {
        for (Review review : reviewToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review findById(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
    
