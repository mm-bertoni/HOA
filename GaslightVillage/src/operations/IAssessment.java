package operations;

import hoa.Owner;

/**
 * An interface to govern HOA Assessments.
 */
public interface IAssessment {
  /**
   * A method to get the total amount of the Assessment.
   * @return amount
   */
  public double getTotalAmount();

  /**
   * A method to get the assessment amount due by Owner.
   * @param owner Owner
   * @return amount owed by that Owner
   */
  public double getIndividualAmount(Owner owner);

  /**
   * A method to get the Project associated with the Assessment.
   * @return Project
   */
  public Project getProject();
}
