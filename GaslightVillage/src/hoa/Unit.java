package hoa;

/**
 * A class for a Unit in an HOA.
 */
public class Unit implements IUnit{
  /**
   * A method to return the unit's owner.
   *
   * @return Owner
   */
  @Override
  public Owner getOwner() {
    return null;
  }

  /**
   * A method to return the unit's tenant.
   *
   * @return Tenant
   */
  @Override
  public Tenant getTenant() {
    return null;
  }

  /**
   * A method to return the unit's square footage.
   *
   * @return square feet of unit
   */
  @Override
  public double getSquareFootage() {
    return 0;
  }

  /**
   * A method to return the unit number.
   *
   * @return unit number string
   */
  @Override
  public String getUnitNumber() {
    return "";
  }
}
