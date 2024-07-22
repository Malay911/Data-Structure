//Evaluation of Postfix using Stack
import java .util.*;

public class Lab47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an expression:");
        String s=sc.nextLine();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(Character.isDigit(temp)){
                st.push(Integer.parseInt(String.valueOf(temp)));
            }
            else{
                int operand2=st.pop();
                int operand1=st.pop();
                int result=0;
                switch(temp){
                    case '+':
                    result=operand1+operand2;
                    break;

                    case '-':
                    result=operand1-operand2;
                    break;

                    case '*':
                    result=operand1*operand2;
                    break;

                    case '/':
                    result=operand1/operand2;
                    break;

                    case '^':
                    result=(int) Math.pow(operand1,operand2);
                    break;

                    default:
                    System.out.println("Invalid expression!");
                    return;
                }
                st.push(result);
            }
        }
        int ans=st.pop();
        System.out.println("Result: "+ans);
    }
}
