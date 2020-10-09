package main.lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ap {

        public static void main(String[] args) throws Exception {


                InputStreamReader st = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(st);
                String name = br.readLine();
                String number1 = br.readLine();
                int number = Integer.parseInt(number1);
                if (number>20){
                    System.out.println("И 18-ти достаточно");

                }


            }
        }