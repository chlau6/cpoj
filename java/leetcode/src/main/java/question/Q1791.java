package question;

import annotation.Graph;

@Graph
public class Q1791 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}

/*
1791. Find Center of Star Graph
 */
