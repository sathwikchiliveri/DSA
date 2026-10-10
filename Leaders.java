import java.util.*;
class Leaders{
    public static void main(String []args){
    int nums[]={1,2,5,3,1,2};
    int o[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>nums[i+1]){
           o[i]=nums[i];
            // System.out.print(o);
        }
    } 
System.out.print(Arrays.toString(o)); 
}
}