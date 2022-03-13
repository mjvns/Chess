public class Piece {
    Color color;
    Type piecetype;
    boolean isActive = true;

    Piece(Color color,Type type){
        this.color = color;
        this.piecetype = type;
    }

    void kill(Piece p){
        this.isActive = false;
    }
}