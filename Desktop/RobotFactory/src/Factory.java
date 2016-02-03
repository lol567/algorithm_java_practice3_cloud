//by Elizabeth Lemeshko
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Factory {
	private static final String testKiller= "Test.txt";
	public static void main(String[] args) throws FileNotFoundException {
		BufferedInputStream in= new BufferedInputStream(new FileInputStream(testKiller));
		Robot[]robots;
		System.setIn(in);
		int n=StdIn.readInt();
		robots = new Robot[n];
		for (int i = 0; !StdIn.isEmpty(); i++) {
			int numberone = StdIn.readInt();
			int numbertwo = StdIn.readInt();
			robots[i] = new Robot(numberone, numbertwo);
		}
		MergeSorter.sort(robots,Robot.FirstNumberComparable);
		for(int i=0;i<robots.length;i++){
			System.out.println(robots[i].getNumberone()+" "+robots[i].getNumbertwo());
		}
	}
}