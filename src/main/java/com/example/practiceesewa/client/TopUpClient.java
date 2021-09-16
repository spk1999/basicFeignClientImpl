package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.TopUpRequestDto;
import com.example.practiceesewa.dto.TopUpResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "topup" ,url = "http://billpaytest.f1soft.com.np/")
public interface TopUpClient {

 @PostMapping("/api")
 TopUpResponseDto topUp(TopUpRequestDto topUpRequestDto);

}
