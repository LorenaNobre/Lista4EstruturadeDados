package Lista4;
    public class Pilha {
        private int[] elementos;
        private int topo;


        public Pilha(int capacidade) {
            elementos = new int[capacidade];
            topo = -1;
        }


        public void push(int elemento) {
            if (topo == elementos.length - 1) {
                System.out.println("Pilha cheia! Não é possível adicionar o elemento " + elemento);
                return;
            }
            elementos[++topo] = elemento;
        }


        public int pop() {
            if (topo == -1) {
                System.out.println("Pilha vazia! Não há elementos para remover.");
                return -1;
            }
            return elementos[topo--];
        }


        public void exibir() {
            if (topo == -1) {
                System.out.println("Pilha vazia!");
                return;
            }
            System.out.print("Conteúdo da pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }


        public int tamanho() {
            return topo + 1;
        }


        public void limpar() {
            topo = -1;
        }

        public static void main(String[] args) {

            Pilha pilha = new Pilha(10);

            pilha.push(5);
            pilha.push(10);
            pilha.push(15);

            pilha.exibir();

            System.out.println("Número de elementos na pilha: " + pilha.tamanho());

            pilha.pop();
            pilha.exibir();

            pilha.limpar();
            pilha.exibir();
        }
    }


