package homework_22.people;

public class App {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();

        AthleteAmateur athleteAmateur = new AthleteAmateur();

        athleteAmateur.run();

        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();
        professionalAthlete.run();

    }
}
