import java.lang.reflect.Array;
import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {
        //Write a program called RemoveDups

        String[] arrayDup={"horse", "dog", "cat", "horse", "dog"};
        String stringNoDup="";

        for(String str:arrayDup){
            if(!stringNoDup.contains(str))
                stringNoDup=stringNoDup+str+",";
        }

        String[] arrayNoDup=stringNoDup.split(",");
        System.out.println(Arrays.toString(arrayNoDup));
    }
}
