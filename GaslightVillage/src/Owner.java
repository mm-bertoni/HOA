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

  public void setName(String name) {
    this.name = name;
  }
  public String getName() { return name; }
  public void setEmail(String email){this.email = email;}
  public String getEmail() { return email; }
  public void setMonthlyFee(Double monthlyFee){this.monthlyFee = monthlyFee;}
  public Double getMonthlyFee() { return monthlyFee; }
  public Unit getUnit() { return unit; }
  /**
   * @param project
   */
  @Override
  public void addAssessment(IProject project, IAccount account) {
    double newAssessment = project.calculateAssessment(account);
    newAssessment = newAssessment*this.unit.getOwnership();
    this.assessments.put(project, newAssessment);
  }


}
