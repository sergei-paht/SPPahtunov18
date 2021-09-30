package sample;

class Variables {
    int x1;
    int x2;

    Variables(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public int multiply(int x, int y) {
        if (y == 0)
            return 0;
        //Добавить х по одному

        if (y > 0)
            return (x + multiply(x, y - 1));

        // случай, когда у отрицателен
        if (y < 0)

            return -multiply(x, -y);

        return -1;
    }
}

