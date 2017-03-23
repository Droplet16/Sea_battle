package com.company;


public class SimpleDotComTest {

    static SimpleDotCom dot = new SimpleDotCom();

    public static void main(String[] args) {
        before_tests();
        test_failed();
        test_success();
        test_died();

    }

    private static void check(String validResult, String realResult) {

        if (validResult.equals(realResult)) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
    }

    private static void before_tests() {
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
    }

    private static void test_failed() {
        String userGuess = "1";


        String result = dot.checkYourself( userGuess );


        check("Мимо", result);

    }
    private static void test_success() {
        String userGuess = "2";


        String result = dot.checkYourself(userGuess);


        check("Попал", result);
    }

    private static void test_died() {
        dot.numOfHits = 0;
        String result = dot.checkYourself( "4" );
         result = dot.checkYourself( "3" );
         result = dot.checkYourself( "2" );


        check("Потопил", result);

    }
}
