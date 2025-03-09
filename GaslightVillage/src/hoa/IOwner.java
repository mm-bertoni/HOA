package hoa;

/**
 * An interface to govern HOA owners.
 */
public interface IOwner extends IStakeholder {
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
   * @return unit.
   */
  public Unit getUnit();

  /**
   * A method to return the owner's monthly HOA fee.
   * @return HOA fee
   */
  public double getHOAFee();

  /**
   * A method to return the owner's fraction of the HOA.
   * @return Ownership fraction
   */
  public double getOwnershipFraction();

  /**
   * A method to report if owner lives in the building.
   * @return true if yes, false if not
   */
  public boolean isBuildingResident();
}
