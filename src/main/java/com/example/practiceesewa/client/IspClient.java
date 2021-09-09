package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.IspFetchRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ISP" ,url = "http://billpaytest.f1soft.com.np/")
public interface IspClient {

    @PostMapping("worldlink/billInquiry")
    public Object getUserData(IspFetchRequestDto ispFetchRequestDto);



}
