package link.yauritux.amlservice.adapter;

import link.yauritux.amlservice.domain.model.BlackList;
import link.yauritux.amlservice.domain.repository.BlackListRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 */
@Repository
public class InMemBlackListRepository implements BlackListRepository {

    Map<Long, BlackList> blackListMap;

    public InMemBlackListRepository() {
        blackListMap = new HashMap<>();
        blackListMap.put(1L, new BlackList(1L, "Fake account"));
        blackListMap.put(2L, new BlackList(2L, "Indicated as a Robot"));
        blackListMap.put(3L, new BlackList(3L, "Terrorist account"));
    }

    @Override
    public BlackList findById(Long id) {
        return blackListMap.get(id);
    }
}
