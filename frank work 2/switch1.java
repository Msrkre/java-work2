public class switch1{
public static void main(String[]args){
int month = 2;
String monthName;

switch (month) {
    case 1:
        monthName = "January";
    case 2:
        monthName = "February";
    case 3:
        monthName = "March";
    default:
        monthName = "Unknown";
}

System.out.println("Month is: " + monthName);
}}