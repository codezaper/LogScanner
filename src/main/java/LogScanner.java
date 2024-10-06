import com.log.scanner.service.LogProcessor;
import java.util.Optional;
import java.util.Scanner;


public class LogScanner
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        LogProcessor logProcessor = new LogProcessor();
        System.out.println("****** Document Analysis App ******");
        // Load Log file
        loadData(logProcessor);
        while (true) {
            Optional<String> officeName = promptUser(scanner, "\nEnter Office Name (Mumbai/Genova): ",false);
            Optional<String> userName = promptUser(scanner, "Enter User Name (Paco/Yogesh): ",false);
            Optional<Integer> monthDay = promptUser(scanner, "Enter Month Day (5/6): ",true);
            Optional<Integer> hourToSearch = promptUser(scanner, "Enter Hour (14/15/17): ",true);

            System.out.println("\nOffice Name : " + officeName.orElse("NA") + ", User Name : " +
                    userName.orElse("NA") + ", Month Day : "+ monthDay.orElse(0) + ", Hour : " + hourToSearch.orElse(0));

            // Print Log Stats
            logProcessor.printStats(officeName.orElse(null),userName.orElse(null),monthDay.orElse(null),hourToSearch.orElse(null));

            System.out.print("Want to continue (Y/N): ");
            String wantToContinue = scanner.nextLine();

            if(wantToContinue.equalsIgnoreCase("N")) {
                break;
            }
        }
        scanner.close();
    }

    private static <T> Optional<T> promptUser(Scanner scanner, String message, boolean isInteger) {
        System.out.print(message);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return Optional.empty();
        }

        if (isInteger) {
            try {
                return Optional.of((T) Integer.valueOf(input)); // Cast to T
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                return promptUser(scanner, message, isInteger); // Retry on invalid input
            }
        } else {
            return Optional.of((T) input); // Cast to T
        }
    }

    private static void loadData(LogProcessor logProcessor) {
        System.out.println("Office Name\t\tUserName\t\tMonthDay\t\tTime\t\t\t\tLogString");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:47:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:49:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:51:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:53:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 5, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 5, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 6, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 6, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 6, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 6, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 6, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 6, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 6, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 6, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 6, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 6, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:27:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "15:37:37.147", "Image showed in applet");


        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 6, "17:37:37.147", "Image showed in applet");
    }
}
