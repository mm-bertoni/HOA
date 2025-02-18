package operations;

import java.time.Month;
import java.time.Year;
import java.util.List;

/**
 * An interface to govern the HOA's Budget.
 */
public interface IBudget {
  /**
   * A method to get the month's planned expenditure.
   * @param month Month
   * @param year Year
   * @return budgeted amount
   */
  public double getMonthlyPlannedExpenditure(Month month, Year year);

  /**
   * A method to get the actual monthly expenditure.
   * @param month Month
   * @param year Year
   * @return actual amount
   */
  public double getMonthlyActualExpenditure(Month month, Year year);

  /**
   * A method to get the annual planned expenditure.
   * @param year Year
   * @return planned expenditure
   */
  public double getAnnualPlannedExpenditure(Year year);

  /**
   * A method to get the actual annual expenditure.
   * @param year Year
   * @return actual expenditure
   */
  public double getAnnualActualExpenditure(Year year);

  /**
   * A method to return the budget projects for that year.
   * @param year Year
   * @return list of Projects
   */
  public List<Project> getBudgetedProjects(Year year);
}
