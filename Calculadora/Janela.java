package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {
    //JFrame f;

	Janela(){
        setTitle("Calculadora");
        setSize(250, 200);

        //tela
        Container c = getContentPane();

        JPanel painel = new JPanel();
        c.add(painel);

        //Caixas
        JLabel valor1 = new JLabel("Valor 1:");
        painel.add(valor1);
        JTextField TFValor1 = new JTextField(15);
        painel.add(TFValor1);

        JLabel valor2 = new JLabel("Valor 2:");
        painel.add(valor2);
        JTextField TFValor2 = new JTextField(15);
        painel.add(TFValor2);

        JLabel resultado = new JLabel("Resultado:");
        painel.add(resultado);
        JTextArea TAResultado = new JTextArea(1,18);
        TAResultado.setEditable(false);
        painel.add(TAResultado);

        //Botões
        JButton btSoma = new JButton("+");
        painel.add(btSoma);
        btSoma.setBackground(Color.pink);
        
        JButton btSubtracao = new JButton("-");
        painel.add(btSubtracao);
        btSubtracao.setBackground(Color.pink);
        
        JButton btMultiplicacao = new JButton("*");
        painel.add(btMultiplicacao);
        btMultiplicacao.setBackground(Color.pink);
        
        JButton btDivisao = new JButton("/");
        painel.add(btDivisao);
        btDivisao.setBackground(Color.pink);
        
        
        //Condições
        btSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(TFValor1.getText().isBlank()) && !(TFValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(TFValor1.getText()), Double.parseDouble(TFValor2.getText()));
                    TAResultado.setText(calc.soma());
                }
            }
        });

        btSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(TFValor1.getText().isBlank()) && !(TFValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(TFValor1.getText()), Double.parseDouble(TFValor2.getText()));
                    TAResultado.setText(calc.subtracao());
                }
            }
        });

        btMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(TFValor1.getText().isBlank()) && !(TFValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(TFValor1.getText()), Double.parseDouble(TFValor2.getText()));
                    TAResultado.setText(calc.multiplicacao());
                }
            }
        });

        btDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(TFValor1.getText().isBlank()) && !(TFValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(TFValor1.getText()), Double.parseDouble(TFValor2.getText()));
                    TAResultado.setText(calc.divisao());
                }
            }
        });

        setVisible(true);
        repaint();
    }

}