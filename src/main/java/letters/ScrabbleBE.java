package letters;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleBE {
    public Integer calculateScore (String word){
        char[] wordArray = word.toCharArray();

        Map<Character, Integer> scrabbleMap = new HashMap<Character, Integer>();
        scrabbleMap.put('a', 1);
        scrabbleMap.put('e', 1);
        scrabbleMap.put('i', 1);
        scrabbleMap.put('o', 1);
        scrabbleMap.put('u', 1);
        scrabbleMap.put('l', 1);
        scrabbleMap.put('n', 1);
        scrabbleMap.put('r', 1);
        scrabbleMap.put('s', 1);
        scrabbleMap.put('t', 1);
        scrabbleMap.put('d', 2);
        scrabbleMap.put('g', 2);
        scrabbleMap.put('b', 3);
        scrabbleMap.put('c', 3);
        scrabbleMap.put('m', 3);
        scrabbleMap.put('p', 3);
        scrabbleMap.put('f', 4);
        scrabbleMap.put('h', 4);
        scrabbleMap.put('v', 4);
        scrabbleMap.put('w', 4);
        scrabbleMap.put('y', 4);
        scrabbleMap.put('k', 5);
        scrabbleMap.put('j', 8);
        scrabbleMap.put('x', 8);
        scrabbleMap.put('q', 10);
        scrabbleMap.put('z', 10);

        int score =0;
        for (char checkLetter : wordArray) {
            Character wrapperClassWord = checkLetter;
            int value = scrabbleMap.get(wrapperClassWord);
            score += value;
        }
        return score;
    }
}
















//    public Integer calculateScore(String letter){
//        int score = 0;
//        char[] letterArray = letter.toCharArray();
//        System.out.println(letterArray);
//        Map<String, Integer> scrabbleMap= new HashMap<String, Integer>();
//        for (char wordBreak : letterArray) {
//            if (wordBreak == 'a' || wordBreak == 'e' || wordBreak == 'i' || wordBreak == 'o' || wordBreak == 'u' || wordBreak == 'l' || wordBreak == 'r' || wordBreak == 'n'|| wordBreak == 's' || wordBreak == 't') {
//                scrabbleMap.put(String.valueOf(wordBreak), 1);
//               System.out.println(scrabbleMap.keySet());
//            }else if (wordBreak == 'd' || wordBreak == 'g'){
//                scrabbleMap.put(String.valueOf(wordBreak), 2);
//            }else if (wordBreak == 'b' || wordBreak == 'c' || wordBreak == 'm' ||wordBreak == 'p'){
//                scrabbleMap.put(String.valueOf(wordBreak), 3);
//            }else if (wordBreak == 'f' || wordBreak == 'h' || wordBreak == 'v' ||wordBreak == 'w' || wordBreak == 'y'){
//                scrabbleMap.put(String.valueOf(wordBreak), 4);
//            }else if (wordBreak == 'k'){
//                scrabbleMap.put(String.valueOf(wordBreak), 5);
//            }else if (wordBreak == 'j' || wordBreak == 'x' ){
//                scrabbleMap.put(String.valueOf(wordBreak), 8);
//            }else if (wordBreak == 'q' || wordBreak == 'z' ){
//                scrabbleMap.put(String.valueOf(wordBreak), 10);
//            }else{
//                System.out.println("oops");
//            }
//        }
//        for (Integer value : scrabbleMap.values()){
//            score +=value;
//        }
//        System.out.println(score);
//        return score;
//    }