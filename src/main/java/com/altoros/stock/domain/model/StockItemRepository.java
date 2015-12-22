package com.altoros.stock.domain.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by uladzimir.ziankevich on 12/22/2015.
 */
public interface StockItemRepository extends CrudRepository<StockItem, Long> {

    List<StockItem> findByType(ItemType type);

}
