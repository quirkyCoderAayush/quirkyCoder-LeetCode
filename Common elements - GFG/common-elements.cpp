//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:    
       vector <int> commonElements (int A[], int B[], int C[], int n1, int n2, int n3)
        {
            //code here.
            vector<int> ans;
            unordered_map<int, int> mp1, mp2, mp3;
            for(int i=0; i<n1; i++)
            {
                mp1[A[i]]++;
            }
            for(int i=0; i<n2; i++)
            {
                mp2[B[i]]++;
            }
            for(int i=0; i<n3; i++)
            {
                mp3[C[i]]++;
            }
            for(int i=0; i<n1; i++)
            {
                if(mp1[A[i]] and mp2[A[i]] and mp3[A[i]])
                    ans.push_back(A[i]);
                mp1[A[i]] = 0;
            }
            return ans;
        }

};

//{ Driver Code Starts.

int main ()
{
    int t; cin >> t;
    while (t--)
    {
        int n1, n2, n3; 
        cin >> n1 >> n2 >> n3;
        int A[n1];
        int B[n2];
        int C[n3];
        
        for (int i = 0; i < n1; i++) cin >> A[i];
        for (int i = 0; i < n2; i++) cin >> B[i];
        for (int i = 0; i < n3; i++) cin >> C[i];
        
        Solution ob;
        
        vector <int> res = ob.commonElements (A, B, C, n1, n2, n3);
        if (res.size () == 0) 
            cout << -1;
        for (int i = 0; i < res.size (); i++) 
            cout << res[i] << " "; 
        cout << endl;
    }
}
// } Driver Code Ends