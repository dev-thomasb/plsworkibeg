import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Hello World!");
		myFrame.setSize(500, 800); 
		myFrame.setLocationRelativeTo(null);;
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		myFrame.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		JLabel contactLabel = new JLabel("Contact Information");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		
		myFrame.add(contactLabel, gbc);
		gbc.gridwidth = 1;
		
		//Name Label
		JLabel nameLabel = new JLabel("Name: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		myFrame.add(nameLabel, gbc);
		
		//Name Box
		JTextField nameBox = new JTextField(15);
		gbc.gridx = 1;
		gbc.gridy = 1;
		
		myFrame.add(nameBox, gbc);
		
		//Phone Box
		JTextField phoneBox = new JTextField(15);
		gbc.gridx = 1;
		gbc.gridy = 2;
		
		myFrame.add(phoneBox, gbc);
		
		//Email Label
		JLabel emailLabel = new JLabel("Email: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		myFrame.add(emailLabel, gbc);
		
		
		
		//pizza size label
		JLabel pizzaSizeLabel = new JLabel("Select Pizza Size");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		
		myFrame.add(pizzaSizeLabel, gbc);
		gbc.gridwidth = 1;
		
		
		
		
		

		//label for the Contact Info	-DONE
		//	Label for Name	-DONE
		//	Textbox for name
		//	Label for Email
		//	Textbox for Email
		//	 Label for Phone
		//	Textbox for Phone
		myFrame.setVisible(true);
	}
}
