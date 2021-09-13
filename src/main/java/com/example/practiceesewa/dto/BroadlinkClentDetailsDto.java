package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BroadlinkClentDetailsDto {
    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("requestid")
    private String requestId;
    @JsonProperty("agenttransid")
    private String agentTransId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("bankcode")
    private String bankCode;
    @JsonProperty("cusomerid")
    private String cusomerId;
    @JsonProperty("userid")
    private String userId;
}
