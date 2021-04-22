package com.example.chatroomapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class ChatRoomAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatRoomAppApplication.class, args);
    }

    /**
     * Login Page
     */
    @GetMapping("/")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    /**
     * Chatroom Page
     */
    @GetMapping("/index")
    public ModelAndView index(HttpServletRequest request, @RequestParam String username) throws UnknownHostException {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("chat");
        modelAndView.addObject("username",username);
        return modelAndView;
    }
}
