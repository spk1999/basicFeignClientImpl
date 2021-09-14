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
    public Object getBarahiUserData(BarahiIspRequestDto barahiIspRequestDto);

    @PostMapping("barahi/billPayment")
    public Object getBarahiPaymentData(BarahiPaymentRequestDto barahiPaymentRequestDto);


    //broadlink

    @PostMapping("/broadlink/billPayment")
    public Object doBroadlinkPayment(BroadlinkPaymentDto broadlinkPaymentDto);

    @PostMapping("/broadlink/billInquiry")
    public Object getBroadlinkCustomerDetails(BroadlinkClentDetailsDto broadlinkClentDetailsDto);

    @PostMapping("/broadlink/packageDetail")
    public Object getBroadlinkPackageDetails(BroadlinkPackageDto broadlinkPackageDto);

    //Chitrawan
    @PostMapping("/chitrawan/billInquiry")
    public Object getChitrawanCustomerDetails(ChitrawanCutomerDetailsDto chitrawanCutomerDetailsDto);

    @PostMapping("/chitrawan/billPayment")
    public Object getChitrawanPaymentData(ChitrawanBillPaymentDto chitrawanBillPaymentDto);

    //DishomefibernetISP
    @PostMapping("/dishhome/fibernet/customer/information")
    public Object getDisHomeCustomerDetails(DishHomeCustomerDetailsDto dishHomeCustomerDetailsDto);

    @PostMapping("/dishhome/fibernet/billPayment")
    public Object getDisHomeBillPayment(DishHomeBillPaymentDto dishHomeBillPaymentDto);

    //ClassiTech
    @PostMapping("/classictech/billInquiry")
    public Object getClassictechBillInquiry(ClassiTechBillInquiryDto classiTechBillInquiryDto);

    @PostMapping("/classictech/billPayment")
    public Object getClassictechBillPayment(ClassiTechBillPaymentDto classiTechBillPaymentDto);

    //FirstLink
    @PostMapping("/firstlink/customer/information")
    public Object getFirstLinkBillInquiry(FirstLinkBillInquiryDto firstLinkBillInquiryDto);

    @PostMapping("/firstlink/billPayment")
    public Object getFirstLinkBillPayment(FirstLinkBillPaymentDto firstLinkBillPaymentDto);

    //LoopNet
    @PostMapping("/loopNet/customer/information")
    public Object getLoopNetBillInquiry(LoopNetBillInquiryDto loopNetBillInquiryDto);

    @PostMapping("/loopNet/billPayment")
    public Object getLoopNetBillPayment(LoopNetBillPayment loopNetBillPayment);

    @PostMapping("/loopNet/transaction/verification")
    public Object getLoopNetPaymentVerification(LoopNetPaymentVerificationDto loopNetPaymentVerificationDto);

    //PalseNet
    @PostMapping("/palsNet/customer/information")
    public Object getPalseNetBillEnquiry(PalseNetBillEnquiryDto palseNetBillEnquiryDto);

    @PostMapping("/palsNet/billPayment")
    public Object getPalseNetBillPayment(PalseNetBillPaymentDto palseNetBillPaymentDto);

    //Subisu
    @PostMapping("/subisu/billPayment")
    public Object getSubisuInternetBillPayment(SubisuInternetBillPaymentDto subisuInternetBillPaymentDto);

    //TechMinds
    @PostMapping("/techmind/billInquiry")
    public Object getTechMindsBillInquiry(TechMindsIspBillInquiryDto techMindsIspBillInquiryDto);

    @PostMapping("/techmind/billPayment")
    public Object getTechMindsBillPayment(TechMindBillPaymentDto techMindBillPaymentDto);

    //UltraNet
    @PostMapping("/ultraNet/billInquiry")
    public Object getUltranetBillInquiry(UltranetIspBillInquiryDto ultranetIspBillInquiryDto);

    @PostMapping("/ultraNet/billPayment")
    public Object getUltranetBillPayment(UltranetIspBillPaymentDto ultranetIspBillPaymentDto);

    //Vianet
    @PostMapping("/vianet/billInquiry")
    public Object getVianetBillInquiry(VianetBillInquiryDto vianetBillInquiryDto);

    @PostMapping("/vianet/billPayment")
    public Object getVianetBillPayment(VianetBillPaymentDto vianetBillPaymentDto);

    //WebSurfer
    @PostMapping("/websurfer/customer/information")
    public Object getWebSurferWalletInfomation(WebSurferWalletInformationDto webSurferWalletInformationDto);

    @PostMapping("/websurfer/wallet/payment")
    public Object getWebSurferWalletPayment(WebSurferWalletPaymentDto webSurferWalletPaymentDto);

    @PostMapping("/websurfer/internet/package/inquiry")
    public Object getWebSurferPackageInformation(WebSurferInternetPackageDto webSurferInternetPackageDto);

    @PostMapping("/websurfer/internet/bill/payment")
    public Object getWebSurferInternetRecharge(WebSurferInternetRechargeDto webSurferInternetRechargeDto);

}
