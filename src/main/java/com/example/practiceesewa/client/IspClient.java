package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ISP" ,url = "http://billpaytest.f1soft.com.np")
public interface IspClient {

    //worldlink
    @PostMapping("/worldlink/billInquiry")
    public Object getWorldLinkUserData(WorldLinkInquiryRequestDto ispFetchRequestDto);

    @PostMapping("/worldlink/billPayment")
    public Object payWorldLinkInternetBill(WorldLinkBillPayRequestDto ispBillPayRequestDto);

    //barahi

    @PostMapping("barahi/billInquiry")
    public Object getUserData(BarahiIspRequestDto barahiIspRequestDto);

    @PostMapping("barahi/billpayment")
    public Object getPaymentData(BarahiPaymentRequestDto barahiPaymentRequestDto);


    //broadlink

    @PostMapping("broadlink/billPayment")
    public Object doPayment(BroadlinkPaymentDto broadlinkPaymentDto);

    @PostMapping("broadlink/billInquiry")
    public Object getCustomerDetails(BroadlinkClentDetailsDto broadlinkClentDetailsDto);

    @PostMapping("broadlink/packageDetail")
    public Object getPackageDetails(BroadlinkPackageDto broadlinkPackageDto);

    @PostMapping("broadlink/billPayment")
    public Object doBillPayment(BroadlinkPaymentDto broadlinkPaymentDto);




}
