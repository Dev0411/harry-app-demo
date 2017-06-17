package account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by 585152 on 6/13/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Current extends Account{

    private String balance;
    private String limit;

    @JsonCreator
    public Current(@JsonProperty("balance") String id,
                   @JsonProperty("limit") String branch,
                   @JsonProperty("name") String name,
                   @JsonProperty("currency") String currency,
                   @JsonProperty("order") String order,
                   @JsonProperty("balance") String balance,
                   @JsonProperty("limit") String limit) {
        super(id, branch, name, currency, order);
        setBalance(balance);
        setLimit(limit);
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
}
