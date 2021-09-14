package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassiTechBillPaymentDto {

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
    @JsonProperty("plan")
    private String plan;
    @JsonProperty("monthid")
    private int monthId;
    @JsonProperty("amount")
    private int amount;
}
