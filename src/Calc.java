import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws NumberFormatException{
        Scanner s = new Scanner(System.in);
        System.out.println("Input");
        String input = s.nextLine();
        try
        {System.out.println(calc(input));}
        catch (RuntimeException e){
            System.out.println(e);
        }
    }
    public static String calc(String input)throws RuntimeException {
        String str2 = input.replaceAll("[^0-9]+", " ");
        String[] operands = str2.split(" ");
        String str3 = input.replaceAll("[0-9]+", "");
        char[] action = str3.toCharArray();
        if (operands.length>2)
        {throw new ArrayIndexOutOfBoundsException("Throw5 Exception");}
        if (operands.length<1)
        {throw new ArrayIndexOutOfBoundsException("Throw4 Exception");}
        Integer operand1 = Integer.parseInt(operands[0]);
        Integer operand2 = Integer.parseInt(operands[1]);
        Integer result = 0;
        if (operand1 <= 10 && operand2 <= 10 && operand1 > 0 && operand2 >0) {
            switch (action[0]) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
                default:
                    throw new  RuntimeException("Throw3 Exception");
            }
        } else throw new RuntimeException("Throw2 Exception");
        String res = String.valueOf(result);
        return res;
    }}