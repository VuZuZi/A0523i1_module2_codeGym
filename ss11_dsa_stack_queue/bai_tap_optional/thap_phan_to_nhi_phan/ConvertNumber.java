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

}
