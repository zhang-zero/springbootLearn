package com.springboots.service.impl;

import com.springboots.domain.model.Account;
import com.springboots.domain.model.dao.IAccountDAO;
import com.springboots.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: zzh
 * @Date: 2019/5/6 14:50
 * @Description:
 * @return
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO iAccountDAO;

    @Override
    public int add(Account account) {
        return iAccountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return iAccountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return iAccountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return iAccountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return iAccountDAO.findAccountList();
    }
}
