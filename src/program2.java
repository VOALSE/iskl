public class program2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,4,5,4,76,7,8,4,2,3};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        }
    }
}
