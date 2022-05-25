package Task09_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

    private static Log log;
    BufferedWriter bufWriter;
    public static int instanceNumber = 0;

    private Log(String str) {
        try {
            this.bufWriter = new BufferedWriter(new FileWriter("./resources/T09_log.txt", true));

            System.out.println("writting log");
            bufWriter.write(str + "\n");
            bufWriter.flush();

        } catch (IOException e) {
        }
        instanceNumber++;
        System.out.println("A log instance has been created");
    }

    public static synchronized Log getSingletonInstance(String str) {
        if (log == null) {
            log = new Log(str);
        } else {
            System.out.println("writting log");
            try {
                log.bufWriter.write(str);
                log.bufWriter.flush();
            } catch (IOException ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return log;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
