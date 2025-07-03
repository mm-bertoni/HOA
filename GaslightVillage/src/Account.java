public class Account implements IAccount{
  private Double currentBalance;
  private Double defaultBuffer;
  private Double currentMonthlyFee;


  public Account(Double currentMonthlyFee, Double currentBalance) {
    this.currentMonthlyFee = currentMonthlyFee;
    this.currentBalance = currentBalance;
    this.defaultBuffer = 3000.00;

  }

  public Double getCurrentBalance() {
    return currentBalance;
  }

  public void deposit(Double amount) {
    currentBalance += amount;
  }

  public void spend(Double amount) {
    currentBalance -= amount;
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
