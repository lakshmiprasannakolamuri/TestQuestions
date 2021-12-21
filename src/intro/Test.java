package intro;

public class Test
{

	public static void main(String[] args)
	{
		// Write a program to convert temperature from degree C to F. (Input 80C)

		float Fahrenheit, Celsius;
		Celsius = 80;
		Fahrenheit = ((Celsius * 9) / 5) + 32;

		System.out.println("Temperature in Fahrenheit is :" + Fahrenheit);

		// Declare and initialize 3 variable and print biggest number

		int a, b, c;
		a = 10;
		b = 50;
		c = 45;

		if (a >= b && a >= c)
		{
			System.out.println("Biggest number:" + a);
		} else if (b >= c && b >= a)
		{
			System.out.println("Biggest number:" + b);
		} else if (c >= a && c >= b)
		{
			System.out.println("Biggest number:" + c);
		} else
			System.out.println("Non of these above");

		// Write a program to print all even number in range 700 to 900.
		int n = 900;
		for (int i = 700; i < n; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i + " ");
			}
		}
		// Write a program to print all odd numbers from 251 to 51. like(251,249,...51)
		int number = 51;
		for (int i = 251; i >= number; i--)
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
			}
		}

		// Write a program to print alternate even numbers from 20 to 140.
		// like(20,24,28,...)
		for (int i = 20; i <= 140; i = i + 4)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}

		// Write a program to sum of all numbers between 382 and 582.
		int sum = 0;
		for (int i = 382; i <= 582; i++)
		{
			if (i % 2 == 0)
			{
				sum = i + sum;
				System.out.println(sum);
			}
		}

		// Write a program to print the all alphabets by using character Variable.
		
		char ch;
		for (c = 'A'; c <= 'Z'; c++)
		{
			System.out.print(c);
		}

		// Write a program to convert Kg to g. (input 56kg print in grams)
		
		float Kilogram, Gram;
		Kilogram = 56;
		Gram = Kilogram / 1000;
		System.out.println(Gram);

		// Declare and initialize a number. Check whether the number is in range 0-100
		// or not. If not in range
		// print invalid input. Else -if the number is in range 90-100 then print Super
		// Smart, 80-90 print Smart,70-80 print smart enough,
		// 60-70 print just smart, 35-60 print no smart, 0-35 print dump.

		int Number = 34;

		if (n >= 100)
		{
			System.out.println("Invalid Input");
		} else if (Number >= 90)
		{
			System.out.println("Super Smart");
		} else if (Number >= 80)
		{
			System.out.println("Smart");
		} else if (Number >= 70)
		{
			System.out.println(" Smart enough");
		} else if (Number >= 60)
		{
			System.out.println("Just Smart");
		} else if (Number >= 35)
		{
			System.out.println("No Smart");
		} else if (Number >= 0)
		{
			System.out.println("Dump");
		} else
			System.out.println("Non of these above");
		

		// Write a program to print PRASANNA for 33 times

		for (int i = 0; i <= 33; i++)
		{
			System.out.println("PRASANNA");
		}

		// Write a program to print all numbers which are divisible by 11 from 250 to
		// 550.
		for (int i = 250; i <= 550; i++)
		{
			if (i % 11 == 0)
			{
				System.out.println(i);
			}
		}

		// Write a program to sum all the numbers from 56 to 153
		int Sum = 0;
		for (int i = 56; i <= 153; i++)
		{
			sum = sum + i;
			System.out.println(Sum);

		}

		// Write a program to find the average of 24,26,28,....100.
		int average = ((24 + 100) / 2);
		// for(int i =24; i<=100; i++) {
		if (average % 2 == 0)
		{
			// System.out.println(i);
			System.out.println(average);
		}

		// Write a program to print A, B alternatively for 100 times. Ex:
		// (A,B,A,B,A,B,...)
		for (int i = 0; i <= 100; i++)
		{

			if (i <= 100)
			{
				System.out.print(" A,");
				System.out.print(" B,");

			}
		}

		// Write a program to print the series: 10@9,9@8, 8@7,....-5@-6
		int value = -5;
		for (int i = 10; i >= value; i--)
		{
			int result = i - 1;
			System.out.println(i + "@" + result);

		}

		// Write a for loop that never ends
		int infinity1 = 0;

		for (;;)
		{

			System.out.println("never ends");
		}

		// Write a program to print all 5 Multiples unto the Given Number

		for (int i = 63; i >= 5; i--)
		{
			if (i % 5 == 0) {
			
				System.out.println(i);
			}
			}
		

		// Write a program to print Average alternative Odd numbers Between the Given
		// Range?

		for (int i = 0; i <= 100; i = i + 3)
		{

			if (i % 2 != 0)
			{
				System.out.println(i);
			}
		}
		// input = 2 &14 ; output =2*3, 3*4, 4*5,......14*15

		for (int i = 2; i <= 14; i++)
		{
			int multiple = i + 1;
			System.out.println(i + "*" + multiple);

			int result = i * multiple;
			System.out.println(result);
		}

		// input =24; output = 1,2,3,factor of four,5,6,7,factor of four,9,10,11,factor
		// of four

		for (int i = 1; i <= 24; i++)
		{
			System.out.print(i + ",");

			if (i % 4 == 0)
			{
				System.out.print("factor of four");
			}

		}

		// input = 10,5,8 ;output =10 9 8 7 6 5 6 7 8
		for (int i = 10; i >= 5; i--)
		{
			System.out.println(i);
		}
		for (int i = 5; i <= 8; i++)
		{
			System.out.println(i);

		}
	}
}
