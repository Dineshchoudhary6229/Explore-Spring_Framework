package com.decipherzone.formcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @RequestMapping("/login")
    public String showForm(){
        System.out.println("This will show login form to user to fill it through Form-login view");
        return "Form-login";
    }

    @RequestMapping(path="/processLogin" , method=RequestMethod.POST)
    public String handleForm(@RequestParam(value = "userName",required = true) String userName,
                             @RequestParam("email") String userEmail,
                             @RequestParam("password") String userPassword,Model model)  {
        System.out.println("User name is "+userName);
        System.out.println("User email is "+userEmail);
        System.out.println("User password is "+userPassword);

        //process the userName , email , password and then show on Form-succes view page
        model.addAttribute("userName", userName);
        model.addAttribute("email",  userEmail);
        model.addAttribute("password", userPassword);



        return "Form-success";
    }



}


/* This code take data from user i.e from login page and send it to Form-success page with the
help of  Model model

    @RequestMapping(path="/processLogin" , method=RequestMethod.POST)
    public String handleForm(@RequestParam(value = "userName",required = true) String userName,
                             @RequestParam("email") String userEmail,
                             @RequestParam("password") String userPassword,Model model)  {
        System.out.println("User name is "+userName);
        System.out.println("User email is "+userEmail);
        System.out.println("User password is "+userPassword);

        //process the userName , email , password and then show on Form-succes view page
        model.addAttribute("userName", userName);
        model.addAttribute("email",  userEmail);
        model.addAttribute("password", userPassword);



        return "Form-success";
    }


*/