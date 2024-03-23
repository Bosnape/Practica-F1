interface TeamDriver {
  
  String getDriver();
  PitCrewTeam getPitCrew();

  void setDriverName(String _driver_name);
  void setPitCrew(PitCrewTeam _team);

  void add(String[] member);
  void print();
}