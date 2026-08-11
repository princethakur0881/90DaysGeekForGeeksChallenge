import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        // code here
  double  res = (double)sI(p,r,t);
      System.out.printf("%.2f%n",res);
    }
    public static double  sI(int P, int R, int T) {
  double si=P*R*T*0.01;
        return  (double)si;
}
}