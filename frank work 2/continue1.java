public class continue1{
public static void main(String[]args){
int i = 1;
do {
    if (i == 3) {
        i++;
        continue; // skip the iteration where i equals 3
    }
    System.out.println(i);
    i++;
} while (i <= 5);
   }}