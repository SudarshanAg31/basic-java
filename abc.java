import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Student1 = new int[3];
        int[] Student2 = new int[3];
        int[] Student3 = new int[3];

        int sum_s1 = 0;
        for (int i = 0; i < Student1.length; i++) {
            Student1[i] = sc.nextInt();
            sum_s1 += Student1[i];
        }

        int sum_s2 = 0;
        for (int i = 0; i < Student2.length; i++) {
            Student2[i] = sc.nextInt();
            sum_s2 += Student2[i];
        }

        int sum_s3 = 0;
        for (int i = 0; i < Student3.length; i++) {
            Student3[i] = sc.nextInt();
            sum_s3 += Student3[i];
        }

        int[] avg_sub = new int[3];
        for (int i = 0; i < Student1.length; i++) {
            avg_sub[i] = (Student1[i] + Student2[i] + Student3[i]) / 3;
        }
        int St_avg = (sum_s1 + sum_s2 + sum_s3) / 3;
        System.out.println("Students avg: " + St_avg);
        System.out.println("subject 1: " + avg_sub[0]);
        System.out.println("subject 2: " + avg_sub[1]);
        System.out.println("subject 3: " + avg_sub[2]);
    }
}
