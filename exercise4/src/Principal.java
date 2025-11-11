
public class Principal {
    public static void main(String[] args) {
       // estaciando as classes
        Soma s = new Soma();
        Substracao su = new Substracao();
        Multiplicacao m = new Multiplicacao();
        Divisao d = new Divisao();

       // usando todos os mesmos metodos mas com o operadores diferentes
        int soma = s.calcular(12,16);
        System.out.println("A soma dos numeros: "+soma);

        int subs = su.calcular(12,16);
        System.out.println("A substracao dos numeros: "+ subs);

        int multi = m.calcular(12,16);
        System.out.println("A multiplicacao dos numeros: "+ multi);

        double divi = d.calcular(100,16);
        System.out.println("A divisao dos numeros: "+ divi);

    }
}