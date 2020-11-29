package lessons.lesson2.task3;

import java.util.regex.Pattern;

public class PhoneNumber {
    public static final Pattern PHONE_PATTERN = Pattern.compile("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");

    public static void main(String[] args) {
        String phone1 = "+7(910)423-73-12";
        boolean check1 = checkPhone(phone1);
        System.out.println(phone1 + " " + check1);

        String phone2 = "7(910)423-73-12";
        System.out.println(phone2 + " " + checkPhone(phone2));

        String phone3 = "89215310934";
        boolean check3 = checkPhone(phone3);
        System.out.println(phone3 + " " + check3);

        String phone4 = "+5(911)310-12-74";
        System.out.println(phone4 + " " + checkPhone(phone4));

        String phone5 = "+7(9fg)125-42-99";
        boolean check5 = checkPhone(phone5);
        System.out.println(phone5 + " " + check5);

        String phone6 = "+7(122)2342343";
        System.out.println(phone6 + " " + checkPhone(phone6));

    }

    public static boolean checkPhone(String phone) {
        return PHONE_PATTERN.matcher(phone).matches();
    }
}
