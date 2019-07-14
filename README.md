# PortfolioTracker

  ## what it should look like
  
    -   Keep live track of stocks/cryptocurrencies portfolio
    -   Plot excel-like statistics
    -   Plot visual graphs
    -   Edit portfolio in real time, google spreadsheets style
    -   Later version, add user login
   
   ------------------------------------------------------------
   
   
   
   First version -- this will be the backbone of future releases
   
    - java core, no external db
    - no external output, just cmd prints
    - no statistics
    - non editable
   
  
  ## Planing
  
   1.   create objects representing each column
       
       - id(criteriu)
       - balance
       - name
       - quantity
       - $ purchase price
       - $ sell price
       - ROE
       - current-btc-price
        
        
        ----- to be continued, added more later -----
        
   2.   create methods representing excel functions ($ sum, btc sum, average entry price, conditions, etc)
       - if same stock_name found, alert user to add a different stock.
   
   
   
   # future releases ideas
   
    - asign db entries as objects, look into hibernate or other alternatives
    - research graphs, what libraries to use, what's easier to understand and easy to deploy
    - add users/login
   
