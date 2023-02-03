package chap04;

public class IntDeque {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    public IntDeque(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enqueFront(int x) throws IntDeque.OverflowIntQueueException {
        if (num >= capacity)
            throw new IntDeque.OverflowIntQueueException();
        num++;
        if (--front < 0)
            front = capacity - 1;
        que[front] = x;
        return x;
    }

    public int enqueRear(int x) throws IntDeque.OverflowIntQueueException {
        if (num >= capacity)
            throw new IntDeque.OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear = 0;
        return x;
    }

    public int dequeFront() throws IntDeque.EmptyIntQueueException {
        if (num <= 0)
            throw new IntDeque.EmptyIntQueueException();
        int x = que[front++];
        num--;
        if(front == capacity)
            front = 0;
        return x;
    }

    public int dequeRear() throws IntDeque.EmptyIntQueueException {
        if (num <= 0)
            throw new IntDeque.EmptyIntQueueException();
        int x = que[rear++];
        num--;
        if (--rear < 0)
            rear = capacity - 1;
        return que[rear];
    }

    public int peekFront() throws IntDeque.EmptyIntQueueException {
        if (num <= 0)
            throw new IntDeque.EmptyIntQueueException();
        return que[front];
    }

    public int peekRear() throws IntDeque.EmptyIntQueueException {
        if (num <= 0)
            throw new IntDeque.EmptyIntQueueException();
        return que[rear];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for(int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if(que[idx] == x)
                return idx;
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비었습니다.");
        else {
            for(int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }

    public int search(int x) {
        for(int i = 0; i < num; i++) {
            if(que[(i + front) % capacity] == x)
                return i + 1;
        }
        return 0;
    }
}
