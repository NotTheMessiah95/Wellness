package com.wellness;
import java.util.Scanner;

public class Exercise {
    private static int ExerciseInput(){
        int exerciseRating = 0;
        System.out.println("On a scale of 1 to 5 - 5 being most active and 1 being least - how how active have you been?");
        Scanner GetExercise = new Scanner(System.in);

        Boolean valid = false;

        while(!valid) {
            try {
                exerciseRating = GetExercise.nextInt();
                if(exerciseRating>5 || exerciseRating <1){
                    throw new Exception(""); // checks that input is in given range, moves to catch block if not
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Please ensure you're entering a number between 1 and 5: ");
                GetExercise.nextLine();
            }
        }
        //TODO write exerciseRating to data file
        return exerciseRating;
    }
    private static String EvaluateExercise(int exerciseRating){
        String Feedback="";
        switch (exerciseRating){
            case 5:
                Feedback = "Looks like you're doing well! :)";
            case 4:
                Feedback = "Looks like you're doing well! :)";
                break;
            case 3:
                Feedback = "Looks like you're doing okay! :)";
                break;
            case 2:
                Feedback = "Sounds like you're having problems :(";
            case 1:
                Feedback = "Sounds like you're having problems :(";
                break;
        }
        return Feedback;
    }
    public static void GetSetExercise(){
        System.out.println(EvaluateExercise(ExerciseInput()));
        Menu.MainMenu();
    }
}
