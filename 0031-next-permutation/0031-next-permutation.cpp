class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size()-1;
        int breakPoint = 0;
        for(int i=n; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                breakPoint = i;
                break;
            }
        }
        if(breakPoint == 0) {
            sort(nums.begin(), nums.end());
        }
        else {
            int numToSwap = nums[breakPoint-1];
            int min = INT_MAX;
            for(int j=breakPoint; j<=n; j++) {
                if(nums[j]>numToSwap && nums[j]<min) {
                    int temp = nums[j];
                    nums[j] = nums[breakPoint-1];
                    nums[breakPoint-1] = temp;
                }
            }
            sort(nums.begin()+breakPoint, nums.end());
        }
    }
};