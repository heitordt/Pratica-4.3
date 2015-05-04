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
public class Elipse implements FiguraComEixos{
    protected double s;
    protected double r;
    
    public Elipse (double semiEixoX, double semiEixoY)
    {
        this.s = semiEixoX;
        this.r = semiEixoY;
    }
    
    @Override
    public double getEixoMaior()
    {
        if (s <= r)
            return r*2;
        else
            return s*2;
    }
    
    @Override
    public double getEixoMenor()
    {
        if (s <= r)
            return s*2;
        else
            return r*2;
    }
    
    @Override
    public double getPerimetro()
    {
        return (Math.PI*(3*(r + s) - Math.sqrt((3*r + s)*(r + 3*s))));
    }
    
    @Override
    public double getArea()
    {
        return (Math.PI * s * r);        
    }
    
    @Override
    public String getNome()
    {
        return this.getClass().getSimpleName();        
    }
}
