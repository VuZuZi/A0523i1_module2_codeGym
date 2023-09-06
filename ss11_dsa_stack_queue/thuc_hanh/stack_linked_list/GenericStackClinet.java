package ss11_dsa_stack_queue.thuc_hanh.stack_linked_list;

public class GenericStackClinet {
    private static void stackOfStrings(){
        MyGeneticStack<String> stack = new MyGeneticStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        System.out.println("size "+stack.size());
    }
    private static void stackOfIntegers() {
        MyGeneticStack<Integer> stack = new MyGeneticStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
    public static void main(String[] args) {
//        System.out.println("1. Stack of integers");
//        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
