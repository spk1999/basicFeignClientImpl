package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VianetBillPaymentDto {

    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("customerid")
    private String customerId;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("paymentid")
    private String paymentId;

}
