package com.springhow.examples.drools.domain;

public class OrderRequest {
    private Integer sugarLevel ;
    private String message;
    

    public Integer getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(Integer sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   
}
