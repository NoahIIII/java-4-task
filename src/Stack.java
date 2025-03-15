class Stack {
    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}