package com.alternatecomputing.jsvn.gui;

import com.alternatecomputing.jsvn.command.Commandable;
import com.alternatecomputing.jsvn.command.Switch;
import com.alternatecomputing.jsvn.command.Update;
import com.alternatecomputing.jsvn.configuration.ConfigurationManager;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.Map;

/**
 *
 */
public class SwitchDialog extends CommandDialog {
	private static final String DIALOG_TITLE = "Switch";
	private static final String DIALOG_CAPTION = "Switch Options";

	/**
     * constructor
     * @param parent parent frame
     * @param modal boolean indicating whether or not this dialog is modal
     */
        public SwitchDialog(Frame parent, boolean modal) {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(475, 225));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 30);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 4, 30);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField2, gridBagConstraints);

        jCheckBox1.setText("Non-recursive");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 32, 0);
        jPanel1.add(jCheckBox1, gridBagConstraints);

        jLabel1.setText("URL:");
        jLabel1.setPreferredSize(new java.awt.Dimension(24, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 15, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel3.setText("new URL to mirror");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 30);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("specify revision number ARG (or X:Y range)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.insets = new java.awt.Insets(35, 10, 38, 30);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel4, gridBagConstraints);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Revision:");
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.insets = new java.awt.Insets(15, 50, 0, 0);
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("Date:");
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.insets = new java.awt.Insets(27, 50, 0, 0);
        jPanel1.add(jRadioButton2, gridBagConstraints);

        jTextField3.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 4, 30);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel2.setText("specify a date ARG (instead of a revision)");
        jLabel2.setMaximumSize(new java.awt.Dimension(267, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(267, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(267, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.insets = new java.awt.Insets(47, 10, 70, 30);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

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
		args.put(Switch.URL, jTextField1.getText().trim());
		String revision = jTextField2.getText().trim();
		if (jRadioButton1.isSelected() && revision.length() > 0) {
			args.put(Update.REVISION, revision);
		}
		String date = jTextField3.getText().trim();
		if (jRadioButton2.isSelected() && date.length() > 0) {
			args.put(Update.REVISION, "{" + date + "}");
		}
		if (jCheckBox1.isSelected()) {
			args.put(Switch.NONRECURSIVE, Boolean.TRUE);
		}
		args.put(Switch.PATH, getTargets());
		return new Switch();
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
		if (jTextField1.getText().trim().length() < 1) {
			JOptionPane.showMessageDialog(this.getContentPane(), "Must specify a URL");
			return false;
		}
		return true;
    }

	/**
	 * Invoked when an action occurs.
	 */
	public void actionPerformed(ActionEvent e) {
		if (jRadioButton1.isSelected()) {
			jTextField2.setEnabled(true);
			jTextField3.setEnabled(false);
		}
		if (jRadioButton2.isSelected()) {
			jTextField2.setEnabled(false);
			jTextField3.setEnabled(true);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables

}
