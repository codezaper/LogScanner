import com.log.scanner.service.LogProcessor;

import java.util.Optional;

/**
 * Hello world!
 *
 */
public class LogScanner
{
    public static void main( String[] args ) {
        Optional<String> officeName = args.length > 0 ? Optional.of(args[0]) : Optional.empty();
        Optional<String> userName = args.length > 1 ? Optional.of(args[1]) : Optional.empty();
        Optional<Integer> monthDay = args.length > 2 ? Optional.of(Integer.valueOf(args[2])) : Optional.empty();
        Optional<Integer> hourToSearch = args.length > 3 ? Optional.of(Integer.valueOf(args[3])) : Optional.empty();

        System.out.println("\nOffice Name : " + officeName.orElse("NA") + ", User Name : " + userName.orElse("NA") + ", Month Day : "+ monthDay.orElse(0) + ", Hour : " + hourToSearch.orElse(0)+"\n");

        LogProcessor logProcessor = new LogProcessor();

        // Load Log file
        loadData(logProcessor);

        // Print Log Stats
        logProcessor.printStats(officeName.orElse(""),userName.orElse(""),monthDay.orElse(null),hourToSearch.orElse(null));
    }

    private static void loadData(LogProcessor logProcessor) {
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
