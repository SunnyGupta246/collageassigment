import java.util.*;

public class qustion1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n ;
    int k;
    int l=sc.nextInt(); ;
    for (int j = 0; j < l; j++){ 
        n = sc.nextInt();
    for (int i = 0; i < n; i++) {
 k=5*i;
 if (n>=38) {
    
     if (k>=n) {
         if (k-n<3) {
             n=k;
             break;
             
            }
    
        }
        //  break;
    }
     
    }


    System.out.println(n);
    }
}
}
