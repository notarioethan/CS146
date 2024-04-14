import java.util.*;
public class Lab6Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) return true;
        
        @SuppressWarnings("unchecked")//the squiggles annoy me

        List<Integer>[] edges = new List[numCourses];//edgelist for all courses (holds every course that a course is a prereq for)
        int[] indegrees = new int[numCourses];//holds # of indegrees(prereqs) for each course
        List<Integer> satisfied = new ArrayList<Integer>();//list of satisfied courses
        
        for (int[] pair : prerequisites){
            int course = pair[0];
            int prereq = pair[1];
            if (edges[prereq] == null) edges[prereq] = new ArrayList<Integer>();
            edges[prereq].add(course);
            indegrees[course]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++){
            if (indegrees[i] == 0) queue.offer(i);
        }
        
        while (!queue.isEmpty()){
            int curr = queue.poll();
            satisfied.add(curr);
            if (edges[curr] != null){
                for (int next : edges[curr]){
                    indegrees[next]--;
                    if (indegrees[next] == 0) queue.offer(next);
                }
            }
        }
        return satisfied.size() == numCourses;
    }
    public static void main(String[] args) throws Exception {
        //test case 1
        Lab6Solution solution = new Lab6Solution();
        int[][] test1 = {{1,0}};
        System.out.println(solution.canFinish(2, test1));
        //test case 2
        int[][] test2 = {{1,0},{0,1}};
        System.out.println(solution.canFinish(2, test2));
        

    }
}
