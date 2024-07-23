package com.quizapp;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "Size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of boolean", "1", "6", "4", "8", "1");
    }

    public void playQuiz() {
        Scanner scan = new Scanner(System.in);
        int i = 0;

        for (Question q : questions) {
            System.out.print("Q no. : " + q.getId() + ". ");
            System.out.println(q.getQuestion());
            System.out.println("a. " + q.getOptionOne() + "   b. " + q.getOptionTwo() + "   c. " + q.getOptionThree() + "   d. " + q.getOptionFour());

            System.out.print("Enter your choice (a, b, c, d): ");
            selection[i] = scan.nextLine();
            i++;
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String correctAnswer = que.getAnswer();

            String userAnswer = "";
            switch (selection[i].toLowerCase()) {
                case "a":
                    userAnswer = que.getOptionOne();
                    break;
                case "b":
                    userAnswer = que.getOptionTwo();
                    break;
                case "c":
                    userAnswer = que.getOptionThree();
                    break;
                case "d":
                    userAnswer = que.getOptionFour();
                    break;
                default:
                    System.out.println("Invalid option selected: " + selection[i]);
            }

            if (correctAnswer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("Your Score is : " + score);
    }
}
