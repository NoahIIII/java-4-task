class Queue {
    private Node front, rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) rear = null;
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}