package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebSurferWalletPaymentDto {

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
    @JsonProperty("amount")
    private int amount;
}
