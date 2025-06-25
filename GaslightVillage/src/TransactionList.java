import java.util.ArrayList;
import java.util.List;

public class TransactionList implements ITransactionList{
  /**
   * List of HOA transactions.
   */
  private List<ITransaction> transactions;

  /**
   * Default constructor for a TransactionList
   */
  public TransactionList() {
    this.transactions = new ArrayList<ITransaction>();
  }

  /**
   * Constructor for a Transaction List with an initial transaction
   * @param transaction ITransaction
   */
  public TransactionList(ITransaction transaction) {
    this.transactions = new ArrayList<ITransaction>();
    this.transactions.add(transaction);
  }

  /**
   * @return
   */
  @Override
  public Double calculateExpectedDeposits() {
    return 0.0;
  }

  /**
   * @return
   */
  @Override
  public Double calculateExpectedExpenses() {
    return 0.0;
  }

  /**
   * @param transaction
   */
  @Override
  public void addTransaction(ITransaction transaction) {

  }
}
