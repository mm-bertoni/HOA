public class Account implements IAccount{
  private Float currentBalance;
  private Float projectedBalanceOneYear;
  private Float defaultBuffer;
  private Float currentMonthlyFee;
  private Float expectedAnnualDeposits;
  private Float expectedAnnualExpenses;

  public Account(Float currentMonthlyFee, Float currentBalance) {
    this.currentMonthlyFee = currentMonthlyFee;
    this.currentBalance = currentBalance;
    this.defaultBuffer = 3000.00;
  }
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
  public Double calculateNewFee(Double buffer) {
    return 0.0;
  }

  /**
   * @return
   */
  @Override
  public Double calculateNewFee() {
    return 0.0;
  }

  /**
   * @return
   */
  @Override
  public Double calculateThreeMonthsExpenses() {
    return 0.0;
  }
}
