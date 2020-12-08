/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.services;

/**
 *@author keanrz
 * @author matth
 */

import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    public static List<Account> list = new ArrayList<>();
    public static List<Movie> movies = new ArrayList<>();
    public static boolean init = true;

    public AccountService() {
        if (init) {
            Account a1 = new Account(1, "superkearnz", "password", movies);
            Account a2 = new Account(2, "supermatt", "password345", movies);
            Account a3 = new Account(3, "lemmy", "password2", movies);
            Account a4 = new Account(4, "harrykane", "passworz", movies);
            Account a5 = new Account(5, "frankieboyle", "passte", movies);
            Account a6 = new Account(6, "xxx-tentacion", "passwody", movies);

            list.add(a1);
            list.add(a2);
            list.add(a3);
            list.add(a4);
            list.add(a5);
            list.add(a6);
            init = false;
        }
    }

    public List<Account> getAllAccounts() {
        return list;
    }

    public Account getAccount(int id) {
        return list.get(id - 1);
    }
}
