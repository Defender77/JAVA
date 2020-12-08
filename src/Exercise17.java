import java.util.Scanner;

public class Exercise17{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double runningTotal=0.0;
        System.out.println("Start entering data:");
        System.out.print("Miles: ");
        int miles=sc.nextInt();
        System.out.print("Gallons: ");
        int gallons=sc.nextInt();
        double MPG=(double)miles/gallons;
        System.out.printf("Current MPG: %f\n",MPG);
        runningTotal+=MPG;
        System.out.printf("Running total of MPGs: %f\n",runningTotal);
        int S=1;
        System.out.print("More entries? Input 1 for yes and 0 for no: ");
        S=sc.nextInt();
        while(S!=0){
        System.out.print("Miles: ");
        miles=sc.nextInt();
        System.out.print("Gallons: ");
        gallons=sc.nextInt();
        MPG=(double)miles/gallons;
        System.out.printf("Current MPG: %f\n",MPG);
        runningTotal+=MPG;
        System.out.printf("Running total of MPGs: %f\n",runningTotal);
        System.out.print("More entries? Input 1 for yes and 0 for no:");
        S=sc.nextInt();
        }
        }
        }
