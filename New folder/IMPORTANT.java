import java.util.*;
public class IMPORTANT {
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans+arr[i];
            if(ans>max){
                max=ans;
            }
            if(ans<0){
                ans=0;
            }
        }
        System.out.println(max);
    }
}
