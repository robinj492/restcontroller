package com.helloworld.restcontroller.controller;

import com.helloworld.restcontroller.model.TextMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    Log log = LogFactory.getLog(MessageController.class);

    @GetMapping("/textMessage")
    public String messageForm(Model model) {
        model.addAttribute("textMessage", new TextMessage());
        return "textMessage";
    }

    @PostMapping("/textMessage")
    public String messageSubmit(@ModelAttribute TextMessage textMessage, Model model) {
        model.addAttribute("textMessage", textMessage);
        log.debug("textMessage: " + textMessage.getContent());
        return "response";
    }
}
