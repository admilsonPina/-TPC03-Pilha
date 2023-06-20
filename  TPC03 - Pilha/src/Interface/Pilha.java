/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Stack;

public class Pilha {
    private Stack<Object> stack;

    public Pilha() {
        stack = new Stack<>();
    }

    public void push(int valor) {
        No novoNo = new No(valor);
        stack.push(novoNo);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        No no = (No) stack.pop();
        return no.getValor();
    }

    public void pushString(String item) {
        stack.push(item);
    }

    public String popString() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return (String) stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clear() {
        stack.clear();
    }

    public int size() {
        return stack.size();
    }
}