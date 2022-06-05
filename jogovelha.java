package jogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import  java.util.Random;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

public class jogovelha {

	private JFrame frame;
	private int contpos=0;
	private int k=0,i=0;
	private int contadorX = 0;
	private int contadorO = 0;
	private Random rand = new Random();
	private String linha1,linha2,linha3,coluna1,coluna2,coluna3,diagonal1,diagonal2;
	private String[][]posvetor=new String[3][3];
	private JButton btnTop1;
	private JButton btnTop2;
	private JButton btnTop3;
	private JButton btnMeio3;
	private JButton btnMeio2;
	private JButton btnMeio1;
	private JButton btnBaixo1;
	private JButton btnBaixo2;
	private JButton btnBaixo3;
	private JTextField ContadorX;
	private JTextField ContadorO;
	private JButton LimparContador;
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jogovelha window = new jogovelha();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jogovelha() {
		initialize();
	}
	public void initialize() {
		frame = new JFrame();	
		frame.setResizable(false);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 621, 470);
		frame.getContentPane().setLayout(null);
		
		btnTop1 = new JButton("");
		btnTop1.setForeground(Color.RED);
		btnTop1.setBackground(Color.LIGHT_GRAY);
		btnTop1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnTop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTop1.setText(Jogada());
		        posvetor[0][0]="x";
		    	btnTop1.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
		
			}
		});
		btnTop1.setBounds(10, 11, 140, 119);
		frame.getContentPane().add(btnTop1);
		
		btnTop2 = new JButton("");
		btnTop2.setForeground(Color.RED);
		btnTop2.setBackground(Color.LIGHT_GRAY);
		btnTop2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnTop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTop2.setText(Jogada());
				posvetor[0][1]="x";
				btnTop2.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
			
		});
		btnTop2.setBounds(160, 11, 140, 119);
		frame.getContentPane().add(btnTop2);
		
		btnTop3 = new JButton("");
		btnTop3.setForeground(Color.RED);
		btnTop3.setBackground(Color.LIGHT_GRAY);
		btnTop3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnTop3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTop3.setText(Jogada());
				posvetor[0][2]="x";
				btnTop3.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor(); 
			}
		});
		btnTop3.setBounds(310, 11, 140, 119);
		frame.getContentPane().add(btnTop3);
		
		btnMeio3 = new JButton("");
		btnMeio3.setForeground(Color.RED);
		btnMeio3.setBackground(Color.LIGHT_GRAY);
		btnMeio3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMeio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMeio3.setText(Jogada());
				posvetor[1][2]="x";
				btnMeio3.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
		});
		btnMeio3.setBounds(310, 141, 140, 119);
		frame.getContentPane().add(btnMeio3);
		
		btnMeio2 = new JButton("");
		btnMeio2.setForeground(Color.RED);
		btnMeio2.setBackground(Color.LIGHT_GRAY);
		btnMeio2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMeio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMeio2.setText(Jogada());
				posvetor[1][1]="x";
				btnMeio2.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
		});
		btnMeio2.setBounds(160, 141, 140, 119);
		frame.getContentPane().add(btnMeio2);
		
		btnMeio1 = new JButton("");
		btnMeio1.setForeground(Color.RED);
		btnMeio1.setBackground(Color.LIGHT_GRAY);
		btnMeio1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMeio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMeio1.setText(Jogada());
				posvetor[1][0]="x";
				btnMeio1.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
		});
		btnMeio1.setBounds(10, 141, 140, 119);
		frame.getContentPane().add(btnMeio1);
		
		btnBaixo1 = new JButton("");
		btnBaixo1.setForeground(Color.RED);
		btnBaixo1.setBackground(Color.LIGHT_GRAY);
		btnBaixo1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBaixo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBaixo1.setText(Jogada());
				posvetor[2][0]="x";
				btnBaixo1.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
		});
		btnBaixo1.setBounds(10, 271, 140, 119);
		frame.getContentPane().add(btnBaixo1);
		
		btnBaixo2 = new JButton("");
		btnBaixo2.setForeground(Color.RED);
		btnBaixo2.setBackground(Color.LIGHT_GRAY);
		btnBaixo2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBaixo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBaixo2.setText(Jogada());
				posvetor[2][1]="x";
				btnBaixo2.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
		});
		btnBaixo2.setBounds(160, 271, 140, 119);
		frame.getContentPane().add(btnBaixo2);	
		btnBaixo3 = new JButton("");
		btnBaixo3.setForeground(Color.RED);
		btnBaixo3.setBackground(Color.LIGHT_GRAY);
		btnBaixo3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBaixo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBaixo3.setText(Jogada());
				posvetor[2][2]="x";
				btnBaixo3.setEnabled(false);
			    Verificapos();
			    JogadorComputadorNivel1(posvetor);
			    VertificaVencedor();
			}
		});
		btnBaixo3.setBounds(310, 271, 140, 119);
		frame.getContentPane().add(btnBaixo3);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
		        Limpaposicoes();
			}
		});
		btnReiniciar.setBounds(185, 401, 89, 23);
		frame.getContentPane().add(btnReiniciar);
		
		JLabel lblNewLabel = new JLabel("Contador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(482, 11, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME X");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(470, 45, 56, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TIME O");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(536, 45, 56, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		ContadorX = new JTextField();
		ContadorX.setEditable(false);
		ContadorX.setBounds(480, 75, 35, 20);
		frame.getContentPane().add(ContadorX);
		ContadorX.setColumns(10);
		
		ContadorO = new JTextField();
		ContadorO.setEditable(false);
		ContadorO.setColumns(10);
		ContadorO.setBounds(546, 75, 35, 20);
		frame.getContentPane().add(ContadorO);
		
		LimparContador = new JButton("Limpar Contador");
		LimparContador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ContadorX.setText("");
			ContadorO.setText("");
			}
		});
		LimparContador.setBounds(480, 367, 112, 23);
		frame.getContentPane().add(LimparContador);
	}
	
	public void desativaButton() 
	   {
		btnTop1.setEnabled(false);
   		btnTop2.setEnabled(false);
   		btnTop3.setEnabled(false);
   		btnMeio1.setEnabled(false);
   		btnMeio2.setEnabled(false);
   	    btnMeio3.setEnabled(false);
		btnBaixo3.setEnabled(false); 
		btnBaixo1.setEnabled(false);
		btnBaixo2.setEnabled(false);
		}
	public String Jogada()
	{
		String valor = "X";
		
		return valor;	
	}
	public void Verificapos(){
	    contpos=0;
	    for(i=0;i<3;i++){
	        for(k=0;k<3;k++){
	          if(posvetor[i][k]=="x"|posvetor[i][k]=="o"){
	             contpos+=1;
	          }
	        }
	    }
	}
	  public void VertificaVencedor(){
	        linha1=posvetor[0][0]+posvetor[0][1]+posvetor[0][2];
	        linha2=posvetor[1][0]+posvetor[1][1]+posvetor[1][2];
	        linha3=posvetor[2][0]+posvetor[2][1]+posvetor[2][2];
	   
	        coluna1=posvetor[0][0]+posvetor[1][0]+posvetor[2][0];
	        coluna2=posvetor[0][1]+posvetor[1][1]+posvetor[2][1];
	        coluna3=posvetor[0][2]+posvetor[1][2]+posvetor[2][2];
	   
	        diagonal1=posvetor[0][0]+posvetor[1][1]+posvetor[2][2];
	        diagonal2=posvetor[0][2]+posvetor[1][1]+posvetor[2][0];
	       
	       if(linha1.equals("xxx")|linha2.equals("xxx")|linha3.equals("xxx")|coluna1.equals("xxx")|coluna2.equals("xxx")|coluna3.equals("xxx")|diagonal1.equals("xxx")|diagonal2.equals("xxx")){
	       JOptionPane.showMessageDialog(null,"O vencedor é o Jogador X");
	       contadorX += 1;
	       ContadorX.setText(Integer.toString(contadorX));
	       desativaButton();
	       Limpaposicoes();
	      
	       }else if(linha1.equals("ooo")|linha2.equals("ooo")|linha3.equals("ooo")|coluna1.equals("ooo")|coluna2.equals("ooo")|coluna3.equals("ooo")|diagonal1.equals("ooo")|diagonal2.equals("ooo")){
	               JOptionPane.showMessageDialog(null,"O vencedor é o Jogador O");
	               contadorO += 1;
	           	   ContadorO.setText(Integer.toString(contadorO));
	               desativaButton();
	               Limpaposicoes();
	       }else if(contpos==9){
	    	   JOptionPane.showMessageDialog(null,"Não Houve Vencedor");
	    	   Limpaposicoes();
	       }
	}
	   public void JogadorComputadorNivel1(String[][]posvetor) {
		   int posicao = rand.nextInt(9);
		   boolean verif = false; 
		   while(verif != true) {
			  
			   if (!(contpos==9))
			   {
				   posicao =  rand.nextInt(9);
				   verif = VerificaEspacoPreenchido(posicao, posvetor);  
			   }
			   else 
			   {
				   verif = true;     
			   }  
		   }
		 }
	   public boolean VerificaEspacoPreenchido(int posicaoMarcada, String [][] posvetor) {
			
			switch(posicaoMarcada){
				case 1: 
				if(posvetor[0][0] == "x" || posvetor[0][0] == "o") {
					return false;
				}
				else {
					posvetor[0][0] = "o";
					btnTop1.setText("o");
					btnTop1.setEnabled(false);
					return true;				
				}
				case 2: 
					if(posvetor[0][1] == "x" || posvetor[0][1] == "o") {
						return false;
						
					}					
					else {
						posvetor[0][1] = "o";
						btnTop2.setText("o");
						btnTop2.setEnabled(false);
						return true;						
					}					
				case 3: 
					if(posvetor[0][2] == "x" || posvetor[0][2] == "o") {
						return false;
					}					
					else {
						posvetor[0][2] = "o";
						btnTop3.setText("o");
						btnTop3.setEnabled(false);
						return true;
					}
				case 4: 
					if(posvetor[1][0] == "x" || posvetor[1][0] == "o") {
						
						return false;
					}
					else {
						posvetor[1][0] = "o";
						btnMeio1.setText("o");
						btnMeio1.setEnabled(false);
						return true;
					}
				case 5: 
					if(posvetor[1][1] == "x" || posvetor[1][1] == "o") {
						return false;
					}	
					else {
						posvetor[1][1] = "o";
						btnMeio2.setText("o");
						btnMeio2.setEnabled(false);
						return true;
					}
				case 6: 
					if(posvetor[1][2] == "x" || posvetor[1][2] == "o") {
						return false;
						
					}
					
					else {
						posvetor[1][2] = "o";
						btnMeio3.setText("o");
						btnMeio3.setEnabled(false);
						return true;
					}
				case 7: 
					if(posvetor[2][0] == "x" || posvetor[2][0] == "o") {
						
						return false;
					}
					
					else {
						posvetor[2][0] = "o";
						btnBaixo1.setText("o");
						btnBaixo1.setEnabled(false);
						return true;
					}
				case 8: 
					if(posvetor[2][1] == "x" || posvetor[2][1] == "o") {
						
						return false;
					}
					
					else {
						posvetor[2][1] = "o";
						btnBaixo2.setText("o");
						btnBaixo2.setEnabled(false);
						return true;
					}
				case 9: 
					if(posvetor[2][2] == "x" || posvetor[2][2] == "o") {
						return false;
					}
					
					else {
						posvetor[2][2] = "o";
						btnBaixo3.setText("o");
						btnBaixo3.setEnabled(false);
						return true;
					}
					default:
						return false;
			}
		}
	   protected void Limpaposicoes(){
		    
		     for(i=0;i<3;i++){
		        for(k=0;k<3;k++){
		            posvetor[i][k]="";
		        }
		     }
	    btnTop1.setText("");
		btnTop1.setEnabled(true);
		btnTop2.setText("");
		btnTop2.setEnabled(true);
		btnTop3.setText("");
		btnTop3.setEnabled(true);
		btnBaixo3.setText("");
		btnBaixo3.setEnabled(true);
		btnBaixo2.setText("");
		btnBaixo2.setEnabled(true);
		btnBaixo1.setText("");
		btnBaixo1.setEnabled(true);
		btnMeio2.setText("");
		btnMeio2.setEnabled(true);
		btnMeio1.setText("");
		btnMeio1.setEnabled(true);
		btnMeio3.setText("");
		btnMeio3.setEnabled(true);
	   }
}
