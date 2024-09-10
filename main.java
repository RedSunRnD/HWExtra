public class Main
{
    public static void main(String[] args) {
        //Xtra#6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = 0;
        result = a * (b + (c - d * e));
        result = 0 - result;
        System.out.println(result);
        System.out.println();
        //Xtra#7
        int f = 5;
        int g = 7;
        f ^= g;
        g ^= f;
        f ^= g;
        System.out.print(f + ", ");
        System.out.println(g);
        System.out.println();
        //Xtra#8
        int x = 341;
        int y = x % 100;
        y = (y - (y % 10)) / 10;
        System.out.println(y);
    }
}
