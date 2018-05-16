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
	JOptionPane.showMessageDialog(null, "If you are looking at this, it means you passed the first test. Lets see if you can pass this one: As they kept going, they faced another two paths.");

int i = JOptionPane.showOptionDialog(null, "Which way do you want them to go?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "right", "left",  }, null);	
		
     if (i==0) {
    	 JOptionPane.showMessageDialog(null, "They ran into ceral  and they got jelus so they ate them");
	System.exit(0);	
	}
     
     else if (i==1) {
    	 JOptionPane.showMessageDialog(null, "They went a way where there was nothing and kept going.");	
    	 JOptionPane.showMessageDialog(null, "If you are looking at this, it means you passed the first 2 tests. Lets see if you can pass this one: As they kept going, they faced another two paths.");
     
    	 
    	int o= JOptionPane.showOptionDialog(null, "Which way do you want them to go?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
    			new String[] { "right", "left",  }, null);	
     
     if (o==0) {
    	 JOptionPane.showMessageDialog(null, "They ran into nothing and kept going.");	
    
	}
     
     else if (o==1) {
    	 JOptionPane.showMessageDialog(null, "They ran into a toaster oven and got cooked ");
    	 System.exit(0);
    	 JOptionPane.showMessageDialog(null, "If you are reading this, you are good at this game and you have reached level 4.But now it gets harder.");
    	 
    	 	int a= JOptionPane.showOptionDialog(null, "Which way do you want them to go?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
        			new String[] { "right", "left",  "straight"}, null);
    	 	
    	 	if (a==0) {
    	 		 JOptionPane.showMessageDialog(null, "They ran into nothing and kept going.");
			}
    	 
     }
     }
     
	 
	 
	 }
	 
	 
	 
	 
	 
		
	}
	 



	 
	 
	 
}

