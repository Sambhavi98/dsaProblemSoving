package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[]= {1,0,2,1,0,1,3,2,1,2,1};
		System.out.print(trap(arr));
		
	}
	public static int trap(int[] height) {
        int size=height.length;
        int left[]=new int[size];
        int right[]=new int[size];
        int area=0;
        left[0]=height[0];
        for(int i=1;i<size;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        right[size-1]=height[size-1];
        for(int i=size-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        for(int i=1;i<size;i++){
            area+=Math.min(left[i],right[i])-height[i];
        }
        return area;
    }
}
