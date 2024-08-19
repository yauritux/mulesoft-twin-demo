package link.yauritux.amlservice.domain.repository;

import link.yauritux.amlservice.domain.model.BlackList;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 */
public interface BlackListRepository {

    BlackList findById(Long id);
}
