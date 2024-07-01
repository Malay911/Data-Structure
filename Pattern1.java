// Perform pattern
// 1
// a b
// 2 3 4
// c d e
// 5 6 7 8
public class Pattern1 {
    public static void main(String[] args) {
        int i;
        int j;
        int a=1;
        char b=65;
        for(i=0;i<6;i++){
            for(j=0;j<i;j++){
                if(i%2==0){
                    System.out.print(b);
                    b++;
                }
                else{
                    System.out.print(a);
                    a++;
                }
            }
            System.out.println();
        }
    }
}