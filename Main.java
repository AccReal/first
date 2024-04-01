public class Main {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Вершина стека: " + stack.peek());

        System.out.println("Удален элемент из стека: " + stack.pop());
        System.out.println("Вершина стека после удаления: " + stack.peek());
    }
}
