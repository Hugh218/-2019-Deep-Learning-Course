package musicPlayList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicGUI {

	private JFrame frame;

	MusicCon mc = new MusicCon();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicGUI window = new MusicGUI();
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
	public MusicGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 41, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -42, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel lbl_info = new JLabel("Music Info");
		lbl_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_info.setFont(new Font("Dialog", Font.PLAIN, 25));
		panel.add(lbl_info, "name_171458165187500");

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -15, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -28, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 149, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 41, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -42, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btn_pre = new JButton("◀◀");
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mc.preMusic();
				lbl_info.setText(mc.list.get(mc.index).getSongName() + mc.list.get(mc.index).getSinger());

			}
		});
		btn_pre.setBackground(Color.LIGHT_GRAY);
		btn_pre.setFont(new Font("굴림", Font.PLAIN, 30));
		panel_1.add(btn_pre);

		JButton btn_play = new JButton("▶");
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mc.musicPlay();
				lbl_info.setText(mc.list.get(mc.index).getSongName() + mc.list.get(mc.index).getSinger());
			}
		});
		btn_play.setBackground(Color.LIGHT_GRAY);
		btn_play.setFont(new Font("굴림", Font.PLAIN, 30));
		panel_1.add(btn_play);

		JButton btn_stop = new JButton("■");
		btn_stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.musicStop();
				lbl_info.setText("노래를 정지합니다");

			}
		});
		btn_stop.setBackground(Color.LIGHT_GRAY);
		btn_stop.setFont(new Font("굴림", Font.PLAIN, 30));
		panel_1.add(btn_stop);

		JButton btn_next = new JButton("▶▶");
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mc.nextMusic();
				lbl_info.setText(mc.list.get(mc.index).getSongName() + mc.list.get(mc.index).getSinger());

			}
		});
		btn_next.setBackground(Color.LIGHT_GRAY);
		btn_next.setFont(new Font("굴림", Font.PLAIN, 30));
		panel_1.add(btn_next);
	}

}
