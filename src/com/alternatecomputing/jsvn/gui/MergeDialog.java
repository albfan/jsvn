package com.alternatecomputing.jsvn.gui;

import com.alternatecomputing.jsvn.command.Commandable;
import com.alternatecomputing.jsvn.command.Merge;
import com.alternatecomputing.jsvn.configuration.ConfigurationManager;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.Map;

/**
 *
 */
public class MergeDialog extends CommandDialog {
	private static final String DIALOG_TITLE = "Merge";
	private static final String DIALOG_CAPTION = "Merge Options";

	/**
     * constructor
     * @param parent parent frame
     * @param modal boolean indicating whether or not this dialog is modal
     */
        public MergeDialog(Frame parent, boolean modal) {
            super(parent, modal);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(470, 260));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Revision 1:");
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 27, 0);
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("URL 1:");
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 0, 0);
        jPanel1.add(jRadioButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 0, 35);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField1, gridBagConstraints);

        jTextField2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 4, 35);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField2, gridBagConstraints);

        jCheckBox1.setText("Non-recursive");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel1.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setText("Dry-run");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.insets = new java.awt.Insets(7, 20, 23, 0);
        jPanel1.add(jCheckBox2, gridBagConstraints);

        jLabel3.setText("Revision 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(11, 60, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 1, 35);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel4.setText("URL 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jTextField4.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 1, 35);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void actionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionHandler
        actionPerformed(evt);
    }//GEN-LAST:event_actionHandler

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm

    }//GEN-LAST:event_exitForm

    /**
	 * creates the appropriate command to run and populated the given Map with appropriate arguments to configure the command
     * @param args map of arguments to be passed into the returned command
     * @return implementation of Command to execute with the given configured args
     */
    protected Commandable buildCommand(Map args) {
		if (jRadioButton1.isSelected()) {
			args.put(Merge.SOURCE1, jTextField1.getText());
			args.put(Merge.SOURCE2, jTextField3.getText());
		}
		if (jRadioButton2.isSelected()) {
			args.put(Merge.SOURCE1, jTextField2.getText());
			args.put(Merge.SOURCE2, jTextField4.getText());
		}
		if (jCheckBox1.isSelected()) {
			args.put(Merge.NONRECURSIVE, Boolean.TRUE);
		}
		if (jCheckBox2.isSelected()) {
			args.put(Merge.DRY_RUN, Boolean.TRUE);
		}
		args.put(Merge.TARGET, getTargets());
		return new Merge();
    }

    /**
	 * gets the captions to be displayed in the options panel
     * @return options panel caption
     */
    protected String getDialogCaption() {
        return DIALOG_CAPTION;
    }

    /**
	 * gets the title of the dialog
     * @return dialog title
     */
    protected String getDialogTitle() {
        return DIALOG_TITLE;
    }

    /**
	 * gets the panel in which all options for the command are configured
     * @return options panel
     */
    protected JPanel getOptionsPanel() {
        initComponents();
        return jPanel1;
    }

    /**
	 * determines whether the selected options are valid before the command is allowed to execute
     * @return options validity indicator
     */
    protected boolean isValidOptions() {
		if (jRadioButton1.isSelected()) {
			if (jTextField1.getText().trim().length() == 0) {
				JOptionPane.showMessageDialog(this.getContentPane(), "Must specify a value for Revision 1");
				return false;
			}
			if (jTextField3.getText().trim().length() == 0) {
				JOptionPane.showMessageDialog(this.getContentPane(), "Must specify a value for Revision 2");
				return false;
			}
		}
		if (jRadioButton2.isSelected()) {
			if (jTextField2.getText().trim().length() == 0) {
				JOptionPane.showMessageDialog(this.getContentPane(), "Must specify a value for URL 1");
				return false;
			}
			if (jTextField4.getText().trim().length() == 0) {
				JOptionPane.showMessageDialog(this.getContentPane(), "Must specify a value for URL 2");
				return false;
			}
		}
		return true;
    }

	/**
	 * Invoked when an action occurs.
	 */
	public void actionPerformed(ActionEvent e) {
		if ("Revision 1".equals(e.getActionCommand())) {
			jTextField1.setEnabled(true);
			jTextField3.setEnabled(true);
			jTextField2.setEnabled(false);
			jTextField4.setEnabled(false);
		} else if ("URL 1".equals(e.getActionCommand())) {
			jTextField1.setEnabled(false);
			jTextField3.setEnabled(false);
			jTextField2.setEnabled(true);
			jTextField4.setEnabled(true);
		}

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
