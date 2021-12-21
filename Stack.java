import java.util.Scanner;
public class Stack {
    int arr[];
    int top;
    Stack(int size){
        arr = new int[size];
        top=-1;

    }
    void push(int n,int size){
        if (top+1==size){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=n;
        }
    }
    void pop(){
        if (top==-1){
            System.out.println("Stack empty");
        }
        else{
            System.out.println("Last element popped");
            top--;
        }
    }
    void display(){
        System.out.println("the current stack is:");
        for (int i=0;i<top+1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int n;
        int control=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size=sc.nextInt();
        Stack m= new Stack(size);
        while(control!=4){
            System.out.println("Press 1 to enter data into the stack \nPress 2 to pop data from the stack \nPress 3 to display the stack ");
            control=sc.nextInt();
            switch(control){
                case 1:
                    System.out.println("enter number to push in stack:");
                    n=sc.nextInt();
                    m.push(n,size);
                    break;
                case 2:
                    m.pop();
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
