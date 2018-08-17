import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import com.bankaccount.BackAccount;
import com.naughtsandcrosses.Board;
import com.naughtsandcrosses.Player;

import exam2015.ParseException;
import exam2015.UtilFunctions;
import exam2016.DividedByZeroException;
import exam2016.KeyValuePair2016;
import exam2017.KeyValuePair2017;
import exam2017.KeyValuePairNotFoundException;
import exam2017.TextMessage;

public class Main {
	
	public static char c = 'c';
	
	public static void main (String[] args) {	
		
//		UnsignedInt newInt = new UnsignedInt(10);
//		UnsignedInt newInt1 = new UnsignedInt(6);	

//		Object o1 = new Cat((byte)1, 10);
//		Cat c1 = new Cat((byte)1, 10);
//		
//		Lion l1 = new Lion((byte)1, 10);
		
		// l1 is Object
		// l1 is Lion
		// l1 is Cat
		
//		c1.sleep();
//		l1.sleep();
//		
//		testInstance(l1);
		
//		Day d = Day.SUNDAY;
//		System.out.print(d);
		
//		int arr[] = {10, 100, 9, 15};
//		int max = largestInArray(arr, 0, -9999999);
//		System.out.println(max);
		
//		 String example = "0123456789a";
//		 String substr = example.substring(6);
//		 System.out.println(substr);
		
//		testTryCatch();	
		
//		testGenerics();
		
//		testIterator();
		
//		try {
//			testBufferedReader();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			testBufferedWriter();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			testBufferedReader();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Object o = getValue(10);
//		} catch (KeyValuePairNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			float f = div(10,0);
//			System.out.println(f);
//		} catch (DividedByZeroException e) {
//			e.printStackTrace();	
//		}

		KeyValuePair2016<String, Integer> p1 = new KeyValuePair2016<String, Integer>("one", 1);
		
//		try {
//			UtilFunctions.stringToInt("test");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
		
	}
	
	
	public static float div(float f1, float f2) throws DividedByZeroException {
		
		if (f2 == 0) {
			throw new DividedByZeroException("Divided By Zero Exception");
		}
		
		return f1 / f2;
		
	}
	
	public static Object getValue(int key) throws KeyValuePairNotFoundException {
		
		ArrayList<KeyValuePair2017<Integer, Object>> my_database = null;
		
		Iterator arrIter = my_database.iterator();
		
		while(arrIter.hasNext()) {
			
			if ( ((KeyValuePair2017<Integer, Object>) arrIter.next()).getKey() == key) {
				return ((KeyValuePair2017<Integer, Object>) arrIter.next()).getValue();
			}
			
		}
		
		throw new KeyValuePairNotFoundException("Key Value Pair Not Found Exception");
	
	}
	

	public static void testBufferedWriter() throws Exception {
		String path = "/home/jackey/eclipse-workspace/JavaClass/src/test.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		
		bw.write("text from java");
		bw.close();
		

	}

	
	public static void testBufferedReader() throws Exception {
		String path = "/home/jackey/eclipse-workspace/JavaClass/src/test.txt";
		BufferedReader br = new BufferedReader( new FileReader(path) );
		String line;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}
	
	public static void testIterator() {
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			arrList.add(i);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arrList.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> myIterator = arrList.iterator();
		while(myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		
	}
	
	public static void testGenerics() {
		Stack s = new Stack();
		s.push("hello");
		String str = (String) s.pop();
//		int i = (int)s.pop();
		
//		Stack<String> s = new Stack<String>();
//		s.push("hello");
//		String str = s.pop();
//		int i = (int)s.pop();

	}
	
	public static void testTryCatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input An Int: ");
		try {
			System.out.println(sc.nextInt());
		} catch (InputMismatchException e) {
			System.out.println(e);
		} //finally {
//			System.out.println("exception is catched, testTryCatch() is terminated");
//		}
		
	}
	
	
	public static void testInstance(Object o) {
		
		if (o instanceof Lion) {
			System.out.println("Lion Yeas: " + ((Lion) o).getCatYears());
		} else if (o instanceof Cat) {
			System.out.println("Cat Yeas: " + ((Cat) o).getCatYears());
		}
	}

	public static void ATMExample(){
		BackAccount b = new BackAccount(1230543);
		b.setBalance(1000);
		Scanner sinput = new Scanner(System.in);
		
		double err = 1;
		while(err != 0){
			System.out.println("How much would you like to withdraw?");
			double amount = sinput.nextDouble();
			err = b.withdrawMoney(amount);
		}
	}


	public static void NaughtsAndCrosses(){
		Player p1 = new Player('O');
		Player p2 = new Player('X');
		Board game = new Board(p1, p2);

		while ((game.getWinner() == null) && (game.isFull() == false)) {
			game.printBoard();
			Player currentPlayer = game.getNextPlayer();
			System.out.println("Player - " + currentPlayer.getMark());
			System.out.print("Row: ");
			int i = Board.getInput();
			System.out.print("Col: ");
			int j = Board.getInput();
			game.playMove(currentPlayer, i, j);
		}

		game.printBoard();
		if (game.getWinner() != null) {
			System.out.println("The winner is: " + game.getWinner().getMark());
		} else {
			System.out.println("The game was drawn");
		}
	}
	
	public static void testWhile() {
		int total = 0;
		 // Running total variable
		int input = 0;
		 // Control variable
		
		
		// while example
		Scanner sc = new Scanner(System.in);
		// Ask for input
		System.out.println("Input number (-1 to finish): ");
		input = sc.nextInt();
		
		while (input != -1) {
			total = total + input; // Add input to the total
			System.out.println("Input number (-1 to finish): ");
		    input = sc.nextInt(); // Update control variable
		}
			
		
		// do while; example
//		Scanner sc = new Scanner(System.in);
//		do {
//			total = total + input; // Add input to the total
//			System.out.println("Input number (-1 to finish): ");
//		    input = sc.nextInt(); // Update control variable
//			
//		}while(input != -1);
//		
//		System.out.println("The total was: " + total);

	}
	
	
	public static void testArray() {
		float arr[];
		arr = new float[1000];
		
		Random randNum = new Random();
		
		float total = 0;
		
		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (float) Math.random();
			arr[i] = randNum.nextFloat();
			total += arr[i];
			System.out.println("random num: " + arr[i] + " iteration: " + i);
		}
		
		System.out.println("Avg: " + total/1000);
	}
	
	public static int fac(int a) {
		if (a == 0) {
			return 1;
		}
		return a * fac(a - 1) ;
	}
	
	public static int sumNum(int a, int b) {
		return a+b;
	}
	
	public static double sumNum(double a, double b) {
		return a+b;
	}
	
	public static void printChar() {
		System.out.println(c);
	}
	
	public static void printChar(char c) {
		System.out.println(c);
	}
	
	public static void addOneInt(int a) {
		a += 1;
		System.out.println("inside function: " + a);
	}
	
	public static void addOneDouble(double a) {
		a += 1;
		System.out.println("inside function: " + a);
	}
	
	public static void addOneArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
			System.out.println("inside function: index: " + i + " value: " + arr[i]);
		}
	}
	
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
	
	public static int revPrintFib(int a) {
		if (a <= 0) {
			//System.out.print(fibonacci(a) + " ");
			System.out.println();
			return a;
		}
		
		System.out.print(fibonacci(a) + " ");
		return revPrintFib(a-1);
		
		
	}
	
	public static void printFib(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}
	
	
	public static void twoA2016 () {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			int temp = 0;
			temp = i * i + 3;
			total += temp;
		}
		
		total /= 2;
		
		System.out.println(total);
	}
	
	public static boolean isPrime(int n) {
		
		if (n == 1) return false;
		
		if (n == 2) return true;
		
	    //check if n is a multiple of 2
	    if (n % 2 == 0) return false;
	    //if not, then just check the odds
	    
	    for(int i = 3; i * i <= n; i+=2) {
	        if( n % i == 0)
	            return false;
	    }
	    
	    return true;
	}
	
	public static void fillArrWithRand(double a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.random();
//			System.out.println(a[i]);
		}
	}
	
	public static void fillArrWithPrime(int arr[]) {
		
		int counter = 0;
	    int inc = 0;
		
		while(counter < 20) {
			if ( isPrime(inc) ) {
				arr[counter] = inc;
				counter++;
			}
			inc++;
		}
		
	}
	
	public static void twoA2017() {
		
		int total = 0;
		
		for (int i = 0; i <= 100; i++) {
			
		
			if (i % 2 == 0) {
				total += i * i + 4;
			} else {
				total += i * i * i + 3;
			}
			
		}
		
		System.out.println(total);
		
	}
	
	public static int largestInArray(int a[], int index, int max) {
		if(index == a.length)
            return max;

	    if (a[index] > max){
	    	max = a[index];
		}
	    
	    return largestInArray(a, index + 1, max);
	}
	
	public static double mean(double a[]) {
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		
		return total/a.length;
	}
	
	public static double sDeviation(double a[]) {
		double meanNum = mean(a);
		double totalSquaredDifference = 0;
		for (int i = 0; i < a.length; i++) {
			double diff =  a[i] - meanNum;
			totalSquaredDifference += diff * diff;
		}
		
		return Math.sqrt( (totalSquaredDifference/(a.length - 1)) );
	}
	
	public static double twoE2017(int a) {
		
		if (a <= 0) {
			return 1;
		}
		
		if (a % 2 == 0) {
			return twoE2017(a - 1) + twoE2017(a - 2) + (a / 2);
		}
		
		return twoE2017(a - 1) - twoE2017(a - 2) + ( (a + 1) / 2);
		
	}
}
	
	
	
