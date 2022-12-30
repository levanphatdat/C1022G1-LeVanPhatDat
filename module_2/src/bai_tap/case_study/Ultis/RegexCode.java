package bai_tap.case_study.Ultis;

import org.omg.CORBA.PUBLIC_MEMBER;

public class RegexCode {
    private static final String REGEX_CUSTOMER_ID = "^KH-[\\d]{1,}$";
    private static final String REGEX_EMPLOYEE_ID = "^NV-[\\d]{1,}$";
    private static final String REGEX_AREA = "^([12][0-9]{2,}|[3-9][0-9]+)(\\.\\d+)?m2$";
    private static final String REGEX_RENTAL_COST = "^\\d*(\\.\\d+)?$";
    private static final String REGEX_MAX_PEOPLE = "^[1-9]|1\\d$";
    private static final String REGEX_FLOORS = "^[1-9]\\d*$";
    private static final String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)" +
            "?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String REGEX_IDENTITY_CODE = "^([\\d]{9}|[\\d]{12})$";
    private static final String REGEX_PHONE_NUMBER = "^09\\d{8}$";
    private static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String REGEX_ROOM="^SVRO-\\d{4}$";
    private static final String REGEX_VILLA="^SVVL-\\d{4}$";


    public static boolean checkCustomerID(String string) {
        return string.matches(REGEX_CUSTOMER_ID);
    }

    public static boolean checkEmployeeID(String string) {
        return string.matches(REGEX_EMPLOYEE_ID);
    }

    public static boolean checkArea(String string) {
        return string.matches(REGEX_AREA);
    }

    public static boolean checkRentalCost(String string) {
        return string.matches(REGEX_RENTAL_COST);
    }

    public static boolean checkMaxPeople(String string) {
        return string.matches(REGEX_MAX_PEOPLE);
    }

    public static boolean checkFloors(String string) {
        return string.matches(REGEX_FLOORS);
    }

    public static boolean checkDateOfBirth(String string) {
        return string.matches(DATE_OF_BIRTH);
    }

    public static boolean checkName(String string) {
        return string.matches(REGEX_NAME);
    }

    public static boolean checkIdentityCode(String string) {
        return string.matches(REGEX_IDENTITY_CODE);
    }

    public static boolean checkPhoneNumber(String string) {
        return string.matches(REGEX_PHONE_NUMBER);
    }

    public static boolean checkEmail(String string) {
        return string.matches(REGEX_EMAIL);
    }
    public static boolean checkRoom(String s){
        return s.matches(REGEX_ROOM);
    }
    public static boolean checkVilla(String s){
        return s.matches(REGEX_VILLA);
    }
}
