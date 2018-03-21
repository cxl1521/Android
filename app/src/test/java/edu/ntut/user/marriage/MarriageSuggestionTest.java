package edu.ntut.user.marriage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Created by user on 2018/3/7.
 */
public class MarriageSuggestionTest {

    private MarriageSuggestion marriageSuggestion;

    @Before
    public void setUp(){
        marriageSuggestion = new MarriageSuggestion(new LLogger());
    }

    @After
    public void tearDown(){
        marriageSuggestion = null;
    }

    @Test
    public void test_getSuggestion() throws Exception {
        String s;

        s = marriageSuggestion.getSuggestion("男", 25);
        assertEquals(s, "還不急");

        s = marriageSuggestion.getSuggestion("女", 35);
        assertEquals(s, "趕快結婚");

        s = marriageSuggestion.getSuggestion("男", 30);
        assertEquals(s, "開始找對象");
    }
}
