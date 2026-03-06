// LAB_5 Q1 - Interface for queue operations
public interface QueueImpl {
    void insert(int value) throws QueueOverflowException;
    int delete() throws QueueUnderflowException;
    void display();
}
