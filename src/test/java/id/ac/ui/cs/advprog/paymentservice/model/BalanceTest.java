package id.ac.ui.cs.advprog.paymentservice.model;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BalanceTest {
    Balance custBalance;

    @BeforeEach
    public void setUp(){
        custBalance = new Balance();
    }

    @Test
    public void getSetCustId(){
        Long custId = 1L;
        custBalance.setCustId(custId);
        assertEquals(custId, custBalance.getCustId());
    }

    @Test
    public void getSetBalance(){
        Integer balance = 1000000;
        custBalance.setCustBalance(balance);
        assertEquals(balance, custBalance.getCustBalance());
    }


}
