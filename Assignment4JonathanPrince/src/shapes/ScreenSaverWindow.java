package shapes;


import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

@SuppressWarnings("serial")
public class ScreenSaverWindow extends JFrame {

	private JPanel contentPane;
	private int height= 0;
	private int width = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenSaverWindow frame = new ScreenSaverWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScreenSaverWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		Animate animate = new Animate();
		contentPane.add(animate, "name_109285974239924");
	}
	
	/*public int getHeight() {
		this.height =  Frame.HEIGHT;
		return height;
	}
	
	public int getWidth() {
		this.width=Frame.WIDTH;
		return width;
	}*/

}
