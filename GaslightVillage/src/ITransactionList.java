public interface ITransactionList {
  public Double calculateExpectedDeposits();
  public Double calculateExpectedExpenses();
  public void addTransaction(ITransaction transaction);
}
