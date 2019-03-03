package second;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.UIManager;

public class CoffeeMachineLogic extends JFrame {

	private JPanel contentPane;
	private JTextField viz1;
	private JTextField viz2;
	private JTextField viz3;
	private JTextField viz4;
	private JTextField viz5;
	private JTextField viz6;
	private JTextField viz7;
	private JTextField viz8;
	private JTextField viz9;
	private JTextField viz10;
	private JTextField kave1;
	private JTextField kave2;
	private JTextField kave3;
	private JTextField kave4;
	private JTextField kave5;
	private JTextField kave6;
	private JLabel alapTöltésSzoveg;
	private JButton vizFeltoltGomb;
	private JButton kaveFeltoltGomb;
	private JButton kaveFozes_BUTTON;
	private JButton kostol_BUTTON;
	private JButton dropCoffee;
	private JTextField kaveViz_Adagmegadas;
	private JTextField alaptoltesSzovegmezo;
	private JTextField hasznaltKave_1;
	private JTextField hasznaltKave_2;
	private JTextField hasznaltKave_3;
	private JTextField hasznaltKave_4;
	private JTextField hasznaltKave_5;
	private JTextField hasznaltKave_6;
	private JEditorPane editorPane_2;
	private JTextField fozes_vizAdagmegadas;
	private JTextField fozes_kaveAdagmegadas;
	private JTextField kostol_szovegmezo;
	private JEditorPane editorPane_3;
	private JEditorPane editorPane_4;
	private JTextField makeCoffee_szovegmezo;
	
	int beirtVizAdag;
	int beirtKaveAdag;
	int  kaveAdag = 0;
	int  vizAdag = 0;
	int fozesAdag_kave = 0;
	int fozesAdag_viz = 0;
	int lefozottKave = 0;
	int tasteCoffee = 0;
	int tasteWater = 0;
	
	
	public CoffeeMachineLogic() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		viz1 = new JTextField();
		viz1.setBackground(Color.WHITE);
		viz1.setText("1");
		viz1.setHorizontalAlignment(SwingConstants.CENTER);
		viz1.setEditable(false);
		viz1.setBounds(800, 360, 30, 30);
		contentPane.add(viz1);
		viz1.setColumns(10);
		
		viz2 = new JTextField();
		viz2.setBackground(Color.WHITE);
		viz2.setText("2");
		viz2.setHorizontalAlignment(SwingConstants.CENTER);
		viz2.setEditable(false);
		viz2.setColumns(10);
		viz2.setBounds(800, 330, 30, 30);
		contentPane.add(viz2);
		
		viz3 = new JTextField();
		viz3.setBackground(Color.WHITE);
		viz3.setText("3");
		viz3.setHorizontalAlignment(SwingConstants.CENTER);
		viz3.setEditable(false);
		viz3.setColumns(10);
		viz3.setBounds(800, 300, 30, 30);
		contentPane.add(viz3);
		
		viz4 = new JTextField();
		viz4.setBackground(Color.WHITE);
		viz4.setText("4");
		viz4.setHorizontalAlignment(SwingConstants.CENTER);
		viz4.setEditable(false);
		viz4.setColumns(10);
		viz4.setBounds(800, 270, 30, 30);
		contentPane.add(viz4);
		
		viz5 = new JTextField();
		viz5.setBackground(Color.WHITE);
		viz5.setText("5");
		viz5.setHorizontalAlignment(SwingConstants.CENTER);
		viz5.setEditable(false);
		viz5.setColumns(10);
		viz5.setBounds(800, 240, 30, 30);
		contentPane.add(viz5);
		
		viz6 = new JTextField();
		viz6.setBackground(Color.WHITE);
		viz6.setText("6");
		viz6.setHorizontalAlignment(SwingConstants.CENTER);
		viz6.setEditable(false);
		viz6.setColumns(10);
		viz6.setBounds(800, 210, 30, 30);
		contentPane.add(viz6);
		
		viz7 = new JTextField();
		viz7.setBackground(Color.WHITE);
		viz7.setText("7");
		viz7.setHorizontalAlignment(SwingConstants.CENTER);
		viz7.setEditable(false);
		viz7.setColumns(10);
		viz7.setBounds(800, 180, 30, 30);
		contentPane.add(viz7);
		
		viz8 = new JTextField();
		viz8.setBackground(Color.WHITE);
		viz8.setText("8");
		viz8.setHorizontalAlignment(SwingConstants.CENTER);
		viz8.setEditable(false);
		viz8.setColumns(10);
		viz8.setBounds(800, 150, 30, 30);
		contentPane.add(viz8);
		
		viz9 = new JTextField();
		viz9.setBackground(Color.WHITE);
		viz9.setText("9");
		viz9.setHorizontalAlignment(SwingConstants.CENTER);
		viz9.setEditable(false);
		viz9.setColumns(10);
		viz9.setBounds(800, 120, 30, 30);
		contentPane.add(viz9);
		
		viz10 = new JTextField();
		viz10.setBackground(Color.WHITE);
		viz10.setText("10");
		viz10.setHorizontalAlignment(SwingConstants.CENTER);
		viz10.setEditable(false);
		viz10.setColumns(10);
		viz10.setBounds(800, 90, 30, 30);
		contentPane.add(viz10);
		
		kave1 = new JTextField();
		kave1.setBackground(Color.WHITE);
		kave1.setHorizontalAlignment(SwingConstants.CENTER);
		kave1.setText("1");
		kave1.setEditable(false);
		kave1.setColumns(10);
		kave1.setBounds(600, 360, 30, 30);
		contentPane.add(kave1);
		
		kave2 = new JTextField();
		kave2.setBackground(Color.WHITE);
		kave2.setText("2");
		kave2.setHorizontalAlignment(SwingConstants.CENTER);
		kave2.setEditable(false);
		kave2.setColumns(10);
		kave2.setBounds(600, 330, 30, 30);
		contentPane.add(kave2);
		
		kave3 = new JTextField();
		kave3.setBackground(Color.WHITE);
		kave3.setText("3");
		kave3.setHorizontalAlignment(SwingConstants.CENTER);
		kave3.setEditable(false);
		kave3.setColumns(10);
		kave3.setBounds(600, 300, 30, 30);
		contentPane.add(kave3);
		
		kave4 = new JTextField();
		kave4.setBackground(Color.WHITE);
		kave4.setText("4");
		kave4.setHorizontalAlignment(SwingConstants.CENTER);
		kave4.setEditable(false);
		kave4.setColumns(10);
		kave4.setBounds(600, 270, 30, 30);
		contentPane.add(kave4);
		
		kave5 = new JTextField();
		kave5.setBackground(Color.WHITE);
		kave5.setText("5");
		kave5.setHorizontalAlignment(SwingConstants.CENTER);
		kave5.setEditable(false);
		kave5.setColumns(10);
		kave5.setBounds(600, 240, 30, 30);
		contentPane.add(kave5);
		
		kave6 = new JTextField();
		kave6.setBackground(Color.WHITE);
		kave6.setText("6");
		kave6.setHorizontalAlignment(SwingConstants.CENTER);
		kave6.setEditable(false);
		kave6.setColumns(10);
		kave6.setBounds(600, 210, 30, 30);
		contentPane.add(kave6);
		
		makeCoffee_szovegmezo = new JTextField();
		makeCoffee_szovegmezo.setForeground(new Color(160, 82, 45));
		makeCoffee_szovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		makeCoffee_szovegmezo.setFont(new Font("Arial", Font.BOLD, 15));
		makeCoffee_szovegmezo.setEditable(false);
		makeCoffee_szovegmezo.setColumns(10);
		makeCoffee_szovegmezo.setBounds(110, 111, 200, 30);
		contentPane.add(makeCoffee_szovegmezo);
		
		JLabel lblVz = new JLabel("WATER");
		lblVz.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblVz.setHorizontalAlignment(SwingConstants.CENTER);
		lblVz.setBounds(780, 60, 65, 30);
		contentPane.add(lblVz);
		
		JLabel lblKv = new JLabel("COFFEE");
		lblKv.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblKv.setHorizontalAlignment(SwingConstants.CENTER);
		lblKv.setBounds(590, 180, 50, 30);
		contentPane.add(lblKv);
		
		JButton fozes_vizAdag_Button = new JButton("WATER DOSE");
		fozes_vizAdag_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (fozes_vizAdagmegadas.getText().equals("") || (Integer.parseInt(fozes_vizAdagmegadas.getText()) > vizAdag) || (Integer.parseInt(fozes_vizAdagmegadas.getText()) <= 0)) {
					fozes_vizAdagmegadas.setText(null);
					fozes_vizAdagmegadas.setBackground(Color.RED);
				} else {
					fozesAdag_viz = Integer.parseInt(fozes_vizAdagmegadas.getText());
					if (vizAdag >= fozesAdag_viz) {
						vizAdag = vizAdag - fozesAdag_viz;
						vizzelFeltolt();
						fozes_vizAdagmegadas.setBackground(Color.GREEN);
						fozes_vizAdag_Button.setEnabled(false);
						fozes_vizAdagmegadas.setEditable(false);
						if (fozesAdag_viz > 0) {
							vizFeltoltGomb.setEnabled(true);
						}
					}	
				}
				
			}
		});
		fozes_vizAdag_Button.setBackground(new Color(135, 206, 235));
		fozes_vizAdag_Button.setFont(new Font("Century Gothic", Font.BOLD, 13));
		fozes_vizAdag_Button.setBounds(110, 198, 125, 30);
		contentPane.add(fozes_vizAdag_Button);
		
		JButton fozes_kaveAdag_Button = new JButton("COFFEE DOSE");
		fozes_kaveAdag_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (fozes_kaveAdagmegadas.getText().equals("") || (Integer.parseInt(fozes_kaveAdagmegadas.getText()) > kaveAdag) || (Integer.parseInt(fozes_kaveAdagmegadas.getText()) <= 0)) {
					fozes_kaveAdagmegadas.setText(null);
					fozes_kaveAdagmegadas.setBackground(Color.RED);
				} else {
					fozesAdag_kave = Integer.parseInt(fozes_kaveAdagmegadas.getText());
					if (kaveAdag >= fozesAdag_kave) {
						kaveAdag = kaveAdag - fozesAdag_kave;
						kavevalFeltolt();
						fozes_kaveAdagmegadas.setBackground(Color.GREEN);
						fozes_kaveAdag_Button.setEnabled(false);
						fozes_kaveAdagmegadas.setEditable(false);
						if (fozesAdag_kave > 0) {
							kaveFeltoltGomb.setEnabled(true);
						}
					}	
				}
				
			}
		});
		fozes_kaveAdag_Button.setBackground(new Color(222, 184, 135));
		fozes_kaveAdag_Button.setFont(new Font("Century Gothic", Font.BOLD, 13));
		fozes_kaveAdag_Button.setBounds(110, 250, 125, 30);
		contentPane.add(fozes_kaveAdag_Button);
		
		JButton clear_Button = new JButton("CLEAR");
		clear_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!fozes_kaveAdagmegadas.getText().equals("") && !fozes_vizAdagmegadas.getText().equals("")) {
					kaveAdag = kaveAdag + Integer.parseInt(fozes_kaveAdagmegadas.getText());
					vizAdag = vizAdag + Integer.parseInt(fozes_vizAdagmegadas.getText());
					fozesAdag_kave = 0;
					fozesAdag_viz = 0;
					vizzelFeltolt();
					kavevalFeltolt();
				}
				if (fozes_kaveAdagmegadas.getText().equals("") && !fozes_vizAdagmegadas.getText().equals("")) {
					vizAdag = vizAdag + Integer.parseInt(fozes_vizAdagmegadas.getText());
					vizzelFeltolt();
				}
				if (!fozes_kaveAdagmegadas.getText().equals("") && fozes_vizAdagmegadas.getText().equals("")) {
					kaveAdag = kaveAdag + Integer.parseInt(fozes_kaveAdagmegadas.getText());
					kavevalFeltolt();
				}
				if (fozes_kaveAdagmegadas.getText().equals("") && fozes_vizAdagmegadas.getText().equals("")) {
					fozesAdag_kave = 0;
					fozesAdag_viz = 0;
				}
				fozes_kaveAdagmegadas.setBackground(Color.WHITE);
				fozes_vizAdagmegadas.setBackground(Color.WHITE);
				kostol_szovegmezo.setText(null);
				fozes_vizAdag_Button.setEnabled(true);
				fozes_kaveAdag_Button.setEnabled(true);
				fozes_vizAdagmegadas.setEditable(true);
				fozes_kaveAdagmegadas.setEditable(true);
				fozes_vizAdagmegadas.setText(null);
				fozes_kaveAdagmegadas.setText(null);
				makeCoffee_szovegmezo.setText(null);
			}
		});
		clear_Button.setBackground(new Color(240, 230, 140));
		clear_Button.setFont(new Font("Arial", Font.BOLD, 20));
		clear_Button.setBounds(97, 291, 230, 40);
		contentPane.add(clear_Button);
		setLocationRelativeTo(null);
		
		kaveFozes_BUTTON = new JButton("MAKE COFFEE");
		kaveFozes_BUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (fozesAdag_kave < 1 || fozesAdag_viz < 1) {
					makeCoffee_szovegmezo.setText("Empty or wrong value!");
					kostol_szovegmezo.setText(null);
				} else {
					fozesAdag_kave = Integer.parseInt(fozes_kaveAdagmegadas.getText());
					lefozottKave += fozesAdag_kave;
					hasznaltKave();
					fozes_vizAdag_Button.setEnabled(true);
					fozes_kaveAdag_Button.setEnabled(true);
					fozes_vizAdagmegadas.setEditable(true);
					fozes_kaveAdagmegadas.setEditable(true);
					fozes_vizAdagmegadas.setBackground(Color.WHITE);
					fozes_kaveAdagmegadas.setBackground(Color.WHITE);
					fozes_vizAdagmegadas.setText(null);
					fozes_kaveAdagmegadas.setText(null);
					kostol_szovegmezo.setText(null);
					if (fozes_kaveAdagmegadas.getText().equals(fozes_vizAdagmegadas.getText())) {
						makeCoffee_szovegmezo.setText("Delicious!");
					}
					if (fozesAdag_kave > fozesAdag_viz) {
						makeCoffee_szovegmezo.setText("Too strong!");
					}
					if (fozesAdag_kave < fozesAdag_viz) {
						makeCoffee_szovegmezo.setText("Too weak!");
					}
					if (lefozottKave == 6) {
						vizFeltoltGomb.setEnabled(false);
						kaveFeltoltGomb.setEnabled(false);
						clear_Button.setEnabled(false);
						fozes_kaveAdag_Button.setEnabled(false);
						fozes_vizAdag_Button.setEnabled(false);
						kaveFozes_BUTTON.setEnabled(false);
					}
					tasteCoffee = fozesAdag_kave;
					tasteWater = fozesAdag_viz;
					
				}
				
			}
		});
		kaveFozes_BUTTON.setForeground(new Color(160, 82, 45));
		kaveFozes_BUTTON.setBackground(new Color(255, 255, 240));
		kaveFozes_BUTTON.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		kaveFozes_BUTTON.setBounds(110, 55, 200, 50);
		contentPane.add(kaveFozes_BUTTON);
		
		JLabel lblKirts = new JLabel("DROP THE USED COFFEE");
		lblKirts.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblKirts.setHorizontalAlignment(SwingConstants.CENTER);
		lblKirts.setBounds(613, 108, 140, 25);
		contentPane.add(lblKirts);
		
		alapTöltésSzoveg = new JLabel("UPLOAD / dose");
		alapTöltésSzoveg.setFont(new Font("Century Gothic", Font.BOLD, 11));
		alapTöltésSzoveg.setHorizontalAlignment(SwingConstants.CENTER);
		alapTöltésSzoveg.setBounds(660, 405, 130, 25);
		contentPane.add(alapTöltésSzoveg);
		
		vizFeltoltGomb = new JButton("WATER");
		vizFeltoltGomb.setBackground(new Color(135, 206, 250));
		vizFeltoltGomb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alaptoltesSzovegmezo.setText(null);
				if (kaveViz_Adagmegadas.getText().equals("")) {
					alaptoltesSzovegmezo.setText("Please, add a value!");
				} else {
					beirtVizAdag = Integer.parseInt(kaveViz_Adagmegadas.getText());
					vizAdag += beirtVizAdag;
					if (beirtVizAdag > -1 && beirtVizAdag < 11 && vizAdag < 11) {
						vizzelFeltolt();
					} else {
						alaptoltesSzovegmezo.setText("Wrong value!");
						vizAdag = vizAdag - beirtVizAdag;
					}								
					kaveViz_Adagmegadas.setText(null);
				}
				
			}
		});
		vizFeltoltGomb.setBounds(629, 484, 85, 30);
		contentPane.add(vizFeltoltGomb);
		
		kaveFeltoltGomb = new JButton("COFFEE");
		kaveFeltoltGomb.setBackground(new Color(222, 184, 135));
		kaveFeltoltGomb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alaptoltesSzovegmezo.setText(null);
				if (kaveViz_Adagmegadas.getText().equals("")) {
					alaptoltesSzovegmezo.setText("Please, add a value!");
				} else {
					beirtKaveAdag = Integer.parseInt(kaveViz_Adagmegadas.getText());
					kaveAdag += beirtKaveAdag;
					if (beirtKaveAdag > -1 && beirtKaveAdag < 7 && kaveAdag < 7) {
						kavevalFeltolt();
					} else {
						alaptoltesSzovegmezo.setText("Wrong value!");
						kaveAdag = kaveAdag - beirtKaveAdag;
					}
					kaveViz_Adagmegadas.setText(null);
				}
				
			}
		});
		kaveFeltoltGomb.setBounds(745, 484, 85, 30);
		contentPane.add(kaveFeltoltGomb);
		
		kostol_BUTTON = new JButton("TASTE");
		kostol_BUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tasteCoffee == 0 && tasteWater == 0) {
					kostol_szovegmezo.setText("WATER: EMPTY, COFFEE: EMPTY");
				} else {
					kostol_szovegmezo.setText("It was made of " + tasteCoffee + " COFFEE and " + tasteWater + " WATER");
				}
				makeCoffee_szovegmezo.setText(null);
				alaptoltesSzovegmezo.setText(null);
			}
		});
		kostol_BUTTON.setBackground(Color.LIGHT_GRAY);
		kostol_BUTTON.setFont(new Font("Century Gothic", Font.BOLD, 13));
		kostol_BUTTON.setBounds(150, 363, 125, 30);
		contentPane.add(kostol_BUTTON);
		
		dropCoffee = new JButton("DROP COFFEE");
		dropCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lefozottKave == 6) {
					vizFeltoltGomb.setEnabled(true);
					kaveFeltoltGomb.setEnabled(true);
					clear_Button.setEnabled(true);
					fozes_kaveAdag_Button.setEnabled(true);
					fozes_vizAdag_Button.setEnabled(true);
					kaveFozes_BUTTON.setEnabled(true);
				}
				lefozottKave = 0;
				hasznaltKave();
				dropCoffee.setEnabled(false);
				kostol_szovegmezo.setText(null);
				
			}
		});
		dropCoffee.setEnabled(false);
		dropCoffee.setBounds(629, 134, 115, 23);
		contentPane.add(dropCoffee);
		
		kaveViz_Adagmegadas = new JTextField();
		kaveViz_Adagmegadas.setFont(new Font("Arial", Font.BOLD, 15));
		kaveViz_Adagmegadas.setHorizontalAlignment(SwingConstants.CENTER);
		kaveViz_Adagmegadas.setBounds(707, 433, 40, 40);
		contentPane.add(kaveViz_Adagmegadas);
		kaveViz_Adagmegadas.setColumns(10);
		
		alaptoltesSzovegmezo = new JTextField();
		alaptoltesSzovegmezo.setFont(new Font("Arial", Font.BOLD, 11));
		alaptoltesSzovegmezo.setEditable(false);
		alaptoltesSzovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		alaptoltesSzovegmezo.setBounds(629, 525, 200, 25);
		contentPane.add(alaptoltesSzovegmezo);
		alaptoltesSzovegmezo.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setEnabled(false);
		editorPane.setBackground(Color.GRAY);
		editorPane.setBounds(625, 406, 210, 150);
		contentPane.add(editorPane);
		
		hasznaltKave_1 = new JTextField();
		hasznaltKave_1.setForeground(Color.WHITE);
		hasznaltKave_1.setText("1");
		hasznaltKave_1.setHorizontalAlignment(SwingConstants.CENTER);
		hasznaltKave_1.setEditable(false);
		hasznaltKave_1.setColumns(10);
		hasznaltKave_1.setBackground(Color.WHITE);
		hasznaltKave_1.setBounds(695, 360, 30, 30);
		contentPane.add(hasznaltKave_1);
		
		hasznaltKave_2 = new JTextField();
		hasznaltKave_2.setForeground(Color.WHITE);
		hasznaltKave_2.setText("2");
		hasznaltKave_2.setHorizontalAlignment(SwingConstants.CENTER);
		hasznaltKave_2.setEditable(false);
		hasznaltKave_2.setColumns(10);
		hasznaltKave_2.setBackground(Color.WHITE);
		hasznaltKave_2.setBounds(695, 330, 30, 30);
		contentPane.add(hasznaltKave_2);
		
		hasznaltKave_3 = new JTextField();
		hasznaltKave_3.setForeground(Color.WHITE);
		hasznaltKave_3.setText("3");
		hasznaltKave_3.setHorizontalAlignment(SwingConstants.CENTER);
		hasznaltKave_3.setEditable(false);
		hasznaltKave_3.setColumns(10);
		hasznaltKave_3.setBackground(Color.WHITE);
		hasznaltKave_3.setBounds(695, 300, 30, 30);
		contentPane.add(hasznaltKave_3);
		
		hasznaltKave_4 = new JTextField();
		hasznaltKave_4.setForeground(Color.WHITE);
		hasznaltKave_4.setText("4");
		hasznaltKave_4.setHorizontalAlignment(SwingConstants.CENTER);
		hasznaltKave_4.setEditable(false);
		hasznaltKave_4.setColumns(10);
		hasznaltKave_4.setBackground(Color.WHITE);
		hasznaltKave_4.setBounds(695, 270, 30, 30);
		contentPane.add(hasznaltKave_4);
		
		hasznaltKave_5 = new JTextField();
		hasznaltKave_5.setForeground(Color.WHITE);
		hasznaltKave_5.setText("5");
		hasznaltKave_5.setHorizontalAlignment(SwingConstants.CENTER);
		hasznaltKave_5.setEditable(false);
		hasznaltKave_5.setColumns(10);
		hasznaltKave_5.setBackground(Color.WHITE);
		hasznaltKave_5.setBounds(695, 240, 30, 30);
		contentPane.add(hasznaltKave_5);
		
		hasznaltKave_6 = new JTextField();
		hasznaltKave_6.setForeground(Color.WHITE);
		hasznaltKave_6.setText("6");
		hasznaltKave_6.setHorizontalAlignment(SwingConstants.CENTER);
		hasznaltKave_6.setEditable(false);
		hasznaltKave_6.setColumns(10);
		hasznaltKave_6.setBackground(Color.WHITE);
		hasznaltKave_6.setBounds(695, 210, 30, 30);
		contentPane.add(hasznaltKave_6);
		
		JLabel lblUsedCoffee = new JLabel("USED COFFEE");
		lblUsedCoffee.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblUsedCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsedCoffee.setBounds(668, 180, 85, 30);
		contentPane.add(lblUsedCoffee);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEnabled(false);
		editorPane_1.setEditable(false);
		editorPane_1.setBackground(new Color(204, 102, 102));
		editorPane_1.setBounds(670, 180, 80, 220);
		contentPane.add(editorPane_1);
		
		editorPane_2 = new JEditorPane();
		editorPane_2.setEnabled(false);
		editorPane_2.setEditable(false);
		editorPane_2.setBackground(new Color(204, 102, 102));
		editorPane_2.setBounds(605, 105, 165, 60);
		contentPane.add(editorPane_2);
		
		fozes_vizAdagmegadas = new JTextField();
		fozes_vizAdagmegadas.setHorizontalAlignment(SwingConstants.CENTER);
		fozes_vizAdagmegadas.setFont(new Font("Arial", Font.BOLD, 15));
		fozes_vizAdagmegadas.setColumns(10);
		fozes_vizAdagmegadas.setBounds(245, 198, 30, 30);
		contentPane.add(fozes_vizAdagmegadas);
		
		fozes_kaveAdagmegadas = new JTextField();
		fozes_kaveAdagmegadas.setHorizontalAlignment(SwingConstants.CENTER);
		fozes_kaveAdagmegadas.setFont(new Font("Arial", Font.BOLD, 15));
		fozes_kaveAdagmegadas.setColumns(10);
		fozes_kaveAdagmegadas.setBounds(245, 250, 30, 30);
		contentPane.add(fozes_kaveAdagmegadas);
		
		kostol_szovegmezo = new JTextField();
		kostol_szovegmezo.setFont(new Font("Arial", Font.BOLD, 11));
		kostol_szovegmezo.setHorizontalAlignment(SwingConstants.CENTER);
		kostol_szovegmezo.setEditable(false);
		kostol_szovegmezo.setColumns(10);
		kostol_szovegmezo.setBounds(100, 399, 225, 30);
		contentPane.add(kostol_szovegmezo);
		
		editorPane_3 = new JEditorPane();
		editorPane_3.setEnabled(false);
		editorPane_3.setEditable(false);
		editorPane_3.setBackground(new Color(255, 250, 205));
		editorPane_3.setBounds(89, 45, 245, 297);
		contentPane.add(editorPane_3);
		
		editorPane_4 = new JEditorPane();
		editorPane_4.setEnabled(false);
		editorPane_4.setEditable(false);
		editorPane_4.setBackground(new Color(255, 160, 122));
		editorPane_4.setBounds(89, 347, 245, 93);
		contentPane.add(editorPane_4);
		
		validate();
		repaint();
	}
	
	public void kavevalFeltolt() {
		kave1.setBackground(Color.WHITE);
		kave2.setBackground(Color.WHITE);
		kave3.setBackground(Color.WHITE);
		kave4.setBackground(Color.WHITE);
		kave5.setBackground(Color.WHITE);
		kave6.setBackground(Color.WHITE);
		
		if (kaveAdag == 1) {
			kave1.setBackground(new Color(139, 69, 19));
		}
		if (kaveAdag == 2) {
			kave1.setBackground(new Color(139, 69, 19));
			kave2.setBackground(new Color(139, 69, 19));
		}
		if (kaveAdag == 3) {
			kave1.setBackground(new Color(139, 69, 19));
			kave2.setBackground(new Color(139, 69, 19));
			kave3.setBackground(new Color(139, 69, 19));
		}
		if (kaveAdag == 4) {
			kave1.setBackground(new Color(139, 69, 19));
			kave2.setBackground(new Color(139, 69, 19));
			kave3.setBackground(new Color(139, 69, 19));
			kave4.setBackground(new Color(139, 69, 19));
		}
		if (kaveAdag == 5) {
			kave1.setBackground(new Color(139, 69, 19));
			kave2.setBackground(new Color(139, 69, 19));
			kave3.setBackground(new Color(139, 69, 19));
			kave4.setBackground(new Color(139, 69, 19));
			kave5.setBackground(new Color(139, 69, 19));
		}
		if (kaveAdag == 6) {
			kave1.setBackground(new Color(139, 69, 19));
			kave2.setBackground(new Color(139, 69, 19));
			kave3.setBackground(new Color(139, 69, 19));
			kave4.setBackground(new Color(139, 69, 19));
			kave5.setBackground(new Color(139, 69, 19));
			kave6.setBackground(new Color(139, 69, 19));
			kaveFeltoltGomb.setEnabled(false);
		}
		
	}
	
	public void vizzelFeltolt() {
		viz1.setBackground(Color.WHITE);
		viz2.setBackground(Color.WHITE);
		viz3.setBackground(Color.WHITE);
		viz4.setBackground(Color.WHITE);
		viz5.setBackground(Color.WHITE);
		viz6.setBackground(Color.WHITE);
		viz7.setBackground(Color.WHITE);
		viz8.setBackground(Color.WHITE);
		viz9.setBackground(Color.WHITE);
		viz10.setBackground(Color.WHITE);
		
		if (vizAdag == 1) {
			viz1.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 2) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 3) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 4) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 5) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
			viz5.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 6) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
			viz5.setBackground(new Color(30, 144, 255));
			viz6.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 7) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
			viz5.setBackground(new Color(30, 144, 255));
			viz6.setBackground(new Color(30, 144, 255));
			viz7.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 8) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
			viz5.setBackground(new Color(30, 144, 255));
			viz6.setBackground(new Color(30, 144, 255));
			viz7.setBackground(new Color(30, 144, 255));
			viz8.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 9) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
			viz5.setBackground(new Color(30, 144, 255));
			viz6.setBackground(new Color(30, 144, 255));
			viz7.setBackground(new Color(30, 144, 255));
			viz8.setBackground(new Color(30, 144, 255));
			viz9.setBackground(new Color(30, 144, 255));
		}
		if (vizAdag == 10) {
			viz1.setBackground(new Color(30, 144, 255));
			viz2.setBackground(new Color(30, 144, 255));
			viz3.setBackground(new Color(30, 144, 255));
			viz4.setBackground(new Color(30, 144, 255));
			viz5.setBackground(new Color(30, 144, 255));
			viz6.setBackground(new Color(30, 144, 255));
			viz7.setBackground(new Color(30, 144, 255));
			viz8.setBackground(new Color(30, 144, 255));
			viz9.setBackground(new Color(30, 144, 255));
			viz10.setBackground(new Color(30, 144, 255));
			vizFeltoltGomb.setEnabled(false);
		}
		
	}
	
	public void hasznaltKave() {
		hasznaltKave_1.setBackground(Color.WHITE);
		hasznaltKave_2.setBackground(Color.WHITE);
		hasznaltKave_3.setBackground(Color.WHITE);
		hasznaltKave_4.setBackground(Color.WHITE);
		hasznaltKave_5.setBackground(Color.WHITE);
		hasznaltKave_6.setBackground(Color.WHITE);
		
		dropCoffee.setEnabled(true);
		
		if (lefozottKave == 1) {
			hasznaltKave_1.setBackground(Color.BLACK);
		}
		if (lefozottKave == 2) {
			hasznaltKave_1.setBackground(Color.BLACK);
			hasznaltKave_2.setBackground(Color.BLACK);
		}
		if (lefozottKave == 3) {
			hasznaltKave_1.setBackground(Color.BLACK);
			hasznaltKave_2.setBackground(Color.BLACK);
			hasznaltKave_3.setBackground(Color.BLACK);
		}
		if (lefozottKave == 4) {
			hasznaltKave_1.setBackground(Color.BLACK);
			hasznaltKave_2.setBackground(Color.BLACK);
			hasznaltKave_3.setBackground(Color.BLACK);
			hasznaltKave_4.setBackground(Color.BLACK);
		}
		if (lefozottKave == 5) {
			hasznaltKave_1.setBackground(Color.BLACK);
			hasznaltKave_2.setBackground(Color.BLACK);
			hasznaltKave_3.setBackground(Color.BLACK);
			hasznaltKave_4.setBackground(Color.BLACK);
			hasznaltKave_5.setBackground(Color.BLACK);
		}
		if (lefozottKave == 6) {
			hasznaltKave_1.setBackground(Color.BLACK);
			hasznaltKave_2.setBackground(Color.BLACK);
			hasznaltKave_3.setBackground(Color.BLACK);
			hasznaltKave_4.setBackground(Color.BLACK);
			hasznaltKave_5.setBackground(Color.BLACK);
			hasznaltKave_6.setBackground(Color.BLACK);
		}
		
	}
}
