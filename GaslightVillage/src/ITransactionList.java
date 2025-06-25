public interface ITransactionList {
  public Float calculateExpectedDeposits();
  public Float calculateExpectedExpenses();
  public void addTransaction(ITransaction transaction);
}
