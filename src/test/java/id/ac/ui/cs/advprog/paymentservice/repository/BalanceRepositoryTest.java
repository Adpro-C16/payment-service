package id.ac.ui.cs.advprog.paymentservice.repository;
import id.ac.ui.cs.advprog.paymentservice.model.Balance;
import id.ac.ui.cs.advprog.paymentservice.model.SupermarketBalance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BalanceRepositoryTest {

    @Mock
    private BalanceRepository balanceRepository;

    @InjectMocks

    private Balance custBalance;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks

        custBalance = new Balance();
        custBalance.setCustId(1L);
        custBalance.setCustBalance(100000);
    }

    @Test
    void testFindByCustId() {
        when(balanceRepository.findById(1L)).thenReturn(Optional.of(custBalance));
        Optional<Balance> result = balanceService.findByCustId(1L);
        assertEquals(Optional.of(custBalance), result);
    }
}
