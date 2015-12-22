package com.altoros.stock.domain.model;

/**
 * Created by uladzimir.ziankevich on 12/22/2015.
 */
public enum ItemType {

    UNKNOWN(1L),
    ELECTRONICS(2L),
    CD(3L);

    Long id;

    ItemType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
