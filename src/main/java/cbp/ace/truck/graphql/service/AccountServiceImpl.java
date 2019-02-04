package cbp.ace.truck.graphql.service;

import cbp.ace.truck.graphql.dto.AccountDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AccountServiceImpl implements AccountService{
    @Value("${cbp-ace-truck-account.endpoint}")
    private String endpoint;

    public AccountDto getAccount(Long accountId){
        String url = endpoint + "/accounts/{id}";
        System.out.println("End Point :" + endpoint);
        System.out.println("Account ID:" + accountId);
        RestTemplate template = new RestTemplate();
        return template.getForObject( url, AccountDto.class, accountId );
    }
}
