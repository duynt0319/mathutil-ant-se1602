/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.duyca.mathutil.core.test;

import com.duyca.mathtil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Duy
 */
public class MathUnitTest {

    //Kiểm thử ngoại lệ thì sao
    //tức là hàm getF() được thiết kê rằng nếu đưa n cà chớn
    //thì hàm phải ném ra ngoại lệ
    //túc là getF(-5) thì EXEPECTED == NGOẠI LỆ ILLEGEL ARGUMENT EXECEPTION
    //thấy ngoại lệ mừng rơi nước mắt
    @Test
    // trong hàm này sẽ chứa các test case để test getF()
    //với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReTurnsWell() {
        //test case 1: test getF() with n = 0;
        //expected result = 1; hy vọng 0! = 1

        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);

        Assert.assertEquals(expectedValue, actualValue);

        //test case 2: test getF() with n = 5;
        //expected result = 120 //hy vong 5! = 120 xem may cos lafm dc nhu v hay khong
        Assert.assertEquals(120, MathUtility.getFactorial(5));

        //test case 3: test getF() with n = 6; expected = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));

        //test case 4: test getF() with n = 6; expected = 720
        Assert.assertEquals(24, MathUtility.getFactorial(4));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //testcase 5: getF() with a wrong arg n = -5
        //expected result: an exception is thrown: illegel argument
        MathUtility.getFactorial(-5);
        //nếu chỉ gõ lệnh trên thì bị màu đỏ
        //do lệnh này gây ra exception, và exception là màu đỏ
        //nhưng hàm này mình kì vọng ra exception nếu có exp
        //thì hàm này đúng thiết kế, đúng thiết kế thì phải xanh
        //lỗi của ta là không đo, không so sánh,
        //ta cần thêm 1 lệnh: đã có ngoại lệ chưa
        // có rồi là: xanh
        // chưa -> đỏ
        //Junit 4 không dùng hàm để do ngoại lệ
        //Junit 5 thì có hàm dùng để do ngoại lệ

    }
}
