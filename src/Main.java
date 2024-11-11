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
            for (int w : Keep) { //check
                System.out.println(w);
            }
            //Sorting Part (using Bubble Sort)
            for(int i=0 ; i < Keep.length ; i++) {
                for(int j=0 ; j < Keep.length ; j++) {
                    if(Keep[i] > Keep[j]) {
                        int temp = Keep[i];
                        Keep[i] = Keep[j];
                        Keep[j] = temp;
                    }
                }
            }
            System.out.println("Sorted: ");
            for(int w : Keep) { //w is member of Keep (loop at first-last element)
                System.out.println(w);
            }
        } else {
            System.out.println("Size must be greater than 0");
        }
    }
}