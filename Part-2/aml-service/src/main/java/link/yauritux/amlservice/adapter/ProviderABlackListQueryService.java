package link.yauritux.amlservice.adapter;

import link.yauritux.amlservice.domain.model.BlackList;
import link.yauritux.amlservice.domain.repository.BlackListRepository;
import link.yauritux.amlservice.domain.service.BlackListQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class ProviderABlackListQueryService implements BlackListQueryService {

    private final BlackListRepository repository;

    @Override
    public BlackList fetchById(Long id) {
        return repository.findById(id);
    }
}
