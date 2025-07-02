import java.time.LocalDate;

import Helpers.Category;
import Helpers.TransactionType;

public class Transaction implements ITransaction {
  private TransactionType type;
  private LocalDate date;
  private Category category;
  private double amount;
  private Project project;

  public Transaction(TransactionType type, LocalDate date, Category category, double amount) {
    this.type = type;
    this.date = date;
    this.category = category;
    this.amount = amount;
  }
  public void setProject(Project project) {
    this.project = project;
  }
  public Project getProject() {
    return project;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
  public double getAmount() {
    return amount;
  }
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public TransactionType getType() {
    return type;
  }
  public void setType(TransactionType type) {
    this.type = type;
  }
}
