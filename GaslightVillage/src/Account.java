public class Account implements IAccount{
  private Float currentBalance;
  private Float projectedBalanceOneYear;
  private Float defaultBuffer;
  private Float currentMonthlyFee;
  private Float expectedAnnualDeposits;
  private Float expectedAnnualExpenses;
  /**
   * @param list
   */
  @Override
  public void updateAnnualDeposits(ITransactionList list) {

  }

  /**
   * @param list
   */
  @Override
  public void updateAnnualExpenses(ITransactionList list) {

  }

  /**
   * @param buffer
   * @return
   */
  @Override
  public float calculateNewFee(Float buffer) {
    return 0;
  }

  /**
   * @return
   */
  @Override
  public float calculateNewFee() {
    return 0;
  }

  /**
   * @return
   */
  @Override
  public float calculateThreeMonthsExpenses() {
    return 0;
  }
}
