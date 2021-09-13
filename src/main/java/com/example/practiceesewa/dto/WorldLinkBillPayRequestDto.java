package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorldLinkBillPayRequestDto {

    @JsonProperty("requestid")
    private String requestid;
    @JsonProperty("customerid")
    private String customerid;
    @JsonProperty("agenttransid")
    private String agenttransid;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("clientusername")
    private String clientusername;
    @JsonProperty("password")
    private String password;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("userid")
    private String userid;
    @JsonProperty("packageid")
    private String packageid;

}
