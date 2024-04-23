package se.dsve.ecoeats.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    //we have many items in orderproduct now, so just use it, not repeat it again here
    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts;
}