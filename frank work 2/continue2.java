public class continue2{
public static void main(String[]args){
outerLoop:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            continue outerLoop; // skip the iteration where i equals 2 and j equals 2
        }
        System.out.println(i + " " + j);
    }
}}}