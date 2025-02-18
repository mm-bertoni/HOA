package hoa;

/**
 * An interface to govern Units in an HOA.
 */
public interface IUnit {
  /**
   * A method to return the unit's owner.
   * @return Owner
   */
  public Owner getOwner();

  /**
   * A method to return the unit's tenant.
   * @return Tenant
   */
  public Tenant getTenant();

  /**
   * A method to return the unit's square footage.
   * @return square feet of unit
   */
  public double getSquareFootage();

  /**
   * A method to return the unit number.
   * @return unit number string
   */
  public String getUnitNumber();
}
