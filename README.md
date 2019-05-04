# PortfolioTracker

  ## what it should look like
  
   1.   Keep live track of stocks/cryptocurrencies portfolio
   2.   Plot excel-like statistics
   3.   Plot visual graphs
   3.   Edit portfolio in real time, google spreadsheets style
   4.   Later version, add user login
   
   ------------------------------------------------------------
   
   
   
   -- First version -- this will be the backbone of future releases
   
   - java core, no external db
   - no external output, just cmd prints
   - no statistics
   - non editable
   
  
  ## Planing
  
   1.   create objects representing each column
       
       - id(criteriu)
       - name
       - ammount
       - B entry price
       - B total ammount entry price
       - B sell price
       - B total sell price
        
       - $ entry price
       - $ total ammount entry price
       - $ sell price
       - $ total sell price
        
       - ROE
       - current-btc-price
       - starting portfolio ammount
       - current portfolio ammount 
        
        
        ----- to be continued, added more later -----
        
   2.   create methods representing excel functions ($ sum, btc sum, average entry price, conditions, etc)
       - if same stock_name found, alert user to add a different stock.
   
   
   
   # future releases ideas
   
   - asign db entries as objects, look into hibernate or other alternatives
   - research graphs, what libraries to use, what's easier to understand and easy to deploy
   - add users/login
   
