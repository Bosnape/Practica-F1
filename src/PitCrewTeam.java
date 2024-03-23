public class PitCrewTeam {
  // Private attributes
  private F1Team f1team;
  private int crew_size;
  private int size = 0;
  private String[][] crew;

  // Constructors
  public PitCrewTeam(F1Team _f1team, int _crew_size) {
    this.f1team = _f1team;
    this.crew_size = _crew_size;
    this.crew = new String[this.crew_size][2];
  }

  // Getters
  public F1Team getTeam() {
    return this.f1team;
  }
  public int getSize() {
    return this.size;
  }
  public int getCrewSize() {
    return this.crew_size;
  }
  public String[][] getCrew() {
    return this.crew;
  }

  // Setters
  public void setTeam(F1Team _f1team) {
    this.f1team = _f1team;
  }
  public void setCrewSize(int _crew_size) {
    this.crew_size = _crew_size;
  }
  public void setCrew(String[][] _crew) {
    this.crew = _crew;
  }

  // Add a new member
  public void add(String[] member) {
    if (isFull()) {
      System.out.println("\nNo se pudo añadir a " + member[0]);
      System.out.println("Los pits está lleno");
    } else {
      if (!repeated(member)){
        String name = member[0];
        String sex = member[1];
        this.crew[this.size][0] = name;
        this.crew[this.size][1] = sex;
        this.size++;
      }
    }
  }

  // Check if the new member is already in the crew
  private boolean repeated(String[] member) {
    String name = member[0];
    String sex = member[1];
    for (int i = 0; i < this.crew.length; i++) {
      String n = this.crew[i][0];
      String s = this.crew[i][1];
      if (name.equalsIgnoreCase(n) && sex.equalsIgnoreCase(s)) {
        return true;
      }
    }
    return false;
  }

  // Check for capacity
  public boolean isFull() {
    return this.size == this.crew_size;
  }

  public void print() {
    System.out.println("Equipo: " + this.f1team);
    System.out.println("Cantidad de miembros: " + this.crew_size);
    System.out.println("Miembros:\n");
    printEveryMember();   
  }

  private void printEveryMember() {
    for (int i = 0; i < this.crew.length; i++){
      for (int j = 0; j < this.crew[0].length; j++){
        System.out.print("Nombre: " + this.crew[0] + "Rol: " + this.crew[1]);
      }
      System.out.println();
    }
  }
}
