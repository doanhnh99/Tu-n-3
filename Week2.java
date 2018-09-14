import java.util.Scanner;

public class Week2
{
	public static void main(String args[])
	{
	int numA, numB;
	Scanner inPut = new Scanner(System.in);
	System.out.print("Nhap so a = ");
	numA = inPut.nextInt();
	System.out.print("Nhap so b = ");
	numB = inPut.nextInt();
	System.out.println("Result = " +ucln(numA, numB));

	// Test de quy
	int num;
	System.out.print("Num = ");
	num = inPut.nextInt();
	//Xuat ket qua
	System.out.println("Recur = " + recur(num));

	}
	
	static int ucln(int a, int b)
	{
		while (a != b)
		{
			if (a > b) a = a - b;
			else if (a < b) b = b - a;
		}
		
		return a;
	}
	 
	static int recur(int n)
	{
	/*if (n == 0) return 0;
	else if (n == 1) return 1;
	else return (recur(n - 1) + recur(n - 2));*/
	int  i = 2, num1 = 0, num2 = 1;
	int result = 0;
	while (i <= n)
	{
		result = num1 + num2;
		num1 = num2;
		num2 = result;
		i++;
	}

	return result;

	}
	
}