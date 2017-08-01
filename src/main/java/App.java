/**
 * Created by Guest on 8/1/17.
 */
import letters.ScrabbleBE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your scrabble word for a score: ");
        try{
            String stringUserInput = bufferedReader.readLine();
            ScrabbleBE scrabble = new ScrabbleBE();
            Integer calculate = scrabble.calculateScore(stringUserInput);
            System.out.println(calculate);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
