import java.util.ArrayList;

public class Workout {
    private String name;
    private ArrayList <Exercise> exercises;

    public Workout(String name){
        this.name = name;
        exercises = new ArrayList<Exercise>();
    }

    public void addExercise(Exercise e){
        exercises.add(e);
    }

    public void listExercises(){
        for (int i=0 ; i<exercises.size() ; i++){
            System.out.println(exercises.get(i).getName());
        }
    }

}
