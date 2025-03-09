package hoa;

/**
 * A class to model Tenants in an HOA.
 */
public class Tenant implements IStakeholder{
  private String name;
  private String email;
  private String phone;
  private Unit unit;

  /**
   * A constructor for a Tenant
   * @param name String
   * @param email String
   * @param phone String
   * @param unit Unit
   */
  public Tenant(String name, String email, String phone, Unit unit) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.unit = unit;

  }

  /**
   * A method to get the name of the stakeholder.
   *
   * @return name
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * A method to get the email address of the stakeholder.
   *
   * @return email address
   */
  @Override
  public String getEmail() {
    return this.email;
  }

  /**
   * A method to get the phone number of the stakeholder.
   *
   * @return phone number
   */
  @Override
  public String getPhone() {
    return this.phone;
  }

  /**
   * A method to get the unit associated with the stakeholder.
   *
   * @return unit number.
   */
  @Override
  public Unit getUnit() {
    return this.unit;
  }
}
