public class App {
    public static void main(String[] args) throws Exception {

    int[] array1 = {1,2,3};
        System.out.println(calculateSum(array1)); 
    }
    public static int calculateSum(int[] numbers)
    {
        int arvo = 0;
        for(int i=0;i < numbers.length;i++){
            arvo = arvo + numbers[i];
        }
        return arvo;
    }

}
