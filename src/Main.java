public class Main {
  public static void main(String[] args) {
    // F1 team
    F1Team eafun = new F1Team("Eafun", 1992, 7200);
    PitCrewTeam pit_crew = new PitCrewTeam(eafun, 20);

    // Drivers
    String driverA = "Max Verstappen";
    String driverB = "Sergio Perez";

    // Driver´s team
    TeamDriverA teamA = new TeamDriverA(pit_crew, driverA);
    TeamDriverB teamB = new TeamDriverB(pit_crew, driverB);

    // Teams who have inheritance of TeamDriver as weel
    TeamTyreGunner tyre_gunner = new TeamTyreGunner(teamA);
    TeamTyreOff tyre_off = new TeamTyreOff(teamB);

    // Tasks
    TeamTyreOn tyre_on = new TeamTyreOn(pit_crew);
    TeamFrontJack front_jack = new TeamFrontJack(pit_crew);
    TeamRearJack rear_jack = new TeamRearJack(pit_crew);
    TeamSideJack side_jack = new TeamSideJack(pit_crew);
    TeamFWAdjust fw_adjust = new TeamFWAdjust(pit_crew);
    LollipopMan lollipop = new LollipopMan(pit_crew);
    
    // Personas
    String[] ana = {"Ana Gomez", "F"};
    String[] pedro = {"Pedro Ramirez", "M"};
    String[] maya = {"Maya Smith", "F"};
    String[] michael = {"Michael Jackson", "M"};
    String[] juan = {"Juan Perez", "M"};
    String[] jose = {"Jose Perez", "M"};
    String[] julian = {"Julian Florez", "M"};
    String[] jaime = {"Jaime Ramirez", "F"};
    String[] julio = {"Julio Ortega", "M"};
    String[] david = {"David Ortiz", "F"};
    String[] joseph = {"Joseph Rodriguez", "M"};
    String[] simon = {"Simon Smith", "M"};
    String[] dave = {"Dave Jones", "M"};
    String[] will = {"Will Falon", "M"};
    String[] samantha = {"Samantha Reyes", "F"};
    String[] julieth = {"Julieth VILLAVICENCIO", "F"};
    String[] noemi = {"Noemi Cruz", "F"};
    String[] jenifer = {"Jenifer Santander", "M"};
    String[] josefa = {"Josefa Garcia", "F"};
    String[] juliana = {"Juliana Hernandez", "F"};

    // Tyre gunner
    tyre_gunner.add(ana);
    tyre_gunner.add(pedro);
    tyre_gunner.add(maya);
    tyre_gunner.add(michael);
    
    // Tyre off
    tyre_off.add(juan);
    tyre_off.add(jose);
    tyre_off.add(julian);
    tyre_off.add(jaime);
    
    // Tyre on
    tyre_on.add(julio);
    tyre_on.add(david);
    tyre_on.add(joseph);
    tyre_on.add(simon);
    
    // Front jack
    front_jack.add(dave);
    // Simon is part of the Front Jack Team and also part of the Tyre On Team
    front_jack.add(simon);
    
    // Rear jack
    rear_jack.add(will);
    rear_jack.add(samantha);
    
    // Side jack
    side_jack.add(julieth);
    side_jack.add(noemi);
    
    // Front wing flap adjust
    fw_adjust.add(jenifer);
    fw_adjust.add(josefa);
    
    // Lollipop man
    lollipop.add(juliana);
 
  }
}