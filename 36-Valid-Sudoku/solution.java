public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //validate row
        if(board.length!=9 || board[0].length!=9) return false;
        for(int row=0; row<9; row++){
            HashSet<Character> hashSet = new HashSet<>();
            for(int col=0; col<9; col++){
                if(board[row][col]!='.')
                    if(!hashSet.add(board[row][col]))
                        return false;
            }
        }
        
        for(int col=0; col<9; col++){
            HashSet<Character> hashSet = new HashSet<>();
            for(int row=0; row<9; row++){
                if(board[row][col]!='.')
                    if(!hashSet.add(board[row][col]))
                        return false;
            }
        }
        
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               HashSet<Character> hashSet = new HashSet<>();
               for(int row=0; row<3; row++){
                   for(int col=0; col<3; col++){
                       if(board[i*3+row][j*3+col]!='.')
                            if(!hashSet.add(board[i*3+row][j*3+col]))
                                return false;
                   }
               }
           }
       }
       
       return true;
    }
}

