package com.example.practiceesewa.client;

import com.example.practiceesewa.dto.BroadlinkClentDetailsDto;
import com.example.practiceesewa.dto.BroadlinkPackageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="BroadLink",url = "http://billpaytest.f1soft.com.np/")
public interface BroadlinkIspClient {
    @PostMapping("broadlink/billInquiry")
    public Object getCustomerDetails(BroadlinkClentDetailsDto broadlinkClentDetailsDto);

    @PostMapping("broadlink/packageDetail")
    public Object getPackageDetails(BroadlinkPackageDto broadlinkPackageDto);

}
