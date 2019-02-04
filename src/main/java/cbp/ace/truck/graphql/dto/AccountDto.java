package cbp.ace.truck.graphql.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.leangen.graphql.annotations.types.GraphQLType;

public class AccountDto {
    private long accountId;
    private String firstName;
    private String lastName;

    @JsonCreator
    public AccountDto(long accountId, String firstName, String lastName){
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AccountDto(){

    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
