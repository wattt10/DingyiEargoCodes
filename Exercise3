public class Exercise3 {
	
	public int maxProfit(int[] stockPrices) {
		if (stockPrices.length == 0) {
		      return 0;
		    }
		    int min= stockPrices[0];
		    int gain = 0;
		    for(int i = 1; i < stockPrices.length; i++) {
		     
		        gain = Math.max(stockPrices[i] - min, gain);
		        if (stockPrices[i] < min){
		          min = stockPrices[i];
		        }
		      }
		    return gain;
		  }
	
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise3 s = new Exercise3();
	System.out.println(s.maxProfit(new int[] {3,8,8,55,38,1,7,42,54,53}));
}
}
