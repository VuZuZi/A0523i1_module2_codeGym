package ss11_dsa_stack_queue.bai_tap_optional.thap_phan_to_nhi_phan;

import java.util.Map;
import java.util.Stack;

public class ConvertNumber {
    public Stack<Integer> stack;// = new Stack<>();
    public int decimal;
    public int binary;
    public String octal;


    public ConvertNumber() {
        stack = new Stack<>();
    }
    public void deToStack(int index){
        this.decimal = index;
        int du;
        while (index != 0){
            du = index%2;
            stack.push(du);
            index = index/2;
        }
    }
    public int[] stackToBi(){
        int length = stack.size();
        int[] bi = new int[length];
        for (int i = 0; i < length; i++) {
            bi[i] = stack.pop();
        }
        return bi;
    }
    public void printBi(int[] bi){
        System.out.print("Decimal: "+decimal+" = Binary: ");
        for (int i = 0; i < bi.length; i++) {
            System.out.print(bi[i]);
        }
    }
    public void decimalToBinary(int index){
        stack = new Stack<>();
        deToStack(index);
        printBi(stackToBi());
        System.out.println();
    }

    public void binaryToDecimal(int index){
        this.binary = index;
        stack = new Stack<>();
        while (index!=0){
            stack.push(index%10);
            index = index / 10;
        }
        decimal = 0;
        int temp = stack.size();
        for (int i = 0; i < temp; i++) {
            if (stack.pop()==0){
                continue;
            }
            decimal = (int) (decimal+Math.pow(2,i));
        }
        System.out.println("Binary: "+binary+" = Decimal: "+decimal);
    }
    public void decimalToHex(int dec){
        Stack<String> stack = new Stack<>();
        int thuongSo = dec;
        int soDu = -1;
        while (soDu != 0){
            soDu = thuongSo % 16;
            switch (soDu){
                case 10:
                    stack.push("A");
                    break;
                case 11:
                    stack.push("B");
                    break;
                case 12:
                    stack.push("C");
                    break;
                case 13:
                    stack.push("D");
                    break;
                case 14:
                    stack.push("E");
                    break;
                case 15:
                    stack.push("F");
                    break;
                default:
                    stack.push(String.valueOf(soDu));
            }
            thuongSo = thuongSo / 16;
        }
        System.out.print("Dec: "+dec+" = Hex: ");
        int size = stack.size();
        stack.pop();
        for (int i = 0; i < size-1; i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
    public void hexToDec(String hex){
        int size = hex.length();
        hex = hex.toUpperCase();
        int dec = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(hex.charAt(i));
//            System.out.println(i +" "+hex.charAt(i));
        }
        for (int i = 0; i < size; i++) {
            char temp = stack.pop();
            switch (temp){
                case 'A':
                    dec = dec + 10*(int) Math.pow(16,i);
                    break;
                case 'B':
                    dec = dec + 11*(int) Math.pow(16,i);
                    break;
                case 'C':
                    dec = dec + 12*(int) Math.pow(16,i);
                    break;
                case 'D':
                    dec = dec + 13*(int) Math.pow(16,i);
                    break;
                case 'E':
                    dec = dec + 14*(int) Math.pow(16,i);
                    break;
                case 'F':
                    dec = dec + 15*(int) Math.pow(16,i);
                    break;
                default:
                    dec = dec + (int)(temp - '0')*(int) Math.pow(16,i);
            }
        }
        System.out.println("Hex: "+hex+" = Dec: "+dec);

            }




}
