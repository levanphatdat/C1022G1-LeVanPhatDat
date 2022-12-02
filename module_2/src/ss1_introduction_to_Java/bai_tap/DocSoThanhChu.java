package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Nhập số:");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0 && num < 10) {
            String strUnit;
            switch (num) {
                case 1:
                    strUnit = "One";
                    break;
                case 2:
                    strUnit = "Two";
                    break;
                case 3:
                    strUnit = "Three";
                    break;
                case 4:
                    strUnit = "Four";
                    break;
                case 5:
                    strUnit = "Five";
                    break;
                case 6:
                    strUnit = "Six";
                    break;
                case 7:
                    strUnit = "Seven";
                    break;
                case 8:
                    strUnit = "Eight";
                    break;
                case 9:
                    strUnit = "Nine";
                    break;
                default:
                    strUnit = "Zero";
            }
            System.out.println(strUnit);
        } else if (num > 9 && num < 100) {
            int dozens = num / 10;
            int unit = num - dozens * 10;
            if (dozens == 1) {
                String strUnit;
                switch (unit) {
                    case 1:
                        strUnit = "Eleven";
                        break;
                    case 2:
                        strUnit = "Twelve";
                        break;
                    case 3:
                        strUnit = "Thirteen";
                        break;
                    case 4:
                        strUnit = "Fourteen";
                        break;
                    case 5:
                        strUnit = "Fifteen";
                        break;
                    case 6:
                        strUnit = "Sixteen";
                        break;
                    case 7:
                        strUnit = "Seventeen";
                        break;
                    case 8:
                        strUnit = "Eighteen";
                        break;
                    case 9:
                        strUnit = "Nineteen";
                        break;
                    default:
                        strUnit = "Ten";
                }
                System.out.println(strUnit);
            } else {
                String strDozens = "";
                String strUnit;
                switch (dozens) {
                    case 2:
                        strDozens = "Twenty";
                        break;
                    case 3:
                        strDozens = "Thirty";
                        break;
                    case 4:
                        strDozens = "Forty";
                        break;
                    case 5:
                        strDozens = "Fifty";
                        break;
                    case 6:
                        strDozens = "Sixty";
                        break;
                    case 7:
                        strDozens = "Seventy";
                        break;
                    case 8:
                        strDozens = "Eighty";
                        break;
                    case 9:
                        strDozens = "Ninety";
                        break;
                    default:
                        strDozens = "";
                }
                switch (unit) {
                    case 1:
                        strUnit = "One";
                        break;
                    case 2:
                        strUnit = "Two";
                        break;
                    case 3:
                        strUnit = "Three";
                        break;
                    case 4:
                        strUnit = "Four";
                        break;
                    case 5:
                        strUnit = "Five";
                        break;
                    case 6:
                        strUnit = "Six";
                        break;
                    case 7:
                        strUnit = "Seven";
                        break;
                    case 8:
                        strUnit = "Eight";
                        break;
                    case 9:
                        strUnit = "Nine";
                        break;
                    default:
                        strUnit = "";
                }
                System.out.println(strDozens + " " + strUnit);
            }
        } else if (num > 99 && num < 1000) {
            int hundreds = num / 100;
            int residualHundreds = num - hundreds * 100;
            int dozens = residualHundreds / 10;
            int unit = residualHundreds - dozens * 10;
            String strHundreds;
            String strDozens = "";
            String strUnit;
            switch (hundreds) {
                case 1:
                    strHundreds = "One";
                    break;
                case 2:
                    strHundreds = "Two";
                    break;
                case 3:
                    strHundreds = "Three";
                    break;
                case 4:
                    strHundreds = "Four";
                    break;
                case 5:
                    strHundreds = "Five";
                    break;
                case 6:
                    strHundreds = "Six";
                    break;
                case 7:
                    strHundreds = "Seven";
                    break;
                case 8:
                    strHundreds = "Eight";
                    break;
                default:
                    strHundreds = "Nine";
            }
            if (dozens == 1) {
                switch (unit) {
                    case 1:
                        strUnit = "Eleven";
                        break;
                    case 2:
                        strUnit = "Twelve";
                        break;
                    case 3:
                        strUnit = "Thirteen";
                        break;
                    case 4:
                        strUnit = "Fourteen";
                        break;
                    case 5:
                        strUnit = "Fifteen";
                        break;
                    case 6:
                        strUnit = "Sixteen";
                        break;
                    case 7:
                        strUnit = "Seventeen";
                        break;
                    case 8:
                        strUnit = "Eighteen";
                        break;
                    case 9:
                        strUnit = "Nineteen";
                        break;
                    default:
                        strUnit = "Ten";
                }
            } else {
                switch (dozens) {
                    case 2:
                        strDozens = "Twenty";
                        break;
                    case 3:
                        strDozens = "Thirty";
                        break;
                    case 4:
                        strDozens = "Forty";
                        break;
                    case 5:
                        strDozens = "Fifty";
                        break;
                    case 6:
                        strDozens = "Sixty";
                        break;
                    case 7:
                        strDozens = "Seventy";
                        break;
                    case 8:
                        strDozens = "Eighty";
                        break;
                    case 9:
                        strDozens = "Ninety";
                        break;
                    default:
                        strDozens = "";
                }
                switch (unit) {
                    case 1:
                        strUnit = "One";
                        break;
                    case 2:
                        strUnit = "Two";
                        break;
                    case 3:
                        strUnit = "Three";
                        break;
                    case 4:
                        strUnit = "Four";
                        break;
                    case 5:
                        strUnit = "Five";
                        break;
                    case 6:
                        strUnit = "Six";
                        break;
                    case 7:
                        strUnit = "Seven";
                        break;
                    case 8:
                        strUnit = "Eight";
                        break;
                    case 9:
                        strUnit = "Nine";
                        break;
                    default:
                        strUnit = "";
                }
            }
            System.out.println(strHundreds + " hundred and " + strDozens + " " + strUnit);
        } else {
            System.out.println("out of ability");
        }
    }
}
