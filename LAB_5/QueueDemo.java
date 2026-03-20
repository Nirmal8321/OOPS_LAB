// LAB_5 Q1 - Queue implementation (bus stand: insert at back, delete from front)
public class QueueDemo implements QueueImpl {
    private static final int MAX_SIZE = 10;
    private int[] arr = new int[MAX_SIZE];
    private int front = 0, rear = -1, count = 0;

    @Override
    public void insert(int value) throws QueueOverflowException {
        if (count >= MAX_SIZE)
            throw new QueueOverflowException();
        rear = (rear + 1) % MAX_SIZE;
        arr[rear] = value;
        count++;
    }

    @Override
    public int delete() throws QueueUnderflowException {
        if (count == 0)
            throw new QueueUnderflowException();
        int value = arr[front];
        front = (front + 1) % MAX_SIZE;
        count--;
        return value;
    }

    @Override
    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0, idx = front; i < count; i++, idx = (idx + 1) % MAX_SIZE)
            System.out.print(arr[idx] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice;

        System.out.println("Queue Demo (Bus Stand Queue) - Max size: 10");
        do {
            System.out.println("\n1. Insert  2. Delete  3. Display  4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter integer to insert: ");
                        int val = sc.nextInt();
                        q.insert(val);
                        System.out.println("Inserted: " + val);
                        break;
                    case 2:
                        int deleted = q.delete();
                        System.out.println("Deleted: " + deleted);
                        break;
                    case 3:
                        q.display();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (QueueOverflowException e) {
                System.out.println("Exception: " + e.getMessage());
            } catch (QueueUnderflowException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        } while (choice != 4);
        sc.close();
    }
}
