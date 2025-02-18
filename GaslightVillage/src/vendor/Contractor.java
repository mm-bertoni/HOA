package vendor;

import java.util.List;

import operations.Project;

/**
 * A class to model Contractors working for the HOA.
 */
public class Contractor implements IContractor {
  /**
   * A method to get the contact person's name.
   *
   * @return name
   */
  @Override
  public String getContactName() {
    return "";
  }

  /**
   * A method to set the contact person's name.
   *
   * @param contactName contact name
   */
  @Override
  public void setContactName(String contactName) {

  }

  /**
   * A method to get the contractor's phone number.
   *
   * @return phone number string
   */
  @Override
  public String getPhone() {
    return "";
  }

  /**
   * A method to get all the projects the contractor is working on for a given unit.
   *
   * @return List of Projects
   */
  @Override
  public List<Project> getProjects() {
    return List.of();
  }
}
