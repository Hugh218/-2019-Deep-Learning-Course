package Ex0508;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberDial extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lbl_id;
	private JLabel lbl_PW;
	private JLabel lbl_name;
	private JLabel lbl_tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MemberDial dialog = new MemberDial();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MemberDial() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(190, 21, 156, 30);
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 72, 156, 30);
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setColumns(10);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 123, 156, 30);
		textField_2.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_2.setColumns(10);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 174, 156, 29);
		textField_3.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_3.setColumns(10);
		contentPanel.add(textField_3);
		
		lbl_id = new JLabel("ID");
		lbl_id.setBounds(156, 26, 16, 24);
		lbl_id.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPanel.add(lbl_id);
		
		lbl_PW = new JLabel("Password");
		lbl_PW.setBounds(90, 76, 82, 24);
		lbl_PW.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPanel.add(lbl_PW);
		
		lbl_name = new JLabel("Name");
		lbl_name.setBounds(124, 126, 48, 24);
		lbl_name.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPanel.add(lbl_name);
		
		lbl_tel = new JLabel("Tel_phone");
		lbl_tel.setBounds(83, 176, 89, 24);
		lbl_tel.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPanel.add(lbl_tel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
