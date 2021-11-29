/*
* File:bmr.java
* Author: Zsolnai Bernadett
* Copyright: 2021,  Zsolnai Bernadett
* Date: 2021-11-29
*
*/

public class bmr {
    
    double testtomeg;
    double magassag;
    double eletkor;

    public void setData(double testtomeg, double magassag, double eletkor){
        this.testtomeg = testtomeg;
        this.magassag = magassag;
        this.eletkor = eletkor;
    }

    public void getData(){
        testtomeg = Input.input("Testtömege");
        magassag = Input.input("Magassága");
        eletkor = Input.input("Életkora");
    }

    public double manBmr(){
        double Manbmr = (13.397*testtomeg)+(4.799*magassag)-(5.667*eletkor)+88.362;

        return Manbmr;
    }

    public double womanBmr(){
        double Womanbmr = (9.247*testtomeg)+(3.098*magassag)-(4.330*eletkor)+447.593;

        return Womanbmr;
    }

}
