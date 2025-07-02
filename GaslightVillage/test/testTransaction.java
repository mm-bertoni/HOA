import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import Helpers.Category;
import Helpers.TransactionType;

public class testTransaction {
  Transaction transaction = new Transaction(TransactionType.Planned, LocalDate.of(2025,12,12), Category.Insurance, 2000);
  @Test
  public void testProject(){
    Project testProject = new Project("Insurance Co", Category.Insurance);
    transaction.setProject(testProject);
    Assertions.assertEquals(testProject, transaction.getProject());
  }

  @Test
  public void testAmount(){
    Assertions.assertEquals(2000,transaction.getAmount());
    transaction.setAmount(5000);
    Assertions.assertEquals(5000,transaction.getAmount());
  }

  @Test
  public void testCategory(){
    Assertions.assertEquals(Category.Insurance,transaction.getCategory());
    transaction.setCategory(Category.Water);
    Assertions.assertEquals(Category.Water,transaction.getCategory());

  }

  @Test
  public void testDate(){
    Assertions.assertEquals(LocalDate.of(2025,12,12),transaction.getDate());
    transaction.setDate(LocalDate.of(2026,1,13));
    Assertions.assertEquals(LocalDate.of(2026,1,13),transaction.getDate());
  }

  @Test
  public void testType(){
    Assertions.assertEquals(TransactionType.Planned,transaction.getType());
    transaction.setType(TransactionType.Actual);
    Assertions.assertEquals(TransactionType.Actual,transaction.getType());
  }
}
