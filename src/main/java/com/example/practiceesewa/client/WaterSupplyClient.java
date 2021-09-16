package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="WaterSupply",url ="http://billpaytest.f1soft.com.np")
public interface WaterSupplyClient {

    //H2O Khanepani
    @PostMapping("/khanepani/counters")
    public Object getH2OKhanepaniList(H2OKhanepaniCountersDto h2OKhanepaniCountersDto);

    @PostMapping("/khanepani/billPayment")
    public Object getH2OKhanepaniBillPayment(H2OKhanepaniPaymentDto h2OKhanepaniPaymentDto);

    //HeartSun
    @PostMapping("/khanepani/heartSun/counters")
    public Object getHeartSunCounters(HeartsunCountersDto heartsunCountersDto);

    @PostMapping("/khanepani/heartSun/billInquiry")
    public Object getHeartSunBillInquiry(HeartsunBillInquiryDto heartsunBillInquiryDto);

    @PostMapping("/khanepani/heartSun/billPayment")
    public Object getHeartSunBillPayment(HeartsunPaymentDto heartsunPaymentDto);

    //Nepal Khanepani
    @PostMapping("/plazma/khanepani/counters")
    public Object getNepalKhanePaniCounters(NepalKhanepaniCountersDto nepalKhanepaniCountersDto);

    @PostMapping("/plazma/khanepani/billInquiry")
    public Object getNepalKhanePaniBillInquiry(NepalKhanepaniBillInquiryDto nepalKhanepaniBillInquiryDto);

    @PostMapping("/plazma/khanepani/billPayment")
    public Object getNepalKhanePaniBillPayment(NepalKhanepaniBillPaymentDto nepalKhanepaniBillPaymentDto);

    //Thaiba Khanepani
    @PostMapping("/thaiba/khanepani/billInquiry")
    public Object getThaibaKhanepaniBillInquiry(ThaibaKhanepaniBillInquiry thaibaKhanepaniBillInquiry);

    @PostMapping("/thaiba/khanepani/billPayment")
    public Object getThaibaKhanepaniBillPayment(ThaibaKhanepaniBillPaymentDto thaibaKhanepaniBillPaymentDto);

    //WaterMark
    @PostMapping("/watermark/khanepani/counters")
    public Object getWaterMarkKhanePaniCounters(WaterMarkKhanepaniCountersDto waterMarkKhanepaniCountersDto);

    @PostMapping("/watermark/khanepani/billInquiry")
    public Object getWaterMarkKhanepaniBillInquiry(WaterMarkKhanepaniBillInquiryDto waterMarkKhanepaniBillInquiryDto);

    @PostMapping("/watermark/khanepani/billPayment")
    public Object getWaterMarkKhanepaniBillPayment(WaterMarkKhanepaniBillPaymentDto waterMarkKhanepaniBillPaymentDto);

}
