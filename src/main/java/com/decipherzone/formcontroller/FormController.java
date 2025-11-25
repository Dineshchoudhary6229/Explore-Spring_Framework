package com.decipherzone.formcontroller;

import com.decipherzone.model.User;
import com.decipherzone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.stream.Stream;

@Controller
public class FormController {
 // by @Autowired object of UserService will create here
    @Autowired
    private UserService userService;

    //Data from this is loaded and add that data to that controller first then that controller will execute
    @ModelAttribute
    public void commonData(Model m){
        m.addAttribute("Header","Learn coding with Spring-MVC");
        m.addAttribute("Desc","This Data will be shown in all controllers ");
        System.out.println("Common data is loaded before.....");
    }

    @RequestMapping("/login")
    public String showForm(){
        System.out.println("This will show login form to user to fill it through Form-login view");
        System.out.println("Login form is created and provided to user to fill");
        return "Form-login";
    }


// In this we use @ModelAttribute annotation inside the method so it will take user as object
// and provide us all detail of user class like email, name , password
    @RequestMapping(path="/processLogin" , method=RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model)  {

// Redirect prefix to redirecting to any url or page
//        if(Stream.of(user.getEmail(),user.getUserName(),user.getPassword()).anyMatch(String::isBlank)){
         if(user.getEmail().isBlank()){
            return "redirect:/login";
        }

      model.addAttribute(user);

      // for data to save database we use this
        this.userService.createUser(user);
        System.out.println("user registration is Successful");

        return "Form-success";
    }



}













/* This code take data from user i.e. from login page and send it to Form-success page with the
help of  (Model model)

    @RequestMapping(path="/processLogin" , method=RequestMethod.POST)
    public String handleForm(@RequestParam(value = "userName",required = true) String userName,
                             @RequestParam("email") String userEmail,
                             @RequestParam("password") String userPassword,Model model)  {
        System.out.println("User name is "+userName);
        System.out.println("User email is "+userEmail);
        System.out.println("User password is "+userPassword);

        //process the userName , email , password and then show on Form-success view page
        model.addAttribute("userName", userName);
        model.addAttribute("email",  userEmail);
        model.addAttribute("password", userPassword);



        return "Form-success";
    }

    Then we do this -------------------------->

      @RequestMapping(path="/processLogin" , method=RequestMethod.POST)
    public String handleForm(@RequestParam(value = "userName",required = true) String userName,
                             @RequestParam("email") String userEmail,
                             @RequestParam("password") String userPassword,Model model)  {

        User user= new User();
        user.setUserName(userName);
        user.setEmail(userEmail);
        user.setPassword(userPassword);
        System.out.println(user);

      model.addAttribute(user);

        return "Form-success";
    }
    after this we use @ModelAttribute instead of these two approaches




*/