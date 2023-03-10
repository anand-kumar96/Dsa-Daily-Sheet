---
description: //https://leetcode.com/problems/two-sum/
---

# two sum


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[] = new int[n+1];
        for(int a=0; a*a<=n; a++){
            for(int b=0; a*a+b*b <= n; b++){
                for(int c=0;a*a+b*b+c*c<=n;c++){
                  int sum=a*a+b*b+c*c;
                if(sum<=n){
                    res[sum]++;
                }
            }
        }
        }
        for(int i=1; i<=n; i++){
            System.out.println(res[i]);
        }
    }
}

