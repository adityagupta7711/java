// public class patterns {
//     public static void main(String[] args) {
//         int n=4;
//         int m=5;
//         //outer loop -- for rows
//         for (int i=1; i<=n; i++){
//             //inner loop -- for column
//             for (int j=1; j<=m; j++){
//                 //cell -> (i,j)
//                 if (i==1 || j==1 || i== n|| j==m) {
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }
//         float adj= 5.444f ;
//         float b= 4.444f;
//         System.out.println(adj * b);
        
//     }
// }

public class patterns {

    public static void main(String[] args) {
        //outer
        int n=4;
        for (int i=1; i<=n;i++){
            //inner 
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}