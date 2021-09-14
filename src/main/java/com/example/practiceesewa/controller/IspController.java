package com.example.practiceesewa.controller;

import com.example.practiceesewa.client.IspClient;
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
@RequestMapping("/isp")
public class IspController {

    private final IspClient ispClient;
    private Gson gson;

    @Autowired
    public IspController(IspClient ispClient) {
        this.ispClient = ispClient;
    }

    //WorldLink
    @PostMapping("/worldLink/billInquiry")
    public ResponseEntity<JsonObject> getWorldLinkBillInquiry(
            @RequestBody WorldLinkInquiryRequestDto worldLinkInquiryRequestDto) {
        gson = new Gson();
        return new ResponseEntity(gson.toJson(ispClient.getWorldLinkUserData(worldLinkInquiryRequestDto)), HttpStatus.OK);
    }

    @PostMapping("/worldLink/billPayment")
    public ResponseEntity<JsonObject> getWorldLinkBillPayment(@RequestBody WorldLinkBillPayRequestDto worldLinkBillPayRequestDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.payWorldLinkInternetBill(worldLinkBillPayRequestDto)),HttpStatus.OK);
    }

    //Barahi
    @PostMapping("/barahi/billInquiry")
    public ResponseEntity<JsonObject> getBarahiUserData(@RequestBody BarahiIspRequestDto barahiIspRequestDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getBarahiUserData(barahiIspRequestDto)),HttpStatus.OK);
    }

    @PostMapping("/barahi/billPayment")
    public ResponseEntity<JsonObject> getBarahiBillPayment(@RequestBody BarahiPaymentRequestDto barahiPaymentRequestDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getBarahiPaymentData(barahiPaymentRequestDto)),HttpStatus.OK);
    }

    //Broadlink
    @PostMapping("/broadlink/billPayment")
    public ResponseEntity<JsonObject> getBroadLinkBillPayment(@RequestBody BroadlinkPaymentDto broadlinkPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.doBroadlinkPayment(broadlinkPaymentDto)),HttpStatus.OK);
    }
    @PostMapping("/broadlink/billInquiry")
    public ResponseEntity<JsonObject> getBroadLinkCustomerDetails(@RequestBody BroadlinkClentDetailsDto broadlinkClentDetailsDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getBroadlinkCustomerDetails(broadlinkClentDetailsDto)),HttpStatus.OK);
    }
    @PostMapping("/broadlink/packageDetail")
    public ResponseEntity<JsonObject> getBroadLinkBillPayment(@RequestBody BroadlinkPackageDto broadlinkPackageDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getBroadlinkPackageDetails(broadlinkPackageDto)),HttpStatus.OK);
    }

    //Chitrawan
    @PostMapping("/chitrawan/billInquiry")
    public ResponseEntity<JsonObject> getChitrawanCustomerDetails(@RequestBody ChitrawanCutomerDetailsDto chitrawanCutomerDetailsDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getChitrawanCustomerDetails(chitrawanCutomerDetailsDto)),HttpStatus.OK);
    }

    @PostMapping("/chitrawan/billPayment")
    public ResponseEntity<JsonObject> getChitrawanBillPayment(@RequestBody ChitrawanBillPaymentDto chitrawanBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getChitrawanPaymentData(chitrawanBillPaymentDto)),HttpStatus.OK);
    }

    //DishomefibernetISP
    @PostMapping("/dishhome/fibernet/customer/information")
    public ResponseEntity<JsonObject> getDisHomeCustomerDetails(@RequestBody DishHomeCustomerDetailsDto dishHomeCustomerDetailsDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getDisHomeCustomerDetails(dishHomeCustomerDetailsDto)),HttpStatus.OK);
    }

    @PostMapping("/dishhome/fibernet/billPayment")
    public ResponseEntity<JsonObject> getDisHomeBillPayment(@RequestBody DishHomeBillPaymentDto dishHomeBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getDisHomeBillPayment(dishHomeBillPaymentDto)),HttpStatus.OK);
    }

    //ClassiTech
    @PostMapping("/classictech/billInquiry")
    public ResponseEntity<JsonObject> getClassictechBillInquiry(@RequestBody ClassiTechBillInquiryDto classiTechBillInquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getClassictechBillInquiry(classiTechBillInquiryDto)),HttpStatus.OK);
    }

    @PostMapping("/classictech/billPayment")
    public ResponseEntity<JsonObject> getClassictechBillPayment(@RequestBody ClassiTechBillPaymentDto classiTechBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getClassictechBillPayment(classiTechBillPaymentDto)),HttpStatus.OK);
    }

    //FirstLink
    @PostMapping("/firstlink/customer/information")
    public ResponseEntity<JsonObject> getFirstLinkBillInquiry(@RequestBody FirstLinkBillInquiryDto firstLinkBillInquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getFirstLinkBillInquiry(firstLinkBillInquiryDto)),HttpStatus.OK);
    }

    @PostMapping("/firstlink/billPayment")
    public ResponseEntity<JsonObject> getFirstLinkBillPayment(@RequestBody FirstLinkBillPaymentDto firstLinkBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getFirstLinkBillPayment(firstLinkBillPaymentDto)),HttpStatus.OK);
    }

    //LoopNet
    @PostMapping("/loopNet/customer/information")
    public ResponseEntity<JsonObject> getLoopNetBillInquiry(@RequestBody LoopNetBillInquiryDto loopNetBillInquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getLoopNetBillInquiry(loopNetBillInquiryDto)),HttpStatus.OK);
    }
    @PostMapping("/loopNet/billPayment")
    public ResponseEntity<JsonObject> getLoopNetBillPayment(@RequestBody LoopNetBillPayment loopNetBillPayment){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getLoopNetBillPayment(loopNetBillPayment)),HttpStatus.OK);
    }

    @PostMapping("/loopNet/transaction/verification")
    public ResponseEntity<JsonObject> getLoopNetPaymentVerification(@RequestBody LoopNetPaymentVerificationDto loopNetPaymentVerificationDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getLoopNetPaymentVerification(loopNetPaymentVerificationDto)),HttpStatus.OK);
    }

    //PalseNet
    @PostMapping("/palsNet/customer/information")
    public ResponseEntity<JsonObject> getPalseNetBillEnquiry(@RequestBody PalseNetBillEnquiryDto palseNetBillEnquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getPalseNetBillEnquiry(palseNetBillEnquiryDto)),HttpStatus.OK);
    }

    @PostMapping("/palsNet/billPayment")
    public ResponseEntity<JsonObject> getPalseNetBillPayment(@RequestBody PalseNetBillPaymentDto palseNetBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getPalseNetBillPayment(palseNetBillPaymentDto)),HttpStatus.OK);
    }

    //Subisu
    @PostMapping("/subisu/billPayment")
    public ResponseEntity<JsonObject> getSubisuInternetBillPayment(@RequestBody SubisuInternetBillPaymentDto subisuInternetBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getSubisuInternetBillPayment(subisuInternetBillPaymentDto)),HttpStatus.OK);
    }

    //TechMinds
    @PostMapping("/techmind/billInquiry")
    public ResponseEntity<JsonObject> getTechMindsBillInquiry(@RequestBody TechMindsIspBillInquiryDto techMindsIspBillInquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getTechMindsBillInquiry(techMindsIspBillInquiryDto)),HttpStatus.OK);
    }

    @PostMapping("/techmind/billPayment")
    public ResponseEntity<JsonObject> getTechMindsBillPayment(@RequestBody TechMindBillPaymentDto techMindBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getTechMindsBillPayment(techMindBillPaymentDto)),HttpStatus.OK);
    }

    //UltraNet
    @PostMapping("/ultraNet/billInquiry")
    public ResponseEntity<JsonObject> getUltranetBillInquiry(@RequestBody UltranetIspBillInquiryDto ultranetIspBillInquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getUltranetBillInquiry(ultranetIspBillInquiryDto)),HttpStatus.OK);
    }

    //Vianet
    @PostMapping("/vianet/billInquiry")
    public ResponseEntity<JsonObject> getVianetBillInquiry(@RequestBody VianetBillInquiryDto vianetBillInquiryDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getVianetBillInquiry(vianetBillInquiryDto)),HttpStatus.OK);
    }
    @PostMapping("/vianet/billPayment")
    public ResponseEntity<JsonObject> getVianetBillPayment(@RequestBody VianetBillPaymentDto vianetBillPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getVianetBillPayment(vianetBillPaymentDto)),HttpStatus.OK);
    }

    //WebSurfer
    @PostMapping("/websurfer/customer/information")
    public ResponseEntity<JsonObject> getWebSurferWalletinfomation(@RequestBody WebSurferWalletInformationDto webSurferWalletInformationDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getWebSurferWalletInfomation(webSurferWalletInformationDto)),HttpStatus.OK);
    }

    @PostMapping("/websurfer/wallet/payment")
    public ResponseEntity<JsonObject> getWebSurferWalletPayment(@RequestBody WebSurferWalletPaymentDto webSurferWalletPaymentDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getWebSurferWalletPayment(webSurferWalletPaymentDto)),HttpStatus.OK);
    }

    @PostMapping("/websurfer/internet/package/inquiry")
    public ResponseEntity<JsonObject> getWebSurferWalletPayment(@RequestBody WebSurferInternetPackageDto webSurferInternetPackageDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getWebSurferPackageInformation(webSurferInternetPackageDto)),HttpStatus.OK);
    }

    @PostMapping("/websurfer/internet/bill/payment")
    public ResponseEntity<JsonObject> getWebSurferInternetRecharge(@RequestBody WebSurferInternetRechargeDto webSurferInternetRechargeDto){
        gson=new Gson();
        return  new ResponseEntity(gson.toJson(ispClient.getWebSurferInternetRecharge(webSurferInternetRechargeDto)),HttpStatus.OK);
    }
}
