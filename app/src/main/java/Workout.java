public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts={
            new Workout("Push Ups" , "Just do your pushups"),
            new Workout("pull ups", "pull your head above the bar"),
            new Workout("situps", "lie on the floor and sit up")
    };

    private Workout(String name, String description) {

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static Workout[] getWorkouts() {
        return workouts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
