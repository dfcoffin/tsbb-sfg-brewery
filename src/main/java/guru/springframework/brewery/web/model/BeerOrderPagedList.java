package guru.springframework.brewery.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:28
 */

public class BeerOrderPagedList extends PageImpl<BeerOrderDto> {
    public BeerOrderPagedList(List<BeerOrderDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerOrderPagedList(List<BeerOrderDto> content) {
        super(content);
    }
}