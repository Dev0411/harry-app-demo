package account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by 585152 on 6/13/2017.
 */
@JsonRootName(value = "account")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    private String  id;
    private String branch;
    private String name;
    private String currency;
    private String order;

    @JsonCreator
    public Account(@JsonProperty("id") String id,
                   @JsonProperty("branch") String branch,
                   @JsonProperty("name") String name,
                   @JsonProperty("currency") String currency,
                   @JsonProperty("order") String order) {

        setId(id);
        setBranch(branch);
        setName(name);
        setCurrency(currency);
        setOrder(order);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
