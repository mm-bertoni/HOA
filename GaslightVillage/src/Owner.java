import java.util.Map;

public class Owner implements IOwner{

  private String name;
  private String email;
  private int unit;
  private Float ownershipPercent;
  private Float monthlyFee;
  private Map<IProject, Float> assessments;

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
  public Float calculateNewFee() {
    return 0f;
  }
}
