import java.awt.EventQueue;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Program do przegladania obrazow
 * @author epiotno
 *
 */
public class ImageViewer 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					JFrame frame = new ImageViewerFrame();
					frame.setTitle("ImageViewer");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
	}
}


/**
*Ramka z etykieta wyswietlajaca obraz
*/

class ImageViewerFrame extends JFrame
{
	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 400;
	public ImageViewerFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//Uzycie etykiety do wyswietlania obrazow
		
		label = new JLabel();
		add(label);
		
		//Dodanie opcji wyboru obrazu
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		
		
		//Pasek menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Plik");
		menuBar.add(menu);
		
		JMenuItem openItem = new JMenuItem("Otworz");
		menu.add(openItem);
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//Wyswietlenie okna dialogowego wyboru pliku
				int result = chooser.showOpenDialog(null);
				
				//Jesli plik zostal wybrany, ustawiamy go jako ikone etykiety
				if(result == JFileChooser.APPROVE_OPTION)
				{
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
		
		JMenuItem exitItem = new JMenuItem("Zakoncz");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}