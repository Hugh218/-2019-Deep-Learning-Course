package Ex0509;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class PhoneGUI {

	private JFrame frame;
	Phone_DAO dao = new Phone_DAO();
	DefaultListModel model;
	static PhoneGUI window;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new PhoneGUI();
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
	public PhoneGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		model = new DefaultListModel<>();
		ArrayList<String> alist = new ArrayList<String>();
		alist = dao.selectID();
		
		for(int i =0; i<alist.size(); i++ ) {
			model.addElement(alist.get(i));
		}
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, 763, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(Color.GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 27, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 159, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 27, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -130, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("전화목록");
		lblNewLabel.setFont(new Font("궁서", Font.BOLD, 56));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_366005258718500");
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		panel_2.setBackground(new Color(255, 255, 0));
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 27, SpringLayout.WEST, frame.getContentPane());
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JList list = new JList(model);
		panel_3.add(list, "name_365992652725400");
		//frame.getContentPane().add(list);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 206, 209));
		panel_1.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel label1 = new JLabel("이름");
		sl_panel_4.putConstraint(SpringLayout.NORTH, label1, 64, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, label1, 36, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, label1, -240, SpringLayout.SOUTH, panel_4);
		label1.setFont(new Font("궁서", Font.BOLD, 20));
		panel_4.add(label1);
		
		JLabel label2 = new JLabel("나이");
		sl_panel_4.putConstraint(SpringLayout.NORTH, label2, 64, SpringLayout.SOUTH, label1);
		sl_panel_4.putConstraint(SpringLayout.WEST, label2, 36, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, label2, 0, SpringLayout.EAST, label1);
		label2.setFont(new Font("궁서", Font.BOLD, 20));
		panel_4.add(label2);
		
		JLabel label3 = new JLabel("전화번호");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, label2, -64, SpringLayout.NORTH, label3);
		sl_panel_4.putConstraint(SpringLayout.EAST, label1, 0, SpringLayout.EAST, label3);
		sl_panel_4.putConstraint(SpringLayout.NORTH, label3, 240, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, label3, -241, SpringLayout.EAST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, label3, 36, SpringLayout.WEST, panel_4);
		label3.setFont(new Font("궁서", Font.BOLD, 20));
		panel_4.add(label3);
		
		JLabel lbl_name = new JLabel("-");
		sl_panel_4.putConstraint(SpringLayout.EAST, lbl_name, -11, SpringLayout.EAST, panel_4);
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setEnabled(false);
		lbl_name.setFont(new Font("궁서체", Font.BOLD, 20));
		sl_panel_4.putConstraint(SpringLayout.NORTH, lbl_name, 70, SpringLayout.NORTH, panel_4);
		panel_4.add(lbl_name);
		
		JLabel lbl_age = new JLabel("-");
		sl_panel_4.putConstraint(SpringLayout.WEST, lbl_age, 0, SpringLayout.WEST, lbl_name);
		sl_panel_4.putConstraint(SpringLayout.EAST, lbl_age, -11, SpringLayout.EAST, panel_4);
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_age.setEnabled(false);
		lbl_age.setFont(new Font("궁서체", Font.BOLD, 20));
		sl_panel_4.putConstraint(SpringLayout.NORTH, lbl_age, 70, SpringLayout.SOUTH, lbl_name);
		panel_4.add(lbl_age);
		
		JLabel lbl_tel = new JLabel("-");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lbl_tel, 70, SpringLayout.SOUTH, lbl_age);
		sl_panel_4.putConstraint(SpringLayout.WEST, lbl_name, 0, SpringLayout.WEST, lbl_tel);
		sl_panel_4.putConstraint(SpringLayout.WEST, lbl_tel, 76, SpringLayout.EAST, label3);
		sl_panel_4.putConstraint(SpringLayout.EAST, lbl_tel, -11, SpringLayout.EAST, panel_4);
		lbl_tel.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tel.setEnabled(false);
		lbl_tel.setFont(new Font("궁서체", Font.BOLD, 20));
		panel_4.add(lbl_tel);
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JButton button = new JButton("연락처추가");
		button.setFont(new Font("궁서체", Font.BOLD, 30));
		sl_panel_2.putConstraint(SpringLayout.NORTH, button, 27, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, button, 49, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, button, 85, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, button, 332, SpringLayout.WEST, panel_2);
		panel_2.add(button);
		
		JButton button_1 = new JButton("연락처삭제");
		button_1.setFont(new Font("궁서체", Font.BOLD, 30));
		sl_panel_2.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, button);
		sl_panel_2.putConstraint(SpringLayout.WEST, button_1, -340, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, button_1, 0, SpringLayout.SOUTH, button);
		sl_panel_2.putConstraint(SpringLayout.EAST, button_1, -43, SpringLayout.EAST, panel_2);
		panel_2.add(button_1);
		
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(e.getValueIsAdjusting()) {
					ArrayList<Phone_DTO> mlist  =new ArrayList<Phone_DTO>();
					mlist = dao.allShow();
					int index = list.getSelectedIndex();
					//System.out.println(index);
					
					lbl_name.setText(mlist.get(index).getName());
					lbl_age.setText(mlist.get(index).getAge()+"");
					lbl_tel.setText(mlist.get(index).getTel());		
				}
			
				
			}
		});
		
		
	}

}
