/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Admilson
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora {
    private static Pilha pilha = new Pilha();
    private static JTextField display;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setResizable(false); // Impede que a janela seja maximizada
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setColumns(20);
        display.setFont(new Font("Arial", Font.BOLD, 24)); // Definir estilo do texto
        display.setHorizontalAlignment(JTextField.RIGHT); // Alinhar texto à direita
        display.setBackground(Color.WHITE); // Definir cor de fundo
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Definir borda
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);

        frame.setExtendedState(JFrame.ICONIFIED); // Inicia a calculadora minimizada
        frame.setLocationRelativeTo(null); // Centraliza a calculadora na tela

        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if (command.equals("C")) {
                pilha.clear();
                display.setText("");
            } else if (command.equals("=")) {
                if (pilha.size() >= 3) {
                    int num2 = pilha.pop();
                    String operator = pilha.popString();
                    int num1 = pilha.pop();
                    int result = calculate(num1, num2, operator);
                    pilha.push(result);
                    display.setText(String.valueOf(result));
                }
            } else if (isOperator(command)) {
                pilha.pushString(command);
            } else {
                // Limpa a caixa de texto se não houver operação pendente
                if (pilha.size() == 0 || pilha.size() % 2 == 0) {
                    display.setText("");
                }
                pilha.push(Integer.parseInt(command));
                display.setText(display.getText() + command); // Adiciona o número no campo de texto
            }
        }

        private boolean isOperator(String command) {
            return command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/");
        }

        private int calculate(int num1, int num2, String operator) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    return num1 / num2;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
    }
}