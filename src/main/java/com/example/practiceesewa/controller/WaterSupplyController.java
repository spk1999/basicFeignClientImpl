package com.example.practiceesewa.controller;

import com.example.practiceesewa.client.WaterSupplyClient;
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
@RequestMapping("/watersupply")
public class WaterSupplyController {

    private final WaterSupplyClient waterSupplyClient;
    private Gson gson;

    @Autowired
    public WaterSupplyController(WaterSupplyClient waterSupplyClient) {
        this.waterSupplyClient = waterSupplyClient;
    }

    //H2O Khanepani
    @PostMapping("/khanepani/counters")
    public ResponseEntity<JsonObject> getH2OKhanepaniList(
            @RequestBody H2OKhanepaniCountersDto h2OKhanepaniCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getH2OKhanepaniList(h2OKhanepaniCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/khanepani/billInquiry")
    public ResponseEntity<JsonObject> getH2OKhanepaniBillInquiry(
            @RequestBody H2OKhanepaniBillInquiryDto h2OKhanepaniBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getH2OKhanepaniBillInquiry(h2OKhanepaniBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/khanepani/billPayment")
    public ResponseEntity<JsonObject> getH2OKhanepaniBillPayment(
            @RequestBody H2OKhanepaniPaymentDto h2OKhanepaniPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getH2OKhanepaniBillPayment(h2OKhanepaniPaymentDto)), HttpStatus.OK);
    }

    //HeartSun
    @PostMapping("/khanepani/heartSun/counters")
    public ResponseEntity<JsonObject> getHeartSunCounters(
            @RequestBody HeartsunCountersDto heartsunCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getHeartSunCounters(heartsunCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/khanepani/heartSun/billInquiry")
    public ResponseEntity<JsonObject> getHeartSunBillInquiry(
            @RequestBody HeartsunBillInquiryDto heartsunBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getHeartSunBillInquiry(heartsunBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/khanepani/heartSun/billPayment")
    public ResponseEntity<JsonObject> getHeartSunBillPayment(
            @RequestBody HeartsunPaymentDto heartsunPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getHeartSunBillPayment(heartsunPaymentDto)), HttpStatus.OK);
    }

    //Nepal Khanepani
    @PostMapping("/plazma/khanepani/counters")
    public ResponseEntity<JsonObject> getNepalKhanePaniCounters(
            @RequestBody NepalKhanepaniCountersDto nepalKhanepaniCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getNepalKhanePaniCounters(nepalKhanepaniCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/plazma/khanepani/billInquiry")
    public ResponseEntity<JsonObject> getNepalKhanePaniBillInquiry(
            @RequestBody NepalKhanepaniBillInquiryDto nepalKhanepaniBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getNepalKhanePaniBillInquiry(nepalKhanepaniBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/plazma/khanepani/billPayment")
    public ResponseEntity<JsonObject> getNepalKhanePaniBillPayment(
            @RequestBody NepalKhanepaniBillPaymentDto nepalKhanepaniBillPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getNepalKhanePaniBillPayment(nepalKhanepaniBillPaymentDto)), HttpStatus.OK);
    }

    //Thaiba Khanepani
    @PostMapping("/thaiba/khanepani/billInquiry")
    public ResponseEntity<JsonObject> getThaibaKhanepaniBillInquiry(
            @RequestBody ThaibaKhanepaniBillInquiry thaibaKhanepaniBillInquiry) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getThaibaKhanepaniBillInquiry(thaibaKhanepaniBillInquiry)), HttpStatus.OK);
    }

    @PostMapping("/thaiba/khanepani/billPayment")
    public ResponseEntity<JsonObject> getThaibaKhanepaniBillPayment(
            @RequestBody ThaibaKhanepaniBillPaymentDto thaibaKhanepaniBillPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getThaibaKhanepaniBillPayment(thaibaKhanepaniBillPaymentDto)), HttpStatus.OK);
    }

    //Water Mark
    @PostMapping("/watermark/khanepani/counters")
    public ResponseEntity<JsonObject> getWaterMarkKhanePaniCounters(
            @RequestBody WaterMarkKhanepaniCountersDto waterMarkKhanepaniCountersDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getWaterMarkKhanePaniCounters(waterMarkKhanepaniCountersDto)), HttpStatus.OK);
    }

    @PostMapping("/watermark/khanepani/billInquiry")
    public ResponseEntity<JsonObject> getWaterMarkKhanepaniBillInquiry(
            @RequestBody WaterMarkKhanepaniBillInquiryDto waterMarkKhanepaniBillInquiryDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getWaterMarkKhanepaniBillInquiry(waterMarkKhanepaniBillInquiryDto)), HttpStatus.OK);
    }

    @PostMapping("/watermark/khanepani/billPayment")
    public ResponseEntity<JsonObject> getWaterMarkKhanepaniBillPayment(
            @RequestBody WaterMarkKhanepaniBillPaymentDto waterMarkKhanepaniBillPaymentDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(waterSupplyClient.getWaterMarkKhanepaniBillPayment(waterMarkKhanepaniBillPaymentDto)), HttpStatus.OK);
    }



}
