public class Main {
    public static void main(String[] args) {

        //Первая задача
        int[] integers = new int[]{1, 2, 3};
        double[] doubles = new double[]{-1.75, 7.654, 9.986};
        int[] numbers = new int[10];
        numbers[2] = 2;

        //Вторая задача
        for (int i = 0; i <= 2; i++) {
            System.out.print(integers[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(doubles[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        //Третья задача
        for (int i = 2; i >= 0; i--) {
            System.out.print(integers[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 2; i >= 0; i--) {
            System.out.print(doubles[i] + ", ");
        }
        System.out.println();

        for (int i = 9; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        //Четвертая задача

        for (int i = 0; i <= 2; i++) {
            //System.out.println(integers[i]);
            if(integers[0] % 2 == 1){
                System.out.println(integers[i] + 1);
            }
        }
    }
}
