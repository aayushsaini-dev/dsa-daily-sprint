public class interfaces {
    public static void main(String args[]) {
        queen q = new queen();
        q.moves();
        beer b = new beer();
        b.eat();
    }
}

interface chessplayer {
    void moves();
}

class queen implements chessplayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal .... 1 step");
    }
}
// multipal level inheritance

interface herbivore {
    void eat();
}

interface carnivore {
    void eat();
}

class beer implements herbivore, carnivore {
    public void eat() {
        System.out.println("eat both grass , flesh");
    }
}
