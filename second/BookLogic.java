package second;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BookLogic extends JFrame {

	private JPanel contentPane;
	private JButton konyvet_letrehoz;
	private JButton kinyitomAKonyvet;
	private JButton lapozokBalraCsokken;
	private JButton LapozokJobbraNo;
	private JButton BezaromAKonyvet;
	private JButton PorgetekBalraCsokken;
	private JButton PorgetekJobbraNo;
	private JButton KonyvreRanezek;
	private JTextField hanyOldalasKonyv;
	private JTextField lapozokBalraSzovegmezo;
	private JTextField lapozokJobbraSzovegmezo;
	private JTextField porgetekBalraSzovegmezo;
	private JTextField porgetekJobbraSzovegmezo;
	private JTextField hanyadikOldalonVanNyitva;
	private JTextField KinyitomAKonyvetRandomOldal;
	private JLabel oldalas;
	
	int konyvOldalam;
	int randomHelyenKinyitottHely;
	int randomPorgetek;
	int randomPorgetesEredmenye;
	int holVagyokNyitva;

	public BookLogic() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		konyvet_letrehoz = new JButton("K\u00F6nyv l\u00E9trehoz\u00E1sa");
		konyvet_letrehoz.setBackground(new Color(245, 245, 245));
		konyvet_letrehoz.setFont(new Font("Times New Roman", Font.BOLD, 15));
		konyvet_letrehoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				konyvOldalam = konyvetLetrehozok();
				hanyOldalasKonyv.setText(Integer.toString(konyvOldalam));
				konyvet_letrehoz.setEnabled(false);
				enable1();
				
			}
		});
		konyvet_letrehoz.setBounds(264, 11, 155, 50);
		contentPane.add(konyvet_letrehoz);
		
		kinyitomAKonyvet = new JButton("Kinyitom a k\u00F6nyvet");
		kinyitomAKonyvet.setEnabled(false);
		kinyitomAKonyvet.setFont(new Font("Times New Roman", Font.BOLD, 15));
		kinyitomAKonyvet.setBackground(new Color(245, 245, 245));
		kinyitomAKonyvet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] konyvem = new int[konyvOldalam];
				randomHelyenKinyitottHely = (int) (Math.random()*konyvem.length+1);
				KinyitomAKonyvetRandomOldal.setText(Integer.toString(randomHelyenKinyitottHely));
				holVagyokNyitva = randomHelyenKinyitottHely;
				kinyitomAKonyvet.setEnabled(false);
				enable3();
				if (holVagyokNyitva == 1) {
					PorgetekBalraCsokken.setEnabled(false);
				}
				if (holVagyokNyitva == konyvOldalam) {
					PorgetekJobbraNo.setEnabled(false);
				}
				
			}
		});
		kinyitomAKonyvet.setBounds(504, 11, 170, 30);
		contentPane.add(kinyitomAKonyvet);
		
		BezaromAKonyvet = new JButton("Bez\u00E1rom a k\u00F6nyvet");
		BezaromAKonyvet.setEnabled(false);
		BezaromAKonyvet.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BezaromAKonyvet.setBackground(new Color(245, 245, 245));
		BezaromAKonyvet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KinyitomAKonyvetRandomOldal.setText(null);
				lapozokBalraSzovegmezo.setText(null);
				lapozokJobbraSzovegmezo.setText(null);
				porgetekBalraSzovegmezo.setText(null);
				porgetekJobbraSzovegmezo.setText(null);
				kinyitomAKonyvet.setEnabled(true);
				hanyOldalasKonyv.setText(null);
				hanyadikOldalonVanNyitva.setText(null);
				disabled();
				
			}
		});
		BezaromAKonyvet.setBounds(504, 320, 170, 30);
		contentPane.add(BezaromAKonyvet);
		
		lapozokBalraCsokken = new JButton("Lapozok balra (-)");
		lapozokBalraCsokken.setEnabled(false);
		lapozokBalraCsokken.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lapozokBalraCsokken.setBackground(new Color(245, 245, 245));
		lapozokBalraCsokken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (holVagyokNyitva > 1 && holVagyokNyitva < konyvOldalam) {
					enable2();
				}
				holVagyokNyitva = holVagyokNyitva-1;
				lapozokBalraSzovegmezo.setText(Integer.toString(holVagyokNyitva));
				lapozokJobbraSzovegmezo.setText(null);
				hanyadikOldalonVanNyitva.setText(null);
				porgetekBalraSzovegmezo.setText(null);
				porgetekJobbraSzovegmezo.setText(null);
				if (holVagyokNyitva == 0) {
					hanyOldalasKonyv.setText(null);
					KinyitomAKonyvetRandomOldal.setText(null);
					lapozokBalraSzovegmezo.setText(null);
					lapozokJobbraSzovegmezo.setText(null);
					porgetekBalraSzovegmezo.setText(null);
					porgetekJobbraSzovegmezo.setText(null);
					disabled();
				}
				if (holVagyokNyitva == 1) {
					PorgetekBalraCsokken.setEnabled(false);
				}
				
			}
		});
		lapozokBalraCsokken.setBounds(10, 127, 160, 30);
		contentPane.add(lapozokBalraCsokken);
		
		LapozokJobbraNo = new JButton("Lapozok jobbra (+)");
		LapozokJobbraNo.setEnabled(false);
		LapozokJobbraNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		LapozokJobbraNo.setBackground(new Color(245, 245, 245));
		LapozokJobbraNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				holVagyokNyitva = holVagyokNyitva+1;
				if (holVagyokNyitva > 1 && holVagyokNyitva < konyvOldalam) {
					enable2();
				}
				lapozokJobbraSzovegmezo.setText(Integer.toString(holVagyokNyitva));
				lapozokBalraSzovegmezo.setText(null);
				porgetekBalraSzovegmezo.setText(null);
				porgetekJobbraSzovegmezo.setText(null);
				hanyadikOldalonVanNyitva.setText(null);
				if (holVagyokNyitva == konyvOldalam) {
					hanyOldalasKonyv.setText(null);
					KinyitomAKonyvetRandomOldal.setText(null);
					lapozokBalraSzovegmezo.setText(null);
					lapozokJobbraSzovegmezo.setText(null);
					porgetekBalraSzovegmezo.setText(null);
					porgetekJobbraSzovegmezo.setText(null);
					disabled();
				}
				
			}
		});
		LapozokJobbraNo.setBounds(10, 188, 160, 30);
		contentPane.add(LapozokJobbraNo);
		
		PorgetekBalraCsokken = new JButton("P\u00F6rgetek balra (-)");
		PorgetekBalraCsokken.setEnabled(false);
		PorgetekBalraCsokken.setFont(new Font("Times New Roman", Font.BOLD, 15));
		PorgetekBalraCsokken.setBackground(new Color(245, 245, 245));
		PorgetekBalraCsokken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (holVagyokNyitva > 1 && holVagyokNyitva < konyvOldalam) {
					enable2();
				}
				do {
					randomPorgetek = (int) (Math.random()*holVagyokNyitva);
				} while (randomPorgetek == 0);
				randomPorgetesEredmenye = holVagyokNyitva-randomPorgetek;
				porgetekBalraSzovegmezo.setText(Integer.toString(randomPorgetesEredmenye));
				holVagyokNyitva = randomPorgetesEredmenye;
				hanyadikOldalonVanNyitva.setText(null);
				lapozokBalraSzovegmezo.setText(null);
				lapozokJobbraSzovegmezo.setText(null);
				porgetekJobbraSzovegmezo.setText(null);
				if (holVagyokNyitva == 1) {
					PorgetekBalraCsokken.setEnabled(false);
				}
				
			}
		});
		PorgetekBalraCsokken.setBounds(10, 249, 165, 30);
		contentPane.add(PorgetekBalraCsokken);
		
		PorgetekJobbraNo = new JButton("P\u00F6rgetek jobbra (+)");
		PorgetekJobbraNo.setEnabled(false);
		PorgetekJobbraNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		PorgetekJobbraNo.setBackground(new Color(245, 245, 245));
		PorgetekJobbraNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do {
					randomPorgetek = (int) (Math.random()*(konyvOldalam-holVagyokNyitva));
				} while (randomPorgetek == 0);
				randomPorgetesEredmenye = randomPorgetek+holVagyokNyitva;
				porgetekJobbraSzovegmezo.setText(Integer.toString(randomPorgetesEredmenye));
				holVagyokNyitva = randomPorgetesEredmenye;
				if (holVagyokNyitva > 1 && holVagyokNyitva < konyvOldalam) {
					enable2();
				}
				hanyadikOldalonVanNyitva.setText(null);
				lapozokBalraSzovegmezo.setText(null);
				lapozokJobbraSzovegmezo.setText(null);
				porgetekBalraSzovegmezo.setText(null);
				if (holVagyokNyitva == konyvOldalam-1) {
					PorgetekJobbraNo.setEnabled(false);
				}
				
			}
		});
		PorgetekJobbraNo.setBounds(10, 310, 165, 30);
		contentPane.add(PorgetekJobbraNo);
		
		KonyvreRanezek = new JButton("K\u00F6nyvre r\u00E1n\u00E9zek");
		KonyvreRanezek.setEnabled(false);
		KonyvreRanezek.setFont(new Font("Times New Roman", Font.BOLD, 15));
		KonyvreRanezek.setBackground(new Color(245, 245, 245));
		KonyvreRanezek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hanyadikOldalonVanNyitva.setText(Integer.toString(holVagyokNyitva));
				
			}
		});
		KonyvreRanezek.setBounds(504, 169, 170, 30);
		contentPane.add(KonyvreRanezek);
		
		oldalas = new JLabel("oldalas");
		oldalas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		oldalas.setBounds(378, 81, 68, 32);
		contentPane.add(oldalas);
		
		hanyOldalasKonyv = new JTextField();
		hanyOldalasKonyv.setFont(new Font("Arial", Font.BOLD, 25));
		hanyOldalasKonyv.setHorizontalAlignment(SwingConstants.CENTER);
		hanyOldalasKonyv.setBackground(new Color(255, 248, 220));
		hanyOldalasKonyv.setEditable(false);
		hanyOldalasKonyv.setBounds(317, 72, 50, 50);
		contentPane.add(hanyOldalasKonyv);
		hanyOldalasKonyv.setColumns(10);
		
		lapozokBalraSzovegmezo = new JTextField();
		lapozokBalraSzovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		lapozokBalraSzovegmezo.setFont(new Font("Arial", Font.BOLD, 25));
		lapozokBalraSzovegmezo.setEditable(false);
		lapozokBalraSzovegmezo.setColumns(10);
		lapozokBalraSzovegmezo.setBackground(new Color(255, 248, 220));
		lapozokBalraSzovegmezo.setBounds(185, 115, 50, 50);
		contentPane.add(lapozokBalraSzovegmezo);
		
		lapozokJobbraSzovegmezo = new JTextField();
		lapozokJobbraSzovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		lapozokJobbraSzovegmezo.setFont(new Font("Arial", Font.BOLD, 25));
		lapozokJobbraSzovegmezo.setEditable(false);
		lapozokJobbraSzovegmezo.setColumns(10);
		lapozokJobbraSzovegmezo.setBackground(new Color(255, 248, 220));
		lapozokJobbraSzovegmezo.setBounds(185, 175, 50, 50);
		contentPane.add(lapozokJobbraSzovegmezo);
		
		porgetekBalraSzovegmezo = new JTextField();
		porgetekBalraSzovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		porgetekBalraSzovegmezo.setFont(new Font("Arial", Font.BOLD, 25));
		porgetekBalraSzovegmezo.setEditable(false);
		porgetekBalraSzovegmezo.setColumns(10);
		porgetekBalraSzovegmezo.setBackground(new Color(255, 248, 220));
		porgetekBalraSzovegmezo.setBounds(185, 236, 50, 50);
		contentPane.add(porgetekBalraSzovegmezo);
		
		porgetekJobbraSzovegmezo = new JTextField();
		porgetekJobbraSzovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		porgetekJobbraSzovegmezo.setFont(new Font("Arial", Font.BOLD, 25));
		porgetekJobbraSzovegmezo.setEditable(false);
		porgetekJobbraSzovegmezo.setColumns(10);
		porgetekJobbraSzovegmezo.setBackground(new Color(255, 248, 220));
		porgetekJobbraSzovegmezo.setBounds(185, 300, 50, 50);
		contentPane.add(porgetekJobbraSzovegmezo);
		
		hanyadikOldalonVanNyitva = new JTextField();
		hanyadikOldalonVanNyitva.setHorizontalAlignment(SwingConstants.CENTER);
		hanyadikOldalonVanNyitva.setFont(new Font("Arial", Font.BOLD, 25));
		hanyadikOldalonVanNyitva.setEditable(false);
		hanyadikOldalonVanNyitva.setColumns(10);
		hanyadikOldalonVanNyitva.setBackground(new Color(255, 248, 220));
		hanyadikOldalonVanNyitva.setBounds(564, 210, 50, 50);
		contentPane.add(hanyadikOldalonVanNyitva);
		
		KinyitomAKonyvetRandomOldal = new JTextField();
		KinyitomAKonyvetRandomOldal.setHorizontalAlignment(SwingConstants.CENTER);
		KinyitomAKonyvetRandomOldal.setFont(new Font("Arial", Font.BOLD, 25));
		KinyitomAKonyvetRandomOldal.setEditable(false);
		KinyitomAKonyvetRandomOldal.setColumns(10);
		KinyitomAKonyvetRandomOldal.setBackground(new Color(255, 248, 220));
		KinyitomAKonyvetRandomOldal.setBounds(564, 52, 50, 50);
		contentPane.add(KinyitomAKonyvetRandomOldal);
		
		JButton bezaromAProgramot = new JButton("PROGRAM BEZ\u00C1R\u00C1SA");
		bezaromAProgramot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		bezaromAProgramot.setForeground(Color.WHITE);
		bezaromAProgramot.setBackground(Color.BLACK);
		bezaromAProgramot.setFont(new Font("Arial", Font.BOLD, 11));
		bezaromAProgramot.setBounds(10, 11, 155, 25);
		contentPane.add(bezaromAProgramot);
		
		JLabel lblOldal = new JLabel("oldal");
		lblOldal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOldal.setBounds(624, 60, 55, 30);
		contentPane.add(lblOldal);
		
		JLabel label = new JLabel("oldal");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(619, 220, 55, 30);
		contentPane.add(label);
		
		repaint();
		validate();
	}
	
	public int konyvetLetrehozok() {
		int x;
		do {
			x = (int) (Math.random()*150+1);
		} while (x<50);
		
		return x;
	}
	
	public void enable1() {
		kinyitomAKonyvet.setEnabled(true);
		
	}
	
	public void enable2() {
		lapozokBalraCsokken.setEnabled(true);
		LapozokJobbraNo.setEnabled(true);
		PorgetekBalraCsokken.setEnabled(true);
		PorgetekJobbraNo.setEnabled(true);
		
	}
	
	public void enable3() {
		lapozokBalraCsokken.setEnabled(true);
		LapozokJobbraNo.setEnabled(true);
		BezaromAKonyvet.setEnabled(true);
		PorgetekBalraCsokken.setEnabled(true);
		PorgetekJobbraNo.setEnabled(true);
		KonyvreRanezek.setEnabled(true);
		
	}
	
	public void disabled() {
		kinyitomAKonyvet.setEnabled(false);
		lapozokBalraCsokken.setEnabled(false);
		LapozokJobbraNo.setEnabled(false);
		BezaromAKonyvet.setEnabled(false);
		PorgetekBalraCsokken.setEnabled(false);
		PorgetekJobbraNo.setEnabled(false);
		KonyvreRanezek.setEnabled(false);
		konyvet_letrehoz.setEnabled(true);
		
	}
}
