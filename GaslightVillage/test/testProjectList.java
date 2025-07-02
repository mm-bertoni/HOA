import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Helpers.Category;
import Helpers.Status;


public class testProjectList {
  ProjectList projectList = new ProjectList();
  Project testProject = new Project("Reinforcements", Category.Basement);


  @Test
  public void testAddGetProject(){
    projectList.addProject(testProject);
    testProject.setApprovalStatus(Status.Approved);
    Assertions.assertEquals(projectList.getProjects(Status.Approved), testProject);
  }


}
