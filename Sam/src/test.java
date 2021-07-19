/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class test {
    public static void main(String arg[])
    {
        int num=20;
        rec obj=new rec();
        obj.a=10;
        obj.b=20;
        num=obj.sum() + num;
        System.out.println(num);
    }
}
