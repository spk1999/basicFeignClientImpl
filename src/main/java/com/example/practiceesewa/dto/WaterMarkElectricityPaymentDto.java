package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WaterMarkElectricityPaymentDto {

    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("bankcode")
    private String bankCode;
    @JsonProperty("customerid")
    private String customerId;
    @JsonProperty("customercode")
    private String customerCode;
    @JsonProperty("counter")
    private String counter;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("walletid")
    private String walletId;
}
