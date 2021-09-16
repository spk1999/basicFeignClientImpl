package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="Electricity",url ="http://billpaytest.f1soft.com.np")
public interface ElectricityClient {

    //NEA
    @PostMapping("/nea/counters")
    public Object getNeaCounterList(NeaGetCountersDto neaGetCountersDto);

    @PostMapping("/nea/billInquiry")
    public Object getNeaBillInquiry(NeaBillInquiryDto neaBillInquiryDto);

    @PostMapping("/nea/billpayment")
    public Object getNeaBillPayment(NeaBillPaymentDto neaBillPaymentDto);

    //Butwal Power Company
    @PostMapping("/bpc/electricity/counters")
    public Object getBpcElectricityCounters(BpcElectricityCountersDto bpcElectricityCountersDto);

    @PostMapping("/bpc/electricity/billInquiry")
    public Object getBpcElectricityBillInquiry(BpcElectricityBillInquiryDto bpcElectricityBillInquiryDto);

    @PostMapping("/bpc/electricity/billPayment")
    public Object getBpcElectricityBillPayment(BpcElectricityBillPaymentDto bpcElectricityBillPaymentDto);

    //WaterMark
    @PostMapping("/watermark/electricity/counters")
    public Object getWaterMarkElectricityCounters(WaterMarkElectricityCountersDto waterMarkElectricityCountersDto);

    @PostMapping("/watermark/electricity/billInquiry")
    public Object getWaterMarkElectricityBillInquiry(WaterMarkElectricityBillInquiryDto waterMarkElectricityBillInquiryDto);

    @PostMapping("/watermark/electricity/billPayment")
    public Object getWaterMarkElectricityBillPayment(WaterMarkElectricityPaymentDto waterMarkElectricityPaymentDto);

    @PostMapping("/watermark/electricity/transaction/verification")
    public Object getWaterMarkElectricityTransactionVerification(WaterMarkElectricityTransactionVerificationDto waterMarkElectricityTransactionVerificationDto);


}
