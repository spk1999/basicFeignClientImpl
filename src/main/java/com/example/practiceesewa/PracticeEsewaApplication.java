package com.example.practiceesewa;

import com.example.practiceesewa.client.BarahiIspClient;
import com.example.practiceesewa.client.BroadlinkIspClient;
import com.example.practiceesewa.client.IspClient;
import com.example.practiceesewa.client.TopUpClient;
import com.example.practiceesewa.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.reflect.Array;

@SpringBootApplication
@EnableFeignClients
public class PracticeEsewaApplication implements CommandLineRunner {

    @Autowired
    TopUpClient topUpClient;
    @Autowired
    IspClient ispClient;
    @Autowired
    BarahiIspClient barahiIspClient;
    @Autowired
    BroadlinkIspClient broadlinkIspClient;

    public static void main(String[] args) {
        SpringApplication.run(PracticeEsewaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        TopUpRequestDto topUpRequestDto = new TopUpRequestDto()
                .withServicecode("NP-RTP-NCELL")
                .withRequestid("F1SOFT-CS41311625")
                .withAgenttransid("41311625")
                .withClientusername("f1soft")
                .withPassword("0dd565b1830c9f94da1443d678caf506")
                .withAmount(20.0)
                .withMobileno("9808144451")
                .withCustomerid("9806697012")
                .withChannel("eSewa")
                .withWalletid("9840311112")
                .withBankcode("GLBBNPKA");

        IspFetchRequestDto ispFetchRequestDto = new IspFetchRequestDto()
                .withRequestid("732526740")
                .withAgenttransid("476936025")
                .withCustomerid("sujanspk1999@gmail.com")
                .withClientusername("f1soft")
                .withPassword("0dd565b1830c9f94da1443d678caf506")
                .withChannel("eSewa")
                .withUserid("spk1999");

       // System.out.println(ispClient.getUserData(ispFetchRequestDto));


        IspBillPayRequestDto ispBillPayRequestDto = IspBillPayRequestDto.builder()
                .requestid("101452414")
                .customerid("1234")
                .agenttransid("407087470")
                .amount(10000.0)
                .clientusername("f1soft")
                .password("0dd565b1830c9f94da1443d678caf506")
                .channel("esewa")
                .userid("use1")
                .packageid("1988131")
                .build();

        //System.out.println(ispClient.payInternetBill(ispBillPayRequestDto));


        System.out.println("Hello I am running");
        //System.out.println(topUpRequestDto.toString());

        BarahiIspRequestDto barahiIspRequestDto=BarahiIspRequestDto.builder()
                .requestId("F1DEV5452774")
                .agentTransId("63687117")
                .clientUserName("f1soft")
                .password("0dd565b1830c9f94da1443d678caf506")
                .channel("eSewa")
                .bankCode("GLBBNPKA")
                .userId("tasipasanggrg")
                .build();
        //System.out.println(barahiIspClient.getUserData(barahiIspRequestDto));

        BarahiPaymentRequestDto barahiPaymentRequestDto=BarahiPaymentRequestDto.builder()
                .requestId("F1DEV5452774")
                .agentTransId("F1DEV5452774")
                .clientusername("f1soft")
                .password("0dd565b1830c9f94da1443d678caf506")
                .channel("eSewa")
                .bankCode("GLBBNPKA")
                .customerId("9808639594")
                .userId("tasipasanggrg")
                .packageId("1-22418-3-1")
                .amount("1695")
                .build();
        //System.out.println(barahiIspClient.getPaymentData(barahiPaymentRequestDto));

        BroadlinkClentDetailsDto broadlinkClentDetailsDto=BroadlinkClentDetailsDto.builder()
                .requestId("F1DEV3734273")
                .agentTransId("3734273")
                .clientUserName("f1soft")
                .password("0dd565b1830c9f94da1443d678caf506")
                .channel("eSewa")
                .bankCode("GLBBNPKA")
                .cusomerId("9808639594")
                .userId("29071")
                .build();
        //System.out.println(broadlinkIspClient.getCustomerDetails(broadlinkClentDetailsDto));

        BroadlinkPackageDto broadlinkPackageDto=BroadlinkPackageDto.builder()
                .requestId("F1DEV3734273")
                .agentTransId("3734273")
                .clientUserName("f1soft")
                .password("0dd565b1830c9f94da1443d678caf506")
                .channel("eSewa")
                .bankCode("GLBBNPKA")
                .customerId("9808639594")
                .userId("29071")
                .packageId("225-532")
                .build();
        //System.out.println(broadlinkIspClient.getPackageDetails(broadlinkPackageDto));


    }
}
