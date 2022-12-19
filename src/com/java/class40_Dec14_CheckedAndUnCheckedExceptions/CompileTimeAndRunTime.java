package com.java.class40_Dec14_CheckedAndUnCheckedExceptions;

import java.util.Scanner;

public class CompileTimeAndRunTime {
    public static void main(String[] args) {
        openBrowser();
    }

    public static void openBrowser() {
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();

        if (browser.equals("Chrome")){
            System.out.println("Opening Chrome");
        } else if (browser.equals("Firefox")){
            System.out.println("Opening Firefox");
        } else {
            throw new RuntimeException("Please re-enter the Browser name. The nae you have entered is invalid!");
        }
    }
}
