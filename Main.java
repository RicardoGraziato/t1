import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score1,score2;
        
        do{
            score1 = input.nextDouble();
            if(score1<0 || score1>10) System.out.print("nota invalida\n");
        }while(score1<0 || score1>10);

        do{
            score2 = input.nextDouble();
            if(score2<0 || score2>10) System.out.print("nota invalida\n");
        }while(score2<0 || score2>10);

            double result = calcula(score1,score2);
            System.out.printf("media = %.2f",result);

    }
    public static double calcula(double score1, double score2){
       
        double media = (score1+score2)/2.0;
        return media;

    }
}