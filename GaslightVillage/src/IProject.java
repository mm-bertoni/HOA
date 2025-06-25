import Helpers.Status;

public interface IProject {
  public void setApprovalStatus(Status status);
  public Float calculateAssessment(IAccount account);
}
