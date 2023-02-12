class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> li = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            li.add(new ArrayList<Integer>());
        }

        for(int j=0;j<prerequisites.length;j++){
            int a = prerequisites[j][0];
            int b = prerequisites[j][1];
            li.get(b).add(a);
        }

        int [] indeg = new int[li.size()];

        for(int i=0;i<li.size();i++){
            for(int va : li.get(i)){
                indeg[va]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0) queue.add(i);
        }
        int c=0;
        while(queue.size()!=0){
            int val = queue.poll();
            for(int kk : li.get(val)){
                indeg[kk]--;
                if(indeg[kk]==0){queue.add(kk);}
            }
            c+=1;
        }

        if(c==numCourses) return true;
        return false;

        
    }
}
