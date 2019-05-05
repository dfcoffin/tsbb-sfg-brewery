package guru.springframework.brewery.repositories;

import guru.springframework.brewery.domain.BeerOrder;
import guru.springframework.brewery.domain.Customer;
import guru.springframework.brewery.domain.OrderStatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:49
 */

public interface BeerOrderRepository  extends JpaRepository<BeerOrder, UUID> {

    Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);

    List<BeerOrder> findAllByOrderStatus(OrderStatusEnum orderStatusEnum);
}