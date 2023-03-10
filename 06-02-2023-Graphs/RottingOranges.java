class Solution {
    class Sample{

        int x,y;
        public Sample(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public int orangesRotting(int[][] grid) {

        int fresh=0;
        Queue<Sample> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){

                if(grid[i][j]==2){
                    queue.add(new Sample(i,j));
                }
                else if(grid[i][j]==1) fresh+=1;
            }
        }
        if(fresh==0) return 0;
        // System.out.println("fresh "+fresh);
        int [] xx = {0,0,-1,1};
        int [] yy = {1,-1,0,0};
        int timer=0,sizc=0,bsiz=queue.size();
        while(!queue.isEmpty()){
            int siz = queue.size();
            // System.out.println("size "+siz);
            sizc+=siz;
            for(int i=0;i<siz;i++){
                Sample rot = queue.poll();
                int x = rot.x;
                int y = rot.y;
                for(int k=0;k<4;k++){
                    int nx = x+xx[k];
                    int ny = y+yy[k];

                    if(nx<0 || ny<0|| nx>=grid.length || ny>=grid[0].length || grid[nx][ny]==0 || grid[nx][ny]==2) continue;

                    grid[nx][ny] = 2;
                    queue.add(new Sample(nx,ny));

                }


            }
            if(queue.size()!=0)
            timer+=1;
        }

        if((sizc-bsiz)==fresh) return timer;
        return -1;
        
    }
}
