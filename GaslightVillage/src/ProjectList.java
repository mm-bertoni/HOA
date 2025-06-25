import java.util.List;

import Helpers.Status;

public class ProjectList implements IProjectList {

  private List<IProject> projects;

  /**
   * @param status
   * @return
   */
  @Override
  public List<IProject> getProjects(Status status) {
    return List.of();
  }
}
