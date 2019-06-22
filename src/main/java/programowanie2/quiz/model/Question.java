package programowanie2.quiz.model;

public class Question {
    private QuestionCategory category;
    private String question;
    private String[] answer;
    private String correctAnswear;

    public Question(QuestionCategory category, String question, String[] answer, String correctAnswer) {
        this.category = category;
        this.question = question;
        this.answer = answer;
        this.correctAnswear = correctAnswer;
    }

    public QuestionCategory getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswear() {
        return answer;
    }

    public String getCorrectAnswear() {
        return correctAnswear;
    }
}
