
public class Stars {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printOneLineStars(int n){
        if(n == 1) {
            System.out.print("*");
        }
        else{
            printOneLineStars(n - 1);
            System.out.print("*");
        }
    }
    static void printTriangle(int n){
        if(n == 1){
            System.out.println("*");
        }else if(n > 1){
            printTriangle(n - 1);
            printOneLineStars(n);
            System.out.println();
        }
    }
}
