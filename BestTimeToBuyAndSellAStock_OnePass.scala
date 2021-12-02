object Solution {
  def maxProfit(prices: Array[Int]): Int = {
    var (profit, buyingPrice) = (0, prices(0))
    for(i <- 1 until prices.length) {
      if(prices(i)-buyingPrice > profit) {
        profit = prices(i)-buyingPrice
      }

      if(prices(i) < buyingPrice) buyingPrice = prices(i)
    }
    profit
  }
}