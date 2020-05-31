/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mono2backpack;

/**
 *
 * @author dasepa
 */
public class Representants {

    static int howMany1(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ++result;
            }
        }
        return result;
    }
}