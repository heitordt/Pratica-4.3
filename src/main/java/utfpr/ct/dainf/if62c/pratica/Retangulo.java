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
public class Retangulo implements FiguraComLados {

    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getLadoMaior() {
        if (base > altura) {
            return base;
        } else {
            return altura;
        }
    }

    @Override
    public double getLadoMenor() {
        if (base < altura) {
            return base;
        } else {
            return altura;
        }
    }

    @Override
    public double getArea() {
        return (base * altura);
    }

    @Override
    public double getPerimetro() {
        return (2 * base + 2 * altura);
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }
}
