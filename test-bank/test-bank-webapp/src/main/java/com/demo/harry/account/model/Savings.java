package com.demo.harry.account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Pawan on 6/13/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Savings extends  Account{
    private String balance;

    @JsonCreator
    public Savings(@JsonProperty("id") String id,
                   @JsonProperty("branch") String branch,
                   @JsonProperty("name") String name,
                   @JsonProperty("currency") String currency,
                   @JsonProperty("order") String order,
                   @JsonProperty("balance") String balance) {
        super(id, branch, name, currency, order);
        setBalance(balance);
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
