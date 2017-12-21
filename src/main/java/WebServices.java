import java.io.FileWriter;
import java.io.IOException;

public class WebServices {

    public static void main(String[] args) throws IOException {
        String Path = System.getProperty("user.dir") + "/";
        if (Path == null){
            Path = "";
        }
        FileWriter fw = new FileWriter(Path + "Jenkins.txt", true);
        fw.append("Ich bin am Testen, und es hat geklappt");
        fw.close();
    }
}
