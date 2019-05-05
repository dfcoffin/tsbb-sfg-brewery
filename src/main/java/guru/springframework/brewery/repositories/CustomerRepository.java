package guru.springframework.brewery.repositories;

import guru.springframework.brewery.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:50
 */

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}