package operations;

import java.time.Month;

public interface IAccount {
  public void deposit(double amount);
  public void withdraw(double amount);
  public double getBalance();
  public void getMonthlyInterest(Month month);
  public double[] getMonthlySummary();
}
