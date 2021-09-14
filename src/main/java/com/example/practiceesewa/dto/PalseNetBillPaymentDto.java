package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PalseNetBillPaymentDto {

    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("customerid")
    private String customerId;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("bankcode")
    private String bankCode;
    @JsonProperty("walletid")
    private String walletId;
}
