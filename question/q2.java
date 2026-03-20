
import java.util.Scanner;


class Checker {
    public static void checkData(String data) throws Exception {
        if (data.endsWith(".csv") || data.endsWith(".txt")) {
            System.out.println("Valid You can use RNN or SVM.");
        } else {
            throw new Exception("Invalid data format. Data is not a CSV or TXT file.");
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data file name");
        String data = sc.nextLine();
        try {
            Checker.checkData(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
// take user data value csv  or text
// outpur rnn or svm used
//for other data invalid data throw error