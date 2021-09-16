package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ThaibaKhanepaniBillPaymentDto {
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
    private String customerid;
    @JsonProperty("customercode")
    private String customerCode;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("totalamount")
    private String totalAmount;
    @JsonProperty("totalmonthcount")
    private String totalMonthCount;
    @JsonProperty("advanceamount")
    private String advanceAmount;
    @JsonProperty("penaltyamount")
    private String penaltyAmount;
    @JsonProperty("rebateamount")
    private String rebateAmount;
    @JsonProperty("lastpaymentmonth")
    private String lastPaymentMonth;
}
