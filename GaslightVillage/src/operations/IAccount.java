package operations;

import java.time.Month;

/**
 * A class to model Accounts for an HOA.
 */
public interface IAccount {
  public void deposit(double amount);
  public void withdraw(double amount);
  public double getBalance();
  public void getMonthlyInterest(Month month);
  public double[] getMonthlySummary();
}
