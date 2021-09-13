package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BroadlinkPaymentDto {

    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("agenttranid")
    private String agentTranId;
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
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("packageid")
    private String packageId;
    @JsonProperty("amount")
    private String amount;
}
