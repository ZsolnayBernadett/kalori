/*
* File:Input.java
* Author: Zsolnai Bernadett
* Copyright: 2021,  Zsolnai Bernadett
* Date: 2021-11-29
*
*/

import java.util.Scanner;

public class Input {
    static Scanner scanner;

    public static double input (String message){
        scanner = new Scanner(System.in);
        System.out.print(message + ":");
        double num = scanner.nextDouble();
        return num;
    }
}
