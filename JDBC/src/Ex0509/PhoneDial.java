package Ex0509;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PhoneDial extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PhoneDial dialog = new PhoneDial();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PhoneDial() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		{
			panel_1 = new JPanel();
			panel_1.setBackground(Color.CYAN);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.SOUTH, panel_1, 68, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.EAST, panel_1, 414, SpringLayout.WEST, contentPanel);
			contentPanel.add(panel_1);
		}
		{
			JPanel panel = new JPanel();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH, panel_1);
			sl_contentPanel.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.SOUTH, panel, 140, SpringLayout.SOUTH, panel_1);
			panel_1.setLayout(new CardLayout(0, 0));
			{
				JLabel lblNewLabel = new JLabel("전화번호 등록");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel_1.add(lblNewLabel, "name_369877635203500");
			}
			sl_contentPanel.putConstraint(SpringLayout.EAST, panel, 414, SpringLayout.WEST, contentPanel);
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(Color.GREEN);
				panel.add(panel_2);
				panel_2.setLayout(new SpringLayout());
			}
			{
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(Color.ORANGE);
				panel.add(panel_2);
				panel_2.setLayout(new SpringLayout());
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
