import java.util.Scanner;

public class CodeVita {

    public static void main(String[] args) {
        String P="";
        String S="";
        char[] pr = new char[26];
        
        int[] x = new int[100];
        int t=0;
        int tmp=0;
        char ch;
        int i;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while(t!=0){
            char[] sr = new char[100];
            P = s.next();
            char[] parr = P.toCharArray();
            S = s.next();
            char[] sarr = S.toCharArray();
            i=0;
            for(char op: parr){
                pr[i] = op;
                i++;
            }
            i=0;
            for(char op: sarr){
                sr[i] = op;
                i++;
            }
            for(i=0;i<=(sr.length-1);i++){
                for(int j=0;j<=(pr.length-1);j++){
                    if(pr[j]==sr[i]){
                        x[i]=j;
                    }
                }
            }
            for(i=0;i<sr.length;i++){
                for(int j=0;j<sr.length-1;j++){
                    if(x[j]>x[j+1]){
                        tmp = x[j];
                        ch = sr[j];
                        x[j] = x[j+1];
                        sr[j] = sr[j+1];
                        x[j+1] = tmp;
                        sr[j+1] = ch;
                    }
                }
            }
            System.out.println(String.valueOf(sr));
            t--;
        }
    }
    
}
