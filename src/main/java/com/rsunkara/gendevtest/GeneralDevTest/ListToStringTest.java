package com.rsunkara.gendevtest.GeneralDevTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToStringTest {

    public static void main(String []args) {
        List<String> listOfAccounts = new ArrayList<>();
        listOfAccounts.add("A100");
        listOfAccounts.add("B101");
        listOfAccounts.add("C102");
        listOfAccounts.add("D103");
        listOfAccounts.add("E104");

        StringBuilder sb = new StringBuilder();
        for (String account : listOfAccounts) {
            sb.append("'" + account + "',");
        }
        String accountListString = sb.toString();
        accountListString = accountListString.substring(0, accountListString.length() - 1);

        System.out.println("Whats in PR:" +accountListString);

        System.out.println("What am proposing:" + listOfAccounts.stream().collect(Collectors.joining("','", "'", "'")));
    }
}
