package guru.springframework.brewery.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:31
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrderStatusUpdate extends BaseItem {

    @Builder
    public OrderStatusUpdate(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                             UUID orderId, OrderStatusEnum orderStatus) {
        super(id, version, createdDate, lastModifiedDate);
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    private UUID orderId;
    private String customerRef;
    private OrderStatusEnum orderStatus;
}