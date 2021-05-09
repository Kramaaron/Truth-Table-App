/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TruthTable;

import java.awt.Toolkit;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Generator extends javax.swing.JFrame {

    /**
     * Creates new form Generator
     */
    
    
    public class Main{
        
        ArrayList<EquationVariables> variableArray = new ArrayList<>();
        ArrayList<Object> equationArray = new ArrayList<>();
    
        public void main()
        {
        String c = input.getText();
        int counter = 1;
        //loops through the equation and stores all characters between a and z in a variable array.
		for (int i = 0; i < c.replaceAll(" ", "").toLowerCase().length();i++){
			if (c.replaceAll(" ", "").toLowerCase().charAt(i)>='a' && c.replaceAll(" ", "").toLowerCase().charAt(i)<='z') {
				boolean alreadyExists = false;
				EquationVariables temp = new EquationVariables(c.replaceAll(" ", "").toLowerCase().charAt(i),true, counter);
				
				//checks for duplicate letters and doesn't add them to the array twice
				for (EquationVariables v : variableArray){
					if (v.getName()==temp.getName()){
						alreadyExists = true;
						temp = v;
					}
				}
				if (!alreadyExists){
					variableArray.add(temp); 
					//doubles the significant bit for each variable that is added
					//First variable has 1, second has 2, third has 4, and so on
					counter = counter*2;
				}
				
				//stores the variable objects that are created in an equation array as well
				equationArray.add(temp);
			}else{
				//any non-letter characters get stored in an equation array
				equationArray.add(c.replaceAll(" ", "").toLowerCase().charAt(i));
			}
		}
                
                if (variableArray.size() > 0){
			//Creates an instance of the truth table class with the proper parameters
			TruthTableGUI table = new TruthTableGUI(variableArray, equationArray);
			table.constructTable();
		}else{
			area1.append("\nNo variables found");
		}
    }
    }
    
    public class TruthTableGUI {
	ArrayList<EquationVariables> variables = new ArrayList<>();
	ArrayList<Object> equation;
	ArrayList<Object> temp;
        
	private TruthTableGUI(ArrayList<EquationVariables> vars, ArrayList<Object> theEquation){
		variables = vars;
		equation = theEquation;
	}
	
	/**
	 * The method that constructs the truth table
	 * It goes through every possible binary combination for the variables, and calls parseEquation()
	 * for each one. If parseEquation returns false, the program stops executing
	 */
	public void constructTable(){
		//prints out the top row of the truth table
		for (int i = variables.size()-1; i >= 0 ; i--){
			area1.append(" | " + variables.get(i).getName());
		}
		area1.append(" || Output\n\n");
		
		//Goes through every possible combination of values for the variables and prints them
		for (int i = 1; i < Math.pow(2, variables.size())+1; i++){
			int size = variables.size();
			//Goes through all of the variables
			for (int m = size-1; m >= 0; m--){
				//if the remainder of i divided by the variables significant bit = 1
				if (i%variables.get(m).getSigBit()==1){
					//set the state
					variables.get(m).setState();
				}
				//if the significant bit = 1, also switch state
				if (variables.get(m).getSigBit() == 1){
					variables.get(m).setState();
				}
				area1.append(" | " + (variables.get(m).getState() ? "true" : "false" ));
			}
			area1.append(" || ");
			//attempts to parse the equation for the current variable states.
			//If it fails, end the program
			if (!parseEquation()){
				return;
			}
		}
	}
	
	public void invertVal(int pos){
		if ((Integer)temp.get(pos)==0){
			temp.set(pos, 1);
		}else{
			temp.set(pos, 0);
		}
	}
	
	public void orValues(int leftPos, int rightPos){
		if ((Integer)temp.get(leftPos) == 1 || (Integer) temp.get(rightPos) == 1){
			temp.set(rightPos, 1);
		}else{
			temp.set(rightPos, 0);
		}
	}
	
	public void andValues(int leftPos, int rightPos){
		if ((Integer) temp.get(leftPos) == 1 && ((Integer) temp.get(rightPos)) == 1){
			temp.set(rightPos, 1);
		}else{
			temp.set(rightPos, 0);
		}
	}
	
	public boolean isInt(int pos){
		return temp.get(pos).getClass().equals(Integer.class);
	}
	
	/**
	 * Goes through the equation and performs the calculations.
	 * @return true if the equation is properly formatted, false otherwise
	 */
	public boolean parseEquation(){
		temp = new ArrayList<>(equation);
		for (int j = 0; j < temp.size();j++){
			if (temp.get(j).getClass().equals(EquationVariables.class)){
				temp.set(j, ((EquationVariables)temp.get(j)).getState() ? 1 : 0);
			}
		}
		for (int i = 0; i < temp.size(); i++){
			if (temp.get(i).getClass().equals(Character.class)){
				if (temp.get(i).equals('~') && isInt(i+1)){
					invertVal(i+1);
				}else if ((!(i == 0) && !(i == temp.size()-1)) && isInt(i-1)){
					if (isInt(i+1)){
						if (temp.get(i).equals('+')){
							orValues(i-1, i+1);
						}else if (temp.get(i).equals('^')){
							andValues(i-1, i+1);
						}
					}else if (temp.get(i+1).equals('~') && isInt(i+2)){
						invertVal(i+2);
						if (temp.get(i).equals('+')){
							orValues(i-1, i+2);
						}else if (temp.get(i).equals('^')){
							andValues(i-1, i+2);
						}
						temp.set(i+1, "");
					}else{
						return fail();
					}
				}else {
					return fail();
				}
			//If two integers are next to each other, end the program for an improper equation
			}else if (isInt(i) && i < temp.size()-1 && isInt(i+1)){
				return fail();
			}
		}
		//prints out the solution in the last column of the truth table
		area1.append((temp.get(temp.size()-1)).toString()+"\n");
		return true;
	}
	
	/*
	 * This method prints an error method and returns false to parseEquation(), ending the program
	 */
	private boolean fail(){
                area1.append("No Output");
		area1.append("\nInvalid String");
		return false;
	}
}
    
    private class EquationVariables {
	
	private boolean state;
	private char name;
	private int sigBit;
	
	/**
	 * Stores variables with a name and a binary state (1 or 0)
	 * @param theName the name of the variable
	 * @param theState the current binary state of the variable
	 * @param significantBit helps with constructing the truth table in the TruthTableGUI class
	 */
	public EquationVariables(char theName, boolean theState, int significantBit){
		name = theName;
		state = theState;
		sigBit = significantBit;
	}
	
	/** Returns the binary state */
	public boolean getState(){
		return state;
	}
	
	/** Returns the significant bit */
	public int getSigBit(){
		return sigBit;
	}
	
	/** Returns the name */
	public char getName(){
		return name;
	}
	
	/**
	 * If state = 1, set state = 0
	 */
	public void setState(){
		state = !state;
		
	}
	
	/**
	 * Returns a String representation of the variable name, which is a Character
	 */
	@Override
	public String toString(){
		return Character.toString(name);
	}
	
}
    
    public Generator() {
        initComponents();
        setIcon();
    }

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gamelogo.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton generatebtn = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        java.awt.Button button1 = new java.awt.Button();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Truth Runes");
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);
        setSize(new java.awt.Dimension(1336, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Alkhemikal", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Truth Rune Casted");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        generatebtn.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 24)); // NOI18N
        generatebtn.setText("Generate Rune");
        generatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(generatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 60));

        input.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 18)); // NOI18N
        input.setToolTipText("");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel1.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 40));

        jLabel2.setFont(new java.awt.Font("Alkhemikal", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rune Generator");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        area1.setEditable(false);
        area1.setColumns(20);
        area1.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 24)); // NOI18N
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 1030, 400));

        jLabel3.setFont(new java.awt.Font("Alkhemikal", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Instruction:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Alkhemikal", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Rune");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        button1.setBackground(new java.awt.Color(51, 51, 51));
        button1.setFont(new java.awt.Font("Æ Systematic TT BRK", 1, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("<");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 55, 60));

        jLabel5.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Use this format: a ^ b + ~c ^ ~a  (spaces do not matter/uppercase A is the same as lowercase a)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 40));

        jLabel6.setFont(new java.awt.Font("Æ Systematic TT (BRK)", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter equation here using ^ for 'and', + for 'or', and ~ for 'not': ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TruthTable/bg.gif"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
       
    }//GEN-LAST:event_inputActionPerformed

    private void generatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatebtnActionPerformed
        area1.setText("");
        Main m = new Main();
        m.main();
    }//GEN-LAST:event_generatebtnActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        new MainMenu().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea area1;
    javax.swing.JTextField input;
    // End of variables declaration//GEN-END:variables
}

