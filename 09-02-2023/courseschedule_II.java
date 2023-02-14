class Solution {
  public int[] findOrder(int numCourses, int[][] prerequisites) {

    boolean isPossible = true;
    Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
    int[] indegree = new int[numCourses];
    int[] topologicalOrder = new int[numCourses];

    for (int i = 0; i < prerequisites.length; i++) {
      int dest = prerequisites[i][0];
      int src = prerequisites[i][1];
      List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
      lst.add(dest);
      adjList.put(src, lst);

     
      indegree[dest] += 1;
    }
    Queue<Integer> q = new LinkedList<Integer>();
    for (int i = 0; i < numCourses; i++) {
      if (indegree[i] == 0) {
        q.add(i);
      }
    }

    int i = 0;
    while (!q.isEmpty()) {
      int node = q.remove();
      topologicalOrder[i++] = node;
      if (adjList.containsKey(node)) {
        for (Integer neighbor : adjList.get(node)) {
          indegree[neighbor]--;
          if (indegree[neighbor] == 0) {
            q.add(neighbor);
          }
        }
      }
    }

  
    if (i == numCourses) {
      return topologicalOrder;
    }

    return new int[0];
  }
}

OR 


class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> adj = new HashMap<>(numCourses);

        int[] indeg = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.put(i,new ArrayList<Integer>());
        }
        for(int j=0;j<prerequisites.length;j++){

            int a = prerequisites[j][0];
            int b = prerequisites[j][1];
            List<Integer> li = adj.get(b);
            li.add(a);
            adj.put(b,li);
            // System.out.println("Indeg "+a);
            indeg[a]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                queue.add(i);
            }
        }
        int[] result = new int[numCourses];
        int h=0;
        // System.out.println(queue.size());
        while(queue.size()!=0){
            int item = queue.poll();
            result[h++] = item;
            if(adj.containsKey(item))
            for(int nei : adj.get(item)){
                indeg[nei]--;
                if(indeg[nei]==0) queue.add(nei);
            }
        }
        
        if(h==numCourses) return result;
        return new int[0];
       
    }
}
