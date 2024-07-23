# QuizApp

A simple Java-based quiz application that allows users to answer multiple-choice questions and receive a score based on their answers.

## Features

- **Multiple Choice Questions**: The quiz consists of multiple-choice questions with four options each.
- **User Interaction**: Users are prompted to select their answers from the provided options.
- **Scoring**: The application calculates and displays the user's score based on the number of correct answers.

## Getting Started

To run this application, follow these steps:

### Prerequisites

Ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher

### Running the Application

1. Clone the repository:
    ```sh
    git clone https://github.com/AkashKannapiran/QuizApp.git
    ```

2. Navigate to the project directory:
    ```sh
    cd quizapp
    ```

3. Compile the Java files:
    ```sh
    javac -d bin src/com/quizapp/*.java
    ```

4. Run the application:
    ```sh
    java -cp bin com.quizapp.Main
    ```

### How It Works

- The `Question` class defines the structure of each quiz question, including options and the correct answer.
- The `QuestionService` class handles quiz logic, such as displaying questions, capturing user responses, and calculating the score.
- The `Main` class serves as the entry point for the application, initializing the `QuestionService` and starting the quiz.

## Example

Here's a sample output from running the application:

```
Q no. : 1. Size of int
a. 2 b. 6 c. 4 d. 8
Enter your choice (a, b, c, d): a
Q no. : 2. Size of double
a. 2 b. 6 c. 4 d. 8
Enter your choice (a, b, c, d): d
...
Your Score is : 2
```


## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by various Java programming tutorials and quizzes.

# Author

- [Akash Kannapiran](https://www.linkedin.com/in/akashkannapiran/)
