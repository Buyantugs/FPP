public class Prog1 {
    public static void main(String[] args) {
        //1. get a random number x in the range 1 .. 9 and compute π*x

        int x=RandomNumbers.getRandomInt(1,9);
        System.out.println(Math.pow(Math.PI,x));

        int y=RandomNumbers.getRandomInt(3,14);
        System.out.println(Math.pow(y,Math.PI));
    }
}