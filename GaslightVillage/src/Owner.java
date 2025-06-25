import java.util.Map;

public class Owner implements IOwner{

  private String name;
  private String email;
  private int unit;
  private Double ownershipPercent;
  private Double monthlyFee;
  private Map<IProject, Double> assessments;

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
