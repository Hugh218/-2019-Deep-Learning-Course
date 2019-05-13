package Ex0508;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberGUI {

	private JFrame frame;
	MemberDAO dao = new MemberDAO();
	MemberDial dail; 
	DefaultListModel model;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberGUI window = new MemberGUI();
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
	public MemberGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 941, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		
		model = new DefaultListModel<>();
		ArrayList<String> alist = new ArrayList<String>();
		alist = dao.selectID();
		//string 배열과 arraylist를 사용할수있는데 string배열은 알고리즘을 짜야해서, DefaultListmodel를 사용함.
		for(int i = 0; i<alist.size(); i++ ) {
			model.addElement(alist.get(i));
			
			
		}
		
		
		JList list = new JList(model);
		springLayout.putConstraint(SpringLayout.NORTH, list, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, list, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, list, 646, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, list, 369, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(list);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 6, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 646, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 501, SpringLayout.EAST, list);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(232, 50, 30, 35);
		lbl_id.setFont(new Font("굴림", Font.PLAIN, 30));
		panel.add(lbl_id);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(224, 182, 46, 35);
		lbl_pw.setFont(new Font("굴림", Font.PLAIN, 30));
		panel.add(lbl_pw);
		
		JLabel lbl_name = new JLabel("NAME");
		lbl_name.setBounds(206, 314, 83, 45);
		lbl_name.setFont(new Font("굴림", Font.PLAIN, 30));
		panel.add(lbl_name);
		
		JLabel lbl_tel = new JLabel("TEL");
		lbl_tel.setBounds(221, 456, 52, 35);
		lbl_tel.setFont(new Font("굴림", Font.PLAIN, 30));
		panel.add(lbl_tel);
		
		JButton btn_join = new JButton("회 원 가 입");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dail = new MemberDial();
				dail.setVisible(true);
				
				
				
				
				
			}
		});
		btn_join.setBounds(113, 520, 269, 45);
		btn_join.setFont(new Font("굴림", Font.PLAIN, 30));
		panel.add(btn_join);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					ArrayList<MemberDTO> mlist = new ArrayList<MemberDTO>();
					mlist = dao.show();
					int index = list.getSelectedIndex();
					//System.out.println(index);
					
					lbl_id.setText(mlist.get(index).getId());
					lbl_pw.setText(mlist.get(index).getPw()+"");
					lbl_name.setText(mlist.get(index).getName());
					lbl_tel.setText(mlist.get(index).getTel());
					
				}
				
				
				
				
			}
			
			
			
			
		});
		
		
		
		
		
		
		
		
		
	}
}
