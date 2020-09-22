package main.lesson2.Task8;

public class WithoutBreak {


    public static void main(String[] args) {
        WithoutBreak withoutBreak = new WithoutBreak();

        System.out.println(withoutBreak.checkResult(-1));
        System.out.println(withoutBreak.checkResult(2));
        System.out.println(withoutBreak.checkResult(4));
        System.out.println(withoutBreak.checkResult(7));
        System.out.println(withoutBreak.checkResult(0));

    }

    String checkResult(int value) {
        switch (value) {
            case 1:
                return "A";
            case 2:
                return "AA";
            case 3:
                return "AAA";
            case 4:
                return "AAAA";
            default:
                return "AAAAA";
        }

    }

}



