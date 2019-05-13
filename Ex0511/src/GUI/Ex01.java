package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex01 {

	private JFrame frmContainerComponent;
	private JTextField txt_inputid;
	private JTextField txt_inputpw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 window = new Ex01();
					window.frmContainerComponent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContainerComponent = new JFrame();
		frmContainerComponent.setTitle("Container & Component");
		frmContainerComponent.getContentPane().setBackground(Color.ORANGE);
		SpringLayout springLayout = new SpringLayout();
		frmContainerComponent.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 72, SpringLayout.NORTH, frmContainerComponent.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 99, SpringLayout.WEST, frmContainerComponent.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 525, SpringLayout.NORTH, frmContainerComponent.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -100, SpringLayout.EAST, frmContainerComponent.getContentPane());
		frmContainerComponent.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 87, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, -432, SpringLayout.EAST, panel);
		panel_1.setBackground(Color.YELLOW);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 427, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -122, SpringLayout.EAST, panel);
		panel_2.setBackground(Color.GREEN);
		panel.add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lbl_check = new JLabel("Please Check!!");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lbl_check, 5, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lbl_check, 45, SpringLayout.WEST, panel_2);
		lbl_check.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_2.add(lbl_check);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C# JCheckBox");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 6, SpringLayout.SOUTH, lbl_check);
		sl_panel_2.putConstraint(SpringLayout.EAST, chckbxNewCheckBox, -76, SpringLayout.EAST, panel_2);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("C++ JCheckBox");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_1, 12, SpringLayout.SOUTH, chckbxNewCheckBox);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_1, 0, SpringLayout.WEST, chckbxNewCheckBox);
		panel_2.add(chckbxNewCheckBox_1);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = txt_inputid.getText();
				String pw = txt_inputpw.getText();
				
				System.out.println(id + " " + pw);
				
			}
		});
		
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, -21, SpringLayout.NORTH, btnOK);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -21, SpringLayout.NORTH, btnOK);
		sl_panel.putConstraint(SpringLayout.NORTH, btnOK, 385, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnOK, 318, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnOK, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnOK, 496, SpringLayout.WEST, panel);
		btnOK.setFont(new Font("굴림", Font.PLAIN, 25));
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lbl_id = new JLabel("Type ID");
		sl_panel_1.putConstraint(SpringLayout.WEST, lbl_id, 105, SpringLayout.WEST, panel_1);
		lbl_id.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(lbl_id);
		String s = lbl_id.getText();
		System.out.println(s);
		lbl_id.setText("hello world!");
		
		
		
		JLabel lbl_pw = new JLabel("Type Password");
		sl_panel_1.putConstraint(SpringLayout.WEST, lbl_pw, 60, SpringLayout.WEST, panel_1);
		lbl_pw.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(lbl_pw);
		lbl_pw.setText(lbl_id.getText());
		
		
		
		txt_inputid = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lbl_id, -6, SpringLayout.NORTH, txt_inputid);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txt_inputid, 46, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txt_inputid, 90, SpringLayout.WEST, panel_1);
		panel_1.add(txt_inputid);
		txt_inputid.setColumns(10);
		
		txt_inputpw = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txt_inputpw, 134, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txt_inputpw, 0, SpringLayout.EAST, txt_inputid);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lbl_pw, -6, SpringLayout.NORTH, txt_inputpw);
		panel_1.add(txt_inputpw);
		txt_inputpw.setColumns(10);
		
		

		
		panel.add(btnOK);
		frmContainerComponent.setBounds(100, 100, 1030, 692);
		frmContainerComponent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
