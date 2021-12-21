import java.util.Scanner;
public class Queue {

    int items[];
    int front, rear;
    
    Queue(int size) {
        items=new int[size];
        front = -1;
        rear = -1;
    }
    void enQueue(int size,int element) {
        if ((front == 0 && rear == size - 1)) {
        System.out.println("Queue is full");
        }
        else {
        if (front == -1) {
            front = 0;
        }
        rear++;
        items[rear] = element;
        System.out.println("Insert " + element);
        }
    }
    int deQueue() {
        int element;
        if (front==-1) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }
    
    void display() {
        int i;
        if (front==-1) {
        System.out.println("Empty Queue");
        }
        else {
        System.out.print("Items -> ");
        for (i = front; i <= rear; i++)
            System.out.print(items[i] + "  ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int control=0;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Queue:");
        int size=sc.nextInt();
        Queue m = new Queue(size);
        while(control!=4){
            System.out.println("Press 1 to enter data into the Queue \nPress 2 to pop data from the Queue \nPress 3 to display the Queue ");
            control=sc.nextInt();
            switch(control){
                case 1:
                    System.out.println("enter number to push in Queue:");
                    n=sc.nextInt();
                    m.enQueue(size, n);
                    break;
                case 2:
                    m.deQueue();
                    break;
                case 3:
                    m.display();
                    break;
                default:
                    System.exit(0);
            }
        }
        sc.close();

    }
}