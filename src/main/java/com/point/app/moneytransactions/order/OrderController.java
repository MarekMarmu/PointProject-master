package com.point.app.moneytransactions.order;

import com.point.app.exceptions.NotMatchingPriceException;
import com.point.app.moneytransactions.order.dto.OrderAck;
import com.point.app.moneytransactions.order.dto.OrderRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class OrderController {

    private OrderService orderService;
//    @PostMapping("/orderPlacement")
//    public OrderAck placeOrder(@RequestBody OrderRequest orderRequest) throws NotMatchingPriceException {
//
//        return  orderService.placingOrder(orderRequest);

    }


