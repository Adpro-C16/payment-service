package id.ac.ui.cs.advprog.paymentservice.repository;

import id.ac.ui.cs.advprog.paymentservice.model.Balance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BalanceRepositoryTest {
    private List<Balance> custBalances;

    @BeforeEach
    void setUp(){
        custBalances = new ArrayList<>();

        Balance custBalance1 = new Balance();
        custBalance1.setCustId(1l);
        custBalance1.setCustBalance(10000);

        Balance custBalance2 = new Balance();

        custBalance2.setCustId(2l);
        custBalance2.setCustBalance(20000);


        Balance custBalance3 = new Balance();
        custBalance3.setCustId(3l);
        custBalance3.setCustBalance(30000);

        custBalances.add(custBalance1);
        custBalances.add(custBalance2);
        custBalances.add(custBalance3);

    }

    @Test
    void testFindById() {
        Long idToFind = 2L;

        Balance foundBalance = balanceRepository.findById(idToFind);

        Assertions.assertNotNull(foundBalance);
        Assertions.assertEquals(idToFind, foundBalance.getCustId());
    }

    @Test
    void testsaveBalance(){

        Balance updatedBalance = new Balance();
        updatedBalance.setCustId(2L);
        updatedBalance.setCustBalance(25000);

        balanceRepository.saveBalance(updatedBalance);

        Balance foundBalance = balanceRepository.findById(2L);

        Assertions.assertNotNull(foundBalance);
        Assertions.assertEquals(updatedBalance.getCustBalance(), foundBalance.getCustBalance());

    }

    @Test
    void testUpdateBalance(){
        Long idToUpdate = 3L;
        int newBalanceValue = 35000;

        Balance existingBalance = balanceRepository.findById(idToUpdate);
        existingBalance.setCustBalance(newBalanceValue);

        balanceRepository.updateBalance(existingBalance);

        Balance updatedBalance = balanceRepository.findById(idToUpdate);

        Assertions.assertNotNull(updatedBalance);
        Assertions.assertEquals(newBalanceValue, updatedBalance.getCustBalance());


    }

}
