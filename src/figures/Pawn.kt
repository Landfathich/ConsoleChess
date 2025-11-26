package figures

import utils.BoardConstants.BLACK
import utils.BoardConstants.WHITE
import utils.FigureConstants

class Pawn(color: String?, letter: String? = null, number: Int? = null) :
    Cell(color = color, letter = letter, number = number),
    Figure {
    init {
        if (color == WHITE) {
            shownChar = FigureConstants.WHITE_PAWN
        } else if (color == BLACK) {
            shownChar = FigureConstants.BLACK_PAWN
        }
    }

    override fun isCanMove(cellTo: Cell): Boolean {
        // Pawn can move one cell forward or two cells forward if it's first move

        // check if it is first move for this pawn
        if (color == WHITE && number == 2) {
            println("first turn for this white pawn")
        }
        if (color == BLACK && number == 7) {
            println("first turn for this black pawn")
        }
        return true
    }
}