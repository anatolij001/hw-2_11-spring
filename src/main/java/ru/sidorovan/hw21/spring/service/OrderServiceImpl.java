package ru.sidorovan.hw21.spring.service;

import org.springframework.stereotype.Service;
import ru.sidorovan.hw21.spring.model.Busket;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Busket busket;

    public OrderServiceImpl(Busket busket) {
        this.busket = busket;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return busket.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return busket.getItems();
    }
}
