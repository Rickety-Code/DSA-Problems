public boolean isValidSudoku(char[][] board) {
    int n = board.length;
    for(int i=0;i<n;i++) {
        if(!(checkValidRow(board, i) && checkValidCol(board, i) && checkValidSubGrid(board, i))){
            return false;
        }
    }
    return true;
}

private boolean checkValidRow(char[][] board, int i) {
    return !hasRepeatingCharacters(board, i, 0, i, 8);
}

private boolean checkValidCol(char[][] board, int i) {
    return !hasRepeatingCharacters(board, 0, i, 8, i);
}

private boolean checkValidSubGrid(char[][] board, int i) {
    return !hasRepeatingCharacters(board, (i*3)%9, (i/3)*3, (i*3)%9 + 2, (i/3)*3 + 2);
}

private boolean hasRepeatingCharacters(char[][] board, int start_i, int start_j, int end_i, int end_j) {
    boolean[] hasOccured = new boolean[10];
    for(int i = start_i; i<=end_i; i++) {
        for(int j = start_j; j<=end_j; j++) {
            int idx = (board[i][j] == '.') ? 0 : Character.getNumericValue(board[i][j]);
            if(idx>0 && hasOccured[idx]) {
                return true;
            }
            hasOccured[idx] = true;
        }
    }
    return false;
}
