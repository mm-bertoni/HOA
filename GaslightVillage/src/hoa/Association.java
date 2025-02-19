package hoa;

import java.util.List;

/**
 * A class for an HOA Association.
 */
public class Association implements IAssociation{
  /**
   * A method to get the Association name.
   *
   * @return
   */
  @Override
  public String getName() {
    return "";
  }

  /**
   * A method to get the Main Point of Contact for the Association.
   *
   * @return Owner
   */
  @Override
  public Owner getMainContact() {
    return null;
  }

  /**
   * A method to change the main contact.
   * @param mainContact Owner
   */
  public void setMainContact(Owner mainContact) {}

  /**
   * A method to get the units located in the Association.
   *
   * @return List of Units
   */
  @Override
  public List<Unit> getUnits() {
    return List.of();
  }

  /**
   * A method to get the Owner Occupancy rate of the Association.
   *
   * @return percent of owner occupancy
   */
  @Override
  public double getOwnerOccupancy() {
    return 0;
  }

  /**
   * A method to get the Association's account balance.
   *
   * @return current account balance.
   */
  @Override
  public double getAccountBalance() {
    return 0;
  }
}
