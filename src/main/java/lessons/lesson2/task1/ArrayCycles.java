package lessons.lesson2.task1;

public class ArrayCycles {
    public static void main(String[] args) {

        String[] array = new String[5];
        array[0] = "Пятница";
        array[1] = "это";
        array[2] = "лучший";
        array[3] = "день";
        array[4] = "недели";


        method1(array);
        System.out.println();
        method2(array);
        System.out.println();
        method3(array);

    }

    static void method1(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1)
                System.out.print(".");
            else
                System.out.print(" ");
        }
    }

    static void method2(String[] array2) {
        int counter = 0;

        for (String item : array2) {
            counter = counter + 1;

            System.out.print(item);

            if (counter > array2.length - 1)
                System.out.print(".");
            else
                System.out.print(" ");
        }

    }

    static void method3(String[] array3) {
        int i = 0;
        while (i < array3.length) {
            System.out.print(array3[i]);
            if (i == array3.length - 1)
                System.out.print(".");
            else
                System.out.print(" ");
            i = i + 1;

        }

    }

}

