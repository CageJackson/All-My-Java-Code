//File name JCardLayout2.java
//Written by Ernest Mushinge
//Written on 4/25/15

//In this application you create JFrame that uses a BorderLayout and place components in each region. 
//In the following sections, you will observe how the same components appear when other layout managers are used

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCardLayout2 extends JFrame implements ActionListener {

	// Instantiate five JButton objects, each with a label that is the name
	// of one of the regions used by BorderLayout

	private JButton nb = new JButton("North");
	private JButton sb = new JButton("South");
	private JButton eb = new JButton("East");
	private JButton wb = new JButton("West");
	private JButton cb = new JButton("Center");

	// Write the constructor that sets the JFrame's layout manager and add each
	// of the
	// five the buttons to the appropriate region. Also set the default close
	// operation for the JFrame

	// Instead of an anonymous layout manager, you need to create a CardLayout
	// manager with an identifier
	// that you can use with the next() method when the user clicks a button.
	CardLayout cardLayout = new CardLayout();

	public JCardLayout2() {
		// setLayout(new BorderLayout());
		// setLayout(new FlowLayout(FlowLayout.RIGHT));
		setLayout(new CardLayout());
		// add(nb, BorderLayout.NORTH);
		// add(sb, BorderLayout.SOUTH);
		// add(eb, BorderLayout.EAST);
		// add(wb, BorderLayout.WEST);
		// add(cb, BorderLayout.CENTER);
		add("North", nb);
		add("South", sb);
		add("East", eb);
		add("West", wb);
		add("Center", cb);

		// Within a constructor change the setLayout() statement so it uses the
		// named layout manager

		setLayout(cardLayout);
		// terminates the program on exit
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// At the end of the constructor, add five statements that allow each of
		// the
		// buttons to initiate an actionEvent
		nb.addActionListener(this);
		sb.addActionListener(this);
		eb.addActionListener(this);
		wb.addActionListener(this);
		cb.addActionListener(this);

	}

	// After the constructor's closing curly brace, add an actionPerformed()
	// method that
	// responds to the user clicks. The method uses the next() method to display
	// the next card
	// (next button) in the collection

	public void actionPerformed(ActionEvent e) {
		cardLayout.next(getContentPane());
	}

	// Main method
	public static void main(String[] args) {

		JCardLayout2 jbl = new JCardLayout2();
		jbl.setSize(250, 250);
		jbl.setVisible(true);
	}

}
