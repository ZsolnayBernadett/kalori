/*
* File:BmrTest.java
* Author: Zsolnai Bernadett
* Copyright: 2021,  Zsolnai Bernadett
* Date: 2021-11-29
*
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BmrTest{
    bmr bmr;

    @BeforeEach
    void setUp(){
        bmr = new bmr();
    }

    @Test
    void manBmrNormal1test(){
        double testtomeg = 92;
        double magassag = 182;
        double eletkor = 46;

        bmr.setData(testtomeg, magassag, eletkor);
        double actual = bmr.manBmr();
        double expected = 1933.6;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    void manBmrNormal2test(){
        double testtomeg = 85;
        double magassag = 176;
        double eletkor = 31;

        bmr.setData(testtomeg, magassag, eletkor);
        double actual = bmr.manBmr();
        double expected = 1896.0;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    void womanBmrNormal1test(){
        double testtomeg = 65;
        double magassag = 172;
        double eletkor = 29;

        bmr.setData(testtomeg, magassag, eletkor);
        double actual = bmr.womanBmr();
        double expected = 1455.9;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    void womanBmrNormal2test(){
        double testtomeg = 76;
        double magassag = 168;
        double eletkor = 49;

        bmr.setData(testtomeg, magassag, eletkor);
        double actual = bmr.womanBmr();
        double expected = 1458.6;
        assertEquals(expected, actual, 0.1);
    }
}
