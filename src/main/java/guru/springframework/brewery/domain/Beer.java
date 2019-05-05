package guru.springframework.brewery.domain;

import guru.springframework.brewery.web.model.BeerStyleEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Donald F. Coffin 2019/05/05 at 00:22
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Beer extends BaseEntity {

    @Builder
    public Beer(UUID id, Long version, Timestamp createdData, Timestamp lastModifiedDate, String beerName,
                BeerStyleEnum beerStyle, Long upc, Integer minOnHand,
                Integer quantityToBrew, BigDecimal price, Set<BeerInventory> beerInventory) {
        super  (id, version, createdData, lastModifiedDate);
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
        this.minOnHand = minOnHand;
        this.quantityToBrew = quantityToBrew;
        this.price = price;
        this.beerInventory = beerInventory;
    }

    private String beerName;
    private BeerStyleEnum beerStyle;

    @Column(unique = true)
    private Long upc;

    /**
     * Min on hand qty - used to trigger brew
     */
    private Integer minOnHand;
    private Integer quantityToBrew;
    private BigDecimal price;

    @OneToMany(mappedBy = "beer")
    private Set<BeerInventory> beerInventory;
}
