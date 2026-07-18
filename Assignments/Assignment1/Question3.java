import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        for(int i=start;i<=end;i++ ) {
            boolean flag=true;
            if(i<=1) {
                flag=false;
            } else{
            for(int j=2;j*j<=i;j++) {
                if(i%j==0) {
                    flag=false;
                    break;
        
                }
            }
            
        }
         if(flag){
            System.out.println(i);
        }
    }
    }
}      
