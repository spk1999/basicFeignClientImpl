package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NeaBillPaymentDto {

    @JsonProperty("servicecode")
    private String serviceCode;
    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("scno")
    private String scno;
    @JsonProperty("consumerid")
    private String consumerId;
    @JsonProperty("officecode")
    private String officeCode;
}
