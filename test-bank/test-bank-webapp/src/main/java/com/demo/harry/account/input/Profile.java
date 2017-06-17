package com.demo.harry.account.input;

import com.demo.harry.account.model.Account;
import com.demo.harry.account.model.Summary;
import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 * Created by PAWAN on 6/13/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "profile")
public class Profile {

    private String name;
    private String category;
    private String salutation;
    private String location;
    private List<Summary> accounts;


    @JsonCreator
    public Profile(@JsonProperty("name") String name,
                   @JsonProperty("category") String category,
                   @JsonProperty("salutation")String salutation,
                   @JsonProperty("location") String location,
                   @JsonProperty("accounts") List<Summary> accounts) {
        setName(name);
        setCategory(category);
        setLocation(location);
        setSalutation(salutation);
        setAccounts(accounts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Summary> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Summary> accounts) {
        this.accounts = accounts;
    }
}
