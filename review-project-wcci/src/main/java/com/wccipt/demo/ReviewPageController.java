package com.wccipt.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;



@Controller
public class ReviewPageController {

    @Resource
    private ReviewRepository reviewRepo;

    
    @RequestMapping("/")
    public String redirectToReviews(Model model) {
        return "redirect:/reviews";
    }

    @RequestMapping("/reviews")
    public String showAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "reviews";
    }

    @RequestMapping("/review")
    public String showOneReview(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("review", reviewRepo.findById(id));
        return "review";
    }

}
