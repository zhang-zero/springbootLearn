package com.springboots.domain.model.dao;

import com.springboots.domain.model.Account;

import java.util.List;

/**
 * @Auther: zzh
 * @Date: 2019/5/6 14:26
 * @Description:
 * @return
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
