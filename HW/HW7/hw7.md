# HW 7

## Problem statement:
Here's another algorithmic problem to solve:

You are the sysadmin for a big tech company, and you have to estimate the amount of servers you need to handle some long-running jobs.

One server can handle only one job at once. One job can only be executed by one server at once.

Once a server has finished executing its current job, it can be reassigned to a new job.

Given an array of time intervals intervals where intervals[i] = [starti, endi], representing the start and end time for a particular job that needs to be executed, return the minimum number of servers required to run all jobs.
### Constraints:
- 1 <= intervals.length <= 10^4
- 0 <= starti < endi <= 10^6
## Approach:
- create 2 arrays to hold every start and end time, sort them in non-decreasing order
- traverse through all start and end times
    - increment the number of active meetings if the start time is less than the end time
    - decrement the number of active meetings if the start time is greater than the end time
    - hold the maximum number of active meetings with another variable
- return the maximum number of active meetings