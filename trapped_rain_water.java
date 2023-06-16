public class trapped_rain_water {

    public static int trappedRainWater(int height[]){
        int n = height.length;

        // calculate left max boundry - array 
        int leftmax[] = new int [n];
        leftmax[0]=height[0];
        for (int i = 1; i <= n; i++) 
        {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        // calculate right max boundry - array
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater = 0;
        
        //loop
        for (int i = 0; i < n; i++) {
            //water level = min(max left , max right)

            int waterLevel = Math.min(leftmax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]

            trappedwater+= waterLevel - height[i];
        }
        return trappedwater;

    }


    public static void main(String[] args) {
        int num[]= {4,2,0,6,3,2,5};
        trappedRainWater(num);
    }
}
