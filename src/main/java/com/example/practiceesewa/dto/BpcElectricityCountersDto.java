package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BpcElectricityCountersDto {

    @JsonProperty("clientusername")
    private String clientUserName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("channel")
    private String channel;

}
