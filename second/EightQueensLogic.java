
package second;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EightQueensLogic extends JFrame {
	
	private JPanel contentPane;
	JPanel mezok[][] = new JPanel[50][50];
	int[] megoldas = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

	public EightQueensLogic() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(79, 68, 520, 520);
		contentPane.add(panel);
		panel.setLayout(null);
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				JPanel mezo = new JPanel();
				mezo.setBounds(20*i, 20*j, 20, 20);
				if ((i+j)%2 == 0) {
					mezo.setBackground(Color.BLACK);
				} else {
					mezo.setBackground(Color.WHITE);
				}
				panel.add(mezo);
				mezok[i][j] = mezo;
			}
		}
		validate();
		repaint();
		backtrack();
	}
	
	private void backtrack() {
		int oszlop = 0;
		int szamlalo = 0;
		while (oszlop>-1 && oszlop<26) {
			megoldas[oszlop]++;
			if (megoldas[oszlop]>25) {
				megoldas[oszlop]=-1;
				oszlop--;
			} else {
				if (johely(oszlop)) {
					oszlop++;
				}
				kirajzol();
				
				if (oszlop == 26) {
					oszlop--;
					szamlalo++;
					System.out.println(szamlalo+". megoldas:");
					for (int i = 0; i < megoldas.length; i++) {
						System.out.print(megoldas[i] + ", ");
					}
					System.out.println();
					try {
						Thread.sleep(0);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (szamlalo == 500) {
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
				//megoldas vizsgalat
				
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void kirajzol() {
		for (int i = 0; i < megoldas.length; i++) {
			for (int j = 0; j < megoldas.length; j++) {
				if ((i+j)%2 == 0) {
					mezok[i][j].setBackground(Color.BLACK);
				} else {
					mezok[i][j].setBackground(Color.WHITE);
				}
			}
		}
		for (int i = 0; i < megoldas.length; i++) {
			if (megoldas[i]>-1) {
				mezok[i][megoldas[i]].setBackground(Color.RED);
			}
		}
	}
	
	private boolean johely(int oszlop) {
		boolean johely = true;
		
		for (int i = 0; i < oszlop; i++) {
			if (megoldas[i] == megoldas[oszlop]) {
				return false;
			}
		}
		
		int x = oszlop;
		int y = megoldas[oszlop];
		
		for (int i = 0; i < oszlop; i++) {
			int x2 = i;
			int y2 = megoldas[i];
			if (Math.abs(x2-x)==Math.abs(y2-y)) {
				return false;
			}
		}
		
		return johely;
	}

}
