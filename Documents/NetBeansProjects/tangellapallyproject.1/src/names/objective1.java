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
public class objective1 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String r = new String("I love Java");
        String s = new String("  Jumping Jeroos  ");
        String t = new String("bearcat");
        String u = new String("northwest");
        System.out.println(t.toUpperCase());
        System.out.println(r.toLowerCase());
        System.out.println(u.length());
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(u.concat(t));
        System.out.println(u.concat("Missouri"));
        System.out.println("Hopping".concat(" Jeroos"));
        System.out.println(t + " football");
        System.out.println(r.indexOf("love"));
        System.out.println(s.indexOf("Jump"));
        System.out.println(t.indexOf("cat"));
        System.out.println(u.indexOf("dog"));
        System.out.println(u.substring(5));
        System.out.println(u.substring(1, 3));
        System.out.println(r.substring(7));
        System.out.println(s.substring(0, 3));
     
    }
}
