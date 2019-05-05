package guru.springframework.brewery.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:32
 */

@Component
public class BeerOrderStatusChangeEventListener {

    @Async
    @EventListener
    public void listen(BeerOrderStatusChangeEvent event) {
        System.out.println("I got an order status change event");
        System.out.println(event);
    }
}
