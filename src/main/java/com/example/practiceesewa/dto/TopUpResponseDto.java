package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class TopUpResponseDto {
    @JsonProperty("resultCode")
    private String resultCode;
    @JsonProperty("resultDescription")
    private String resultDescription;
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("mobileNo")
    private String mobileNo;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("vendorTransId")
    private String vendorTransId;
    @JsonProperty("agentTransId")
    private String agentTransId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("resultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("resultDescription")
    public String getResultDescription() {
        return resultDescription;
    }

    @JsonProperty("resultDescription")
    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("mobileNo")
    public String getMobileNo() {
        return mobileNo;
    }

    @JsonProperty("mobileNo")
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("vendorTransId")
    public String getVendorTransId() {
        return vendorTransId;
    }

    @JsonProperty("vendorTransId")
    public void setVendorTransId(String vendorTransId) {
        this.vendorTransId = vendorTransId;
    }

    @JsonProperty("agentTransId")
    public String getAgentTransId() {
        return agentTransId;
    }

    @JsonProperty("agentTransId")
    public void setAgentTransId(String agentTransId) {
        this.agentTransId = agentTransId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "TopUpResponseDto{" +
                "resultCode='" + resultCode + '\'' +
                ", resultDescription='" + resultDescription + '\'' +
                ", requestId='" + requestId + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", amount='" + amount + '\'' +
                ", vendorTransId='" + vendorTransId + '\'' +
                ", agentTransId='" + agentTransId + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
