public class Account implements IAccount{
  private Double currentBalance;
  private Double projectedBalanceOneYear;
  private Double defaultBuffer;
  private Double currentMonthlyFee;
  private Double expectedAnnualDeposits;
  private Double expectedAnnualExpenses;

  public Account(Double currentMonthlyFee, Double currentBalance) {
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
