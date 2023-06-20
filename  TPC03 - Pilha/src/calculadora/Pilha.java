/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.EmptyStackException;

/**
 *
 * @author Admilson
 */
class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(int valor) {
        No novoNo = new No(valor);
        if (topo == null) {
            topo = novoNo;
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
        }
    }

    public int pop() {
        if (topo == null) {
            throw new EmptyStackException();
        }
        int valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public int peek() {
        if (topo == null) {
            throw new EmptyStackException();
        }
        return topo.valor;
    }

    public boolean isEmpty() {
        return topo == null;
    }
}