package operations;

import java.util.List;

public interface IContractor {
  /**
   * A method to get the contact person's name.
   * @return name
   */
  public String getContactName();

  /**
   * A method to set the contact person's name.
   * @param contactName contact name
   */
  public void setContactName(String contactName);

  /**
   * A method to get the contractor's phone number.
   * @return phone number string
   */
  public String getPhone();

  /**
   * A method to get all the projects the contractor is working on for a given unit.
   * @return List of Projects
   */
  public List<Project> getProjects();
}
