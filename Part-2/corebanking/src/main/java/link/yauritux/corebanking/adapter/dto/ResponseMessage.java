package link.yauritux.corebanking.adapter.dto;

import link.yauritux.corebanking.domain.model.CustomerAccount;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 * @param code
 * @param message
 */
public record ResponseMessage(int code, String message, CustomerAccount data) {
}
