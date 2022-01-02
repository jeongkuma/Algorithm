package algorithm.programmers.namu;

/**
 *  m x n binary grid가 주어집니다.
 *  각 cell의 값 중에 ‘1’은 땅이고 ‘0’은 물입니다.
 *  섬은 물에 의해 둘러싸입니다.
 *  섬은 수직 또는 수평으로 인접하는 땅(1)을연결함으로써 형성됩니다.
 *  섬은 grid의 네 모서리가 모두 물로 둘러싸여 있다고 가정 할 수 있습니다.
 * 섬의 개수를 리턴하세요
 */
public class 섬의수 {

    static int[][] dirs = {{0,1}, {0,-1}, {1, 0}, {-1, 0}};
    static int m,n;
    static int[][] ch;
    public static void main(String[] args) {
        int[][] grid =  {
                {1,1,1,1,0},
                {1,1,1,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}
        };

        int[][] grid2 = {
                {1, 1, 0 ,0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1}
        };

        System.out.println(solution(grid2));

    }

    public static int  solution(int[][] grid) {
        int answer = 0;
        m = grid.length;
        n = grid[0].length;
        ch = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // 독립된 섬이 2개일 경우 , 첫번째 섬을 찾고 이격된 섬을 다시 찾기 위해
                if(grid[i][j] == 1 && ch[i][j] == 0){
                    dfs(i, j, grid);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void dfs(int i, int j, int[][] grid){
        // i, j < 0 : 범위 초과
        // i, j == m,n : 범위 초과
        // grid[i][j] == 0 : 물
        // ch[i][j] == 1 : 방문
        if(i < 0 || j < 0 || i == m || j == n || grid[i][j] == 0 || ch[i][j] == 1) return;
        ch[i][j] = 1;
        for(int[] dir : dirs){
            dfs(i + dir[0] , j + dir[1], grid);
        }
    }
}
