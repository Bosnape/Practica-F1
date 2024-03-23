public class TeamFWAdjust extends PitCrewTeam {
  // Private attributes
  private String rol = "Aplicar cambios aerodinámicos al alerón delantero.";
  private PitCrewTeam pit_crew;

  // Constructor
  public TeamFWAdjust(PitCrewTeam _pit_crew) {
    super(_pit_crew.getTeam(), 2);
    this.pit_crew = _pit_crew;
  }

  // Getters
  public String getRol() {
    return this.rol;
  }
  public PitCrewTeam getPitCrew() {
    return this.pit_crew;
  }

  // Setters
  public void setRol(String _rol) {
    this.rol = _rol;
  }
  public void setPitCrew(PitCrewTeam _team) {
    this.pit_crew = _team;
  }

  // Add a new member
  @Override
  public void add(String[] member) {
    if (super.isFull()) {
      System.out.println("No se pudo añadir a " + member[0]);
      System.out.println("El equipo para hacer cambios al alerón esta lleno");
    } else {
      super.add(member);
    }
    addToPitTeam(member);
  }

  // Add to pits as well
  private void addToPitTeam(String[] member) {
    this.pit_crew.add(member);
  }
  
  @Override
  public void print() {
    System.out.println("Equipo: " + super.getTeam());
    System.out.println("Rol: " + this.rol);
  }
}
