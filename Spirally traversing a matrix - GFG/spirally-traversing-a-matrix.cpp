//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{   
    public: 
    //Function to return a list of integers denoting spiral traversal of matrix.
    vector<int> spirallyTraverse(vector<vector<int> > matrix, int r, int c) 
    {
        // code here 
        vector<int> ans;
        int rowSize = r;
        int colSize = c;
        int count = 0;
        int top = 0;
        int left = 0;
        int bottom = rowSize-1;
        int right = colSize-1;
        int total = rowSize*colSize;
        
        while(count < total)
        {
            // top print
            for(int i = left; count < total && i<=right; i++)
            {
                ans.push_back(matrix[top][i]);
                count++;
            }
            top++;
            // right print
            for(int i = top; count < total && i<=bottom; i++)
            {
                ans.push_back(matrix[i][right]);
                count++;
            }
            right--;
            // bottom print
            for(int i = right; count < total && i>=left; i--)
            {
                ans.push_back(matrix[bottom][i]);
                count++;
            }
            bottom--;
            // left print
            for(int i = bottom; count < total && i>=top; i--)
            {
                ans.push_back(matrix[i][left]);
                count++;
            }
            left++;
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--) 
    {
        int r,c;
        cin>>r>>c;
        vector<vector<int> > matrix(r); 

        for(int i=0; i<r; i++)
        {
            matrix[i].assign(c, 0);
            for( int j=0; j<c; j++)
            {
                cin>>matrix[i][j];
            }
        }

        Solution ob;
        vector<int> result = ob.spirallyTraverse(matrix, r, c);
        for (int i = 0; i < result.size(); ++i)
                cout<<result[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends