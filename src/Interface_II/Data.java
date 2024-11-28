package Interface_II;

public class Data {

    public static void main(String[] args) {
        Quiz[] quizzes = {
                new Quiz(77.5,"A"),
                new Quiz(67.5,"B+"),
                new Quiz(87.5,"A+"),
                new Quiz(50.5,"C"),
                new Quiz(63.5,"B-"),
                new Quiz(73.5,"A-")
        };
        double totalScore = 0;
        for(Quiz quiz : quizzes){
            totalScore+= quiz.getScore();
        }
        double averageValue = totalScore/ quizzes.length;
        Quiz highestQuiz = (Quiz) Measurable.largest(quizzes);
        System.out.println("Average Score: " + averageValue);
        System.out.println("Highest Score: " + highestQuiz.getScore() + " (" + highestQuiz.getLetterGrade() + ")");

    }
}