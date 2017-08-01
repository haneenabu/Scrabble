package letters;

import org.junit.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleBETest {
    @Test
    public void calculateScore_returnScoreForSingleLetter_1() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 1;
        assertEquals(expected, testScarabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnScoreForRepeatingLetter_2() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 2;
        assertEquals(expected, testScarabble.calculateScore("aa"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_2() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 2;
        assertEquals(expected, testScarabble.calculateScore("ae"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAndRepeat_3() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 3;
        assertEquals(expected, testScarabble.calculateScore("aee"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_3() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 3;
        assertEquals(expected, testScarabble.calculateScore("ad"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAndRepeat_5() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 5;
        assertEquals(expected, testScarabble.calculateScore("add"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_4() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 4;
        assertEquals(expected, testScarabble.calculateScore("ab"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAndRepeat_7() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 7;
        assertEquals(expected, testScarabble.calculateScore("abb"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_5() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 5;
        assertEquals(expected, testScarabble.calculateScore("af"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAndRepeat_9() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 9;
        assertEquals(expected, testScarabble.calculateScore("aff"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_6() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 6;
        assertEquals(expected, testScarabble.calculateScore("ak"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAndRepeat_11() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 11;
        assertEquals(expected, testScarabble.calculateScore("akk"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_9() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 9;
        assertEquals(expected, testScarabble.calculateScore("aj"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAddRepeat_17() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 17;
        assertEquals(expected, testScarabble.calculateScore("ajj"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLetters_11() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 11;
        assertEquals(expected, testScarabble.calculateScore("aq"));
    }
    @Test
    public void calculateScore_returnScoreForTwoDiffLettersAddRepeat_21() throws Exception{
        ScrabbleBE testScarabble = new ScrabbleBE();
        Integer expected = 21;
        assertEquals(expected, testScarabble.calculateScore("aqq"));
    }
}