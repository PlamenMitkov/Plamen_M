import java.awt.event.*;
import java.awt.*;

public class MyWind1 extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Choice menu;
	Checkbox CB1, CB2, CB3;
	String str1, str2;
	int x1, y1, x2, y2;

	public MyWind1() {
		setLocationRelativeTo(null);
		setSize(720, 200);
		MenuBar mbar = new MenuBar();

		Menu menu1 = new Menu("незапълнен овал");
		Menu menu2 = new Menu("линия");
		Menu menu3 = new Menu("запълнен четириъгълник");

		MenuItem mi1 = new MenuItem("незапълнен овал");
		MenuItem mi2 = new MenuItem("линия");
		MenuItem mi3 = new MenuItem("запълнен четириъгълник");

		mbar.add(menu1);
		mbar.add(menu2);
		mbar.add(menu3);

		menu1.add(mi1);
		menu2.add(mi2);
		menu3.add(mi3);

		menu = new Choice();
		menu.add("незапълнен овал");
		menu.add("линия");
		menu.add("запълнен четириъгълник");
		add(menu);

		/*
		 * mi1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { //
		 * menu.addMouseListener(new Rectangle(x1, x1, x1, x1)); // repaint(); String
		 * cmd = e.getActionCommand(); if ("незапълнен овал".equals(cmd))
		 * menu.repaint(); }
		 * 
		 * }); mi2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { //
		 * menu.addMouseListener(new Line(x1, x1, x1, x1)); // repaint(); String cmd =
		 * e.getActionCommand(); if ("линия".equals(cmd)) menu.repaint(); }
		 * 
		 * }); mi3.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { //
		 * menu.addMouseListener(new Oval(x1, x1, x1, x1)); // repaint();
		 * menu.getMouseListeners(); String cmd = e.getActionCommand(); if
		 * ("запълнен четириъгълник".equals(cmd)) menu.repaint(); }
		 * 
		 * });
		 */
		setLayout(new GridLayout(0, 4));
		CheckboxGroup CBG = new CheckboxGroup();
		CB1 = new Checkbox("GREEN", CBG, true);
		CB2 = new Checkbox("RED", CBG, true);
		CB3 = new Checkbox("BLUE", CBG, true);
		add(CB1);
		add(CB2);
		add(CB3);
		CB1.addItemListener(new C());
		CB2.addItemListener(new C());
		CB3.addItemListener(new C());

		/*
		 * setLayout(new GridLayout(0,4));
		 * 
		 * Button MyButton1 =new Button("RED"); Button MyButton2 =new Button("GREEN");
		 * Button MyButton3 =new Button("BLUE"); add(MyButton1); add(MyButton2);
		 * add(MyButton3);
		 * 
		 * 
		 * MyButton1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.print("RED"); System.out.print(menu);
		 * 
		 * }
		 * 
		 * }); MyButton2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.print("GREEN"); System.out.print(menu); }
		 * 
		 * }); MyButton3.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.print("BLUE"); System.out.print(menu); }
		 * 
		 * });
		 */
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}

		});
		setMenuBar(mbar);
		setVisible(true);
	}

	class C implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			str1 = menu.getSelectedItem();
			System.out.println(str1);
			if (CB1.getState()) {
				str2 = CB1.getLabel();
				System.out.println(str2);
			} else if (CB2.getState()) {
				str2 = CB2.getLabel();
				System.out.println(str2);
			} else if (CB3.getState()) {
				str2 = CB3.getLabel();
				System.out.println(str2);
			}
		}
	}

}
