/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author fatiq
 */
class MyException extends Exception {
    private static int accno[] = 
                    {1001, 1002, 1003, 1004};
    private static String name[] = 
                    {"Anta","Budi","Candra","Dana","Zaid"};
    private static double bal[] =
                    {10000,12000,5600,999,1100.55};
    
    MyException(){}
    
    MyException(String str){super(str);}
    
    public static void main(String[] args) {
        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i < 5; i++){
                System.out.println(accno[i] + "\t" + name[i] + "\t\t" + bal[i]);
                if(bal[i] > 1000 && bal[i] < 2000){
                    MyException me =
                       new MyException("Balance is less than 1000");
                    throw me;
                }
            }
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}
