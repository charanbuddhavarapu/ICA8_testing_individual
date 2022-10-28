// Author : Devi Sricharan
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class urinals {
    public static int checking(char[] x) {
        for (int i = 0; i < x.length; i++) {
            if ((x[i] == '1') && (x[i + 1] == '1')) {

                return -1;
            }

        }
        return 0;
    }

    public static int counter(int count){
        count=count+1;
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string");
        String inputs = sc.next();
        Scanner filescan = new Scanner(new FileReader("Urinals.dat"));
        String input = filescan.useDelimiter("\\A").next();
        char[] s = input.toCharArray();


    }
}










