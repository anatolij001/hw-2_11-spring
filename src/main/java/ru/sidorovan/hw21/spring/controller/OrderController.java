package ru.sidorovan.hw21.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sidorovan.hw21.spring.service.OrderService;


import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids){
        return orderService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems(){
        return orderService.getItems();
    }

}
