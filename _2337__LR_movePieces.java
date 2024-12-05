import java.util.*;
//import java.io.*;



public class _2337__LR_movePieces {

    public boolean canChange(String start, String target) {
        int i=0,j=0;
        int n=start.length();
        String filteredStart=start.replace("_","");
          String filteredTarget=start.replace("_","");
          if(filteredStart !=filteredTarget)
          {
            return false;
          }
          while(i<n && j<n)
          {
            while(start.charAt(i)=='_' && i<n)
            {
                i++;
            }
             while(target.charAt(j)=='_' && j<n)
            {
                j++;
            }
            if(i==n || j==n)
            {
                break;
            }
            if(start.charAt(i)!=target.charAt(j))
            {
                return false;
            }
            if(start.charAt(i)=='L' && i<j)
            {
                return false;
            }
            if(start.charAt(i)=='R' && i>j)
            {
                return false;
            }
            i++;
            j++;
          }
          while(i<n && start.charAt(i)=='_')
          {
            i++;
          }
          while(j<n && start.charAt(j)=='_')
          {
            j++;
          }
          return i==n && j==n;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}