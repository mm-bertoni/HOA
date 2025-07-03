public class Account implements IAccount{
  private Double currentBalance;
  private Double defaultBuffer;
  private Double currentMonthlyFee;


  public Account(Double currentMonthlyFee, Double currentBalance) {
    this.currentMonthlyFee = currentMonthlyFee;
    this.currentBalance = currentBalance;
    this.defaultBuffer = 3000.00;

  }
  public Double getCurrentMonthlyFee() {
    return currentMonthlyFee;
  }

  public Double getCurrentBalance() {
    return currentBalance;
  }
  public Double getBuffer() {
    return defaultBuffer;
  }
  public void deposit(Double amount) {
    currentBalance += amount;
  }
  public void spend(Double amount) {
    currentBalance -= amount;
  }

  /**
   * @param buffer
   * @param year
   * @return
   */
  @Override
  public Double calculateNewFee(Double buffer, int year) {
    return 0.0;
  }

  /**
   * @param year
   * @return
   */
  @Override
  public Double calculateNewFee(int year) {
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
