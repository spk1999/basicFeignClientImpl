package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CodeNameDto {
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
}
