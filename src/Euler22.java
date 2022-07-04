import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Euler22 {

    public static void main(String... args) throws IOException {
        String namesString = "";
        try(FileInputStream fos = new FileInputStream("src/Euler22_names.txt")) {
            namesString = new String(fos.readAllBytes());
        }

        String[] quotedNames = namesString.split(",");
        Arrays.sort(quotedNames);
        int totalsScore = 0;
        for(int i=0; i<quotedNames.length; i++) {
            int charsValue = 0;
            for(int j=1; j<quotedNames[i].length()-1; j++) {
                charsValue += quotedNames[i].charAt(j) - 'A' + 1;
            }
            totalsScore += (i+1)*charsValue;
        }

        System.out.println(totalsScore);
    }
}
