class Solution(object):
    def isValidSudoku(self, board):
        
        row_sets = [set() for _ in range(9)]
        col_sets = [set() for _ in range(9)]
        subgrid_sets = [set() for _ in range(9)]

        for i in range(9):
            for j in range(9):

                val = board[i][j]

                if val == ".":
                    continue

                subgrid_index = (i // 3) * 3 + (j // 3)

                if (val in row_sets[i] or 
                    val in col_sets[j] or 
                    val in subgrid_sets[subgrid_index]):
                    return False

                row_sets[i].add(val)
                col_sets[j].add(val)
                subgrid_sets[subgrid_index].add(val)

        return True