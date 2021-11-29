/*
* File:App.java
* Author: Zsolnai Bernadett
* Copyright: 2021,  Zsolnai Bernadett
* Date: 2021-11-29
*
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Napi kalória szükséglet számítás");
        bmr bmr = new bmr();
        bmr.getData();
        System.out.println(bmr.manBmr());
        System.out.println(bmr.womanBmr());
    }
}
