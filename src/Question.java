import java.util.HashMap;
import java.util.Map;
public class Question {
    private String question;
    private Map<String, String> reponses;
    private String bonneReponse;

    public Question(String question) {
        this.question = question; // Correction ici
        this.reponses = new HashMap<>();
    }

    public void ajouterReponse(String lettre, String reponse) {
        reponses.put(lettre, reponse);
    }

    public void setBonneReponse(String lettre) {
        if (reponses.containsKey(lettre)) {
            this.bonneReponse = lettre;
        } else {
            System.out.println("La réponse " + lettre + " n'est pas une option valide.");
        }
    }

    public String getQuestion() {
        return question;
    }

    public Map<String, String> getReponses() {
        return reponses;
    }

    public void print() {
        System.out.println(question);
        for (Map.Entry<String, String> entry : reponses.entrySet()) {
            System.out.println(entry.getKey() + "/ " + entry.getValue());
        }
    }

    public boolean validate(String lettreReponse) {
        if (lettreReponse.equals(bonneReponse)) {
            System.out.println("Oui");
            return true;
        } else {
            System.out.println("Non, la bonne réponse était " + bonneReponse + ": " + reponses.get(bonneReponse));
            return false;
        }

    }



    }









