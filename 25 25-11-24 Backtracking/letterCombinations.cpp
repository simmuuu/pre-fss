/*
Given a classic mobile phone, and the key pad of the phone looks like below.
	1		2		3
           abc	   def
		 
	4		5		6
    ghi    jkl     mno
  
	7		8		9
    pqrs    tuv     wxyz
	
	*		0		#


You are given a string S contains digits between [2-9] only, 
For example: S = "2", then the possible words are "a", "b", "c".

Now your task is to find all possible words that the string S could represent.
and print them in a lexicographical order. 

Input Format:
-------------
A string S, consist of digits [2-9]

Output Format:
--------------
Print the list of words in lexicographical order.


Sample Input-1:
---------------
2

Sample Output-1:
----------------
[a, b, c]


Sample Input-2:
---------------
24

Sample Output-2:
----------------
[ag, ah, ai, bg, bh, bi, cg, ch, ci]
*/

#include <iostream> 
#include <unordered_map>
#include <string>
#include <vector>  
using namespace std;

class LetterCombinations {
private:

    void backtrack(string digits,int idx,vector<string> &ans,string &temp,unordered_map<int,string> mp){
        if(idx >= digits.size()){
            ans.push_back(temp);
            return;
        }

        for(char ch : mp[digits[idx] - '0']){
            temp += ch;
            backtrack(digits,idx+1,ans,temp,mp);
            temp.pop_back();
        }

        return;

    }

public:
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        if(digits == "") return ans;
        unordered_map<int, string> mp {{2, "abc"}, {3, "def"}, {4, "ghi"}, 
                                {5, "jkl"}, {6, "mno"}, {7, "pqrs"}, 
                                {8, "tuv"}, {9, "wxyz"}};

        string temp;
        backtrack(digits,0,ans,temp,mp);

        return ans;
    }
};

int main(){
    string digits;
    cin >> digits;
    LetterCombinations sol;
    vector<string> ans = sol.letterCombinations(digits);
    for(string s : ans){
        cout << s << " ";
    }
}