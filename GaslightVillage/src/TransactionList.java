import java.util.List;

public class TransactionList implements ITransactionList{

  private List<ITransaction> transactions;

  /**
   * @return
   */
  @Override
  public Float calculateExpectedDeposits() {
    return 0f;
  }

  /**
   * @return
   */
  @Override
  public Float calculateExpectedExpenses() {
    return 0f;
  }

  /**
   * @param transaction
   */
  @Override
  public void addTransaction(ITransaction transaction) {

  }
}
