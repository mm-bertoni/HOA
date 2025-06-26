package Helpers;

public enum Unit {
  Unit1(0.20),
  Unit2(0.22),
  Unit3(0.26),
  Unit4(0.32);

  private final double ownership;
  Unit(double ownership) {
    this.ownership = ownership;
  }
  public double getOwnership() {
    return ownership;
  }
}
