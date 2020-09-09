/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package names;

/**
 *
 * @author S540965
 */
public class object2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String r = "computer";
        String s = "  Java  ";
        String t = "random access memory";
        System.out.println(s.trim().toUpperCase());
        System.out.println(r.substring(r.length() - 5));
        System.out.println(t.toUpperCase().substring(14));
        System.out.println(r.substring(r.indexOf('p'), 6));
        System.out.println(t.substring(3, 5).concat(t.substring(14, 16)));
        System.out.println(r.substring(0, 4) + ("sci").toUpperCase());
        System.out.println(t.substring(t.indexOf("me"), t.indexOf("or")));
        System.out.println(t.substring(t.indexOf(t.substring(14))));

    }

}
