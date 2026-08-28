public class Main {
    public static void main(String[] args){

        Exercise LatPulldown = new Exercise("Lat Pulldown", 3, 12, 120);
        Exercise BicepsCurl = new Exercise("Biceps Curl", 2, 15, 90);

        Workout PullDay = new Workout("Pull Day");
        PullDay.addExercise(LatPulldown);
        PullDay.addExercise(BicepsCurl);

        PullDay.listExercises();

    }

}
