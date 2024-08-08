package com.order;

import lombok.Getter;

@Getter
public class OrderPlacedEvent {
    private final Order order;

    public OrderPlacedEvent(Order order) {
        this.order = order;
    }
}
