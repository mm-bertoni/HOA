
import java.time.LocalDate;
import java.util.List;

import Helpers.*;

public class Project implements IProject{
  private String projectName;
  private String vendorName;
  private Category category;
  private List<Double> payments;
  private List<LocalDate> paymentDates;
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

  public String getProjectName(){return projectName;}
  public Category getCategory(){ return category; }
  public void setVendorName(String vendorName){this.vendorName = vendorName;}
  public String getVendorName(){return vendorName;}
  public void addPayment(Double amount, LocalDate date){}
  public List<Double> getPayments(){return payments;}
  public List<LocalDate> getPaymentDates(){return paymentDates;}
  public void setUrgency(Urgency urgency){this.urgency = urgency;}
  public Urgency getUrgency(){return urgency;}

  /**
   * @param status
   */
  @Override
  public void setApprovalStatus(Status status) {
    this.approvalStatus = status;
  }

  public Status getApprovalStatus(){
    return this.approvalStatus;
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
