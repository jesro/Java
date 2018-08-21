import java.awt.datatransfer.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Gui extends JFrame{
	private JLabel label;
	private JButton but;
	private JButton button;
	private JTextField come;
	private JTextField textfield;
	public Gui(){
		setLayout(new FlowLayout());
		label = new JLabel("Paste Links");
		add(label);
		textfield = new JTextField(20);
		add(textfield);
		come = new JTextField(20);
		add(come);
		button = new JButton("Submit");
		add(button);
		but = new JButton("Copy");
		add(but);		
		event e = new event();
		button.addActionListener(e);
		eve en = new eve();
		but.addActionListener(en);
		}	
		public class eve implements ActionListener{
                	public void actionPerformed(ActionEvent en){
				StringSelection stringSelection = new StringSelection(come.getText());
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				clip.setContents(stringSelection, null);
                	
			}
		}



	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			come.setText("You Know ? This is My First Java Code ! "+textfield.getText());
		}
	}

	public static void main(String[] args){
		Gui jes=new Gui();
		jes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jes.setSize(500,600);
		jes.setVisible(true);
		jes.setTitle("Jes Window");
		
	}
}
