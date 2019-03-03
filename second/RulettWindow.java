package second;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Label;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RulettWindow extends JFrame {

	private JPanel contentPane;
	int toke = 1000;
	int risk;
	int newRisk;
	int rounds = 0;
	private JButton END_btnEnd;
	private JTextField ACTUAL_RISK_textField;
	private JTextField BALANCE_textField_1;
	private JTextField textField_2_$;
	private JTextField RISK_textField;
	private JButton btnAccept;
	private JButton GAME_btnNewButton;
	private Label BALANCE_label;
	
	int intRisk;
	int evenOrOdd;
	int korokSzama = 1;
	
	private JLabel label_3;
	private Label label_1;
	private JLabel lblNewLabel;
	private Label label;
	private Label label_2;
	private JLabel lblYourType;
	private JTextField EVEN_OR_ODD_textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RulettWindow frame = new RulettWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RulettWindow() {
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		label = new Label("Please choose, EVEN or ODD?");
		label.setBounds(10, 0, 175, 20);
		label.setForeground(Color.BLACK);
		contentPane.add(label);
		
		label_1 = new Label("Risk:");
		label_1.setBounds(55, 105, 43, 20);
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setForeground(Color.RED);
		label_1.setAlignment(Label.CENTER);
		contentPane.add(label_1);
		
		BALANCE_label = new Label("BALANCE:");
		BALANCE_label.setBounds(125, 232, 141, 50);
		BALANCE_label.setForeground(Color.BLACK);
		BALANCE_label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(BALANCE_label);
		
		label_2 = new Label("Your actual risk is:");
		label_2.setBounds(480, 45, 115, 30);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(label_2);
		
		END_btnEnd = new JButton("END");
		END_btnEnd.setBounds(579, 296, 55, 15);
		END_btnEnd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "You end your game!");
				JOptionPane.showMessageDialog(null, "Your balance:  " + toke + "$");
				System.exit(0);
			}
		});
		END_btnEnd.setForeground(Color.WHITE);
		END_btnEnd.setBackground(Color.BLACK);
		END_btnEnd.setFont(new Font("Dialog", Font.BOLD, 11));
		contentPane.add(END_btnEnd);
		
		RISK_textField = new JTextField();
		RISK_textField.setBackground(new Color(240, 248, 255));
		RISK_textField.setFont(new Font("Dialog", Font.BOLD, 15));
		RISK_textField.setHorizontalAlignment(SwingConstants.CENTER);
		RISK_textField.setBounds(35, 125, 100, 22);
		contentPane.add(RISK_textField);
		RISK_textField.setColumns(10);
		
		ACTUAL_RISK_textField = new JTextField();
		ACTUAL_RISK_textField.setHorizontalAlignment(SwingConstants.CENTER);
		ACTUAL_RISK_textField.setEditable(false);
		ACTUAL_RISK_textField.setBackground(new Color(240, 248, 255));
		ACTUAL_RISK_textField.setBounds(480, 75, 145, 30);
		ACTUAL_RISK_textField.setFont(new Font("Calibri", Font.BOLD, 21));
		ACTUAL_RISK_textField.setDisabledTextColor(Color.BLACK);
		contentPane.add(ACTUAL_RISK_textField);
		ACTUAL_RISK_textField.setColumns(10);
		
		btnAccept = new JButton("ACCEPT");
		btnAccept.setBackground(new Color(224, 255, 255));
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				intRisk = Integer.parseInt(RISK_textField.getText()); 				 // kiirja a RISK_textField-bol az ACTUAL_RISK_textField-be a beirt szamot
				ACTUAL_RISK_textField.setText(String.valueOf(intRisk));
			}
		});
		btnAccept.setBounds(35, 150, 100, 25);
		btnAccept.setFont(new Font("Dialog", Font.BOLD, 15));
		contentPane.add(btnAccept);
		
		JButton EVEN_btnEven = new JButton("EVEN");
		EVEN_btnEven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EVEN_OR_ODD_textField.setText("EVEN");
				evenOrOdd = 0;
			}
		});
		EVEN_btnEven.setBackground(new Color(255, 228, 181));
		EVEN_btnEven.setFont(new Font("Dialog", Font.BOLD, 12));
		EVEN_btnEven.setBounds(20, 25, 65, 26);
		contentPane.add(EVEN_btnEven);
		
		JButton ODD_btnOdd = new JButton("ODD");
		ODD_btnOdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EVEN_OR_ODD_textField.setText("ODD");
				evenOrOdd = 1;
			}
		});
		ODD_btnOdd.setBackground(new Color(255, 228, 181));
		ODD_btnOdd.setFont(new Font("Dialog", Font.BOLD, 12));
		ODD_btnOdd.setBounds(100, 25, 65, 26);
		contentPane.add(ODD_btnOdd);
		
		EVEN_OR_ODD_textField = new JTextField();
		EVEN_OR_ODD_textField.setHorizontalAlignment(SwingConstants.CENTER);
		EVEN_OR_ODD_textField.setFont(new Font("Calibri", Font.BOLD, 21));
		EVEN_OR_ODD_textField.setEditable(false);
		EVEN_OR_ODD_textField.setDisabledTextColor(Color.BLACK);
		EVEN_OR_ODD_textField.setColumns(10);
		EVEN_OR_ODD_textField.setBackground(new Color(255, 222, 173));
		EVEN_OR_ODD_textField.setBounds(555, 128, 75, 25);
		contentPane.add(EVEN_OR_ODD_textField);
		
		TextArea All_GAME_textArea = new TextArea();
		All_GAME_textArea.setForeground(new Color(0, 0, 0));
		All_GAME_textArea.setFont(new Font("Dialog", Font.BOLD, 12));
		All_GAME_textArea.setBackground(new Color(255, 235, 205));
		All_GAME_textArea.setEditable(false);
		All_GAME_textArea.setBounds(172, 100, 290, 130);
		contentPane.add(All_GAME_textArea);
		
		GAME_btnNewButton = new JButton("$$$GAME$$$");
		GAME_btnNewButton.setBounds(212, 20, 210, 75);
		GAME_btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int randomNumber = new Random().nextInt(37)+1;
				
				if (randomNumber%2==0 && evenOrOdd == 0) {
					All_GAME_textArea.append("ROUND: " + korokSzama + "\n\n");
					korokSzama++;
					All_GAME_textArea.append("A kisorsolt szam: " + randomNumber + "\n");
					toke = toke + (2 * intRisk);
					All_GAME_textArea.append("*****WIN*****" + "\n");
					All_GAME_textArea.append("Your actual balance is: " + toke + "\n\n");
					BALANCE_textField_1.setText(Integer.toString(toke));
				}
				else if (randomNumber%2==0 && evenOrOdd == 1) {
					All_GAME_textArea.append("ROUND: " + korokSzama + "\n\n");
					korokSzama++;
					All_GAME_textArea.append("A kisorsolt szam: " + randomNumber + "\n");
					toke = toke - intRisk;
					All_GAME_textArea.append("-----LOSE-----" + "\n");
					All_GAME_textArea.append("Your actual balance is: " + toke + "\n\n");
					BALANCE_textField_1.setText(Integer.toString(toke));
				}
				else if (randomNumber%2!=0 && evenOrOdd == 0) {
					All_GAME_textArea.append("ROUND: " + korokSzama + "\n\n");
					korokSzama++;
					All_GAME_textArea.append("A kisorsolt szam: " + randomNumber + "\n");
					toke = toke - intRisk;
					All_GAME_textArea.append("-----LOSE-----" + "\n");
					All_GAME_textArea.append("Your actual balance is: " + toke + "\n\n");
					BALANCE_textField_1.setText(Integer.toString(toke));
				}
				else if (randomNumber%2!=0 && evenOrOdd == 1) {
					All_GAME_textArea.append("ROUND: " + korokSzama + "\n");
					korokSzama++;
					All_GAME_textArea.append("A kisorsolt szam: " + randomNumber + "\n\n");
					toke = toke + (2 * intRisk);
					All_GAME_textArea.append("*****WIN*****" + "\n");
					All_GAME_textArea.append("Your actual balance is: " + toke + "\n\n");
					BALANCE_textField_1.setText(Integer.toString(toke));
				}
				if (toke == 0) {
					JOptionPane.showMessageDialog(null, "You lost all of your money!");
					System.exit(0);
				}
				if (toke < 0) {
					JOptionPane.showMessageDialog(null, "Lost your game.");
					JOptionPane.showMessageDialog(null, "You made yourself a debt." + "\n\n" + "Your debt is:  " + toke*(-1) + " $");
					System.exit(0);
				}
			}
		});
		GAME_btnNewButton.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		GAME_btnNewButton.setForeground(new Color(0, 100, 0));
		GAME_btnNewButton.setBackground(Color.ORANGE);
		contentPane.add(GAME_btnNewButton);
		
		BALANCE_textField_1 = new JTextField();
		BALANCE_textField_1.setDisabledTextColor(Color.LIGHT_GRAY);
		BALANCE_textField_1.setSelectionColor(Color.LIGHT_GRAY);
		BALANCE_textField_1.setBackground(Color.LIGHT_GRAY);
		BALANCE_textField_1.setEditable(false);
		BALANCE_textField_1.setForeground(Color.BLACK);
		BALANCE_textField_1.setFont(new Font("Dialog", Font.BOLD, 25));
		BALANCE_textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		BALANCE_textField_1.setBounds(265, 235, 115, 45);
		BALANCE_textField_1.setText(Integer.toString(toke));  // toke kasztolasa STRING-re
		contentPane.add(BALANCE_textField_1);
		BALANCE_textField_1.setColumns(10);
		
		textField_2_$ = new JTextField();
		textField_2_$.setDisabledTextColor(Color.LIGHT_GRAY);
		textField_2_$.setSelectionColor(Color.LIGHT_GRAY);
		textField_2_$.setEditable(false);
		textField_2_$.setBackground(Color.LIGHT_GRAY);
		textField_2_$.setForeground(Color.BLACK);
		textField_2_$.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2_$.setFont(new Font("Constantia", Font.BOLD, 35));
		textField_2_$.setText("$");
		textField_2_$.setBounds(390, 235, 30, 45);
		contentPane.add(textField_2_$);
		textField_2_$.setColumns(10);
		
		lblNewLabel = new JLabel("$");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(97, 99, 25, 25);
		contentPane.add(lblNewLabel);
		
		label_3 = new JLabel("$");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 100, 0));
		label_3.setFont(new Font("Dialog", Font.BOLD, 25));
		label_3.setBounds(590, 46, 25, 25);
		contentPane.add(label_3);
		
		lblYourType = new JLabel("Your type:");
		lblYourType.setFont(new Font("Dialog", Font.BOLD, 14));
		lblYourType.setBounds(480, 129, 75, 20);
		contentPane.add(lblYourType);
		
	}
}
