

public class J102_Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves(); //we can't implement this to achieve the abstraction.
}

//inheriting the interface class using implement keyword
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(all direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down , right , left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal(by 1 step)");
    }
}