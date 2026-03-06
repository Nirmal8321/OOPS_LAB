public class QueueUnderflowException extends Exception {
    public QueueUnderflowException() {
        super("Queue underflow: Cannot delete, queue is empty.");
    }
}
