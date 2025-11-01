import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;

    private static final String LOG_FILE = "log.txt";

    private Logger() {
        System.out.println("Nouvelle instance de Logger créée !");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String fullMessage = "[" + timestamp + "] " + message;

        System.out.println(fullMessage);

        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(fullMessage);
        } catch (IOException e) {
            System.err.println("Erreur lors de l’écriture dans le fichier log : " + e.getMessage());
        }
    }
}
