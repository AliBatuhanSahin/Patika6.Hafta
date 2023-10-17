import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Metin Giriniz :");
        String line = input.nextLine();


        try {
            File file = new File("notlar.txt");
            if (!file.exists()) {

                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter("notlar.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(line);
            printWriter.close();


            FileReader fileReader = new FileReader("notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readedLine;

            // Line olarak kaydettiğimiz için tüm satırları yazdırmak için while döngüsü kullanıldı.
            while ((readedLine = bufferedReader.readLine()) != null) {
                System.out.println(readedLine);
            }

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}