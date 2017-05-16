package com.bittrex.responsebody;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by root on 17-5-16.
 */
public class GetCurrencies {
    Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    String message ;

    @JsonProperty("result")
     private List<CurrentInfo> result;

    public List<CurrentInfo> getResult() {
        return result;
    }

    public void setResult(List<CurrentInfo> result) {
        this.result = result;
    }
}
