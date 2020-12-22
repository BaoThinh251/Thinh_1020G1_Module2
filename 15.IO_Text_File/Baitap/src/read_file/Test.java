package read_file;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File nationFile = new File("src/read_file/Nation.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nationFile));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Nation code: " + country[4] + ", Nation: " + country[5]);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
