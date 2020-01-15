public class Convert {
    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        Stack s = new Stack();
        int rest;

        // Fase 1 =empilhamento dos restos
        while (number != 0) {
            rest = number % 2; // pego o resto da divisão deste número por 2 (vale 0 ou 1)

            s.push(rest); // armazeno na pilha
            number = number / 2; // gero um novo número, resultado da divisão dele por 2

        }
        while (!s.isEmpty()) {
            rest = s.pop();
            System.out.print(rest);
        }
        System.out.println("\n end of the program");

    }
}

// (172)10 = (10101100)2
/*
 * Um exemplo das divisoes suscessivas 172 / 2 0 86 / 2 0 43 / 2 1 21 / 2 1 10 /
 * 2 0 5 / 2 1 2 / 2 0 1 / 2 1 0
 */