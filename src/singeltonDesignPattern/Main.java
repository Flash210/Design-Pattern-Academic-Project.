package singeltonDesignPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Test du Logger Singleton ===");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Démarrage de l’application.");
        logger2.log("Une action utilisateur a été détectée.");
        logger1.log("Application arrêtée.");

        if (logger1 == logger2) {
            System.out.println("Les deux références pointent vers la même instance du Logger.");
        } else {
            System.out.println("Les deux références sont différentes !");
        }

        System.out.println("Les messages ont été enregistrés dans log.txt");
    }
    }