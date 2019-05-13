package Ex0508;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MemberDial extends JDialog {

	private final JPanel contentPanel = new JPanel();
	MemberDAO dao;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_tel;
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
		getContentPane().setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setBounds(34, 43, 116, 21);
		getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JTextField();
		txt_pw.setBounds(34, 74, 116, 21);
		getContentPane().add(txt_pw);
		txt_pw.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setBounds(34, 105, 116, 21);
		getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_tel = new JTextField();
		txt_tel.setBounds(34, 136, 116, 21);
		getContentPane().add(txt_tel);
		txt_tel.setColumns(10);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dao = new MemberDAO();
						
						int cnt = dao.insert(txt_id.getText(), txt_pw.getText(), txt_name.getText(), txt_tel.getText());
						
						if(cnt > 0 ) {
							System.out.println("insert success! ");
						} else {
							System.out.println("insert fail..");
						}
						setVisible(false);
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
