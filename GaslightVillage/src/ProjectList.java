import java.util.ArrayList;
import java.util.List;

import Helpers.Status;

public class ProjectList implements IProjectList {

  private List<IProject> projects;

  /**
   * Default constructor for a ProjectList
   */
  public ProjectList() {
    this.projects = new ArrayList<IProject>();
  }

  /**
   * Constructor for a ProjectList with an initial Project
   * @param project IProject
   */
  public ProjectList(IProject project) {
    this.projects = new ArrayList<IProject>();
    this.projects.add(project);
  }

  /**
   * @param status
   * @return
   */
  @Override
  public List<IProject> getProjects(Status status) {
    return List.of();
  }

  /**
   * A method to add a new Project to the ProjectList
   * @param project IProject
   */
  public void addProject(IProject project) {
    this.projects.add(project);
  }
}
