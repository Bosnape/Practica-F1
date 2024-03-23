public class TeamDriverB extends PitCrewTeam implements TeamDriver {
  // Private attributes
  private String driver_name;
  private PitCrewTeam pit_crew;

  // Constructor
  public TeamDriverB(PitCrewTeam _pit_crew, String _driver_name) {
    super(_pit_crew.getTeam(), 5);
    this.driver_name = _driver_name;
    this.pit_crew = _pit_crew;
  }

  // Getters
  public String getDriver() {
    return this.driver_name;
  }
  public PitCrewTeam getPitCrew() {
    return this.pit_crew;
  }

  // Setters
  public void setDriverName(String _driver_name) {
    this.driver_name = _driver_name;
  }
  public void setPitCrew(PitCrewTeam _team) {
    this.pit_crew = _team;
  }

  // Add a new member
  @Override
  public void add(String[] member) {
    if (super.isFull()) {
      System.out.println("No se pudo añadir a " + member[0]);
      System.out.println("El equipo del conductor B esta lleno");
    } else {
      super.add(member);
    }
    addToPitsTeam(member);
  }

  // Add to pits as well
  private void addToPitsTeam(String[] member) {
    this.pit_crew.add(member);
  }

  @Override
  public void print() {
    System.out.println("Equipo: " + super.getTeam());
    System.out.println("Equipo del conductor: " + this.driver_name);
  }
}