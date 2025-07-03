import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import Helpers.Category;
import Helpers.TransactionType;

public class testTransactionList {
  Transaction t1 = new Transaction(TransactionType.Actual, LocalDate.of(2025,1,2), Category.Water, -50);
  Transaction t2 = new Transaction(TransactionType.Planned, LocalDate.of(2026,12,12), Category.Fee, 800);
  Transaction t3 = new Transaction(TransactionType.Planned, LocalDate.of(2025,11,11), Category.Insurance, -1000);
  Transaction t4 = new Transaction(TransactionType.Actual, LocalDate.of(2025,2,12), Category.Fee, 800);
  TransactionList testList = new TransactionList(t1);
  @BeforeEach
          void setUp() {

    testList.addTransaction(t2);
    testList.addTransaction(t3);
    testList.addTransaction(t4);

  }


  @Test
  public void testCalculateExpectedDeposits(){
    Assertions.assertEquals(800,testList.calculateExpectedDeposits(2025));
    Assertions.assertEquals(800,testList.calculateExpectedDeposits(2026));
  }

  @Test
  public void testCalculateExpectedExpenses(){
    Assertions.assertEquals(-1050,testList.calculateExpectedExpenses(2025));
  }

  @Test
  public void testAddTransaction(){
    Assertions.assertEquals(4,testList.getTransactions().size());
  }



}
