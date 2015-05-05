/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1611810
 */
public class TrianguloEquilatero extends Retangulo {

    public TrianguloEquilatero(double lado) {
        super(lado, Math.sqrt(3)*lado/2);
    }
    
    @Override
    public double getPerimetro(){
        return base*3;
    }
    
    @Override
    public double getArea(){
        return base*altura/2;
    }
    
    @Override
    public double getLadoMenor(){
        return base;
    }
    
    @Override
    public String getNome(){
        return this.getClass().getSimpleName();
    }
}
