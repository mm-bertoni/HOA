public interface IAccount {
  public void updateAnnualDeposits(ITransactionList list);
  public void updateAnnualExpenses(ITransactionList list);
  public Double calculateNewFee(Double buffer);
  public Double calculateNewFee();
  public Double calculateThreeMonthsExpenses();
}
