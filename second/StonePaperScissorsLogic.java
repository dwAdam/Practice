package second;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;

public class StonePaperScissorsLogic extends JFrame {

	private JPanel contentPane;
	private JButton gepKo1;
	private JButton gepPapir2;
	private JButton gepOllo3;
	private JButton enyemOllo3;
	private JButton enyemPapir2;
	private JButton enyemKo1;
	private JTextField uzenetek;
	private JTextField enyemPontok;
	private JTextField gepPontok;
	
	int enyemPont = 0;
	int gepPont = 0;
	int gepValasztasa;

	public StonePaperScissorsLogic() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		enyemKo1 = new JButton("STONE");
		enyemKo1.setBackground(Color.WHITE);
		enyemKo1.setForeground(Color.BLACK);
		enyemKo1.setFont(new Font("Constantia", Font.BOLD, 14));
		enyemKo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enyemKo1.setBackground(Color.WHITE);
				gepKo1.setBackground(Color.WHITE);
				gepPapir2.setBackground(Color.WHITE);
				enyemPapir2.setBackground(Color.WHITE);
				gepOllo3.setBackground(Color.WHITE);
				enyemOllo3.setBackground(Color.WHITE);
				gepValasztasa = gepValaszt();
				if (gepValasztasa == 1) {
					uzenetek.setText("Draw!");
					gepKo1.setBackground(Color.YELLOW);
					enyemKo1.setBackground(Color.YELLOW);
				}
				if (gepValasztasa == 2) {
					uzenetek.setText("Lose!");
					gepPont++;
					gepPontok.setText(Integer.toString(gepPont));
					gepPapir2.setBackground(Color.GREEN);
					enyemKo1.setBackground(Color.RED);
				}
				if (gepValasztasa == 3) {
					uzenetek.setText("Win!");
					enyemPont++;
					enyemPontok.setText(Integer.toString(enyemPont));
					gepOllo3.setBackground(Color.RED);
					enyemKo1.setBackground(Color.GREEN);
				}
			}
		});
		enyemKo1.setBounds(10, 11, 100, 50);
		contentPane.add(enyemKo1);
		
		enyemPapir2 = new JButton("PAPER");
		enyemPapir2.setBackground(Color.WHITE);
		enyemPapir2.setForeground(Color.BLACK);
		enyemPapir2.setFont(new Font("Constantia", Font.BOLD, 14));
		enyemPapir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enyemKo1.setBackground(Color.WHITE);
				gepKo1.setBackground(Color.WHITE);
				gepPapir2.setBackground(Color.WHITE);
				enyemPapir2.setBackground(Color.WHITE);
				gepOllo3.setBackground(Color.WHITE);
				enyemOllo3.setBackground(Color.WHITE);
				gepValasztasa = gepValaszt();
				if (gepValasztasa == 1) {
					uzenetek.setText("Win!");
					enyemPont++;
					enyemPontok.setText(Integer.toString(enyemPont));
					gepKo1.setBackground(Color.RED);
					enyemPapir2.setBackground(Color.GREEN);
				}
				if (gepValasztasa == 2) {
					uzenetek.setText("Draw!");
					gepPapir2.setBackground(Color.YELLOW);
					enyemPapir2.setBackground(Color.YELLOW);
				}
				if (gepValasztasa == 3) {
					uzenetek.setText("Lose!");
					gepPont++;
					gepPontok.setText(Integer.toString(gepPont));
					enyemPapir2.setBackground(Color.RED);
					gepOllo3.setBackground(Color.GREEN);
				}
			}
		});
		enyemPapir2.setBounds(10, 72, 100, 50);
		contentPane.add(enyemPapir2);
		
		enyemOllo3 = new JButton("SCISSORS");
		enyemOllo3.setBackground(Color.WHITE);
		enyemOllo3.setForeground(Color.BLACK);
		enyemOllo3.setFont(new Font("Constantia", Font.BOLD, 14));
		enyemOllo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enyemKo1.setBackground(Color.WHITE);
				gepKo1.setBackground(Color.WHITE);
				gepPapir2.setBackground(Color.WHITE);
				enyemPapir2.setBackground(Color.WHITE);
				gepOllo3.setBackground(Color.WHITE);
				enyemOllo3.setBackground(Color.WHITE);
				gepValasztasa = gepValaszt();
				if (gepValasztasa == 1) {
					uzenetek.setText("Lose!");
					gepPont++;
					gepPontok.setText(Integer.toString(gepPont));
					enyemOllo3.setBackground(Color.RED);
					gepKo1.setBackground(Color.GREEN);
				}
				if (gepValasztasa == 2) {
					uzenetek.setText("Win!");
					enyemPont++;
					enyemPontok.setText(Integer.toString(enyemPont));
					gepPapir2.setBackground(Color.RED);
					enyemOllo3.setBackground(Color.GREEN);
				}
				if (gepValasztasa == 3) {
					uzenetek.setText("Draw!");
					gepOllo3.setBackground(Color.YELLOW);
					enyemOllo3.setBackground(Color.YELLOW);
				}
			}
		});
		enyemOllo3.setBounds(10, 133, 100, 50);
		contentPane.add(enyemOllo3);
		
		gepKo1 = new JButton("STONE");
		gepKo1.setBackground(Color.WHITE);
		gepKo1.setForeground(Color.BLACK);
		gepKo1.setFont(new Font("Constantia", Font.BOLD, 14));
		gepKo1.setEnabled(false);
		gepKo1.setBounds(474, 11, 100, 50);
		contentPane.add(gepKo1);
		
		gepPapir2 = new JButton("PAPER");
		gepPapir2.setBackground(Color.WHITE);
		gepPapir2.setForeground(Color.BLACK);
		gepPapir2.setFont(new Font("Constantia", Font.BOLD, 14));
		gepPapir2.setEnabled(false);
		gepPapir2.setBounds(474, 72, 100, 50);
		contentPane.add(gepPapir2);
		
		gepOllo3 = new JButton("SCISSORS");
		gepOllo3.setBackground(Color.WHITE);
		gepOllo3.setForeground(Color.BLACK);
		gepOllo3.setFont(new Font("Constantia", Font.BOLD, 14));
		gepOllo3.setEnabled(false);
		gepOllo3.setBounds(474, 133, 100, 50);
		contentPane.add(gepOllo3);
		
		uzenetek = new JTextField();
		uzenetek.setHorizontalAlignment(SwingConstants.CENTER);
		uzenetek.setEditable(false);
		uzenetek.setFont(new Font("Arial", Font.BOLD, 25));
		uzenetek.setBackground(new Color(255, 239, 213));
		uzenetek.setForeground(Color.BLACK);
		uzenetek.setBounds(192, 142, 183, 77);
		contentPane.add(uzenetek);
		uzenetek.setColumns(10);
		
		JLabel pontokSzovegmezo1 = new JLabel("Points:");
		pontokSzovegmezo1.setFont(new Font("Arial", Font.BOLD, 20));
		pontokSzovegmezo1.setHorizontalAlignment(SwingConstants.CENTER);
		pontokSzovegmezo1.setBounds(10, 215, 100, 30);
		contentPane.add(pontokSzovegmezo1);
		
		JLabel pontokSzovegmezo2 = new JLabel("Points:");
		pontokSzovegmezo2.setFont(new Font("Arial", Font.BOLD, 20));
		pontokSzovegmezo2.setHorizontalAlignment(SwingConstants.CENTER);
		pontokSzovegmezo2.setBounds(474, 215, 100, 30);
		contentPane.add(pontokSzovegmezo2);
		
		enyemPontok = new JTextField();
		enyemPontok.setFont(new Font("Times New Roman", Font.BOLD, 25));
		enyemPontok.setHorizontalAlignment(SwingConstants.CENTER);
		enyemPontok.setEditable(false);
		enyemPontok.setBounds(10, 250, 100, 100);
		contentPane.add(enyemPontok);
		enyemPontok.setColumns(10);
		
		gepPontok = new JTextField();
		gepPontok.setFont(new Font("Times New Roman", Font.BOLD, 25));
		gepPontok.setHorizontalAlignment(SwingConstants.CENTER);
		gepPontok.setEditable(false);
		gepPontok.setColumns(10);
		gepPontok.setBounds(474, 250, 100, 100);
		contentPane.add(gepPontok);
		
		repaint();
		validate();
	}
	
	public static int gepValaszt() {
		int x = (int) (Math.random()*3+1);
		return x;
	}
}
