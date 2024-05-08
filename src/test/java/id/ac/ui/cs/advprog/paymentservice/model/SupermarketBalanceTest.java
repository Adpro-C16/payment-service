package id.ac.ui.cs.advprog.paymentservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupermarketBalanceTest {
    SupermarketBalance supermarketBalance;

    @BeforeEach
    public void setUp(){
        supermarketBalance = new SupermarketBalance();
    }

    @Test
    public void getSetSupermarkettId(){
        Long supermarketId = 1L;
        supermarketBalance.setSupermarketId(supermarketId);
        assertEquals(supermarketId, supermarketBalance.getSupermarketId());
    }

    @Test
    public void getSetSupermarketBalance(){
        Integer balance = 1000000;
        supermarketBalance.setSupermarketBalance(balance);
        assertEquals(balance, supermarketBalance.getSupermarketBalance());
    }

}
