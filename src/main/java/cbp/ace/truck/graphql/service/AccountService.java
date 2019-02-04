package cbp.ace.truck.graphql.service;

import cbp.ace.truck.graphql.dto.AccountDto;

public interface AccountService {
    AccountDto getAccount(Long accountId);
}
