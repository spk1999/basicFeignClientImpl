package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChitrawanBillPaymentDto {

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
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("walletid")
    private String walletId;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("packageid")
    private String packageId;
}
