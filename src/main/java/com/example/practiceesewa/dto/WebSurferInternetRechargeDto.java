package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebSurferInternetRechargeDto {

    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("customerid")
    private String customerId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("customerno")
    private String customerNo;
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("packagecode")
    private String packageCode;
    @JsonProperty("amount")
    private int amount;
}
