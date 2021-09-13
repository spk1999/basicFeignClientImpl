package com.example.practiceesewa.controller;

import com.example.practiceesewa.client.IspClient;
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
@RequestMapping("/isp")
public class IspController {

    private final IspClient ispClient;
    private Gson gson;

    @Autowired
    public IspController(IspClient ispClient) {
        this.ispClient = ispClient;
    }

    @PostMapping("/worldLink/billInquiry")
    public ResponseEntity<JsonObject> getWorldLinkBillInquiry(
            @RequestBody WorldLinkInquiryRequestDto worldLinkInquiryRequestDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(ispClient.getWorldLinkUserData(worldLinkInquiryRequestDto)), HttpStatus.OK);
    }
}
