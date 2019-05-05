package guru.springframework.brewery.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:29
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CreditCardDto extends BaseItem {

    @Builder
    public CreditCardDto(UUID id, Integer version, OffsetDateTime createdDate,
                         OffsetDateTime lastModifiedDate) {
        super(id, version, createdDate, lastModifiedDate);
    }

    private Integer cardNumber;
    private LocalDate expirationDate;
    private Integer cvv;
    private Boolean primary;
}