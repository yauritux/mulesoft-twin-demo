package link.yauritux.corebanking.domain.repository;

import link.yauritux.corebanking.domain.model.CustomerAccount;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 */
public interface CustomerAccountRepository {

    CustomerAccount fetchById(Long id);
}
