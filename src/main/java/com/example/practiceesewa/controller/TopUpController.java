package com.example.practiceesewa.controller;

import com.example.practiceesewa.client.TopUpClient;
import com.example.practiceesewa.dto.TopUpRequestDto;
import com.example.practiceesewa.dto.WorldLinkInquiryRequestDto;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topUp")
public class TopUpController {

    private final TopUpClient topUpClient;
    private Gson gson;

    @Autowired
    public TopUpController(TopUpClient topUpClient) {
        this.topUpClient = topUpClient;
    }

    //TopUp
    @PostMapping("/API")
    public ResponseEntity<JsonObject> topUp(
            @RequestBody TopUpRequestDto topUpRequestDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(topUpClient.topUp(topUpRequestDto)), HttpStatus.OK);
    }
}
