package Helper;
import java.io.*;
import java.util.Properties;

public class Helper {
    public static Properties prop;
    static {
        prop = new Properties();
    }

    public static void readConfig() {
        String workingDir = System.getProperty("user.dir")+"/src/test/java/Testdata/Data.xml";
        try {
            File file = new File(workingDir);
            FileInputStream fileInput = new FileInputStream(file);
            prop.loadFromXML(fileInput);
            fileInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
