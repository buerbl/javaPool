package java核心技术代码.v2ch08.buttons3;

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.01 2016-05-10
 * @author Cay Horstmann
 */
public class ButtonTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() ->
         {

            ButtonFrame frame = new ButtonFrame();
            frame.setTitle("ButtonTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}