package Controller;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Model.Madlib;

public class FormPanel extends JPanel{
	private JLabel nameText = new JLabel("  Name: ");
	private JTextField nameField = new JTextField(12);
	
	private JLabel item1Text = new JLabel("  Item:  ");
	private JTextField item1Field = new JTextField(12);
	
	private JLabel item2Text = new JLabel("   Item:  ");
	private JTextField item2Field = new JTextField(12);
	
	private JLabel item3Text = new JLabel("   Item:  ");
	private JTextField item3Field = new JTextField(12);
	
	private JLabel VerbText = new JLabel("   Verb:  ");
	private JTextField VerbTextField = new JTextField(12);
	
	private JLabel AdjectiveText = new JLabel(" Adjective:  ");
	private JTextField AdjectiveTextField = new JTextField(12);
	
	private JButton submit = new JButton("Submit");
	private JButton clear = new JButton("Clear");
	
	private JTextArea results = new JTextArea(5,20);
	
	
	public FormPanel() {
		
		
		add(nameText);
		add(nameField);
		
		add(item1Text);
		add(item1Field);
		
		add(item2Text);
		add(item2Field);
		
		add(item3Text);
		add(item3Field);
		
		add(VerbText);
		add(VerbTextField);
		
		add(AdjectiveText);
		add(AdjectiveTextField);
		
		add(submit);
		add(clear);
		
		add(results);
		ClearButtonListener cbl = new ClearButtonListener();
		clear.addActionListener(cbl);
		
		SubmitButtonListener sbl = new SubmitButtonListener();
		submit.addActionListener(sbl);
	}
	
	class ClearButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			nameField.setText("");
			item1Field.setText("");
			item2Field.setText("");
			item3Field.setText("");
			VerbTextField.setText("");
			AdjectiveTextField.setText("");
			results.setText("");

			
		}
		
	}
	
	class SubmitButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = nameField.getText();
			String item1 = item1Field.getText();
			String item2 = item2Field.getText();
			String item3 = item3Field.getText();
			String VerbText = VerbTextField.getText();
			String AdjectiveText = AdjectiveTextField.getText();
			
			Madlib userLib = new Madlib(name,item1,item2,item3, VerbText, AdjectiveText);
			results.setText(userLib.reciteMadlib());



			
			}
		
	}
	
	
}
