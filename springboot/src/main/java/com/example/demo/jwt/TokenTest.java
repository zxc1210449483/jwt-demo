package com.example.demo.jwt;

public class TokenTest {

    public static void main(String[] args) {
        tokenTest();
    }

    public static void tokenTest(){
        TokenUtil tku = new TokenUtil();
        Token tk;

        String result = tku.createToken("asdfghjkl","admin");

        System.out.println(result);

        tk = tku.getTokenData(result);

        System.out.println(tk.toString());
    }
}
