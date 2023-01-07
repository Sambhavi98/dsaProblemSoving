package arrays;
//Trapping Rain Water in O(1) Space Complexity
public class TrappingRainWater2 {

	public static void main(String[] args) {
		int arr[]= {3,4,5,1,7,2,6,5,4,1};
		System.out.print(trap(arr));
		
	}
	public static int trap(int[] height) {
		int leftMax=0;
        int rightMax=0;
        int left=0,ans=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }
                else{
                    ans+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>rightMax){
                    rightMax=height[right];
                }
                else{
                    ans+=rightMax-height[right];
                }
                right--;
            }
            
        }
        return ans;
    }
}
