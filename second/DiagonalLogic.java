package second;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DiagonalLogic extends JFrame {

	private JPanel contentPane;
	JTextField osszesMezo[][] = new JTextField[25][25];
	int[][] tomb_osszesMezo = new int[5][5];
	int random;
	
	private JTextField balOldal_1;
	private JTextField balOldal_2;
	private JTextField balOldal_3;
	private JTextField balOldal_4;
	private JTextField balOldal_5;
	private JTextField jobbOldal_1;
	private JTextField jobbOldal_2;
	private JTextField jobbOldal_3;
	private JTextField jobbOldal_4;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JButton kiszamolX;
	private JButton generalX;
	private JLabel lblGenerls;
	private JLabel lblKiszmols;
	private JPanel panel;

	public DiagonalLogic() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(117, 105, 250, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		generalX = new JButton("");
		generalX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				general();
				
			}
		});
		generalX.setFont(new Font("Arial Black", Font.BOLD, 8));
		generalX.setBackground(Color.BLACK);
		generalX.setBounds(122, 18, 25, 25);
		contentPane.add(generalX);
		
		balOldal_1 = new JTextField();
		balOldal_1.setFont(new Font("Arial", Font.BOLD, 20));
		balOldal_1.setHorizontalAlignment(SwingConstants.CENTER);
		balOldal_1.setBackground(new Color(255, 255, 224));
		balOldal_1.setEditable(false);
		balOldal_1.setBounds(117, 385, 50, 50);
		contentPane.add(balOldal_1);
		balOldal_1.setColumns(10);
		
		balOldal_2 = new JTextField();
		balOldal_2.setFont(new Font("Arial", Font.BOLD, 20));
		balOldal_2.setHorizontalAlignment(SwingConstants.CENTER);
		balOldal_2.setBackground(new Color(255, 255, 224));
		balOldal_2.setEditable(false);
		balOldal_2.setColumns(10);
		balOldal_2.setBounds(167, 385, 50, 50);
		contentPane.add(balOldal_2);
		
		balOldal_3 = new JTextField();
		balOldal_3.setFont(new Font("Arial", Font.BOLD, 20));
		balOldal_3.setHorizontalAlignment(SwingConstants.CENTER);
		balOldal_3.setBackground(new Color(255, 255, 224));
		balOldal_3.setEditable(false);
		balOldal_3.setColumns(10);
		balOldal_3.setBounds(217, 385, 50, 50);
		contentPane.add(balOldal_3);
		
		balOldal_4 = new JTextField();
		balOldal_4.setFont(new Font("Arial", Font.BOLD, 20));
		balOldal_4.setHorizontalAlignment(SwingConstants.CENTER);
		balOldal_4.setBackground(new Color(255, 255, 224));
		balOldal_4.setEditable(false);
		balOldal_4.setColumns(10);
		balOldal_4.setBounds(267, 385, 50, 50);
		contentPane.add(balOldal_4);
		
		balOldal_5 = new JTextField();
		balOldal_5.setFont(new Font("Arial", Font.BOLD, 20));
		balOldal_5.setHorizontalAlignment(SwingConstants.CENTER);
		balOldal_5.setBackground(new Color(255, 255, 224));
		balOldal_5.setEditable(false);
		balOldal_5.setColumns(10);
		balOldal_5.setBounds(317, 385, 50, 50);
		contentPane.add(balOldal_5);
		
		jobbOldal_1 = new JTextField();
		jobbOldal_1.setFont(new Font("Arial", Font.BOLD, 20));
		jobbOldal_1.setHorizontalAlignment(SwingConstants.CENTER);
		jobbOldal_1.setEditable(false);
		jobbOldal_1.setColumns(10);
		jobbOldal_1.setBackground(new Color(255, 255, 224));
		jobbOldal_1.setBounds(397, 105, 50, 50);
		contentPane.add(jobbOldal_1);
		
		jobbOldal_2 = new JTextField();
		jobbOldal_2.setFont(new Font("Arial", Font.BOLD, 20));
		jobbOldal_2.setHorizontalAlignment(SwingConstants.CENTER);
		jobbOldal_2.setEditable(false);
		jobbOldal_2.setColumns(10);
		jobbOldal_2.setBackground(new Color(255, 255, 224));
		jobbOldal_2.setBounds(397, 155, 50, 50);
		contentPane.add(jobbOldal_2);
		
		jobbOldal_3 = new JTextField();
		jobbOldal_3.setFont(new Font("Arial", Font.BOLD, 20));
		jobbOldal_3.setHorizontalAlignment(SwingConstants.CENTER);
		jobbOldal_3.setEditable(false);
		jobbOldal_3.setColumns(10);
		jobbOldal_3.setBackground(new Color(255, 255, 224));
		jobbOldal_3.setBounds(397, 205, 50, 50);
		contentPane.add(jobbOldal_3);
		
		jobbOldal_4 = new JTextField();
		jobbOldal_4.setFont(new Font("Arial", Font.BOLD, 20));
		jobbOldal_4.setHorizontalAlignment(SwingConstants.CENTER);
		jobbOldal_4.setEditable(false);
		jobbOldal_4.setColumns(10);
		jobbOldal_4.setBackground(new Color(255, 255, 224));
		jobbOldal_4.setBounds(397, 255, 50, 50);
		contentPane.add(jobbOldal_4);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("\u2193");
		textField_9.setBounds(127, 355, 30, 30);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setText("\u2193");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(177, 355, 30, 30);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setText("\u2193");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(227, 355, 30, 30);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setText("\u2193");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(277, 355, 30, 30);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setText("\u2193");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(326, 355, 30, 30);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("\u2192");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(367, 264, 30, 30);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("\u2192");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(367, 216, 30, 30);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("\u2192");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(367, 166, 30, 30);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("\u2192");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(367, 114, 30, 30);
		contentPane.add(textField_17);
		
		kiszamolX = new JButton("");
		kiszamolX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kiszamol();
				
			}
		});
		kiszamolX.setFont(new Font("Arial Black", Font.BOLD, 8));
		kiszamolX.setBackground(Color.BLACK);
		kiszamolX.setBounds(122, 60, 25, 25);
		contentPane.add(kiszamolX);
		
		lblGenerls = new JLabel("GENER\u00C1L\u00C1S:");
		lblGenerls.setFont(new Font("Constantia", Font.BOLD, 15));
		lblGenerls.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerls.setBounds(10, 12, 110, 40);
		contentPane.add(lblGenerls);
		
		lblKiszmols = new JLabel("KISZ\u00C1MOL\u00C1S:");
		lblKiszmols.setHorizontalAlignment(SwingConstants.CENTER);
		lblKiszmols.setFont(new Font("Constantia", Font.BOLD, 15));
		lblKiszmols.setBounds(10, 54, 110, 40);
		contentPane.add(lblKiszmols);
		setLocationRelativeTo(null);
		
		repaint();
		validate();
		kirajzol();
		
	}
	
	public void kirajzol() {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				JTextField mezok = new JTextField();
				mezok.setBounds(50*i, 50*j, 50, 50);
				if ((i+j)%2 == 0) {
					mezok.setBackground(Color.BLACK);
					mezok.setEditable(false);
				} else {
					mezok.setBackground(Color.WHITE);
					mezok.setEditable(false);
				}
				panel.add(mezok);
				osszesMezo[i][j] = mezok;
			}
		}
		repaint();
		general();
	}
	
	public void general() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				random = (int) (Math.random()*100)+1;
				tomb_osszesMezo[i][j] = random;
				if ((i+j)%2 == 0) {
					osszesMezo[i][j].setText(Integer.toString(random));
					osszesMezo[i][j].setFont(new Font("Times New Roman", Font.BOLD, 25));
					osszesMezo[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					osszesMezo[i][j].setForeground(Color.WHITE);
				} else {
					osszesMezo[i][j].setText(Integer.toString(random));
					osszesMezo[i][j].setFont(new Font("Times New Roman", Font.BOLD, 25));
					osszesMezo[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					osszesMezo[i][j].setForeground(Color.BLACK);
				}
			}
		}
		
		repaint();
		
	}
	
	public void kiszamol() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 0; j++) {
				
			}
		}
		
	}
	
}
