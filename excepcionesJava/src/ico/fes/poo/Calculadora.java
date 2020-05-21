/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

import ico.fes.excepciones.fueraRangoException;

/**
 *
 * @author crist
 */
public class Calculadora {
    private float operando1;   //10/2
    private float operando2;
    private int operador;   //1-> + 2-> resta 3 -> mul  4-> division

    public Calculadora() {
    }

    public Calculadora(float operando1, float operando2, int operador) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador = operador;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) throws fueraRangoException{
        if (operador < 1 || operador > 4) {
            //System.out.println("El operador esta fuera de rango");
            throw new fueraRangoException();
        }else{
        this.operador = operador;
        }
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }
    
    public void calcular(){
        switch(operador){
            case 1:
                System.out.println("resultado= " + (operando1+operando2));
                break;
            case 2:
                System.out.println("resultado= " + (operando1-operando2));
                break;
            case 3:
                System.out.println("resultado= " + (operando1*operando2));
                break;
            case 4:
                System.out.println("resultado= " + (operando1/operando2));
                break;
        }
    }
    
    
}
