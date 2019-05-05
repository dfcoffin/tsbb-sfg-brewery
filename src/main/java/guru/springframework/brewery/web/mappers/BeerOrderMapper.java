package guru.springframework.brewery.web.mappers;

import guru.springframework.brewery.domain.Beer;
import guru.springframework.brewery.domain.BeerOrder;
import guru.springframework.brewery.domain.BeerOrderLine;
import guru.springframework.brewery.web.model.BeerOrderDto;
import guru.springframework.brewery.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:31
 */

@Mapper(uses = DateMapper.class)
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    default BeerOrderLine dtoToBeerOrder(BeerOrderLineDto dto){
        return BeerOrderLine.builder()
                .orderQuantity(dto.getOrderQuantity())
                .beer(Beer.builder().id(dto.getBeerId()).build())
                .build();
    }
}