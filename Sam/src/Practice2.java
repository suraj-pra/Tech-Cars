/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class Practice2 {
    public static void main(String args[]){
        String s1, s2, s3, x, y, z;
        int t;
        s1 = "Class XII";
        s2 = "Cbseboard";
        s3 = "    aisse2016";
        x = s1.substring(5, 8);
        y = s2.concat(s1);
        z = s3.trim();
        t = z.length();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
    }
}
