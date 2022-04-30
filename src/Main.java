import java.util.Scanner;
class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        if (n < 0) {
            System.out.println("Error");
        }else{
                double S=0;
                double result = 0;
                for(int i=0;i<=n;i++){
                    S=Math.pow(x,(2*n+1))/2*n+1;
                    result = result + S;
                }
                System.out.println(result);
            }
        }
    }
