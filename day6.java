
public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numT = 20;
		if (numT > 1 && numT <= 6) {
			System.out.println("10% discount");
			{
			}

			if (numT > 6 && numT <= 11) {
			}
			System.out.println("20% discount");
			{
				if (numT > 11) {
				}

				System.out.println("30% discount");
			}

			// program 2
			int numTa = -15;

			if (numTa > 1 && numTa <= 6) {
				System.out.println("10% discount");
			}

			else if (numTa > 6 && numTa <= 11) {
				System.out.println("20% discount");
			}

			else if (numTa > 11) {
				System.out.println("incorrect input");
			}

			// program 3

			int marks = 93;

			if (marks > 91) {
				System.out.println("Grade A");

			}
			if (marks > 76) {
				System.out.println("Grade B");
			}
			if (marks > 66) {
				System.out.println("Grade C");
			}

			// program 4

			int marksB = 55;

			if (marksB > 91) {
				System.out.println("Grade A");
			} else if (marksB > 76) {
				System.out.println("Grade B");
			} else if (marksB > 66) {
				System.out.println("Grade C");
			}

			else {
				System.out.println("Fail try again");
			}

			// program 5

			int a = 11;
			int b = 51;

			if (a > b) {
				System.out.println("a is greater");
			} else {
				System.out.println("b is greater");
			}

			// program 6

			int x = 15;
			int y = 55;
			int z = 255;

			if (x > y && x > z) {
				System.out.println("x is greater");
			} else if (y > x && y > z) {
				System.out.println("y is greater");
			} else {
				System.out.println("z is greater");
			}
		}

		{
		}
	}
}
