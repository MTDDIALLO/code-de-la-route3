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
        //Mise en place du jeu de données
        Question question1 = new Question("Au feu, je m'arrête ?");
        question1.ajouterReponse("a", "oui");
        question1.ajouterReponse("b", "non");
        question1.ajouterReponse("c", "je sais pas");
        question1.setBonneReponse("a");
        question.add(question1);

        Question question2 = new Question("la couleur du pc");
        question2.ajouterReponse("a", "noir");
        question2.ajouterReponse("b" , "blanc");
        question2.ajouterReponse("c", "vert");
        question2.setBonneReponse("a");
        question.add(question2);

        Question question3 = new Question("couleur du panneaux en face");
        question3.ajouterReponse("a", "orange");
        question3.ajouterReponse("b" , "rouge");
        question3.setBonneReponse("B");
        question.add(question3);

        Question question4 = new Question("couleur du feux rouge");
        question4.ajouterReponse("a", "jaune");
        question4.ajouterReponse("b", "vert");
        question4.setBonneReponse("b");
        question.add(question4);

        Question question5 = new Question("passage pieton dans 50m,que dois faire");
        question5.ajouterReponse("a", "Je ralentis");
        question5.ajouterReponse("b", "Je m'arrête");
        question5.setBonneReponse("a");
        question.add


        for (int i = 0; i < 5; i ++) {
            System.out.println("i est : " + i);
        }

        //affichage à l'utilisateur
        Question.print();

        //Saisie de la réponse
        Scanner scanner = new Scanner(System.in);
        System.out.println("votre reponse");
        String reponse = scanner.nextLine();

        //validate
        Question.validate(reponse);


    }
}