package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BpcElectricityBillPaymentDto {

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
    @JsonProperty("consumerid")
    private int consumerId;
    @JsonProperty("counter")
    private String counter;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("paymentDetails")
    private List<BpcPaymentDetailsDto> bpcPaymentDetailsDtoList;
}
