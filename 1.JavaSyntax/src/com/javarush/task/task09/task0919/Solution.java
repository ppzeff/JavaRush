package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        divideByZero();
    }
    public static void divideByZero(){
        try{
            int i =5/0;

        } catch (NullPointerException exception){
            exception.printStackTrace();

        }
    }
}
