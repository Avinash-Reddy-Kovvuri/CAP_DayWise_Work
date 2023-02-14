class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int [][]ans=image;
        int iniColor=image[sr][sc];

        int delRow[]={-1,1,0,0};
        int delCol[]={0,0,1,-1};

        DFS(image,sr,sc,color,iniColor,ans,delRow,delCol);
        return ans;
    }

    public void DFS(int[][] image,int sr, int sc, int color,int iniColor,int [][]ans,
    int delRow[],int delCol[]){
        ans[sr][sc]=color;
        int n=image.length;
        int m=image[0].length;

        for(int i=0;i<4;i++){
            int nrow=sr+delRow[i];
            int ncol=sc+delCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==iniColor &&
            ans[nrow][ncol]!=color){
                DFS(image,nrow,ncol,color,iniColor,ans,delRow,delCol);
            }
        }

    }
}

OR 

class Solution {
    class Pair{
        int x,y;
        Pair(int x ,int y){this.x = x;this.y = y;}

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color) return image;

        Queue<Pair> queue = new LinkedList<>();
        int val = image[sr][sc];

        queue.add(new Pair(sr,sc));

        int[] xx = {0,0,1,-1};
        int[] yy = {1,-1,0,0};

        int ss = image[sr][sc];

        while(queue.size()!=0){

            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;
            image[x][y] = color;
            for(int i=0;i<4;i++){
                int nx = x+xx[i];
                int ny = y+yy[i];
                
                if(nx<0 || ny<0 || nx>image.length-1 || ny>image[0].length-1 || image[nx][ny] != ss)
                continue;
                queue.add(new Pair(nx,ny));


            }
        }
        return image;
        
    }
}
