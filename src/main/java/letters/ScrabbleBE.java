package letters;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleBE {
    public Integer calculateScore(String letter){
        int score = 0;
        char[] letterArray = letter.toCharArray();
        System.out.println(letterArray);
        Map<String, Integer> scrabbleMap= new HashMap<String, Integer>();
        for (char wordBreak : letterArray) {
            if (wordBreak == 'a' || wordBreak == 'e') {
                scrabbleMap.put(String.valueOf(wordBreak), 1);
               //System.out.println(scrabbleMap.keySet());
            }else{
                System.out.println("oops");
            }
        }
        for (Integer value : scrabbleMap.values()){
            score +=value;
        }
        System.out.println(score);
        return score;
    }
}
