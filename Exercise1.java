

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	public List<Integer> coinChange(int target) {
	    // Write your solution here
		int[] coins = new int[] {25, 10, 5, 1};
		List<Integer> result = new ArrayList<>();
		helper(coins, target, 0, result);
		return result;
	}
	private void helper(int[] coins, int target, int index, List<Integer> res) {
		//Base Case
		if (index == 4) {
			return;
		}
		int count = target/coins[index];
		res.add(count);
		helper(coins, target - (count*coins[index]), index + 1, res);
	}
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 s = new Exercise1();
		System.out.println(s.coinChange(83));
		  // Test Cases
    System.out.println(s.coinChange(22));
    System.out.println(s.coinChange(40));
		}
}
