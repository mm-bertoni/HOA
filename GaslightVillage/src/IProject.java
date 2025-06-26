import Helpers.Status;

public interface IProject {
  public void setApprovalStatus(Status status);
  public Double calculateAssessment(IAccount account);
}
