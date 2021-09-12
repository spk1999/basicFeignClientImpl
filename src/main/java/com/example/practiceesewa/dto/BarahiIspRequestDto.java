package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BarahiIspRequestDto {
    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("userid")
    private String userId;
    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("bankCode")
    private String bankCode;
}
