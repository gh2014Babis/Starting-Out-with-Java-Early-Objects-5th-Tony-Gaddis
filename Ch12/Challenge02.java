package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Challenge02 extends JFrame {
	
	// The following variables will reference menu components.
	private JMenuBar menuBar;   // The menu bar
	private JMenu fileMenu;     // The File menu
	private JMenuItem openItem;
	private JMenuItem exitItem; // An item to exit the application
	private JPanel imagePanel;  
	private JLabel imageLabel; 
	
	/**
	 *  Constructor
	 */

	public Challenge02() {
		// Call the JFrame constructor.
	    super("Image Viewer");
	    setSize(1000, 900);
	    // Specify an action for the close button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BorderLayout());
	    // Build the menu bar.
	    buildMenuBar();
	    buildImagePanel();
	    setVisible(true);
	}

	/**
	 *  The buildMenuBar method builds the menu bar.
	 */

	private void buildMenuBar() {
		// Create the menu bar.
	    menuBar = new JMenuBar();
	    buildFileMenu();
	    menuBar.add(fileMenu);	      
	    // Set the window's menu bar.
	    setJMenuBar(menuBar);
	}
	   
	/**
	 *  The buildFileMenu method builds the File menu
	 *  and returns a reference to its JMenu object.
	 */

	private void buildFileMenu() {
		openItem = new JMenuItem("Open");
		openItem.setMnemonic(KeyEvent.VK_O);
		openItem.addActionListener(new OpenListener());
	    exitItem = new JMenuItem("Exit");
	    exitItem.setMnemonic(KeyEvent.VK_X);
	    exitItem.addActionListener(new ExitListener());
	    
	    fileMenu = new JMenu("File");
	    fileMenu.setMnemonic(KeyEvent.VK_F);
	    
	    fileMenu.add(openItem);
	    fileMenu.add(exitItem);
	}
	   
	private void buildImagePanel() {
		// Create a panel.
		imagePanel = new JPanel();

		// Create a label.
		imageLabel = new JLabel();
		      
		// Add the label to the panel.
		imagePanel.add(imageLabel);
		add(imagePanel, BorderLayout.CENTER);
	}
	   
	/**
	 * Private inner class that handles the event that
	 * is generated when the user selects Exit from
	 * the File menu.
	 */
	   
	private class ExitListener implements ActionListener {
	    	
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
	    }
	}
	   
	/**
	 * Private inner class that handles the event that
	 * is generated when the user selects a color from
	 * the Text menu.
	 */
	   
	private class OpenListener implements ActionListener {
	    	
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileChooser = new JFileChooser();
	    	int status = fileChooser.showOpenDialog(null);
	    	if (status == JFileChooser.APPROVE_OPTION) {
	    		File selectedFile = fileChooser.getSelectedFile();
	    		String filename = selectedFile.getPath();
	    		System.out.println(filename);
	    		ImageIcon img = new ImageIcon(filename); 
	    		// Display the image in the label.
	    		imageLabel.setIcon(img);
	    	}
		}
	}
	/**
	 * The main method creates an instance of the MenuWindow
	 * class, which causes it to display its window.
	 */

	public static void main(String[] args) {
		new Challenge02();
	}
}
