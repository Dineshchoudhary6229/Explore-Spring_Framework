package com.decipherzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

// Model to send data from controller to view resolver
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("This is Model to send data from contoller to view ");

// In Model we have method model.addAttribute to add data
        model.addAttribute("name","Dinesh");
        model.addAttribute("id",111);

        List<String> friends= new ArrayList<String>();
        friends.add("Anil");
        friends.add("Abhay");
        friends.add("Aman");
        friends.add("Naman");
        model.addAttribute("frnd",friends);

        return "Home-sindex"; // it return the view to resolve and here it is index which turns to index.jsp
    }

//ModelAndView method of controller to view
    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndview= new ModelAndView();

        //setting name of view for view resolver
        modelAndview.setViewName("Home-help");     // name of view is send like this in ModelAndView it is not reutrned in it as we did in Model

// setting the data
        modelAndview.addObject("name","Dinesh");
        modelAndview.addObject("id",123);
        LocalDateTime now=LocalDateTime.now();
        modelAndview.addObject("time",now);

        List<String> list = new ArrayList<>();
        list.add("Google");
        list.add("Amazon");
        list.add("Flipkart");
        list.add("Paytem");
        modelAndview.addObject("Company", list);

        return modelAndview;    // here we return ModelAndView object not the view as we do in Model
    }


    @RequestMapping("/")             // ('/')is used for all ,would be name of controller which we use with localhost to run this controller
    public String show(){
        System.out.println("this is new view by request mapping");
        return "Home-welcome";              // this about is name of contoller which we provide to view resolver which provide about.jsp
    }

    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("name","Rahul");
        model.addAttribute("city", "Delhi");

        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(56);
        list.add(75);
        list.add(89);
        model.addAttribute("array",list);

        return "Home-about";
        // In this controller we added Expression language for single element adding in about.jsp
        // and JSTL and Expression language for list traversing check about.jsp better code
    }


}







// here GET is a http method which retrieve data(read) that is viewing a web page or getting data from server
// it is one of the http methods like GET(retrieve data from server i.e viewing a web page) ,
// POST(send data to server i.e submitting a form), PUT(update data on server i.e editing existing resource),
// DELETE(delete data on server i.e removing a resource form server)