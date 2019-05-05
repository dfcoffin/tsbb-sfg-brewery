package guru.springframework.brewery.repositories;

import guru.springframework.brewery.domain.Beer;
import guru.springframework.brewery.domain.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:49
 */
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeer(Beer beer);
}
