public class trappedRainwater {

    public static int trappedRainwater(int num[]){
        int n = num.length;
        // calculate leftmax boundry using auxiliary array 
        int leftmax[] = new int[n];
        leftmax[0] = num[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(num[i] , leftmax[i-1]);
        }
        // calculate rightmax boundry using auxiliary array
        int rightmax[] = new int[n];
        rightmax[n-1] = num[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(num[i], rightmax[i+1]);
        }
        int trappedRainwater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            // water level = min (maxleft boundry , maxright boundry)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trappedwater = waterlevel = num[i]
            trappedRainwater += waterlevel  - num[i];
        }
        return trappedRainwater;
    }
    public static void main(String[] args) { 
        int num[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(num));
    }
}
