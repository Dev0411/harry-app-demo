package com.demo.harry.account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by 585152 on 6/13/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposits extends Account {
    private String maturityDate;
    private String initial;
    private String interest;

    @JsonCreator
    public Deposits(@JsonProperty("id") String id,
                    @JsonProperty("branch") String branch,
                    @JsonProperty("name") String name,
                    @JsonProperty("currency") String currency,
                    @JsonProperty("order") String order,
                    @JsonProperty("initial") String initial,
                    @JsonProperty("interest") String interest,
                    @JsonProperty("maturityDate") String maturityDate) {

        super(id, branch, name, currency, order);
        setInitial(initial);
        setInterest(interest);
        setMaturityDate(maturityDate);
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }


}
