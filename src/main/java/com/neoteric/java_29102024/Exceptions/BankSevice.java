package com.neoteric.java_29102024.Exceptions;
import java.util.HashMap;
import java.util.Map;

public class
BankSevice {
    private double dailyTransactionLimit = 6000.0;
    Map<String,Double> accountData = new HashMap<>();
    public BankSevice(){
        accountData.put("2244",10000.0);
        accountData.put("3355",2000.0);

    }
    public void transfer(String fromAccount,String toAccount,double amount) throws Exception{
         double accountBalance  = accountData.get(fromAccount);
        if(accountBalance < amount){
            throw new InSufficientBalnceException( fromAccount+ ErrorCode.IN_SUFFICEINT_FUNDS.getCode()+ ErrorCode.IN_SUFFICEINT_FUNDS.getMessage() );
        }
        if(!accountData.containsKey(fromAccount) || !accountData.containsKey(toAccount)){
            throw new AccountNotFoundException(  ErrorCode.ACCOUNT_NOT_FOUND.getCode()+ ErrorCode.ACCOUNT_NOT_FOUND.getMessage()+ "Account not Found " + fromAccount + " To AccountNumber is  " + toAccount);
        }

        if( amount>dailyTransactionLimit){
            throw new DailyTransactionLimitException(ErrorCode.DAILY_LIMIT_EXCEED.getCode()+ ErrorCode.DAILY_LIMIT_EXCEED.getMessage()+ fromAccount);

        }
         double fromAccountBlance =accountBalance-amount;
          accountData.put(fromAccount,fromAccountBlance);
         double toAccountBlance = accountData.get(toAccount)+amount;
         accountData.put(toAccount,toAccountBlance );

        System.out.println(" Transaction Sucessful " + amount+ "from " + fromAccount +  "to"+ toAccount );

    }


   }



