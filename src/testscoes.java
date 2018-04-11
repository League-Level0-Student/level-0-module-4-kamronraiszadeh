import javax.swing.JOptionPane;

public class testscoes {
	public static void main(String[] args) {
		String answer= JOptionPane.showInputDialog("What was your test score?");
		int score = Integer.parseInt(answer);
			
		if (score >= 90) {
			JOptionPane.showMessageDialog(null,"Good job");
		}
			else if (score >=70 ) {
				JOptionPane.showMessageDialog(null, "Not bad");
				
				
			}
		
			else {
				JOptionPane.showMessageDialog(null, "You suck");
			}
		
		
		}
		}
	


