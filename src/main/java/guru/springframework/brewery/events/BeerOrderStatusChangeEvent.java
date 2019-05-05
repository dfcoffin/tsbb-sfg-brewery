package guru.springframework.brewery.events;

import guru.springframework.brewery.domain.BeerOrder;
import guru.springframework.brewery.domain.OrderStatusEnum;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:32
 */
public class BeerOrderStatusChangeEvent extends ApplicationEvent {

    private final OrderStatusEnum previousStatus;

    public BeerOrderStatusChangeEvent(BeerOrder source, OrderStatusEnum previousStatus) {
        super(source);
        this.previousStatus = previousStatus;
    }

    public OrderStatusEnum getPreviousStatus() {
        return previousStatus;
    }
}
