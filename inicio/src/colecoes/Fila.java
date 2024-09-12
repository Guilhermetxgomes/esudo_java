package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    Queue<String> fila = new LinkedList<>();

    fila.add("Ana");
    fila.offer("Bia");
    fila.add("Carlos");
    fila.add("Daniel");

    System.out.println(fila.peek());
    System.out.println(fila.element());


    System.out.println(fila.poll());

    System.out.println(fila.remove());
  }
}
