import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String getCouleurAleatoire() {
        Random random = new Random();
        int aleatoire = random.nextInt(2);
        if (aleatoire == 0) {
            return "rouge";
        } else {
            return "vert";
        }
    }

    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();

        Question question1 = new Question("Au feu, je m'arrête ?");
        question1.ajouterReponse("a", "oui");
        question1.ajouterReponse("b", "non");
        question1.ajouterReponse("c", "je sais pas");
        question1.setBonneReponse("a");
        boolean add = questions.add(question1);

        Question question2 = new Question("La couleur du PC ?");
        question2.ajouterReponse("a", "noir");
        question2.ajouterReponse("b", "blanc");
        question2.ajouterReponse("c", "vert");
        question2.setBonneReponse("a");
        questions.add(question2);

        Question question3 = new Question("Couleur du panneau en face ?");
        question3.ajouterReponse("a", "orange");
        question3.ajouterReponse("b", "rouge");
        question3.setBonneReponse("b");
        questions.add(question3);

        Question question4 = new Question("Couleur du feu rouge ?");
        question4.ajouterReponse("a", "jaune");
        question4.ajouterReponse("b", "rouge");
        question4.setBonneReponse("b");
        questions.add(question4);

        Question question5 = new Question("Passage piéton dans 50m, que dois-je faire ?");
        question5.ajouterReponse("a", "Je ralentis");
        question5.ajouterReponse("b", "Je m'arrête");
        question5.setBonneReponse("a");
        questions.add(question5);


        Scanner scanner = new Scanner(System.in);
        int score = 5;
        


         for(Question question : questions) {
            question.print();
            System.out.print("Votre réponse : ");
            String reponse = scanner.nextLine();
            question.validate(reponse);





        }

        // Affichage du score final
        System.out.println("Votre score final est : " + score + "/" + questions.size());

        if (score ==5) {
            System.out.println("vous avez gagné");
        } else {
            System.out.println("vous avez perdu");
        }

    }
}