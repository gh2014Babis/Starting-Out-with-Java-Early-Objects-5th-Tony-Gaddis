package challenges;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Challenge04 extends JApplet {
	
	private JPanel sliderPanel;
	private JPanel textPanel;
	private JSlider tempSlider;
	private JTextField tempTextField;
	
	public void init() {
	    buildSliderPanel();
	    buildTextPanel();
	    setLayout(new BorderLayout());
	    add(sliderPanel, BorderLayout.CENTER);
	    add(textPanel, BorderLayout.SOUTH);
	    setVisible(true);
	}
	
	private void buildSliderPanel() {
		sliderPanel = new JPanel();
		tempSlider = new JSlider(JSlider.HORIZONTAL, -40, 40, 0);
		tempSlider.setMajorTickSpacing(20);
		tempSlider.setMinorTickSpacing(5);
		tempSlider.setPaintTicks(true);
		tempSlider.setPaintLabels(true);
		tempSlider.addChangeListener(new SliderListener());
		sliderPanel.add(tempSlider);
	}
	
	private void buildTextPanel() {
		textPanel = new JPanel();
		tempTextField = new JTextField(5);
		tempTextField.setEditable(false);
		textPanel.add(tempTextField);
	}
	
	private class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int temp;    
	        temp = tempSlider.getValue();
	        tempTextField.setText(String.valueOf(temp));
		}
	}
	
	public static void main(String[] args) {
		new Challenge04();
	}
}