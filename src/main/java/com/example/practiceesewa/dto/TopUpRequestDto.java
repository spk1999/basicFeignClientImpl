package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class TopUpRequestDto {
    @JsonProperty("servicecode")
    private String servicecode;
    @JsonProperty("requestid")
    private String requestid;
    @JsonProperty("agenttransid")
    private String agenttransid;
    @JsonProperty("clientusername")
    private String clientusername;
    @JsonProperty("password")
    private String password;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("mobileno")
    private String mobileno;
    @JsonProperty("customerid")
    private String customerid;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("walletid")
    private String walletid;
    @JsonProperty("bankcode")
    private String bankcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("servicecode")
    public String getServicecode() {
        return servicecode;
    }

    @JsonProperty("servicecode")
    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public TopUpRequestDto withServicecode(String servicecode) {
        this.servicecode = servicecode;
        return this;
    }

    @JsonProperty("requestid")
    public String getRequestid() {
        return requestid;
    }

    @JsonProperty("requestid")
    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public TopUpRequestDto withRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }

    @JsonProperty("agenttransid")
    public String getAgenttransid() {
        return agenttransid;
    }

    @JsonProperty("agenttransid")
    public void setAgenttransid(String agenttransid) {
        this.agenttransid = agenttransid;
    }

    public TopUpRequestDto withAgenttransid(String agenttransid) {
        this.agenttransid = agenttransid;
        return this;
    }

    @JsonProperty("clientusername")
    public String getClientusername() {
        return clientusername;
    }

    @JsonProperty("clientusername")
    public void setClientusername(String clientusername) {
        this.clientusername = clientusername;
    }

    public TopUpRequestDto withClientusername(String clientusername) {
        this.clientusername = clientusername;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public TopUpRequestDto withPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TopUpRequestDto withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("mobileno")
    public String getMobileno() {
        return mobileno;
    }

    @JsonProperty("mobileno")
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public TopUpRequestDto withMobileno(String mobileno) {
        this.mobileno = mobileno;
        return this;
    }

    @JsonProperty("customerid")
    public String getCustomerid() {
        return customerid;
    }

    @JsonProperty("customerid")
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public TopUpRequestDto withCustomerid(String customerid) {
        this.customerid = customerid;
        return this;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public TopUpRequestDto withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    @JsonProperty("walletid")
    public String getWalletid() {
        return walletid;
    }

    @JsonProperty("walletid")
    public void setWalletid(String walletid) {
        this.walletid = walletid;
    }

    public TopUpRequestDto withWalletid(String walletid) {
        this.walletid = walletid;
        return this;
    }

    @JsonProperty("bankcode")
    public String getBankcode() {
        return bankcode;
    }

    @JsonProperty("bankcode")
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public TopUpRequestDto withBankcode(String bankcode) {
        this.bankcode = bankcode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TopUpRequestDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "TopUpRequestDto{" +
                "servicecode='" + servicecode + '\'' +
                ", requestid='" + requestid + '\'' +
                ", agenttransid='" + agenttransid + '\'' +
                ", clientusername='" + clientusername + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", mobileno='" + mobileno + '\'' +
                ", customerid='" + customerid + '\'' +
                ", channel='" + channel + '\'' +
                ", walletid='" + walletid + '\'' +
                ", bankcode='" + bankcode + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
