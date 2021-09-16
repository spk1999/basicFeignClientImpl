package com.example.practiceesewa.controller;

import com.example.practiceesewa.client.ElectricityClient;
import com.example.practiceesewa.dto.*;
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
@RequestMapping("/electricity")
public class ElectricityController {

    private final ElectricityClient electricityClient;
    private Gson gson;

    @Autowired
    public ElectricityController(ElectricityClient electricityClient) {
        this.electricityClient = electricityClient;
    }

    //NEA
    @PostMapping("/nea/counters")
    public ResponseEntity<JsonObject> getNeaCounterList(
            @RequestBody NeaGetCountersDto neaGetCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getNeaCounterList(neaGetCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/nea/billInquiry")
    public ResponseEntity<JsonObject> getNeaBillInquiry(
            @RequestBody NeaBillInquiryDto neaBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getNeaBillInquiry(neaBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/nea/billpayment")
    public ResponseEntity<JsonObject> getNeaBillPayment(
            @RequestBody NeaBillPaymentDto neaBillPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getNeaBillPayment(neaBillPaymentDto)), HttpStatus.OK);
    }

    //Butwal Power Company
    @PostMapping("/bpc/electricity/counters")
    public ResponseEntity<JsonObject> getBpcElectricityCounters(
            @RequestBody BpcElectricityCountersDto bpcElectricityCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getBpcElectricityCounters(bpcElectricityCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/bpc/electricity/billInquiry")
    public ResponseEntity<JsonObject> getBpcElectricityBillInquiry(
            @RequestBody BpcElectricityBillInquiryDto bpcElectricityBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getBpcElectricityBillInquiry(bpcElectricityBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/bpc/electricity/billPayment")
    public ResponseEntity<JsonObject> getBpcElectricityBillPayment(
            @RequestBody BpcElectricityBillPaymentDto bpcElectricityBillPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getBpcElectricityBillPayment(bpcElectricityBillPaymentDto)), HttpStatus.OK);
    }

    //WaterMark
    @PostMapping("/watermark/electricity/counters")
    public ResponseEntity<JsonObject> getWaterMarkElectricityCounters(
            @RequestBody WaterMarkElectricityCountersDto waterMarkElectricityCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getWaterMarkElectricityCounters(waterMarkElectricityCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/watermark/electricity/billInquiry")
    public ResponseEntity<JsonObject> getWaterMarkElectricityBillInquiry(
            @RequestBody WaterMarkElectricityBillInquiryDto waterMarkElectricityBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getWaterMarkElectricityBillInquiry(waterMarkElectricityBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/watermark/electricity/billPayment")
    public ResponseEntity<JsonObject> getWaterMarkElectricityBillPayment(
            @RequestBody WaterMarkElectricityPaymentDto waterMarkElectricityPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getWaterMarkElectricityBillPayment(waterMarkElectricityPaymentDto)), HttpStatus.OK);
    }

    @PostMapping("/watermark/electricity/transaction/verification")
    public ResponseEntity<JsonObject> getWaterMarkElectricityTransactionVerification(
            @RequestBody WaterMarkElectricityTransactionVerificationDto waterMarkElectricityTransactionVerificationDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(electricityClient.getWaterMarkElectricityTransactionVerification(waterMarkElectricityTransactionVerificationDto)), HttpStatus.OK);
    }

}
