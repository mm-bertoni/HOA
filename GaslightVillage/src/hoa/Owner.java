package hoa;

/**
 * A class to represent an Owner of a Unit in an HOA.
 */
public class Owner extends Tenant implements IOwner {
  /**
   * A method to get the name of the stakeholder.
   *
   * @return name
   */
  @Override
  public String getName() {
    return "";
  }

  /**
   * A method to get the email address of the stakeholder.
   *
   * @return email address
   */
  @Override
  public String getEmail() {
    return "";
  }

  /**
   * A method to get the phone number of the stakeholder.
   *
   * @return phone number
   */
  @Override
  public String getPhone() {
    return "";
  }

  /**
   * A method to get the unit associated with the stakeholder.
   *
   * @return unit number.
   */
  @Override
  public String getUnit() {
    return "";
  }

  /**
   * A method to return the owner's monthly HOA fee.
   *
   * @return HOA fee
   */
  @Override
  public double getHOAFee() {
    return 0;
  }

  /**
   * A method to return the owner's fraction of the HOA.
   *
   * @return Ownership fraction
   */
  @Override
  public double getOwnershipFraction() {
    return 0;
  }

  /**
   * A method to report if owner lives in the building.
   *
   * @return true if yes, false if not
   */
  @Override
  public boolean isBuildingResident() {
    return false;
  }
}
