import javax.swing.JOptionPane;

public class chooseyourownadventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Once apon a time in a galaxy far far away, thier was an egg riding on a bacon. Which way will they go?");
	
	 int n = JOptionPane.showOptionDialog(null, "Which way do you want them to go?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "right", "left",  }, null);
	
	 if (n==0) {
		JOptionPane.showMessageDialog(null, "They ran into humans and got eaten");
		System.exit(0);
	}
	 
	 else if (n==1) {
		JOptionPane .showMessageDialog(null,"They ran into nothing and kept going ");
	} 
	 
}
}
