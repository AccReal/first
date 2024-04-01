public class IntegerStack {
    // Поля класса
    private final int maxSize; // максимальный размер стека
    private final int[] stackArray; // массив для хранения элементов стека
    private int top; // индекс вершины стека

    // Конструктор класса
    public IntegerStack(int size) {
        this.maxSize = size; // установка максимального размера стека
        this.stackArray = new int[maxSize]; // создание массива для хранения элементов
        this.top = -1; // инициализация вершины стека как -1 (так как стек пуст)
    }

    // Метод для добавления элемента в стек
    public void push(int element) {
        // Проверка, не заполнен ли стек полностью
        if (isFull()) {
            System.out.println("Стек полон. Невозможно добавить элемент " + element);
            return;
        }
        stackArray[++top] = element; // добавление элемента в стек и увеличение вершины
    }

    // Метод для удаления элемента из стека
    public int pop() {
        // Проверка, не пуст ли стек
        if (isEmpty()) {
            System.out.println("Стек пуст.");
            return -1;
        }
        return stackArray[top--]; // удаление элемента из стека и уменьшение вершины
    }

    // Метод для получения вершины стека без удаления
    public int peek() {
        // Проверка, не пуст ли стек
        if (isEmpty()) {
            System.out.println("Стек пуст.");
            return -1;
        }
        return stackArray[top]; // возврат вершины стека
    }

    // Метод для проверки, пустой ли стек
    public boolean isEmpty() {
        return (top == -1); // возвращает true, если вершина стека равна -1 (стек пуст)
    }

    // Метод для проверки, заполнен ли стек полностью
    public boolean isFull() {
        return (top == maxSize - 1); // возвращает true, если вершина стека равна максимальному размеру - 1 (стек заполнен)
    }
}
