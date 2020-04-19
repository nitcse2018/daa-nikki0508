package package01;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Resume extends JFrame
{

	private JFrame frame;
	private JTextField PhoneNo;
	private JTextField FirstName;
	private JTextField Email;
	private JTextField Address;
	private JTextField Proficiency;
	private JTextField EducationHighlights;
	private JTextField Consideration;
	private JTextField Achievements;
	FileWriter FileWriter;
	
	
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

	
	public Resume() {
		frame = new JFrame("RESUME");
		frame.setBounds(250, 100, 700,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			private AbstractButton lblNewLabel_1;
			private AbstractButton lblNewLabel_2;
			private AbstractButton lblNewLabel_3;
			private AbstractButton lblNewLabel_4;
			private AbstractButton lblNewLabel_5;
			private AbstractButton lblNewLabel_6;
			private AbstractButton lblNewLabel_7;
			private AbstractButton lblNewLabel_8;

			public void actionPerformed(ActionEvent e) {
				
				if(e.getActionCommand() == btnNewButton.getActionCommand() )
				{
					try
					{
						FileWriter = new FileWriter("D:/Resume Details.txt");
						JLabel lblNewLabel_1 = new JLabel("First Name:");
						FileWriter.write(lblNewLabel_1.getText() + "  :  " +FirstName.getText() + "\n");
						JLabel lblNewLabel_2 = new JLabel("Phone Number:");
						FileWriter.write(lblNewLabel_2.getText() + "  :  " +PhoneNo.getText()+ "\n");
						JLabel lblNewLabel_3 = new JLabel("Email:");
						FileWriter.write(lblNewLabel_3.getText() + "  :  " +Email.getText()+ "\n");
						JLabel lblNewLabel_4 = new JLabel("Address:");
						FileWriter.write(lblNewLabel_4.getText() + "  :  " +Address.getText()+ "\n");
						JLabel lblNewLabel_5 = new JLabel("Proficiency:");
						FileWriter.write(lblNewLabel_5.getText() + "  :  " +Proficiency.getText()+ "\n");
						JLabel lblNewLabel_6 = new JLabel("Education ");
						FileWriter.write(lblNewLabel_6.getText() + "  :  " +EducationHighlights.getText()+ "\n");
						JLabel lblNewLabel_7 = new JLabel("Achievements:");
						FileWriter.write(lblNewLabel_7.getText() + "  :  " +Achievements.getText()+ "\n");
						JLabel lblNewLabel_8 = new JLabel("Consideration:");
						FileWriter.write(lblNewLabel_8.getText() + "  :  " +Consideration.getText()+ "\n");
						
						FileWriter.close();
						JOptionPane.showMessageDialog(null,"File Written successfully");
						
					}catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,e1+"");
					}
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("DialogInput", Font.BOLD, 25));
		btnNewButton.setBounds(239, 433, 177, 50);
		frame.getContentPane().add(btnNewButton);
		
		PhoneNo = new JTextField(10);
		PhoneNo.setBounds(260, 112, 407, 25);
		frame.getContentPane().add(PhoneNo);
		PhoneNo.setColumns(10);
		
		FirstName = new JTextField(20);
		FirstName.setBounds(260, 76, 407, 25);
		frame.getContentPane().add(FirstName);
		FirstName.setColumns(10);
		
		Email = new JTextField(20);
		Email.setBounds(260, 147, 407, 25);
		frame.getContentPane().add(Email);
		Email.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Please Fill The Following Details");
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 30));
		lblNewLabel.setBounds(37, 11, 603, 25);
		frame.getContentPane().add(lblNewLabel);
		
		Address = new JTextField(50);
		Address.setBounds(260, 183, 407, 25);
		frame.getContentPane().add(Address);
		Address.setColumns(10);
		
		Proficiency = new JTextField(100);
		Proficiency.setBounds(260, 219, 407, 35);
		frame.getContentPane().add(Proficiency);
		Proficiency.setColumns(10);
		
		EducationHighlights = new JTextField(100);
		EducationHighlights.setBounds(260, 265, 407, 35);
		frame.getContentPane().add(EducationHighlights);
		EducationHighlights.setColumns(10);
		
		Consideration = new JTextField(100);
		Consideration.setBounds(260, 357, 407, 35);
		frame.getContentPane().add(Consideration);
		Consideration.setColumns(10);
		
		Achievements = new JTextField(100);
		Achievements.setBounds(260, 311, 407, 35);
		frame.getContentPane().add(Achievements);
		Achievements.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(87, 67, 165, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number:");
		lblNewLabel_2.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(64, 103, 188, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(121, 138, 120, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(121, 174, 120, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Proficiency:");
		lblNewLabel_5.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(75, 215, 177, 35);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Education ");
		lblNewLabel_6.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(10, 251, 177, 55);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Achievements:");
		lblNewLabel_7.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(76, 307, 165, 35);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Consideration:");
		lblNewLabel_8.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(58, 353, 194, 35);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Highlights:");
		lblNewLabel_9.setFont(new Font("DialogInput", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(125, 253, 154, 50);
		frame.getContentPane().add(lblNewLabel_9);
		
	}

}
