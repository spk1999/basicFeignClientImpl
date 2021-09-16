package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BpcPaymentDetailsDto {

    @JsonProperty("id")
    private String id;
    @JsonProperty("billno")
    private String billNo;
    @JsonProperty("billtype")
    private String billType;
    @JsonProperty("billyear")
    private String billYear;
    @JsonProperty("billmonth")
    private String billMonth;
    @JsonProperty("billdate")
    private String billDate;
    @JsonProperty("billAmount")
    private String billAmount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("surcharge")
    private String surCharge;
    @JsonProperty("rebateamount")
    private String rebateAmount;
    @JsonProperty("totalamount")
    private float totalAmount;
}
