import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File newFile = new File("toplam.txt");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }

        try {
            String val = "5\n" +
                    "10\n" +
                    "20\n" +
                    "12\n" +
                    "33";

            FileWriter fileWriter = new FileWriter(newFile);

            BufferedWriter bReader = new BufferedWriter(fileWriter);
            bReader.write(val);
            bReader.close();

            FileReader fileReader = new FileReader(newFile);
            String line;
            int sum = 0;

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}