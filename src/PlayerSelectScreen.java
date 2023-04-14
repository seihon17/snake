
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//needs massive aesthetic rewrites
public class PlayerSelectScreen extends JPanel {

    JButton go;
    JButton quit;
    MainWindow mw;

    JRadioButton opt1;
    JRadioButton opt2;
    JRadioButton opt3;

    public void quitButtonActionListener() {
        mw.showCard("One");
    }

    public void goButtonActionListener() {
        playerOptions();
        mw.s4.setUpPlayers();
        mw.showCard("Three");
    }

    public void playerOptions() {
        int m = 5;
        if (opt1.isSelected() == true) {
            m = 1;
        } else if (opt2.isSelected() == true) {
            m = 2;
        } else if (opt3.isSelected() == true) {
            m = 3;
            
        }
        mw.s4.setMaxPlayers(m);
    }
/**
 * 
 * @param mw 
 */
    public PlayerSelectScreen(MainWindow mw) {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        final String select_Players_ = "Select Players: ";

        JLabel mess = new JLabel(select_Players_);
        add(mess);
        final String default_1Player = "Default: 1Player";

        JLabel uc = new JLabel(default_1Player);
        add(uc);
        final String _PlayerDefault = "1 Player(Default)";

        //set up radio buttons
        opt1 = new JRadioButton(_PlayerDefault);
        opt1.setSelected(true);
        final String _Players = "2 Players";

        opt2 = new JRadioButton(_Players);
        final String _Players1 = "3 Players";
        opt3 = new JRadioButton(_Players1);

        ButtonGroup grp = new ButtonGroup();
        grp.add(opt1);
        grp.add(opt2);
        grp.add(opt3);

        add(opt1);
        add(opt2);
        add(opt3);

        final ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                playerOptions();
            }
        };

        opt1.addActionListener(actionListener);
        opt2.addActionListener(actionListener);

        opt3.addActionListener(actionListener);

        go = new JButton("Customize Board");
        quit = new JButton("Back");
        final ActionListener actionListener1 = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                goButtonActionListener();
            }
        };

        go.addActionListener(actionListener1);
        final ActionListener actionListener2 = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                quitButtonActionListener();
            }
        };

        quit.addActionListener(actionListener2);

        add(go);
        add(quit);

    }

}
