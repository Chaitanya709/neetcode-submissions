class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                String key = (r / 3) + "," + (c / 3);

                Set<Character> rowSet = rows.computeIfAbsent(r, k -> new HashSet<>());
                Set<Character> colSet = cols.computeIfAbsent(c, k -> new HashSet<>());
                Set<Character> squareSet = squares.computeIfAbsent(key, k -> new HashSet<>());

                if (rowSet.contains(board[r][c]) || colSet.contains(board[r][c])
                    || squareSet.contains(board[r][c])) {
                    return false;
                }

                rowSet.add(board[r][c]);
                colSet.add(board[r][c]);
                squareSet.add(board[r][c]);
            }
        }
        return true;
    }
}