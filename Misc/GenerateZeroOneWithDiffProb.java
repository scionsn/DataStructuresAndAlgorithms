//generate zero with 25% prob and 1 with 75% prob
//Given a function rand50() that returns 0 or 1 with equal probability,
//write a function that returns 1 with 75% probability and 0 with 25% probability using rand50() only.
//ref gfg
public class GenerateZeroOneWithDiffProb {
	static int rand50() {
		// rand() function will generate odd or even
		// number with equal probability. If rand()
		// generates odd number, the function will
		// return 1 else it will return 0.
		return (int) (10 * Math.random()) & 1;
	}

	static int rand75() {
//		 rand 50 generates either a 1 or 0 with equal prob(odd or even)
//		 there are 4 cases possible like in table of or gate
//		 we chose or operation because or with 1 returns 1 everytime 
//		 and returns 0 only if both bits are 0
//		 0|1=1 1|0=1 1|1=1 0|0=0
//		 here 1 is generatd three time s and 0 one time, thus prob of 1 is 75% and 0 is 25% or ratio is 3:1 
		return rand50() | rand50();
	}

	public static void main(String[] args) {
//		 math.random prints a floating number bw 0.0 and 1.0,multipluing by 10
//		 gives a number bw 0 and 10
//		 and typecasting it removes the floating point
//		the prob that we will get a odd or an even number is 50 50
		System.out.println((int) (10 * Math.random()));
	}

}
