// LAB_8 Q6 - Read sdj.txt, replace "his" with "her"
import java.io.*;

public class ReplaceHisWithHer {
    public static void main(String[] args) {
        String path = "sdj.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null)
                content.append(line.replaceAll("(?i)\\bhis\\b", "her")).append("\n");
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(content.toString());
            bw.close();
            System.out.println("Replaced 'his' with 'her' in " + path);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating sample sdj.txt.");
            try {
                BufferedWriter w = new BufferedWriter(new FileWriter(path));
                w.write("This is his book. His name is John.\n");
                w.close();
                System.out.println("Created. Run again to replace.");
            } catch (IOException ex) { ex.printStackTrace(); }
        } catch (IOException e) { e.printStackTrace(); }
    }
}
