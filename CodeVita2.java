import java.util.Scanner;

public class CodeVitaWalaNew {

    public static void main(String[] args) {
                
        int[] pts = new int[100];
        int[] win = new int[100];
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int T= s.nextInt();
        int[][] t = new int[N+1][T+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<=T;j++){
                t[i][j] = s.nextInt();
            }
        }        
        int k;
        int x = T/2;
        for(int j=1;j<=x;j++){
            for(int i=0;i<N;i++){
                pts[i] += (t[i][2*j]*t[i][T])+(t[i][2*j-1]*t[i][T]);
            }
            int max = pts[0];
            int index = 0;
            for(k=0;k<N;k++){
                if(max<pts[k]){
                    max = pts[k];
                    index = k;
                }
            }
            win[k]+=1;
        }
        int winner = win[0];
        int winindex = 0;
        for(int i=0;i<N;i++){
            if(winner<win[i]){
                winner = win[i];
                winindex = i;
            }
        }
        System.out.println(winindex+1);

    }
    
}
