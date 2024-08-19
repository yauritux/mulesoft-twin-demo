package link.yauritux.corebanking.domain.service;

import link.yauritux.corebanking.domain.model.CustomerAccount;
import link.yauritux.corebanking.shared.exceptions.type.NotFoundException;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 */
public interface CustomerAccountQueryService {

    CustomerAccount findByAccountNumber(Long accountNumber) throws NotFoundException;
}
