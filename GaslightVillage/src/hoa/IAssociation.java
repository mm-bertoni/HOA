package hoa;

import java.util.List;

/**
 * A interface to govern Associations.
 */
public interface IAssociation {
  /**
   * A method to get the Association name.
   * @return
   */
  public String getName();

  /**
   * A method to get the Main Point of Contact for the Association.
   * @return Owner
   */
  public Owner getMainContact();

  /**
   * A method to get the units located in the Association.
   * @return List of Units
   */
  public List<Unit> getUnits();

  /**
   * A method to get the Owner Occupancy rate of the Association.
   * @return percent of owner occupancy
   */
  public double getOwnerOccupancy();

  /**
   * A method to get the Association's account balance.
   * @return current account balance.
   */
  public double getAccountBalance();
}
