
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1611810
 */
public class Pratica43 {
    public static void main (String[] args)
    {
        Retangulo ret = new Retangulo(2, 5);
        System.out.println("Área do Retângulo: " + ret.getArea() + "Perímetro do Retângulo: " + ret.getPerimetro());
        Quadrado qua = new Quadrado(2);
        System.out.println("Área do Quadrado: " + qua.getArea() + "Perímetro do Quadrado: " + qua.getPerimetro());        
    }
    
}
