package operations;

import java.time.Month;
import java.time.Year;
import java.util.List;

public interface IBudget {
  public double getMonthlyExpenditure(Month month, Year year);
  public double getAnnualExpenditure(Year year);
  public List<Project> getBudgetedProjects();
}
