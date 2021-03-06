package challenges;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Challenge11_1 extends JFrame {

	private JPanel gridPanel;
	private JPanel buttonPanel;
	private JLabel cell1Label;
	private JLabel cell2Label;
	private JLabel cell3Label;
	private JLabel cell4Label;
	private JLabel cell5Label;
	private JLabel cell6Label;
	private JLabel cell7Label;
	private JLabel cell8Label;
	private JLabel cell9Label;
	private JButton newGameButton;
	private JButton exitButton;
	private int[][] grid = new int[3][3];
	private boolean end = true;
	private boolean win1 = false;
	private boolean win2 = false;
	private int uncoveredCells = 0;
	private int turn;
	
	public Challenge11_1() {
		super("Tic-Tac-Toe Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 800);
		setLayout(new BorderLayout());
		
		gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(3, 3));
		
		cell1Label = new JLabel();
		cell1Label.setText("1");
		cell1Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell1Label.addMouseListener(new MouseAdapter());
		
		cell2Label = new JLabel();
		cell2Label.setText("2");
		cell2Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell2Label.addMouseListener(new MouseAdapter());
		
		cell3Label = new JLabel();
		cell3Label.setText("3");
		cell3Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell3Label.addMouseListener(new MouseAdapter());
		
		cell4Label = new JLabel();
		cell4Label.setText("4");
		cell4Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell4Label.addMouseListener(new MouseAdapter());
		
		cell5Label = new JLabel();
		cell5Label.setText("5");
		cell5Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell5Label.addMouseListener(new MouseAdapter());
		
		cell6Label = new JLabel();
		cell6Label.setText("6");
		cell6Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell6Label.addMouseListener(new MouseAdapter());
		
		cell7Label = new JLabel();
		cell7Label.setText("7");
		cell7Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell7Label.addMouseListener(new MouseAdapter());
		
		cell8Label = new JLabel();
		cell8Label.setText("8");
		cell8Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell8Label.addMouseListener(new MouseAdapter());
		
		cell9Label = new JLabel();
		cell9Label.setText("9");
		cell9Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
		cell9Label.addMouseListener(new MouseAdapter());
		
		gridPanel.add(cell1Label);
		gridPanel.add(cell2Label);
		gridPanel.add(cell3Label);
		gridPanel.add(cell4Label);
		gridPanel.add(cell5Label);
		gridPanel.add(cell6Label);
		gridPanel.add(cell7Label);
		gridPanel.add(cell8Label);
		gridPanel.add(cell9Label);
		
		buttonPanel = new JPanel();
		newGameButton = new JButton("New Game");
		newGameButton.addActionListener(new ButtonListener());
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new ButtonListener());
		buttonPanel.add(newGameButton);
		buttonPanel.add(exitButton);
		
		add(gridPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		System.out.println(cell1Label);
		
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				grid[i][j] = -1;
	}
	
	private class MouseAdapter implements MouseListener {
		public void mousePressed(MouseEvent me) {
			if (!end) {
				JLabel selectedLabel = (JLabel)me.getSource();
				int cell = Integer.parseInt(selectedLabel.getText());
				int row, col;		
				if (cell % 3 != 0) {
					row = cell / 3;
					col = cell % 3 - 1;
				} else {
					row = cell / 3 - 1;
					col = 2;
				}					
				if (grid[row][col] == -1) {
					uncoveredCells++;						
					System.out.println("Row: " + row + " Col: " + col);
					if (turn == 1) {
						selectedLabel.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\x.jpg"));	
						grid[row][col] = 1;
						if (checkGrid(row, col, 1)) {
							System.out.println("Player1 (X) wins");
							win1 = true;
						}	
						turn = 2;
					} else {
						selectedLabel.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\o.jpg"));	
						grid[row][col] = 0;						
						if (checkGrid(row, col, 0)) {
							System.out.println("Player2 (O) wins");
							win2 = true;
						}	
						turn = 1;
					}
					if (win1) {
						JOptionPane.showMessageDialog(null, "Player1 (X) wins");
						uncoveredCells = 0;
						end = true;
					}
					if (win2) {
						JOptionPane.showMessageDialog(null, "Player2 (O) wins");
						uncoveredCells = 0;
						end = true;
					}
					if (uncoveredCells == 9 && !win1 && !win2) {
						JOptionPane.showMessageDialog(null, "It's a tie");
						uncoveredCells = 0;
						end = true;
					}
				} else {
					JOptionPane.showMessageDialog(null, "The cell is uncovered");
				}
			} else {
				JOptionPane.showMessageDialog(null, "You must push the New Game Button");
			}
		}
		
		public void mouseReleased(MouseEvent e) {
			
		}

		public void mouseEntered(MouseEvent e) {
		   
		}

		public void mouseExited(MouseEvent e) {
		   
		}

		public void mouseClicked(MouseEvent e) {
		   
		}

		@SuppressWarnings("unused")
		void saySomething(String eventDescription, MouseEvent e) {
			
		}
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){  
			if (e.getSource() == newGameButton) {
				end = false;
				win1 = false;
				win2 = false;
				for (int i = 0; i < grid.length; i++)
					for (int j = 0; j < grid[i].length; j++)
						grid[i][j] = -1;
				cell1Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell2Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell3Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell4Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell5Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell6Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell7Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell8Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				cell9Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cells\\empty.jpg"));
				Random random = new Random();
				turn = random.nextInt(2) + 1;
				if (turn == 1) 
					JOptionPane.showMessageDialog(null, "Player1 can play");
				else
					JOptionPane.showMessageDialog(null, "Player2 can play");					
			} else {
				System.exit(0);
			}
		}
    } 
	
	private boolean checkGrid(int row, int col, int value) {
		int count = 0;
		for (int j = 0; j < 3; j++) {
			if (grid[row][j] == value)
				count++;
		}
		if (count == 3) {
			System.out.println(1);
			return true;
		}
		
		count = 0;
		for (int i = 0; i < 3; i++) {
			if (grid[i][col] == value)
				count++;
		}
		if (count == 3){
			System.out.println(2);
			return true;
		}
		
		if (row == col) {
			count = 0;
			for (int i = 0; i < 3; i++) {
				if (grid[i][i] == value)
					count++;
			}
			if (count == 3) {
				System.out.println(3);
				return true;
			}
		}

		if (row + col == 2) {
			count = 0;
			for (int i = 0; i < 3; i++) {
				if (grid[i][2 - i] == value)
					count++;
			}
			if (count == 3) {
				System.out.println(4);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		new Challenge11_1();
	}
}