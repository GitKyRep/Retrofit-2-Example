package com.japati.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Value {
    @SerializedName("message")
    private String message;
    @SerializedName("value")
    private String value;

    List<Result> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public List<Result> getResult() {
        return result;
    }
}
