package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class H2OKhanepaniPaymentDto {

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
    @JsonProperty("customercode")
    private String customerCode;
    @JsonProperty("counter")
    private String counter;
    @JsonProperty("amount")
    private String amount;

}
