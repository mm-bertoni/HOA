package hoa;

/**
 * An interface to govern the HOA stakeholders.
 */
public interface IStakeholder {
  /**
   * A method to get the name of the stakeholder.
   * @return name
   */
  public String getName();
  /**
   * A method to get the email address of the stakeholder.
   * @return email address
   */
  public String getEmail();

  /**
   * A method to get the phone number of the stakeholder.
   * @return phone number
   */
  public String getPhone();

  /**
   * A method to get the unit associated with the stakeholder.
   * @return unit number.
   */
  public String getUnit();
}
