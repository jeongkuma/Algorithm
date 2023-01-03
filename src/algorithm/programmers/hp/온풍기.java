package algorithm.programmers.hp;

public class 온풍기 {



    /**
    *
     * 전체 크기는 N * N
     * N = 주어진 office의 수
     * 온풍기는 k * k
     *
     * 0,0 > 0,1 > 1,0 > 1,1
     * 1,1 > 1,2 > 2,1 > 2,2
     * 2,2 > 2,3 > 3,2 > 3,3
     *
     *
     *
     */

    static int m, n;

    static int[][] ch;

//    static int[][] dirs = {{0,1}, {0,-1}, {1, 0}, {-1, 0}};


    public static void main(String[] args) {
        // case1
        practice(new int[][]{{1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0}}, 2);

//        practice(new int[][]{{1,0,0},{0,0,1},{1,0,0}}, 2);

    }

    public static int practice(int[][] office, int k) {
        int answer = -1;

        m = office.length;
        n = office[0].length;
        ch = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (office[i][j] == 1) {
                    dfs(i, j, office);
                    answer++;
                }

            }
        }


        System.out.println(answer);
        return answer;
    }

    public static void dfs(int i, int j, int[][] grid){
        // i, j < 0 : 범위 초과
        // i, j == m,n : 범위 초과
        // grid[i][j] == 0 : 없음
        // ch[i][j] == 1 : 있음
        if(i < 0 || j < 0 || i == m || j == n) return;
        ch[i][j] = 1;

        dfs(i+1, j+1, grid);

//        for(int[] dir : dirs){
//            dfs(i + dir[0] , j + dir[1], grid);
//        }
    }


    public static int solution(int[][] office, int k) {
        int answer = -1;

        return answer;
    }
}
