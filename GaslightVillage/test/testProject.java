import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import Helpers.Category;
import Helpers.Status;
import Helpers.Urgency;

public class testProject {
  Project project = new Project("Reinforcement Beams", Category.Basement);

  @Test
  public void testGetProjectName() {
    Assertions.assertEquals("Reinforcement Beams", project.getProjectName());
  }

  @Test
  public void testGetCategoryName() {
    Assertions.assertEquals(Category.Basement, project.getCategory());
  }

  @Test
  public void testVendorName(){
    project.setVendorName("Basement Co");
    Assertions.assertEquals("Basement Co", project.getVendorName());
  }

  @Test
  public void testAddPayment(){
    project.addPayment(2000.00, LocalDate.of(2020, 1, 1));
    Assertions.assertEquals(2000.00, project.getPayments().getFirst());
    Assertions.assertEquals(LocalDate.of(2020, 1, 1), project.getPaymentDates().getFirst());
  }

  @Test
  public void testUrgency(){
    project.setUrgency(Urgency.Emergency);
    Assertions.assertEquals(Urgency.Emergency, project.getUrgency());
  }

  @Test
  public void testApproval(){
    project.setApprovalStatus(Status.Completed);
    Assertions.assertEquals(Status.Completed, project.getApprovalStatus());
  }

  @Test
  public void testAssessment(){
  }
}
