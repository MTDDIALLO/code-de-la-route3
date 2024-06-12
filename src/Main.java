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
        Question question = new Question("Au feu, je m'arrête ?");
        question.ajouterReponse("a", "oui");
        question.ajouterReponse("b", "non");
        question.ajouterReponse("c", "je sais pas");
        question.setBonneReponse("a");

        //affichage à l'utilisateur
        question.print();

        //Saisie de la réponse
        Scanner scanner = new Scanner(System.in);
        System.out.println("votre reponse");
        String reponse = scanner.nextLine();

        //validate
        question.validate(reponse);


    }
}