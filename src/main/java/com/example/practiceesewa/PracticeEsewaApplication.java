package com.example.practiceesewa;

import com.example.practiceesewa.client.IspClient;
import com.example.practiceesewa.client.TopUpClient;
import com.example.practiceesewa.dto.IspFetchRequestDto;
import com.example.practiceesewa.dto.TopUpRequestDto;
import com.example.practiceesewa.dto.TopUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PracticeEsewaApplication implements CommandLineRunner {

    @Autowired
    TopUpClient topUpClient;
    @Autowired
    IspClient ispClient;

    public static void main(String[] args) {
        SpringApplication.run(PracticeEsewaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        TopUpRequestDto topUpRequestDto=new TopUpRequestDto()
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

        IspFetchRequestDto ispFetchRequestDto=new IspFetchRequestDto()
                .withRequestid("732526740")
                        .withAgenttransid("476936025")
                                .withCustomerid("1234")
                                        .withClientusername("f1soft")
                                                .withPassword("0dd565b1830c9f94da1443d678caf506")
                                                        .withChannel("eSewa")
                                                                .withUserid("yogesh6875");

        System.out.println(ispClient.getUserData(ispFetchRequestDto));


            System.out.println("Hello I am running");
            //System.out.println(topUpRequestDto.toString());

    }
}
