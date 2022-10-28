// Author : Devi Sricharan
import java.io.*;
import java.util.*;

public class urinals {
    public static int checking(char[] x) {
        for (int i = 0; i < x.length-1; i++) {
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

    public static void main(String[] args) throws IOException {
        Scanner filescan = new Scanner(new FileReader("Urinals.dat")).useDelimiter("delimiter to separate things");
        String input = filescan.useDelimiter("\\A").next();
        String[] str = input.split("\r\n");
        FileWriter outfile = new FileWriter("rule1.txt");

        for (int j = 0; j < str.length; j++) {
            char[] s = str[j].toCharArray();
            System.out.println(s);
            int free = 0;
            int a = urinals.checking(s);
            if (a == -1) {

                free = -1;
            } else if (a == 0) {
                for ( int i = 0; i < s.length; i++) {
                    if (i == 0) {
                        if (s[i] == '0' && s[i + 1] == '0') {
                            s[i] = '1';
                            free = counter(free);

                        }

                    } else if (i == s.length - 1) {
                        if (s[i] == '0' && s[i - 1] == '0') {
                            s[i] = '1';
                            free = counter(free);
                        }


                    } else {
                        if ((s[i - 1] == '0' && s[i] == '0' && s[i + 1] == '0')) {
                            s[i] = '1';
                            free = counter(free);

                        }
                    }
                }
            }
            String out=String.valueOf(free);
            outfile.write(out);
            outfile.write("\n");
            System.out.println(free);


        }
        outfile.close();
    }
}










