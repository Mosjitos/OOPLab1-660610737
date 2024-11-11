import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner Get = new Scanner(System.in);
        int N = Get.nextInt();
        if (N >= 0) {
            //Collecting element in Keep[]
            int[] Keep = new int[N];
            for (int i = 0; i < Keep.length; i++) { //i has value between 0 - N-1
                Keep[i] = Get.nextInt();
            }
            for (int w : Keep) { //check Array
                System.out.println(w);
            }
        }
    }
}