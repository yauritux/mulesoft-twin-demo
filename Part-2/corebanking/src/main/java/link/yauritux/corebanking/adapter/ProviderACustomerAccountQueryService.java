package link.yauritux.corebanking.adapter;

import link.yauritux.corebanking.domain.model.CustomerAccount;
import link.yauritux.corebanking.domain.repository.CustomerAccountRepository;
import link.yauritux.corebanking.domain.service.CustomerAccountQueryService;
import link.yauritux.corebanking.shared.exceptions.type.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 */
@Service
@RequiredArgsConstructor
public class ProviderACustomerAccountQueryService implements CustomerAccountQueryService {

    private final CustomerAccountRepository repository;

    @Override
    public CustomerAccount findByAccountNumber(Long accountNumber) throws NotFoundException {
        var result = repository.fetchById(accountNumber);
        if (result == null) {
            throw new NotFoundException("Cannot find account with ID " + accountNumber);
        }
        return result;
    }
}
