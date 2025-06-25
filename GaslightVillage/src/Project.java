import java.util.Date;
import java.util.List;

import Helpers.*;

public class Project implements IProject{
  private String projectName;
  private String vendorName;
  private Category category;
  private List<Double> payments;
  private List<Date> paymentDates;
  private Urgency urgency;
  private Status approvalStatus;
  private Status projectStatus;

  /**
   * A constructor for a new project.
   * @param projectName String
   * @param category Category enum
   */
  public Project(String projectName, Category category){
    this.projectName = projectName;
    this.category = category;
  }
  /**
   * @param status
   */
  @Override
  public void setApprovalStatus(Status status) {

  }

  /**
   * @param account
   * @return
   */
  @Override
  public Double calculateAssessment(IAccount account) {
    return 0.0;
  }
}
