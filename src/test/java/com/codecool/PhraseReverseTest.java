package com.codecool;

import com.codecool.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PhraseReverseTest {

    @Test
    public void testReverseArrayWorksAsExpected() {
        String[] testString = new String[]{"Ana", "are", "mere"};
        String[] expectedString = new String[]{"mere", "are", "Ana"};
        System.out.println(Arrays.toString(PhraseReverse.reverseArray(testString)));
        assertEquals(Arrays.toString(expectedString), Arrays.toString(PhraseReverse.reverseArray(testString)));
    }

    @Test
    public void testJoinWorksAsExpected() {
        String[] testString = new String[]{"horse", "flour", "grain", "food"};
        String otherString = " ";

        String expectedResult = "horse flour grain food";

        assertEquals(expectedResult, PhraseReverse.join(testString, otherString));
    }

    @Test
    public void testReverseWorksAsExpectedSingleWord() {
        String testString = "fire";
        String expectedResult = "erif";

        assertEquals(expectedResult, PhraseReverse.reverse(testString));
    }

    @Test
    public void testReverseWorksAsExpectedSentence() {
        String testString = "I'm being chased by my imagination";
        String expectedResult = "noitanigami ym yb desahc gnieb m'I";

        assertEquals(expectedResult, PhraseReverse.reverse(testString));
    }

    @Test
    public void testReverseWordOrderSingleWord() {
        String testString = "This";
        String expectedString = "This";

        assertEquals(expectedString, PhraseReverse.reverseWordOrder(testString));
    }

    @Test
    public void testReverseWordOrder() {
        String testString = "This is the end of everything";
        String expectedString = "everything of end the is This";

        assertEquals(expectedString, PhraseReverse.reverseWordOrder(testString));
    }
    @Test
    public void testReverseWordsSingleWord() {
        String testString = "Matchbook";
        String expectedString = "koobhctaM";
        assertEquals(expectedString, PhraseReverse.reverseWords(testString));
    }

    @Test
    public void testReverseWords() {
        String testString = "Matchbook Romance";
        String expectedString = "koobhctaM ecnamoR";

        assertEquals(expectedString, PhraseReverse.reverseWords(testString));
    }


    @Test
    public void testReverseNThrowsIllegalArgumentException() {
        String testString = "test";

        assertThrows(IllegalArgumentException.class, () -> {
           PhraseReverse.reverseN(testString, -25);
        });
    }

    @Test
    public void testReverseNThrowsIndexOutOfBoundsException() {
        String testString = "test";

        assertThrows(IndexOutOfBoundsException.class, () -> {
            PhraseReverse.reverseN(testString, 30);
        });
    }

    @Test
    public void testReverseNSingleWord() {
        String testString = "Mayday";
        String resultString = "yaMday";
        int numberOfReverses = 3;

        assertEquals(resultString, PhraseReverse.reverseN(testString,numberOfReverses));
    }

    @Test
    public void testReverseN() {
        String testString = "Mayday Parade";
        int numberOfReverses = 7;
        String resultString = " yadyaMParade";

        assertEquals(resultString, PhraseReverse.reverseN(testString, numberOfReverses));
    }
}