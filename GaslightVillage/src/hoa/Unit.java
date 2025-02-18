package hoa;

/**
 * A class for a Unit in an HOA.
 */
public class Unit implements IUnit{

  /**
   * A constructor for a Unit.
   * @param association Association
   * @param unitNumber unit number
   * @param owner Owner
   */
  public Unit(Association association, int unitNumber, Owner owner){

  }

  /**
   * A method to change the associated Tenant for the Unit.
   * @param tenant Tenant
   */
  public void setTenant(Tenant tenant){}

  /**
   * A method to change the associated Owner.
   * @param owner Owner
   */
  public void setOwner(Owner owner){}

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
