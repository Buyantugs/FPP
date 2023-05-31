public class Prog4 {
    public static void main(String[] args) {
        float x= 1.27F, y=3.881F, z=9.6F;

        // I don't know which one is correct because I'm unable to understand the question exactly then wrote two options below
        System.out.println((int)(x+y+z));
        System.out.println((int)x+(int)y+(int)z);

        System.out.println(Math.round(x)+Math.round(y)+Math.round(z));
        System.out.println(Math.round(x+y+z));
    }
}
