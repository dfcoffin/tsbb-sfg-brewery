package guru.springframework.brewery.repositories;

import guru.springframework.brewery.domain.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:50
 */

public interface BreweryRepository extends JpaRepository<Brewery, UUID> {
}