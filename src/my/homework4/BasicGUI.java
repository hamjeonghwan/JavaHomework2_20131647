package my.homework4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BasicGUI {
    private static String piece="O";
    protected static Boolean player=true;
    private static final JFrame frame = new JFrame("Tic Tac Toe");
    private static final JPanel panel=new JPanel(new GridLayout(4,3));
    protected static final JButton[] cells= new JButton[9];
    private static final JButton exitButton=new JButton("Exit");
    private static final JButton restartButton=new JButton("Restart");
    protected static final JLabel winLabel = new JLabel("Make a move");

    public static void main(String[] args){
         createWindow();
         createButtons();
    }


    //Set up frame
    private static void createWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 600);
        frame.setVisible(true);
    }

    //Add action listeners to buttons
    private static void createButtons(){
        for(int i=0; i<9; i++){
            cells[i]=new JButton();
            cells[i].addActionListener(new ButtonHandler());
            panel.add(cells[i]);
        }
        exitButton.addActionListener(new ExitHandler());
        restartButton.addActionListener(new RestartHandler());
        panel.add(exitButton);
        panel.add(restartButton);
        panel.add(winLabel);
        frame.add(panel);
        frame.setVisible(true);
        //frame.pack();
    }

    protected static String getPiece(){
        return piece;
    }
    protected static void setPiece(String s){
        piece=s;
    }

    protected static Boolean checkWinner(){
        if(checkCells(cells[0], cells[4], cells[8])) return true;
        else if(checkCells(cells[2], cells[4], cells[6])) return true;

        else if(checkCells(cells[2], cells[5], cells[8])) return true;
        else if(checkCells(cells[1], cells[4], cells[7])) return true;
        else if(checkCells(cells[0], cells[3], cells[6])) return true;

        else if(checkCells(cells[0], cells[1], cells[2])) return true;
        else if(checkCells(cells[3], cells[4], cells[5])) return true;
        else if(checkCells(cells[6], cells[7], cells[8])) return true;
        else return false;
    }

    /*Checks the series in the array to see if they contain the same piece,
    * resulting in a win condition. */
    private static Boolean checkCells(JButton cell1, JButton cell2, JButton cell3){
        return(cell1.getText()==getPiece() &&
               cell2.getText()==getPiece() &&
               cell3.getText()==getPiece()
        );
    }
}

class ButtonHandler implements ActionListener{  
    public void actionPerformed(ActionEvent e){
        //Sets the button clicked to the piece then disables the button
        JButton pressedButton=(JButton)(e.getSource());
        pressedButton.setText(BasicGUI.getPiece());
        pressedButton.setEnabled(false);

        //If there is no winner; change the piece and player then exit method
        if(!BasicGUI.checkWinner()){
            BasicGUI.player=!BasicGUI.player;
            String changePiece=(BasicGUI.player)? "O":"X";
            BasicGUI.setPiece(changePiece);
            BasicGUI.winLabel.setText(BasicGUI.getPiece()+" make a move");
            return;
        }
        //If a win condition is found, disable all the buttons for the game an show who won
        for(JButton c:BasicGUI.cells){
            c.setEnabled(false);
            BasicGUI.winLabel.setText("Game over! "+BasicGUI.getPiece()+" won!");
        }
        return;
    }
}

//Exit game if clicked
class ExitHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

//Clear the text on the games buttons and re-enable them if disabled
class RestartHandler implements ActionListener{
    BasicGUI GUI = new BasicGUI();
    public void actionPerformed(ActionEvent e){
        for(JButton c:GUI.cells){
            c.setEnabled(true);
            c.setText("");
        }
    }
}