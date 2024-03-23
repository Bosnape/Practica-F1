public class TeamTyreGunner extends PitCrewTeam implements TeamDriver {
  // Private attributes
  private String rol = "Utilizar la pistola para quitar y colocar la tuerca del neumatico.";
  private TeamDriverA driver;
  private PitCrewTeam pit_crew;

  // Constructor
  public TeamTyreGunner(TeamDriverA _driver) {
    super(_driver.getTeam(), 4);
    this.pit_crew = _driver.getPitCrew();
    this.driver = _driver;
  }

  // Getters
  public String getRol() {
    return this.rol;
  }
  public String getDriver() {
    return this.driver.getDriver();
  }
  public PitCrewTeam getPitCrew() {
    return this.pit_crew;
  }

  // Setters
  public void setDriverName(String _driver_name) {
    this.driver.setDriverName(_driver_name);
  }
  public void setPitCrew(PitCrewTeam _team) {
    this.pit_crew = _team;
  }

  // Add a new member
  @Override
  public void add(String[] member) {
    if (super.isFull()) {
      System.out.println("No se pudo añadir a " + member[0]);
      System.out.println("El equipo para ser artillero de neumaticos esta lleno");
    } else {
      super.add(member);
    }
    addToTeamDriverAndTeamPits(member);
  }

  // Add to pits and to team driver B as well
  private void addToTeamDriverAndTeamPits(String[] member) {
    this.driver.add(member);
  }

  @Override
  public void print() {
    System.out.println("Equipo: " + super.getTeam());
    System.out.println("Rol: " + this.rol);
    System.out.println("Equipo del conductor: " + this.driver.getDriver());
  }
}
