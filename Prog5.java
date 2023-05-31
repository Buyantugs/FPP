import java.util.Arrays;
public class Prog5 {
    public static void main(String[] args) {

        int[] array1={5,6,-4,3,1};
        int[] array2={3,8,9,11};
        System.out.println(Arrays.toString(combine(array1, array2)));
    }
    public static int[] combine(int[] a, int[] b){

        int a1=a.length;
        int a2=b.length;
        int[] newArray=new int[a1+a2];

        System.arraycopy(a, 0,newArray,0,a1);
        System.arraycopy(b, 0,newArray,a1,a2);

        return newArray;
    }
}
