package id.ac.ui.cs.advprog.paymentservice.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SupermarketBalance {
    private Long supermarketId;
    private Integer supermarketBalance;
}