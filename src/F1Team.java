public class F1Team {
  // Private attributes
  private String name;
  private int foundation_year;
  private int points;

  // Constructor
  public F1Team(String _name, int _foundation_year, int _pts) {
    this.name = _name;
    this.points = _pts;
    this.foundation_year = _foundation_year;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public int getFoundationYear() {
    return this.foundation_year;
  }

  public int getPts() {
    return this.points;
  }

  // Setters
  public void setName(String _name) {
    this.name = _name;
  }

  public void setFoundationYear(int _foundation_year) {
    this.foundation_year = _foundation_year;
  }

  public void setPoints(int _pts) {
    this.points = _pts;
  }

  // Calculate the age of the F1 Team
  public int age() {
    return 2024 - this.foundation_year;
  }

  public void print() {
    System.out.println("Equipo: " + this.name);
    System.out.println("Puntos totales: " + this.points);
  }

}
