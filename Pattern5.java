//3 3 3 3 3
//3 2 2 2 3
//3 2 1 2 3
//3 2 2 2 3
//3 3 3 3 3

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("3 ");
                }
                else if(i==3 && j==3){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }
    }
}
