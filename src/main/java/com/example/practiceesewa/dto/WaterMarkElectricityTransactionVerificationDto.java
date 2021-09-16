package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WaterMarkElectricityTransactionVerificationDto {

    @JsonProperty("traceId")
    private String traceID;
}
