package Interface_II;

public class Quiz implements Measurable{
    public double score;
    public String letterGrade;

    public Quiz(double score, String letterGrade) {
        this.score = score;
        this.letterGrade = letterGrade;
    }

    @Override
    public double getMeasure() {
        return score;
    }
    public double getScore() {
        return score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
}
