# Lab 3
## Problem 1:
Let's compare some basic math functions to refresh our memory. For each of the following, just write which function is asymptotically greater (So, you should be thinking about your asymptotic notations!). Show your reasoning for the same.

1. 10000000000n^2 vs n^3
2. n^2 log(n) vs n(log(n))^10
3. n^logn vs 2^sqrt(n)
4. 2^n vs 2^2n
### Answer:
1. For asymptotic notation, 10000000000n^2 would be reduced to n^2, and n^3 > n^2, so n^3 is asymptoically greater.
2. By cancelling out some terms, we can get n vs (log(n))^9, and n is greater, so n^2 log(n) is asymptotically greater.
3. n^logn is comparable to n^n, while 2^sqrt(n) is comparable to 2^n, and n^n > 2^n, so n^logn is asymptotically greater.
4. 2^2n is always greater than 2^n, and it cannot equal c * 2^n where c is a constant, as 2^2n = 2^n * 2^n. As such, 2^2n is asymptotically greater.

## Problem 2:
Now let's examine some [pseudo]code and apply asymptotic notation to it. 

isPrime(n): 
  for(i = 2, i*i <= n; i++) {
    if(n % i == 0) {
      return false
    }
  return true

What is the 

Best Case
Worst Case
Average Case
Time complexity for the above function? 
### Answer:
i is the number of times the loop runs, n is the number of elements
i*i = i^2 = n
i = sqrt(n)
as long as n > 1, the loop runs; if n <= 1, it does not

Best Case: O(1)
Average Case: O(sqrt(n))
Worst Case: O(sqrt(n))