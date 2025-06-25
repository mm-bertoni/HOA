public interface IAccount {
  public void updateAnnualDeposits(ITransactionList list);
  public void updateAnnualExpenses(ITransactionList list);
  public float calculateNewFee(Float buffer);
  public float calculateNewFee();
  public float calculateThreeMonthsExpenses();
}
