class Solution {
    class Sample{
        int x,y;
        public Sample(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int c=0;
        int[][] vis= new int[row][col];
        
            for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    c+=1;
                    bst(grid,i,j,vis);
                }
            }
            }
            return c;     
    }
        public void bst(char[][] grid,int x,int y,int[][] vis){
         
        int [] xx = {0,0,1,-1};
        int [] yy = {1,-1,0,0};
        vis[x][y]=1;
        grid[x][y]='2';
                    for(int k=0;k<4;k++){
                        int nx = x+xx[k];
                        int ny = y+yy[k];
                        if(nx<0 || ny<0 || nx>grid.length-1 || ny>grid[0].length-1 || vis[nx][ny]==1 || grid[nx][ny]!='1') continue;
                            
                            bst(grid,nx,ny,vis);
                            
                        
                    }
                }
            
}
