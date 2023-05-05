//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class nQueens {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solveNQueens(4)));
//    }
//    public static void helper(char[][] board,int row,List<List<String>> ans){
//            // TRUE means Queen is places
//            // Base condition
//            if(row == board.length){
//                List<String> temp = new ArrayList<>();
//                for (int i = 0; i < board.length; i++) {
//                    for (int j = 0; j < board.length; j++) {
//                        temp.add(String.valueOf(board[i][j]));
//                    }
//                }
//                ans.add(new ArrayList(temp));
//                return;
//            }
//            //placing the queen and checking for every row and col
//            for(int col = 0; col < board.length;col++){
//                //place the queen if it is safe
//                if(isSafe(board,row,col)){
//                    board[row][col] = 'Q';
//                    helper(board,row + 1,ans);
//                    board[row][col] = '.';
//                }
//            }
//        }
//        public static boolean isSafe(char[][] board,int row,int col){
//            // to check vertical
//            for(int i = 0;i < row ; i++){
//                if(board[i][col] == 'Q'){
//                    return false;
//                }
//            }
//            // left diagonal
//            int maxLeft = Math.min(row,col);
//            for(int i = 1; i <= maxLeft;i++){
//                if(board[row - i][col - i] == 'Q'){
//                    return false;
//                }
//            }
//            // right diagonal
//            int maxRight = Math.min(row,board.length - col - 1);
//            for(int i = 1; i <= maxRight;i++){
//                if(board[row - i][col + i] == 'Q'){
//                    return false;
//                }
//            }
//            return true;
//        }
//        public static List<List<String>> solveNQueens(int n) {
//            List<List<String>> ans = new ArrayList<>();
//
//            char[][] board = new char[n][n];
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    board[i][j] = '.';
//                }
//            }
//            helper(board,0,ans);
//            return ans;
//
//        }
//}
//
