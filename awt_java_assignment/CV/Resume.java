package CV;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;


import CV.Sample1;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Canvas;

public class Resume {

	private JFrame frame;
	private JTextField Name1;
	private JTextField Name2;
	private JTextField textFieldNo;
	private JTextField textFieldEmail;
	private JTextField textFieldAdddress;
	private JTextField desig1;
	private JTextField comp2;
	private JTextField desig2;
	private JTextField comp3;
    private JTextField desig3;
	private JTextField comp4;
	private JTextField desig4;
	private JTextField lang3;
	private JTextField lang4;
	private JTextField lang2;
	private JTextField lang1;
	private JTextField sports1;
	private JTextField sports2;
	public String filename;
	private JTextField url;
	public String date[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
	public String month[]= {"January","February","March","April","May","june","July","August","September","october","November","December"};
	public String Year[]= {"1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
	public String grade[]= {"A+","A","B+","B","C","D"};
	
	FileWriter FileWriter;
	private JTextField textFieldSchoolName;
	private JLabel SchoolName;
	private JTextField textFieldcollegeName;
	private JTextField textFieldcgpa;
	private JTextField textFieldBranch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resume window = new Resume();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Resume() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Resume");
		frame.getContentPane().setBackground(new Color(248, 248, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 128));
		frame.setBounds(250, 100,1200 ,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		layeredPane.setBounds(38, 38, 444, 226);
		frame.getContentPane().add(layeredPane);
		
		Name1 = new JTextField();
		Name1.setBounds(106, 11, 105, 20);
		layeredPane.add(Name1);
		Name1.setColumns(10);
		
		Name2 = new JTextField();
		Name2.setBounds(320, 11, 114, 20);
		layeredPane.add(Name2);
		Name2.setColumns(10);
		
		JLabel FirstName = new JLabel("First Name:");
		FirstName.setFont(new Font("DialogInput", Font.BOLD, 12));
		FirstName.setBounds(10, 14, 86, 14);
		layeredPane.add(FirstName);
		
		JLabel LastName = new JLabel("Last Name:");
		LastName.setFont(new Font("DialogInput", Font.BOLD, 12));
		LastName.setBounds(234, 14, 76, 14);
		layeredPane.add(LastName);
		
		JLabel PhoneNo = new JLabel("Phone Number:");
		PhoneNo.setFont(new Font("DialogInput", Font.BOLD, 12));
		PhoneNo.setBounds(10, 60, 119, 14);
		layeredPane.add(PhoneNo);
		
		textFieldNo = new JTextField();
		textFieldNo.setBounds(106, 57, 105, 20);
		layeredPane.add(textFieldNo);
		textFieldNo.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(106, 98, 328, 20);
		layeredPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel Email = new JLabel("Email:");
		Email.setFont(new Font("DialogInput", Font.BOLD, 12));
		Email.setBounds(20, 101, 49, 14);
		layeredPane.add(Email);
		
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblDob.setBounds(21, 145, 48, 14);
		layeredPane.add(lblDob);
		
		JLabel lblDay = new JLabel("Date");
		lblDay.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblDay.setBounds(106, 129, 48, 14);
		layeredPane.add(lblDay);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblMonth.setBounds(205, 129, 48, 14);
		layeredPane.add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblYear.setBounds(328, 129, 48, 14);
		layeredPane.add(lblYear);
		
		@SuppressWarnings("rawtypes")
		JComboBox dob = new JComboBox();
		dob.setEditable(true);
		dob.setBounds(106, 141, 48, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel dm = new DefaultComboBoxModel(date);
		dob.setModel(dm);
		layeredPane.add(dob);
		
		@SuppressWarnings("rawtypes")
		JComboBox mob = new JComboBox();
		mob.setEditable(true);
		mob.setBounds(178, 141, 95, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel mo=new DefaultComboBoxModel(month);
		mob.setModel(mo);
		layeredPane.add(mob);
		
		@SuppressWarnings("rawtypes")
		JComboBox yob = new JComboBox();
		yob.setEditable(true);
		yob.setBounds(304, 141, 72, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr = new DefaultComboBoxModel(Year);
		yob.setModel(yr);
		layeredPane.add(yob);
		
		
		
		textFieldAdddress = new JTextField();
		textFieldAdddress.setBounds(106, 172, 328, 43);
		layeredPane.add(textFieldAdddress);
		textFieldAdddress.setColumns(10);
		
		JLabel Address = new JLabel("Address:");
		Address.setFont(new Font("DialogInput", Font.BOLD, 12));
		Address.setBounds(20, 186, 60, 14);
		layeredPane.add(Address);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		layeredPane_1.setBounds(38, 321, 444, 231);
		frame.getContentPane().add(layeredPane_1);
		
		textFieldSchoolName = new JTextField();
		textFieldSchoolName.setBounds(170, 11, 264, 20);
		layeredPane_1.add(textFieldSchoolName);
		textFieldSchoolName.setColumns(10);
		
		SchoolName = new JLabel("School Name:");
		SchoolName.setFont(new Font("DialogInput", Font.BOLD, 12));
		SchoolName.setHorizontalAlignment(SwingConstants.LEFT);
		SchoolName.setBounds(42, 14, 118, 14);
		layeredPane_1.add(SchoolName);
		
		JLabel lblCgpa = new JLabel("Grade:");
		lblCgpa.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblCgpa.setBounds(70, 39, 48, 22);
		layeredPane_1.add(lblCgpa);
		
		@SuppressWarnings("rawtypes")
		JComboBox cgpa = new JComboBox();
		cgpa.setEditable(true);
		cgpa.setBounds(58, 60, 60, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel Grade=new DefaultComboBoxModel(grade);
		cgpa.setModel(Grade);
		layeredPane_1.add(cgpa);
		
		JLabel lblPassingYear = new JLabel("Passing year:");
		lblPassingYear.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblPassingYear.setBounds(253, 39, 109, 22);
		layeredPane_1.add(lblPassingYear);
		
		@SuppressWarnings("rawtypes")
		JComboBox graduation_Year = new JComboBox();
		graduation_Year.setEditable(true);
		graduation_Year.setBounds(253, 60, 109, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr1 = new DefaultComboBoxModel(Year);
		graduation_Year.setModel(new DefaultComboBoxModel(new String[] {"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		layeredPane_1.add(graduation_Year);
		
		textFieldcollegeName = new JTextField();
		textFieldcollegeName.setBounds(170, 104, 264, 20);
		layeredPane_1.add(textFieldcollegeName);
		textFieldcollegeName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("College Name:");
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblNewLabel.setBounds(43, 107, 95, 14);
		layeredPane_1.add(lblNewLabel);
		
		JComboBox graduation_Year_1 = new JComboBox();
		graduation_Year_1.setModel(new DefaultComboBoxModel(new String[] {"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		graduation_Year_1.setEditable(true);
		graduation_Year_1.setBounds(253, 157, 109, 22);
		layeredPane_1.add(graduation_Year_1);
		
		JLabel lblPassingYear_1 = new JLabel("Passing year:");
		lblPassingYear_1.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblPassingYear_1.setBounds(253, 135, 109, 22);
		layeredPane_1.add(lblPassingYear_1);
		
		textFieldcgpa = new JTextField();
		textFieldcgpa.setBounds(112, 158, 96, 20);
		layeredPane_1.add(textFieldcgpa);
		textFieldcgpa.setColumns(10);
		
		JLabel lblCgpa2 = new JLabel("CGPA:");
		lblCgpa2.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblCgpa2.setBounds(38, 161, 49, 14);
		layeredPane_1.add(lblCgpa2);
		
		textFieldBranch = new JTextField();
		textFieldBranch.setBounds(170, 200, 264, 20);
		layeredPane_1.add(textFieldBranch);
		textFieldBranch.setColumns(10);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblBranch.setBounds(78, 203, 60, 14);
		layeredPane_1.add(lblBranch);
		
		
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		layeredPane_2.setBounds(507, 38, 390, 297);
		frame.getContentPane().add(layeredPane_2);
		
		JLabel lblCompany = new JLabel("Organization Name");
		lblCompany.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblCompany.setBounds(8, 11, 130, 32);
		layeredPane_2.add(lblCompany);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblDesignation.setBounds(138, 11, 124, 32);
		layeredPane_2.add(lblDesignation);
		
		JLabel lblWorkExperience = new JLabel("Work Experience");
		lblWorkExperience.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblWorkExperience.setBounds(256, 11, 124, 32);
		layeredPane_2.add(lblWorkExperience);
		

		JTextField comp1 = new JTextField();
		comp1.setBackground(new Color(255, 255, 255));
		comp1.setBounds(10, 54, 110, 45);
		layeredPane_2.add(comp1);
		comp1.setColumns(10);
		
		desig1 = new JTextField();
		desig1.setBackground(new Color(255, 255, 255));
		desig1.setBounds(130, 54, 96, 45);
		layeredPane_2.add(desig1);
		desig1.setColumns(10);
		
		comp2 = new JTextField();
		comp2.setColumns(10);
		comp2.setBounds(10, 109, 110, 45);
		layeredPane_2.add(comp2);
		
		desig2 = new JTextField();
		desig2.setColumns(10);
		desig2.setBounds(130, 110, 96, 44);
		layeredPane_2.add(desig2);
		
		comp3 = new JTextField();
		comp3.setColumns(10);
		comp3.setBounds(10, 169, 110, 45);
		layeredPane_2.add(comp3);
		
		desig3 = new JTextField();
		desig3.setColumns(10);
		desig3.setBounds(130, 169, 96, 44);
		layeredPane_2.add(desig3);
		
		comp4 = new JTextField();
		comp4.setColumns(10);
		comp4.setBounds(10, 230, 110, 45);
		layeredPane_2.add(comp4);
		
		desig4 = new JTextField();
		desig4.setColumns(10);
		desig4.setBounds(130, 230, 96, 45);
		layeredPane_2.add(desig4);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear1 = new JComboBox();
		fromyear1.setEditable(true);
		fromyear1.setBackground(new Color(255, 255, 255));
		fromyear1.setBounds(236, 65, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr4 = new DefaultComboBoxModel(Year);
		fromyear1.setModel(yr4);
		layeredPane_2.add(fromyear1);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear1 = new JComboBox();
		toyear1.setEditable(true);
		toyear1.setBackground(new Color(255, 255, 255));
		toyear1.setBounds(313, 65, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr5 = new DefaultComboBoxModel(Year);
		toyear1.setModel(yr5);
		layeredPane_2.add(toyear1);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear2 = new JComboBox();
		fromyear2.setEditable(true);
		fromyear2.setBounds(236, 120, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr6 = new DefaultComboBoxModel(Year);
		fromyear2.setModel(yr6);
		layeredPane_2.add(fromyear2);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear2 = new JComboBox();
		toyear2.setEditable(true);
		toyear2.setBounds(313, 120, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr7 = new DefaultComboBoxModel(Year);
		toyear2.setModel(yr7);
		layeredPane_2.add(toyear2);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear3 = new JComboBox();
		fromyear3.setEditable(true);
		fromyear3.setBounds(236, 180, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr8 = new DefaultComboBoxModel(Year);
		fromyear3.setModel(yr8);
		layeredPane_2.add(fromyear3);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear3 = new JComboBox();
		toyear3.setEditable(true);
		toyear3.setBounds(313, 180, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr9 = new DefaultComboBoxModel(Year);
		toyear3.setModel(yr9);
		layeredPane_2.add(toyear3);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear4 = new JComboBox();
		fromyear4.setEditable(true);
		fromyear4.setBounds(236, 241, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr10 = new DefaultComboBoxModel(Year);
		fromyear4.setModel(yr10);
		layeredPane_2.add(fromyear4);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear4 = new JComboBox();
		toyear4.setEditable(true);
		toyear4.setBounds(313, 241, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr11 = new DefaultComboBoxModel(Year);
		toyear4.setModel(yr11);
		layeredPane_2.add(toyear4);
		
		
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		layeredPane_3.setBounds(507, 388, 390, 164);
		frame.getContentPane().add(layeredPane_3);
		
		JLabel lblLanguages = new JLabel("Languages");
		lblLanguages.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblLanguages.setBounds(10, 11, 86, 14);
		layeredPane_3.add(lblLanguages);
		
		lang3 = new JTextField();
		lang3.setColumns(10);
		lang3.setBounds(10, 67, 175, 20);
		layeredPane_3.add(lang3);
		
		lang4 = new JTextField();
		lang4.setColumns(10);
		lang4.setBounds(207, 67, 175, 20);
		layeredPane_3.add(lang4);
		
		lang2 = new JTextField();
		lang2.setColumns(10);
		lang2.setBounds(207, 36, 175, 20);
		layeredPane_3.add(lang2);
		
		lang1 = new JTextField();
		lang1.setColumns(10);
		lang1.setBounds(10, 36, 175, 20);
		layeredPane_3.add(lang1);
		
		JLabel lblSports = new JLabel("Sports");
		lblSports.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblSports.setBounds(10, 101, 48, 20);
		layeredPane_3.add(lblSports);
		
		sports1 = new JTextField();
		sports1.setColumns(10);
		sports1.setBounds(10, 133, 175, 20);
		layeredPane_3.add(sports1);
		
		sports2 = new JTextField();
		sports2.setColumns(10);
		sports2.setBounds(207, 133, 175, 20);
		layeredPane_3.add(sports2);
		
		
		
		
	
		
		JLabel PersonalInfo = new JLabel("Personal Information");
		PersonalInfo.setFont(new Font("DialogInput", Font.BOLD, 20));
		PersonalInfo.setBounds(118, 1, 299, 30);
		frame.getContentPane().add(PersonalInfo);
		
		JButton Save = new JButton("Save");
		Save.setBackground(new Color(152, 251, 152));
		Save.setForeground(new Color(0, 0, 0));
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand() == Save.getActionCommand()) {
					try {
						FileWriter = new FileWriter("D:/Resume Details.txt");
						FileWriter.write("\n \t--------------------------RESUME--------------------------");
						//layeredPane data
						JLabel FirstName = new JLabel("First Name:");
						FileWriter.write("\n \t"+ FirstName.getText() + "  :  " +Name1.getText() + "\n");
						
						JLabel LastName = new JLabel("Last Name:");
						FileWriter.write(" \t"+LastName.getText() + "  :  " +Name2.getText() + "\n");
						
						JLabel PhoneNo = new JLabel("Phone Number:");
						FileWriter.write(" \t"+PhoneNo.getText() + "  :  " +textFieldNo.getText() + "\n");
						
						JLabel Email = new JLabel("Email:");
						FileWriter.write(" \t"+Email.getText() + "  :  " +textFieldEmail.getText() + "\n");
						
						JLabel lblDob = new JLabel("D.O.B");
						FileWriter.write(" \t"+lblDob.getText() + " : " + (String) dob.getSelectedItem()+" - "+(String) mob.getSelectedItem()+" - "+(String) yob.getSelectedItem()+ "\n");
						
						
						JLabel Address = new JLabel("Address:");
						FileWriter.write(" \t"+Address.getText() + "  :  " +textFieldAdddress.getText() + "\n");
						//layeredPane data end
						
						
						//layeredPane_1 data
						SchoolName = new JLabel("School Name:");
						FileWriter.write(" \t"+SchoolName.getText() + "  :  " +textFieldSchoolName.getText() + "\n");
						
						JLabel lblCgpa = new JLabel("Grade:");
						FileWriter.write(" \t"+lblCgpa.getText() + "  :  " + (String) cgpa.getSelectedItem() + "\n");
						
						JLabel lblPassingYear = new JLabel("Grade:");
						FileWriter.write(" \t"+lblPassingYear.getText() + "  :  " + (String) graduation_Year.getSelectedItem() + "\n");
						
						JLabel lblNewLabel = new JLabel("College Name:");
						FileWriter.write(" \t"+lblNewLabel.getText() + "  :  " +textFieldcollegeName.getText() + "\n");
						
						JLabel lblCgpa2 = new JLabel("CGPA:");
						FileWriter.write(" \t"+lblCgpa2.getText() + "  :  " +textFieldcgpa.getText() + "\n");
						
						JLabel lblPassingYear_1 = new JLabel("Passing year:");
						FileWriter.write(" \t"+lblPassingYear_1.getText() + "  :  " + (String) graduation_Year_1.getSelectedItem() + "\n");
						
						JLabel lblBranch = new JLabel("Branch:");
						FileWriter.write(" \t"+lblBranch.getText() + "  :  " +textFieldBranch.getText() + "\n");
						//layeredPane_1 data end
						
						
						//layeredPane_2 data
						JLabel lblCompany = new JLabel("Organization Name");
						JLabel lblWorkExperience = new JLabel("Work Experience");
						JLabel lblDesignation = new JLabel("Designation");
						
						FileWriter.write(" \t"+lblCompany.getText() + "-1 :  " +comp1.getText() + "\n");
                        FileWriter.write("\t"+lblDesignation.getText() + "  :  " +desig1.getText() + "\n");
                        FileWriter.write(" \t"+lblWorkExperience.getText() + "  From :  " +(String) fromyear1.getSelectedItem()+ " To :" + toyear1.getSelectedItem()+ "\n");
						
						FileWriter.write(" \t"+lblCompany.getText() + "-2 :  " +comp2.getText() + "\n");
						FileWriter.write(" \t"+lblDesignation.getText() + "  :  " +desig2.getText() + "\n");
						FileWriter.write(" \t"+lblWorkExperience.getText() + "  From :  " +(String) fromyear2.getSelectedItem()+ " To :" + toyear2.getSelectedItem()+ "\n");
						
						FileWriter.write(" \t"+lblCompany.getText() + "-3 :  " +comp3.getText() + "\n");
						FileWriter.write(" \t"+lblDesignation.getText() + "  :  " +desig3.getText() + "\n");
						FileWriter.write(" \t"+lblWorkExperience.getText() + "  From :  " +(String) fromyear3.getSelectedItem()+ " To :" + toyear3.getSelectedItem()+ "\n");
						
						FileWriter.write(" \t"+lblCompany.getText() + "-4 :  " +comp4.getText() + "\n");
						FileWriter.write(" \t"+lblDesignation.getText() + "  :  " +desig4.getText() + "\n");
						FileWriter.write(" \t"+lblWorkExperience.getText() + "  From :  " +(String) fromyear4.getSelectedItem()+ " To :" + toyear4.getSelectedItem()+ "\n");
						//layeredPane_2 data end
						
						//layeredPane_3 data
						JLabel lblLanguages = new JLabel("Languages");
						
						FileWriter.write(" \t"+lblLanguages.getText() + "-1 :  " +lang1.getText() + "\n");
						FileWriter.write(" \t"+lblLanguages.getText() + "-2 :  " +lang2.getText() + "\n");
						FileWriter.write("\t"+lblLanguages.getText() + "-3 :  " +lang3.getText() + "\n");
						FileWriter.write(" \t"+lblLanguages.getText() + "-4 :  " +lang4.getText() + "\n");
						
						JLabel lblSports = new JLabel("Sports");
						FileWriter.write(" \t"+lblSports.getText() + "-1 :  " +sports1.getText() + "\n");
						FileWriter.write(" \t"+lblSports.getText() + "-2 :  " +sports2.getText() + "\n");
						
						
						
						FileWriter.close();
						JOptionPane.showMessageDialog(null,"File Written successfully");
						 frame.dispose();
						
					} catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,e1);

					}
					
				}
			}
		});
		Save.setBounds(972, 433, 165, 55);
		frame.getContentPane().add(Save);
		
		JLabel Education = new JLabel("Educational Highlights");
		Education.setFont(new Font("DialogInput", Font.BOLD, 20));
		Education.setBounds(118, 285, 337, 30);
		frame.getContentPane().add(Education);
		
		JLabel WorkExperience = new JLabel("Work Experience");
		WorkExperience.setFont(new Font("DialogInput", Font.BOLD, 20));
		WorkExperience.setBounds(596, 1, 214, 30);
		frame.getContentPane().add(WorkExperience);
		
		JLabel lblNewLabel_1 = new JLabel("Skills ");
		lblNewLabel_1.setFont(new Font("DialogInput", Font.BOLD, 20));
		lblNewLabel_1.setBounds(664, 358, 151, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		JLayeredPane photo = new JLayeredPane();
		photo.setBackground(new Color(0, 0, 128));
		photo.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		photo.setBounds(946, 79, 194, 169);
		frame.getContentPane().add(photo);

		JLabel lblPicture = new JLabel("Photo");
		lblPicture.setFont(new Font("DialogInput", Font.BOLD, 20));
		lblPicture.setBounds(1010, 39, 87, 29);
		frame.getContentPane().add(lblPicture);
		
		JLabel label = new JLabel("");
		label.setBounds(938, 67, 214, 189);
		frame.getContentPane().add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		

		JButton btnNewButton = new JButton("Add Photo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				@SuppressWarnings("unused")
				Sample1 window = new Sample1();
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				filename=f.getAbsolutePath();

				@SuppressWarnings("unused")
				Image getabsolutePath=null;
				ImageIcon icon = new ImageIcon(filename);
				
				@SuppressWarnings("unused")
				Image image =icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
				label.setIcon(icon);
				 
				
				
			}
		});
		
		
		btnNewButton.setBounds(991, 259, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
	}
}
