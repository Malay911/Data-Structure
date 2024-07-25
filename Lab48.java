import java.util.*;
import java.util.Stack;
public class Lab48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression to Evaluate : ");
        String str  = sc.nextLine();
        int result = Operations(str);
        System.out.println("Result : " + result);
        
    }
  
    public static int Operations(String str){
        Stack<Integer> stack = new Stack<>();
        int operator1 = 0, operator2 = 0;

        for (int i = str.length() - 1 ; i >= 0; i--) {
            int a = str.charAt(i);
            if (Character.isLetterOrDigit(a)) {
                stack.push(a - '0');
            }
            
            else if( a == '+' || a == '-' || a == '/' || a == '*' || a == '^') {
                operator2 = stack.pop();
                operator1 = stack.pop();
                switch(a){
                    case '+':
                        stack.push(operator2 + operator1);
                        break;
                    case '-':
                        stack.push(operator2 - operator1);
                        break;
                    case '*':
                        stack.push(operator2 * operator1);
                        break;
                    case '/':
                        stack.push(operator2 / operator1);
                        break;
                    case '^':
                        stack.push( (int)Math.pow(operator2, operator1));
                        break;
                    default:
                        System.out.println("Invalid operator");
                        break;
         
                }
            }
            else{
                // here we catch all the commas use in the  input String ...
            }
        }
        int ans = stack.pop();
        return ans;
    }
}