package bai_tap.case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Menu -----\n"+
                "1.\tEmployee Management\n"+
                "2.\tCustomer Management\n"+
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n"+
                "-----------------------------");
    }
}
