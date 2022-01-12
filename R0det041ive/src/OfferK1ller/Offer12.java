package OfferK1ller;

public class Offer12 {
    /**
     * @program: R0det041ive
     * @description: 矩阵中的路径
     * @author: Log1c
     * @create: 2022-01-04 20:25
     **/

    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if(existNext(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    private static boolean existNext(char[][] board, char[] word, int x, int y, int k){
        if(x>=board.length || x<0 || y>board[0].length || y<0 || board[x][y]!=word[k]) return false;
        if(k==word.length-1) return true;
        board[x][y] = '\0';// 剪枝
        boolean res = existNext(board, word, x+1, y, k+1) || existNext(board, word, x, y+1, k+1) || existNext(board, word, x, y-1, k+1) || existNext(board, word, x-1, y, k+1);
        board[x][y] = word[k];// 复原
        return res;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));

    }
}
