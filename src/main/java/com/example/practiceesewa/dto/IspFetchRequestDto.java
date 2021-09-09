package com.example.practiceesewa.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class IspFetchRequestDto {

    @JsonProperty("requestid")
    private String requestid;
    @JsonProperty("agenttransid")
    private String agenttransid;
    @JsonProperty("customerid")
    private String customerid;
    @JsonProperty("clientusername")
    private String clientusername;
    @JsonProperty("password")
    private String password;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("userid")
    private String userid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("requestid")
    public String getRequestid() {
        return requestid;
    }

    @JsonProperty("requestid")
    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public IspFetchRequestDto withRequestid(String requestid) {
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

    public IspFetchRequestDto withAgenttransid(String agenttransid) {
        this.agenttransid = agenttransid;
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

    public IspFetchRequestDto withCustomerid(String customerid) {
        this.customerid = customerid;
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

    public IspFetchRequestDto withClientusername(String clientusername) {
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

    public IspFetchRequestDto withPassword(String password) {
        this.password = password;
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

    public IspFetchRequestDto withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }

    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public IspFetchRequestDto withUserid(String userid) {
        this.userid = userid;
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

    public IspFetchRequestDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


}
