import java.util.*;
public class hwCalculator {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int operator= scn.nextInt();
        switch (operator) {
            case 1: System.out.println(a+b);
                
                break;
                case 2: System.out.println(a-b);
                break;
            case 3: System.out.println(a*b);
            break;
            case 4: if (b == 0){ 
                System.out.println("invalid division");
            } else {
                System.out.println(a/b);
            }
            break;
            case 5: if (b==0){
                System.out.println("invalid division");
            } else {
                System.out.println(a%b);
            }
            default:System.out.println("invalid operator");
                break;
        }
        scn.close();
    }
    
}
