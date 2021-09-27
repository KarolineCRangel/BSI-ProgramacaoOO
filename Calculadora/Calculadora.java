package Calculadora;

public class Calculadora {
	
    private Double num1,num2;

    public Calculadora(Double a, Double b) {
        this.num1 = a;
        this.num2 = b;
    }

    public String soma(){
    	return String.valueOf(this.num1 + this.num2);
    }
    
    public String subtracao(){
    	return String.valueOf(this.num1 - this.num2);
    }
    
    public String multiplicacao(){
    	return String.valueOf(this.num1 * this.num2);
    }
    
    public String divisao(){
    	return String.valueOf(this.num1 / this.num2);
    }

}