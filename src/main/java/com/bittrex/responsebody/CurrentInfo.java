package com.bittrex.responsebody;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by root on 17-5-16.
 */
public class CurrentInfo {
    @JsonProperty("Currency")
    String Currency;

    @JsonProperty("CurrencyLong")
    String CurrencyLong;

    @JsonProperty("MinConfirmation")
    int MinConfirmation;

    @JsonProperty("TxFee")
    float TxFee;

    @JsonProperty("IsActive")
    Boolean IsActive;

    @JsonProperty("CoinType")
    String CoinType;

    @JsonProperty("BaseAddress")
    String BaseAddress;

    @JsonProperty("Notice")
    String Notice;

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        this.Currency = currency;
    }

    public String getCurrencyLong() {
        return CurrencyLong;
    }

    public void setCurrencyLong(String currencyLong) {
        this.CurrencyLong = currencyLong;
    }

    public int getMinConfirmation() {
        return MinConfirmation;
    }

    public void setMinConfirmation(int minConfirmation) {
        MinConfirmation = minConfirmation;
    }

    public float getTxFee() {
        return TxFee;
    }

    public void setTxFee(float txFee) {
        TxFee = txFee;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    public String getCoinType() {
        return CoinType;
    }

    public void setCoinType(String coinType) {
        CoinType = coinType;
    }

    public String getBaseAddress() {
        return BaseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        BaseAddress = baseAddress;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
    //    "Currency":"BTC","CurrencyLong":"Bitcoin","MinConfirmation":2,"TxFee":0.00050000,"IsActive":true,"CoinType":"BITCOIN","BaseAddress":null,"Notice":null
}
