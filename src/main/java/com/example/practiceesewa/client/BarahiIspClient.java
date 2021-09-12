package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.BarahiIspRequestDto;
import com.example.practiceesewa.dto.BarahiPaymentRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="BarahiISP",url="http://billpaytest.f1soft.com.np/")
public interface BarahiIspClient {

    @PostMapping("barahi/billInquiry")
    public Object getUserData(BarahiIspRequestDto barahiIspRequestDto);

    @PostMapping("barahi/billpayment")
    public Object getPaymentData(BarahiPaymentRequestDto barahiPaymentRequestDto);

    @PostMapping("broadlink/billPayment")
    public Object doPayment(BroadlinkPaymentDto broadlinkPaymentDto);
}
