package operations;

import vendor.Contractor;

/**
 * An interface to govern an HOA Project.
 */
public interface IProject {
  /**
   * A method to get the project's name.
   * @return name
   */
  public String getName();

  /**
   * A method to get the project's estimated cost.
   * @return estimated cost
   */
  public double getEstimatedCost();

  /**
   * A method to update the project's actual cost.
   * @param actualCost in dollars
   */
  public void setActualCost(double actualCost);

  /**
   * A method to return the project's actual cost.
   * @return actualCost
   */
  public double getActualCost();

  /**
   * A method to return the project's contractor.
   * @return Contractor
   */
  public Contractor getContractor();
}
