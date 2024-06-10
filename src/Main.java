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
        String q = "Si le feu est rouge, je dois m'arrêter. Le feu est rouge, que dois-je faire ?";
        String r = "a/ je m'arrête";
        Question question = new Question(q, r);
        System.out.println(question.getQuestion());
        System.out.println(question.getAnswer());
        Scanner scanner = new Scanner(System.in);
        System.out.println("votre reponse");
        String reponse = scanner.nextLine();
        if (reponse.equals("a")) {
            System.out.println("oui");
        } else {
            System.out.println("non");
        }
    }
}