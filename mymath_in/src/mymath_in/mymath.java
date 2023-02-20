package mymath_in;

import java.util.stream.IntStream;

public class mymath {

	/**
	 * Returns the square root rounded down of the given non negative number
	 * 
	 * @post the result is the greatest non negative number whose square is not
	 *       greater than the given number 
	 *       |0 <= result && result*result <= x && x < (result +1)*(result+1)
	 * @pre x must not be negative 
	 * 		|x >= 0
	 * 
	 */

	static int sqrt(int x) {
		int r = 0;
		while ((r + 1) * (r + 1) <= x)
			r++;
		return r;
	}
	
	/**
	 * Returns the index where the given value belongs in the given sorted array. If
	 * the given value appears in the given array, returns the index of the first
	 * occurrence
	 * 
	 * @pre the list is sorted, and the 'haystack' is not null
	 * 		| haystack != null
	 * @pre | IntStream.range(1, haystack.length).allMatch(i -> haystack[i-1] <= haystack[i])
	 *
	 * @post| 0 <= result
	 * @post| result <= haystack.length
	 * @post| IntStream.range(0, result).allMatch(i -> haystack[i] <= needle)
	 * @post| IntStream.range(result, haystack.length).allMatch(i -> needle <= haystack[i])
	 * 
	 */
	
	static int binarySearch(int[] haystack, int needle) {
		int lo = 0;
		int hi = haystack.length;
		while(lo<hi) {
			int middle = lo +(hi - lo)/2;
			if (needle <= haystack[middle])
				hi = middle;
			else
				lo = middle+1;
		}
		return lo;
	}
}
