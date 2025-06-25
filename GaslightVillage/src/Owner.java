import java.util.Map;

import Helpers.Unit;

public class Owner implements IOwner{

  private String name;
  private String email;
  private Unit unit;
  private Double monthlyFee;
  private Map<IProject, Double> assessments;

  /**
   * A constructor for a new Owner
   * @param name String
   * @param unit Unit enum
   */
  public Owner(String name, Unit unit){
    this.name = name;
    this.unit = unit;
  }

  /**
   * @param project
   */
  @Override
  public void addAssessment(IProject project) {

  }

  /**
   * @return
   */
  @Override
  public Double calculateNewFee() {
    return 0.0;
  }
}
