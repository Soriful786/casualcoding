import java.io.*;
class objectAddition {
	int num1,num2;
	String str1,str2;

    void sum1(int a, String s1) {
		num1=a;
		str1=s1;
    }
	void sum2(int b, String s2) {
		num2=b;
		str2=s2;
    }
	void display(objectAddition y){
		System.out.println("Sum of integers: "+(num1+y.num2));
		System.out.println("Concatenation of strings "+str1+y.str2);

	}

    public static void main(String args[]) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);
        System.out.print("Enter integer of object1: ");
        int a = Integer.parseInt(br.readLine());
		System.out.print("Enter integer of object2: ");
        int b = Integer.parseInt(br.readLine());
		System.out.print("Enter string of object1: ");
		String s1=br.readLine();
		System.out.print("Enter string of object2: ");
		String s2=br.readLine();
        objectAddition x = new objectAddition();
		objectAddition y = new objectAddition();
        x.sum1(a, s1);
		y.sum2(b,s2);
		x.display(y);
		br.close();
		r.close();
    }
}