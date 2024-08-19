package link.yauritux.amlservice.application;

import link.yauritux.amlservice.adapter.dto.ResponseMessage;
import link.yauritux.amlservice.domain.model.BlackList;
import link.yauritux.amlservice.domain.service.BlackListQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 */
@RestController
@RequestMapping("/aml")
@RequiredArgsConstructor
public class BlackListController {

    private final BlackListQueryService queryService;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseMessage> findById(@PathVariable String id) {
        var response = queryService.fetchById(Long.parseLong(id));
        return ResponseEntity.ok().body(new ResponseMessage(200,
                response != null ? response.reason() : "No Fraud Detected"));
    }
}
