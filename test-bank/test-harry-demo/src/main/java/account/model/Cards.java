package account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by PAWAN on 6/13/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cards extends Account {

    private String type;

    private String consumedLimit;


    @JsonCreator
    public Cards(@JsonProperty("id") String id,
                 @JsonProperty("branch") String branch,
                 @JsonProperty("name") String name,
                 @JsonProperty("currency") String currency,
                 @JsonProperty("order") String order,
                 @JsonProperty("type") String type,
                 @JsonProperty("consumedLimit") String consumedLimit) {
        super(id, branch, name, currency, order);
        setType(type);
        setConsumedLimit(consumedLimit);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConsumedLimit() {
        return consumedLimit;
    }

    public void setConsumedLimit(String consumedLimit) {
        this.consumedLimit = consumedLimit;
    }
}
