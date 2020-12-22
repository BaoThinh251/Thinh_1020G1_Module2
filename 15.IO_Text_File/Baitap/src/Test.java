import java.io.*;

public class Test {
    public static void main(String[] args) {
        File sourceFile = new File("src/Source.csv");
        File targetFile = new File("src/Target.csv");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            String line = null;

            while ((line = reader.readLine()) != null) {
                BufferedWriter write = new BufferedWriter(new FileWriter(targetFile, true));
                write.write(line);
                write.newLine();
                write.close();
            }

        } catch(FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
