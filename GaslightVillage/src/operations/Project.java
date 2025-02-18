package operations;

import vendor.Contractor;

/**
 * A class for an HOA Project.
 */
public class Project implements IProject{
  /**
   * A method to get the project's name.
   *
   * @return name
   */
  @Override
  public String getName() {
    return "";
  }

  /**
   * A method to get the project's estimated cost.
   *
   * @return estimated cost
   */
  @Override
  public double getEstimatedCost() {
    return 0;
  }

  /**
   * A method to update the project's actual cost.
   *
   * @param actualCost in dollars
   */
  @Override
  public void setActualCost(double actualCost) {

  }

  /**
   * A method to return the project's actual cost.
   *
   * @return actualCost
   */
  @Override
  public double getActualCost() {
    return 0;
  }

  /**
   * A method to return the project's contractor.
   *
   * @return Contractor
   */
  @Override
  public Contractor getContractor() {
    return null;
  }
}
