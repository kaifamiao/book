package com.kaifamiao.service.impl;

import com.kaifamiao.dao.AccountDao;
import com.kaifamiao.service.AccountService;
import com.kaifamiao.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

//    public void transfer(String out,String in ,Double money) {
//        accountDao.outMoney(out,money);
//        accountDao.inMoney(in,money);
//    }
    @Transactional
    public void transfer(String out,String in ,Double money) {
//        accountDao.outMoney(out,money);
//        int i = 1 / 0;  //抛出异常
//        accountDao.inMoney(in,money);
        try{
            accountDao.outMoney(out,money);
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }
    }
}
