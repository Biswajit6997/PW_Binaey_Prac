import java.util.HashSet;
import java.util.Set;

public class pangram {
   
    
    public static void main(String[] args) {
        boolean flag=false;
        // String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        // String str="JOHN QUICKLY EXTEMPORIZED FIVE TOW BAGS";
        String str="Quick wafting zephyrs vex bold Jim";
                        

        str=str.replace(" ", "");
        str=str.toUpperCase();
        // 

        char ch[]=str.toCharArray();
        int arr[]=new int[26];
        
        for(int i=0;i<ch.length;i++){
            arr[ch[i]-65]++;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0) {
                System.out.println("It is not a panagram");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("It is a Pangram");
        }

   

    }
}
