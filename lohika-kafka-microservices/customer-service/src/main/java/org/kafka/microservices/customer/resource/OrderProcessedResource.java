package org.kafka.microservices.customer.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProcessedResource {

    private String login;
    private String uid;
    private BigDecimal price;
    private List<OrderProductResource> products;

}
