package link.yauritux.amlservice.domain.service;

import link.yauritux.amlservice.domain.model.BlackList;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 */
public interface BlackListQueryService {

    BlackList fetchById(Long id);
}
