package cbp.ace.truck.graphql.service;

import cbp.ace.truck.graphql.dto.AccountDto;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class AccountServiceMock implements AccountService{

    @Override
    public AccountDto getAccount(Long accountId) {
        AccountDto account = new AccountDto();
        account.setAccountId(1);
        account.setFirstName("John");
        account.setLastName("Doe");
        return account;
    }
}
