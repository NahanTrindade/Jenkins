package br.com.teste;

class Valor{
    private int valor;

    public Valor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

    public boolean verificaImpar(){
        if(this.getValor() %2 != 0){
            System.out.printf("%d é Impar\n", this.getValor());
            return true;
        }else{
            System.out.printf("%d não é Impar\n", this.getValor());
            return false;
        }
    }

    public boolean verificaPar(){
        if(this.getValor() %2 == 0){
            System.out.printf("%d é Par\n", this.getValor());
            return true;
        }else{
            System.out.printf("%d não é Par\n", this.getValor());
            return false;
        }
    } 

}

public class Main{
    public static void main(String[]args){
        Valor val = new Valor(6);

        val.verificaImpar();
    }
}
