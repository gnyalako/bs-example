package cbp.ace.truck.graphql.controller;

import cbp.ace.truck.graphql.dto.AccountDto;
import cbp.ace.truck.graphql.dto.AccountMetricsDto;
import cbp.ace.truck.graphql.service.AccountService;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotation.GraphQLApi;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@GraphQLApi
@Service
public class AccountController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private Mapper mapper;

    @GraphQLQuery(name = "accounts")
    public AccountDto getAccount(@GraphQLNonNull Long accountId){
        return accountService.getAccount(accountId);
    }

    @GraphQLQuery(name = "users")
    public AccountDto getUser(@GraphQLNonNull Long userId){
        return accountService.getAccount(userId);
    }

    @GraphQLQuery(name = "accountmetrics")
    public AccountMetricsDto getAccountMetrics(String userId, String startDate, String endDate){
        return new AccountMetricsDto( random(), random(), random(), random(), random(), random(), random() );
    }

    private int random(){
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }


}
