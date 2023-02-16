package com.kafkatemplate.controllers;

import com.kafkatemplate.services.MessageService;
import com.kafkatemplate.types.MessageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private MessageService messageService;

    MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        this.messageService.processMessage(messageRequest.message());
    }
}
