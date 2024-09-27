import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        String newString = "Hello";
        String reversedString = "";
        
        for (int i = 0; i < newString.length(); i++) {
          reversedString = newString.charAt(i) + reversedString;
        }
        
        System.out.println("Reversed string: "+ reversedString);
    }
}
