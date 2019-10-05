package application;

/**
* A test to showcase the attributes/properties of the Wizard class
*
* @author	Richard Salvaty
* @version	1.0.3
*/

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class WizardTestFX {

	private JFrame frmWizardTest;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtCurrHp;
	private JTextField txtMaxHp;
	private JTextField txtCurrMagika;
	private JTextField txtMaxMagika;
	private JTextField txtIntelligence;
	private JTextField txtDefense;
	private JTextField txtSpellDmg;
	private JTextField txtDmg;
	private JTextField txtLvl;
	Wizard wizard = new Wizard();
	private String name = wizard.getFirstName() + " " + wizard.getLastName();
	private Byte age = wizard.getAge();
	private String hp = Integer.toString(wizard.getHP());
	private String maxHp = Integer.toString(wizard.getMaxHP());
	private String sex = wizard.getGender();
	private String magika = Integer.toString(wizard.getMagika());
	private String maxMagika = Integer.toString(wizard.getMaxMagika());
	private String intel = Integer.toString(wizard.getIntelligence());
	private String def = Integer.toString(wizard.getDefense());
	private String lvl = Integer.toString(wizard.getLevel());
	private String spellDmg = Double.toString(wizard.getSpellDmg());
	private String dmg = Double.toString(wizard.getDamage());
	private String bio = wizard.getBio();
	private Image robe;
	private Image wizHat = new ImageIcon(this.getClass().getResource("/wizard_hat.png")).getImage();
	private Image wizRobe = new ImageIcon(this.getClass().getResource("/Wizard_Suit.png")).getImage();
	private Image wizDress = new ImageIcon(this.getClass().getResource("/Wizard_Dress.png")).getImage();
	private Image wizStaff = new ImageIcon(this.getClass().getResource("/Wizard_Staff.jpg")).getImage();
	private Image spellBk = new ImageIcon(this.getClass().getResource("/spell_book.png")).getImage();
	private Image wizSuit = new ImageIcon(this.getClass().getResource("/Wizard_Robe.png")).getImage();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WizardTestFX window = new WizardTestFX();
					window.frmWizardTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WizardTestFX() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWizardTest = new JFrame();
		frmWizardTest.getContentPane().setBackground(SystemColor.window);
		frmWizardTest.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frmWizardTest.setTitle("Wizard Test");
		frmWizardTest.setBounds(100, 100, 603, 464);
		frmWizardTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWizardTest.getContentPane().setLayout(null);
		
		txtName = new JTextField(name);
		txtName.setEditable(false);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setBounds(66, 24, 155, 20);
		frmWizardTest.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setLabelFor(txtName);
		lblName.setBounds(10, 27, 46, 14);
		frmWizardTest.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 62, 46, 14);
		frmWizardTest.getContentPane().add(lblAge);
		
		txtAge = new JTextField(age.toString());
		txtAge.setEditable(false);
		txtAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setLabelFor(txtAge);
		txtAge.setBounds(66, 55, 74, 20);
		frmWizardTest.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(10, 87, 46, 14);
		frmWizardTest.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");		
		rdbtnMale.setBounds(10, 105, 52, 23);
		frmWizardTest.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		lblGender.setLabelFor(rdbtnFemale);
		rdbtnFemale.setBounds(66, 105, 74, 23);
		frmWizardTest.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnUnspecified = new JRadioButton("Unspecified");
		rdbtnUnspecified.setBounds(155, 105, 108, 23);
		frmWizardTest.getContentPane().add(rdbtnUnspecified);
		
		switch(sex)
		{
			case "male":
				rdbtnMale.setSelected(true);
				robe = wizRobe;
				break;
			case "female":
				rdbtnFemale.setSelected(true);
				robe = wizDress;
				break;
			case "unspecified":
				rdbtnUnspecified.setSelected(true);
				robe = wizSuit;
				break;
		}
		
		rdbtnMale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(rdbtnMale.isSelected())
				{
					rdbtnFemale.setSelected(false);
					rdbtnUnspecified.setSelected(false);
					robe = wizRobe;
				}
			}
		});
		
		rdbtnFemale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(rdbtnFemale.isSelected())
				{
					rdbtnMale.setSelected(false);
					rdbtnUnspecified.setSelected(false);
					robe = wizDress;
				}
			}
		});
		
		rdbtnUnspecified.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(rdbtnUnspecified.isSelected())
				{
					rdbtnMale.setSelected(false);
					rdbtnFemale.setSelected(false);
					robe = wizSuit;
				}
			}
		});
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setBounds(10, 135, 46, 14);
		frmWizardTest.getContentPane().add(lblHp);
		
		txtCurrHp = new JTextField(hp);
		txtCurrHp.setEditable(false);
		txtCurrHp.setHorizontalAlignment(SwingConstants.CENTER);
		txtCurrHp.setBounds(10, 157, 36, 20);
		frmWizardTest.getContentPane().add(txtCurrHp);
		txtCurrHp.setColumns(10);
		
		JLabel lblHpSep = new JLabel("/");
		lblHpSep.setBounds(49, 160, 13, 14);
		frmWizardTest.getContentPane().add(lblHpSep);
		
		txtMaxHp = new JTextField(maxHp);
		txtMaxHp.setEditable(false);
		txtMaxHp.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaxHp.setBounds(56, 157, 36, 20);
		frmWizardTest.getContentPane().add(txtMaxHp);
		txtMaxHp.setColumns(10);		
		
		JButton btnExitApp = new JButton("Exit App");
		btnExitApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWizardTest.dispose();
			}
		});
		btnExitApp.setBounds(363, 347, 108, 48);
		frmWizardTest.getContentPane().add(btnExitApp);
		
		JLabel lblMagika = new JLabel("Magika:");
		lblMagika.setBounds(10, 188, 46, 14);
		frmWizardTest.getContentPane().add(lblMagika);
		
		txtCurrMagika = new JTextField(magika);
		txtCurrMagika.setEditable(false);
		txtCurrMagika.setHorizontalAlignment(SwingConstants.CENTER);
		txtCurrMagika.setBounds(10, 208, 36, 20);
		frmWizardTest.getContentPane().add(txtCurrMagika);
		txtCurrMagika.setColumns(10);
		
		JLabel lblMagSep = new JLabel("/");
		lblMagSep.setBounds(49, 211, 13, 14);
		frmWizardTest.getContentPane().add(lblMagSep);
		
		txtMaxMagika = new JTextField(maxMagika);
		txtMaxMagika.setEditable(false);
		txtMaxMagika.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaxMagika.setBounds(56, 208, 36, 20);
		frmWizardTest.getContentPane().add(txtMaxMagika);
		txtMaxMagika.setColumns(10);
		
		JLabel lblIntelligence = new JLabel("Intelligence:");
		lblIntelligence.setBounds(102, 135, 74, 14);
		frmWizardTest.getContentPane().add(lblIntelligence);
		
		txtIntelligence = new JTextField(intel);
		txtIntelligence.setEditable(false);
		txtIntelligence.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIntelligence.setBounds(102, 157, 67, 20);
		frmWizardTest.getContentPane().add(txtIntelligence);
		txtIntelligence.setColumns(10);
		
		JLabel lblDefense = new JLabel("Defense:");
		lblDefense.setBounds(10, 239, 67, 14);
		frmWizardTest.getContentPane().add(lblDefense);
		
		txtDefense = new JTextField(def);
		txtDefense.setEditable(false);
		txtDefense.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDefense.setBounds(10, 258, 67, 20);
		frmWizardTest.getContentPane().add(txtDefense);
		txtDefense.setColumns(10);		
		
		JLabel lblSpellDamage = new JLabel("Spell Damage:");
		lblSpellDamage.setBounds(102, 188, 84, 14);
		frmWizardTest.getContentPane().add(lblSpellDamage);
		
		txtSpellDmg = new JTextField(spellDmg);
		txtSpellDmg.setEditable(false);
		txtSpellDmg.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSpellDmg.setBounds(102, 208, 67, 20);
		frmWizardTest.getContentPane().add(txtSpellDmg);
		txtSpellDmg.setColumns(10);
		
		JLabel lblDamage = new JLabel("Damage:");
		lblDamage.setBounds(102, 239, 62, 14);
		frmWizardTest.getContentPane().add(lblDamage);
		
		txtDmg = new JTextField(dmg);
		txtDmg.setEditable(false);
		txtDmg.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDmg.setBounds(102, 258, 67, 20);
		frmWizardTest.getContentPane().add(txtDmg);
		txtDmg.setColumns(10);
		
		JLabel lblBio = new JLabel("Bio:");
		lblBio.setBounds(10, 289, 46, 14);
		frmWizardTest.getContentPane().add(lblBio);
		
		JTextArea txtBio = new JTextArea(bio);
		txtBio.setEditable(false);
		txtBio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtBio.setLineWrap(true);
		txtBio.setWrapStyleWord(true);
		txtBio.setBounds(10, 314, 211, 91);
		frmWizardTest.getContentPane().add(txtBio);
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setBounds(150, 62, 36, 14);
		frmWizardTest.getContentPane().add(lblLevel);
		
		txtLvl = new JTextField(lvl);
		txtLvl.setEditable(false);
		txtLvl.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLevel.setLabelFor(txtLvl);
		txtLvl.setBounds(189, 55, 32, 20);
		frmWizardTest.getContentPane().add(txtLvl);
		txtLvl.setColumns(10);
		
		JLabel lblHead = new JLabel(WearLoc.HEAD.toString());
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setBounds(372, 48, 80, 80);
		frmWizardTest.getContentPane().add(lblHead);
		
		JLabel lblBody = new JLabel(WearLoc.BODY.toString());
		lblBody.setHorizontalAlignment(SwingConstants.CENTER);
		lblBody.setBounds(363, 135, 108, 150);
		frmWizardTest.getContentPane().add(lblBody);
		
		JLabel lblRightHand = new JLabel(WearLoc.RIGHT_HAND.toString());
		lblRightHand.setHorizontalAlignment(SwingConstants.CENTER);
		lblRightHand.setBounds(288, 135, 66, 150);
		frmWizardTest.getContentPane().add(lblRightHand);
		
		JLabel lblLeftHand = new JLabel(WearLoc.LEFT_HAND.toString());
		lblLeftHand.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftHand.setBounds(472, 148, 80, 80);
		frmWizardTest.getContentPane().add(lblLeftHand);
		
		JButton btnEquipItems = new JButton("Equip Items");
		btnEquipItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRightHand.setIcon(new ImageIcon(wizStaff));
				lblLeftHand.setIcon(new ImageIcon(spellBk));
				lblHead.setIcon(new ImageIcon(wizHat));
				lblBody.setIcon(new ImageIcon(robe));
			}
		});
		btnEquipItems.setBounds(363, 289, 108, 47);
		frmWizardTest.getContentPane().add(btnEquipItems);
	}
}
