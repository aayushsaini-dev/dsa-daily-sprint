public class TrapWater {
    public static int Trapwater(int height[]) {
        int n = height.length;
        // calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calciulate right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // loop
        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water = waterlevel -height[i]
            TrappedWater = TrappedWater + waterlevel - height[i];
        }

        return TrappedWater;
    }

    public static void main(String args[]) {
        System.out.print("trap water is : ");
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(Trapwater(height));
    }
}
