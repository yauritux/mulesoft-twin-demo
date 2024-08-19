package link.yauritux.corebanking.domain.model;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 *
 * @param id
 * @param fullName
 * @param gender
 */
public record CustomerAccount(Long id, String fullName, boolean gender) {
}
