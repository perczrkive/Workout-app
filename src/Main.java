public class Main {
    public static void main(String[] args){

        Exercise Exercise1 = new Exercise("Lat Pulldown", 3, 12, 90);

        System.out.println(Exercise1.getName());
        System.out.println(Exercise1.getSets());
        System.out.println(Exercise1.getReps());
        System.out.println(Exercise1.getRestTime());


    }

}
