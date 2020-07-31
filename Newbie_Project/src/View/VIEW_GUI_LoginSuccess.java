package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import model.userVO;

import javax.swing.JLabel;

public class VIEW_GUI_LoginSuccess {

   private JFrame frame;
   public VIEW_GUI_LoginSuccess(userVO vo) {
      initialize(vo);
      frame.setVisible(true);
   }
   private void initialize(userVO vo) {
      frame = new JFrame();
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JLabel lbl = new JLabel("name");
      lbl.setBounds(27, 93, 57, 15);
      frame.getContentPane().add(lbl);
      lbl.setText(vo.getName());
   }
}