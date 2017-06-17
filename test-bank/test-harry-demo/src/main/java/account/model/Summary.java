package account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by PAWAN on 6/13/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary {

    private List<Account> current;
    private List<Account> savings;
    private List<Account> deposits;
    private List<Account> cards;
    private List<Account> loans;


    @JsonCreator
    public Summary(@JsonProperty("current") List<Account> current,
                   @JsonProperty("savings") List<Account> savings,
                   @JsonProperty("deposits") List<Account> deposits,
                   @JsonProperty("cards") List<Account> cards,
                   @JsonProperty("loans") List<Account> loans) {

        setCurrent(current);
        setSavings(savings);
        setDeposits(deposits);
        setCards(cards);
        setLoans(loans);
    }

    public List<Account> getCurrent() {
        return current;
    }

    public void setCurrent(List<Account> current) {
        this.current = current;
    }

    public List<Account> getSavings() {
        return savings;
    }

    public void setSavings(List<Account> savings) {
        this.savings = savings;
    }

    public List<Account> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Account> deposits) {
        this.deposits = deposits;
    }

    public List<Account> getCards() {
        return cards;
    }

    public void setCards(List<Account> cards) {
        this.cards = cards;
    }

    public List<Account> getLoans() {
        return loans;
    }

    public void setLoans(List<Account> loans) {
        this.loans = loans;
    }
}
