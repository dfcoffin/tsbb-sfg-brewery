package guru.springframework.brewery.repositories;

import guru.springframework.brewery.domain.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:49
 */

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}