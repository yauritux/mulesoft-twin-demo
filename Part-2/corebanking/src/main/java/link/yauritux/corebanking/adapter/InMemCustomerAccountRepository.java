package link.yauritux.corebanking.adapter;

import link.yauritux.corebanking.domain.model.CustomerAccount;
import link.yauritux.corebanking.domain.repository.CustomerAccountRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 */
@Repository
public class InMemCustomerAccountRepository implements CustomerAccountRepository {

    private final Map<Long, CustomerAccount> customerAccounts;

    public InMemCustomerAccountRepository() {
        this.customerAccounts = new HashMap<>();
        this.customerAccounts.put(1L, new CustomerAccount(1L, "Uzumaki Naruto", true));
        this.customerAccounts.put(2L, new CustomerAccount(2L, "Natsu Dragneel", true));
        this.customerAccounts.put(3L, new CustomerAccount(3L, "Rebecca L", false));
        this.customerAccounts.put(4L, new CustomerAccount(4L, "Yauri Attamimi", true));
        this.customerAccounts.put(5L, new CustomerAccount(5L, "Jessica L", false));
    }

    @Override
    public CustomerAccount fetchById(Long id) {
        return this.customerAccounts.get(id);
    }
}
