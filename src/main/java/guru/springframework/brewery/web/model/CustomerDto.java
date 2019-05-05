package guru.springframework.brewery.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:30
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CustomerDto extends BaseItem {

    @Builder
    public CustomerDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate, String name,
                       List<CreditCardDto> creditCards) {
        super(id, version, createdDate, lastModifiedDate);
        this.name = name;
        this.creditCards = creditCards;
    }

    private String name;
    private List<CreditCardDto> creditCards;
}