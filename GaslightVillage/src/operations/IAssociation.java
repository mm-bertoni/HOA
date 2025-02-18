package operations;

import java.util.List;

import hoa.Owner;
import hoa.Unit;

public interface IAssociation {
  public String getName();
  public Owner getMainContact();
  public List<Unit> getUnits();
  public double getOwnerOccupancy();
  public double getAccountBalance();
}
