package MarwaJaida.Td3;

class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Point1 extends Point {
    public Point1(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Les coordonnées du point : " + getX() + ", " + getY());
    }


public static void main(String[] args) {
        Point1 p = new Point1(2, 1);
        p.affiche();
        p.deplace(1, 4);
        p.affiche();
    }
}

