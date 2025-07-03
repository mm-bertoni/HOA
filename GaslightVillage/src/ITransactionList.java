import java.util.List;

public interface ITransactionList {
  public Double calculateExpectedDeposits(int year);
  public Double calculateExpectedExpenses(int year);
  public void addTransaction(ITransaction transaction);
  public List<ITransaction> getTransactions();
}
