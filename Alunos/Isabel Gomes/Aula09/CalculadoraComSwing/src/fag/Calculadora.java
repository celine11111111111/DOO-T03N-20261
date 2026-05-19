package fag;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {
	
	static double numero1;
	static String operacao;

	public static void main(String[] args) {
	
		//janela 
		JFrame frame = new JFrame("Calculadora simples");	//janela com titulo
		frame.setSize(350,600);	//tam janela
        frame.setResizable(false);	//n deixa o usuario mexer dos lados pra aumentar
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//a aplicacao termina quando clica no x
		
		//outra janela
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);	//cor de fundo
		
		//cria o visor da caluclçadora
		panel.setLayout(null);
		JTextField visor =  new JTextField();
	    visor.setBounds(0, 0, 350, 80);
	    visor.setEditable(false);
		panel.add(visor, BorderLayout.NORTH);	//coloca em cima o visor
		
		//afdicionando no janelao(frame)
		frame.add(panel);
		
		//botoes
		//numeros
		JButton b0 = new JButton("0");
		b0.setBounds(90, 310, 60, 60);
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "0");
			}
		});
		panel.add(b0);
		
		JButton b1 = new JButton("1");
		b1.setBounds(20, 240, 60, 60);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "1");
			}
		});
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setBounds(90, 240, 60, 60);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "2");
			}
		});
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setBounds(160, 240, 60, 60);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "3");
			}
		});
		panel.add(b3);
		
		JButton b4 = new JButton("4");
		b4.setBounds(20, 170, 60, 60);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "4");
			}
		});
		panel.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBounds(90, 170, 60, 60);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "5");
			}
		});
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBounds(160, 170, 60, 60);
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "6");
			}
		});
		panel.add(b6);
		
		JButton b7 = new JButton("7");
		b7.setBounds(20, 100, 60, 60);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "7");
			}
		});
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setBounds(90, 100, 60, 60);
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "8");
			}
		});
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setBounds(160, 100, 60, 60);
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "9");
			}
		});
		panel.add(b9);
		
		
		//operacoes
		JButton soma = new JButton("+");
		soma.setBounds(240, 100, 60, 60);
		soma.setBackground(Color.ORANGE);
		soma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 =  Double.parseDouble(visor.getText());
				operacao = "+";
				
				visor.setText("");
						
			}
		});
		panel.add(soma);
		
		JButton div = new JButton("/");
		div.setBounds(240, 310, 60, 60);
		div.setBackground(Color.ORANGE);
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					numero1 =  Double.parseDouble(visor.getText());
					operacao = "/";
					
					visor.setText("");
				
			}
		});
		panel.add(div);
		
		JButton mult = new JButton("*");
		mult.setBounds(240, 240, 60, 60);
		mult.setBackground(Color.ORANGE);
		mult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 =  Double.parseDouble(visor.getText());
				operacao = "*";
				
				visor.setText("");
			}
		});
		panel.add(mult);
		
		JButton menos = new JButton("-");
		menos.setBounds(240, 170, 60, 60);
		menos.setBackground(Color.ORANGE);
		menos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 =  Double.parseDouble(visor.getText());
				operacao = "-";
				
				visor.setText("");
			}
		});
		panel.add(menos);
		
		
		//outros dois botao
		JButton limpar = new JButton("<--");
		limpar.setBounds(160, 310, 60, 60);
		limpar.setBackground(Color.ORANGE);
		limpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText("");
			}
		});
		panel.add(limpar);
		
		JButton igual = new JButton("=");
		igual.setBounds(20, 310, 60, 60);
		igual.setBackground(Color.ORANGE);
		igual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double numero2 = Double.parseDouble(visor.getText());
					double resultado = 0;
					
					switch(operacao) {
					
					case "+":
						resultado = numero1 + numero2;
					break;
					
					case "-":
						resultado = numero1 - numero2;
					break;
					
					case "*":
						resultado = numero1 * numero2;
					break;
					
					case "/":
						if(numero2 == 0 ) {
							throw new DividirPorZeroException("Nao pode dividir por zero !!");
						}
						
						resultado = numero1 / numero2;

					break;
					
					}
					
					visor.setText(String.valueOf(resultado));
					
				}catch (DividirPorZeroException erro) {
					
					JOptionPane.showMessageDialog(frame, 
					erro.getMessage(),
					"Erro de divisao",
					JOptionPane.ERROR_MESSAGE
					);

					//visor.setText(erro.getMessage());

				}
			}
		});
		
		panel.add(igual);
		
		
		//exibindo frame
		frame.setVisible(true);
		
	
	}

}
