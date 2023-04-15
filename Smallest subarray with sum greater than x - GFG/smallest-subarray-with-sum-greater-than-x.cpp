//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
  public:

    int smallestSubWithSum(int arr[], int n, int x)
    {
        // Your code goes here  
        int i=0, j=0, count=INT_MAX, sum=arr[0];
        while(j < n){
            if(sum > x)
            {
                count = min(j - i + 1 , count);  
                sum -= arr[i];
                i++;
            }
            else
            {
                j++;
                sum += arr[j];
            }
        }
          
        return count;
    }
};

//{ Driver Code Starts.

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n,x;
		cin>>n>>x;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		Solution obj;
		cout<<obj.smallestSubWithSum(a,n,x)<<endl;
	}
	return 0;
}
// } Driver Code Ends