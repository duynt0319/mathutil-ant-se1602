/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.duyca.mathutil.main;

import com.duyca.mathtil.core.MathUtility;

/**
 *
 * @author Duy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenWrongArgumentThrowsException();
                testFactorialGivenRightAgumentRunsWell();

    }

    // dân dev phải có trách nhiệm test code của mình chạy đúng hay sai trước khi lắp ráp nó với các class khác để tạo nên các chức năng
    // thường tên hàm sẽ bao hàm ý nghĩa của việc kiểm thử
    // ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
    // trong tình huống - case đưa n đúng chuẩn, thì ta hy vọng - expected
    // hàm chạy ngon như thiết kế, ví dụ n = 5 thì hàm phải trả về 120
    // tức là 5! hy vọng hàm tính ra 120
    public static void testFactorialGivenRightAgumentRunsWell() {
        // test case #1: test getFactorial with n = 0
        // exepected value:  1 hy vọng khi đưa n 0 1 vào thì hàm trả về 1
        int n = 0;
        long exepectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);

        System.out.println("Test " + n + "!: exepected: " + exepectedValue
                + " | actual Value: " + actualValue);
        //test case 2: test getFactorial() with n = 1
        //expected value = 1 - hy vong 1! app tra ve 1
        n = 1;
        exepectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("test " + n + "!: expected = " + exepectedValue
                + "| actual: " + actualValue);

        //test case 3 test 3
        // expectedValue = 6;
        System.out.println("test 3!: expect 6" + "| actual: " + MathUtility.getFactorial(3));

    }

    public static void testFactorialGivenWrongArgumentThrowsException() {
        //thiet ke ham getF() la: chi tinh n! tu 0...20
        //neu dua n < 0 || n > 20 thi ham se k tinh, thong bao co ngoai le
        // thuc te ham getF() khi chay co lam dc nhu thiet ke hay khong
        //phai test thu, chay moi biet dc
        //test case 4: test getF() with n = 5, wrong argument
        //expected value: an exeception is throw IllegalArgumentExeception
        System.out.println("test -5!: expect illegal Argument exception");
        MathUtility.getFactorial(5);
    }
}
