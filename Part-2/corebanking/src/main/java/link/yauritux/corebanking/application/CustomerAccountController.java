package link.yauritux.corebanking.application;

import link.yauritux.corebanking.domain.model.CustomerAccount;
import link.yauritux.corebanking.domain.service.CustomerAccountQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 */
@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class CustomerAccountController {

    private final CustomerAccountQueryService queryService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerAccount> findByAccountId(@PathVariable String id) {
        var response = queryService.findByAccountNumber(Long.parseLong(id));
        return ResponseEntity.ok().body(response);
    }
}
