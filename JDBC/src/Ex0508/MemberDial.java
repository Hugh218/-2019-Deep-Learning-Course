package Ex0508;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MemberDial extends JDialog {

	private final JPanel contentPanel = new JPanel();
	MemberDAO dao;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_tel;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblName;
	private JLabel lblTel;
	
	
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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setBounds(119, 42, 116, 21);
		contentPanel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JTextField();
		txt_pw.setBounds(119, 73, 116, 21);
		contentPanel.add(txt_pw);
		txt_pw.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setBounds(119, 104, 116, 21);
		contentPanel.add(txt_name);
		txt_name.setColumns(10);
		
		txt_tel = new JTextField();
		txt_tel.setBounds(119, 135, 116, 21);
		contentPanel.add(txt_tel);
		txt_tel.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setBounds(50, 45, 57, 15);
		contentPanel.add(lblId);
		
		lblPw = new JLabel("PW");
		lblPw.setBounds(50, 76, 57, 15);
		contentPanel.add(lblPw);
		
		lblName = new JLabel("Name");
		lblName.setBounds(50, 107, 57, 15);
		contentPanel.add(lblName);
		
		lblTel = new JLabel("Tel");
		lblTel.setBounds(50, 138, 57, 15);
		contentPanel.add(lblTel);
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
						MemberGUI gui = new MemberGUI();
						gui.main(null);
						
						
						
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
