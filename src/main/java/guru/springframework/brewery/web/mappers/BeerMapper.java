package guru.springframework.brewery.web.mappers;

import guru.springframework.brewery.domain.Beer;
import guru.springframework.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:31
 */

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
