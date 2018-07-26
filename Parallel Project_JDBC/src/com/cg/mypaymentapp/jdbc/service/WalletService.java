package com.cg.mypaymentapp.jdbc.service;
import java.math.BigDecimal;
import java.util.List;

import com.cg.mypaymentapp.jdbc.beans.Customer;
import com.cg.mypaymentapp.jdbc.beans.Transactions;


public interface WalletService {
public Customer createAccount(String name ,String mobileno, BigDecimal amount);
public Customer showBalance (String mobileno);
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
public Customer depositAmount (String mobileNo,BigDecimal amount );
public Customer withdrawAmount(String mobileNo, BigDecimal amount);
public List<Transactions> recentTransactions(String mobileNo);
}
