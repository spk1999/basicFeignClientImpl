package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BpcElectricityBillInquiryDto {

    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("counter")
    private String counter;
    @JsonProperty("consumerid")
    private String consumerId;
    @JsonProperty("consumerno")
    private String consumerNo;
    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("channel")
    private String channel;

}
