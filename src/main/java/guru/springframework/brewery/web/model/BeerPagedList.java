package guru.springframework.brewery.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Donald F. Coffin 2019/05/05 at 01:29
 */

public class BeerPagedList extends PageImpl<BeerDto> {
    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}