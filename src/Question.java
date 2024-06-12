public class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
    public String getQuestion() {
        return question;
    }

    public void print() {
        System.out.println(question);
        System.out.println(answer);
    }
    public void validate(String reponse) {
        if (reponse.equals("a")) {
            System.out.println("oui");
        } else {
            System.out.println("non");
        }

    }
}

