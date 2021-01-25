package AssignmentsFrom12;

import java.util.Locale;

public class a42 {
    public static void main(String[] args) {
        String str = " white car has a white liense plate";
        int count;
        str= str.toLowerCase(Locale.ROOT);
        String words[]= str.split("");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }

    }
}
