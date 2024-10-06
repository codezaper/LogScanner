import com.log.scanner.service.LogProcessor;

/**
 * Hello world!
 *
 */
public class LogScanner
{
    public static void main( String[] args )
    {
        LogProcessor logProcessor = new LogProcessor();

        // Example log entries
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:36.147", "Loading image…");

        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:37.147", "Image showed in applet");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco", 5, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 5, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Yogesh", 6, "14:27:37.147", "Image showed in applet");

        logProcessor.processLogLine("Genova", "Amol", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Amol", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Amol", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Amol", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Amol", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Amol", 5, "14:27:37.147", "Image showed in applet");

        /*logProcessor.processLogLine("Genova", "Paco1", 5, "14:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Genova", "Paco1", 5, "14:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Genova", "Paco1", 5, "14:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Genova", "Paco1", 5, "14:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Genova", "Paco1", 5, "14:37:36.147", "Loading image…");
        logProcessor.processLogLine("Genova", "Paco1", 5, "14:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Paco", 5, "14:37:37.147", "Image showed in applet");

        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:37:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:37:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:37:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:37:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:37:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Yogesh", 5, "14:37:37.147", "Image showed in applet");*/

       /* logProcessor.processLogLine("Mumbai", "Amol", 5, "14:47:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Mumbai", "Amol", 5, "14:47:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Mumbai", "Amol", 5, "14:47:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Mumbai", "Amol", 5, "14:47:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Mumbai", "Amol", 5, "14:47:36.147", "Loading image…");
        logProcessor.processLogLine("Mumbai", "Amol", 5, "14:47:37.147", "Image showed in applet");

        logProcessor.processLogLine("Delhi", "Paco2", 5, "14:27:30.646", "*********Starting scan********");
        logProcessor.processLogLine("Delhi", "Paco2", 5, "14:27:35.646", "Scan done. Image loaded in memory");
        logProcessor.processLogLine("Delhi", "Paco2", 5, "14:27:35.647", "Saving sample TIF image in share disc ...");
        logProcessor.processLogLine("Delhi", "Paco2", 5, "14:27:36.146", "Image TIF saved in shared disc");
        logProcessor.processLogLine("Delhi", "Paco2", 5, "14:27:36.147", "Loading image…");
        logProcessor.processLogLine("Delhi", "Paco2", 5, "14:27:37.147", "Image showed in applet");*/
        logProcessor.printStats("Genova",null,null);
    }
}
