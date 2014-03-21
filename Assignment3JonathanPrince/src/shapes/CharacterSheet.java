package shapes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CharacterSheet extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupArmor = new ButtonGroup();
	private final ButtonGroup buttonGroupWeapon = new ButtonGroup();
	
	
	//Variables for creating Game
	
	private String armor;
	private String weaponSelection;
	
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterSheet frame = new CharacterSheet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame. (This is a Constructor.)
	 */
	public CharacterSheet() {
		setTitle("D & D Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 497);
		contentPane = new JPanel();
		contentPane.setToolTipText("select a weapon");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panelCharacterSelect = new JPanel();
		
		panelCharacterSelect.setBounds(0, 0, 570, 458);
		contentPane.add(panelCharacterSelect);
		panelCharacterSelect.setLayout(null);
		
		JLabel lblChooseYourCharacters = new JLabel("Choose Your Character's Equipment");
		lblChooseYourCharacters.setFont(new Font("Old English Text MT", Font.PLAIN, 32));
		lblChooseYourCharacters.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseYourCharacters.setBounds(26, 43, 522, 64);
		panelCharacterSelect.add(lblChooseYourCharacters);
		
		final JRadioButton rdbtnLeather = new JRadioButton("Leather");
		rdbtnLeather.setSelected(true);
		buttonGroupArmor.add(rdbtnLeather);
		rdbtnLeather.setBounds(136, 223, 109, 23);
		panelCharacterSelect.add(rdbtnLeather);
		
		final JRadioButton rdbtnChainMail = new JRadioButton("Chain Mail");
		buttonGroupArmor.add(rdbtnChainMail);
		rdbtnChainMail.setBounds(136, 249, 109, 23);
		panelCharacterSelect.add(rdbtnChainMail);
		
		final JRadioButton rdbtnPlate = new JRadioButton("Plate");
		buttonGroupArmor.add(rdbtnPlate);
		rdbtnPlate.setBounds(136, 275, 109, 23);
		panelCharacterSelect.add(rdbtnPlate);
		
		JLabel lblArmorType = new JLabel("Armor Type");
		lblArmorType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArmorType.setBounds(136, 202, 91, 17);
		panelCharacterSelect.add(lblArmorType);
		
		JLabel lblWeaponType = new JLabel("Weapon Type");
		lblWeaponType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeaponType.setBounds(406, 205, 91, 17);
		panelCharacterSelect.add(lblWeaponType);
		
		final JRadioButton rdbtnSword = new JRadioButton("Sword");
		rdbtnSword.setSelected(true);
		buttonGroupWeapon.add(rdbtnSword);
		rdbtnSword.setBounds(406, 223, 109, 23);
		panelCharacterSelect.add(rdbtnSword);
		
		final JRadioButton rdbtnMace = new JRadioButton("Mace");
		buttonGroupWeapon.add(rdbtnMace);
		rdbtnMace.setBounds(406, 249, 109, 23);
		panelCharacterSelect.add(rdbtnMace);
		
		final JRadioButton rdbtnAxe = new JRadioButton("Axe");
		buttonGroupWeapon.add(rdbtnAxe);
		rdbtnAxe.setBounds(406, 275, 109, 23);
		panelCharacterSelect.add(rdbtnAxe);
		
		JButton btnNext = new JButton("Next");
		
		btnNext.setBounds(271, 356, 89, 23);
		panelCharacterSelect.add(btnNext);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(1);
			}
		});
		btnQuit.setBounds(370, 356, 89, 23);
		panelCharacterSelect.add(btnQuit);
		
		final JPanel panelBattle = new JPanel();
		panelBattle.setVisible(false);
		panelBattle.setBounds(0, 0, 570, 458);
		contentPane.add(panelBattle);
		panelBattle.setLayout(null);
		
		JLabel lblPlayerVersusEnemy = new JLabel("Player Versus Enemy");
		lblPlayerVersusEnemy.setBounds(10, 38, 550, 64);
		lblPlayerVersusEnemy.setFont(new Font("Old English Text MT", Font.PLAIN, 34));
		lblPlayerVersusEnemy.setHorizontalAlignment(SwingConstants.CENTER);
		panelBattle.add(lblPlayerVersusEnemy);
		
		JTextArea textBattle = new JTextArea();
		textBattle.setEditable(false);
		textBattle.setBounds(58, 170, 455, 151);
		panelBattle.add(textBattle);
		
		JButton btnQuit_1 = new JButton("Quit");
		btnQuit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(1);
			}
		});
		btnQuit_1.setBounds(331, 367, 89, 23);
		panelBattle.add(btnQuit_1);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(232, 367, 89, 23);
		panelBattle.add(btnGoBack);
		
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelCharacterSelect.setVisible(false);
				panelBattle.setVisible(true);
				
				if(rdbtnAxe.isSelected())
				{
					weaponSelection = "Axe";
				}
				else if(rdbtnSword.isSelected())
				{
					weaponSelection = "Sword";
				}
				else 
				{
					weaponSelection = "Mace";
				}
				
				
				if(rdbtnLeather.isSelected())
				{
					armor = "Leather";
				}
				else if (rdbtnChainMail.isSelected())
				{
					armor = "Chain";
				}
				else if (rdbtnPlate.isSelected())
				{
					armor = "Plate";
				}
				System.out.println(weaponSelection + ", " + armor);
			}
		});
		
		btnGoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelCharacterSelect.setVisible(true);
				panelBattle.setVisible(false);
			}
		});
		
		

	}
}