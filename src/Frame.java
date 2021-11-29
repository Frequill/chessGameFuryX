import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {




      Frame(){
        setTitle("Moron-chess!");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.ORANGE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        panel.setBackground(Color.ORANGE);

        //Letters to name each chess tile
        JLabel letterLable = new JLabel();
        letterLable.setBounds(580, 420, 1000, 1000);
        Font font = new Font("serif", Font.ITALIC, 30);
        letterLable.setFont(font);
        letterLable.setText("A          B          C          D          E          F          G          H");
        letterLable.setVisible(true);

        setVisible(true); //Frame
        panel.setVisible(true);  //Panel
        panel.add(letterLable);
      }



      public void paint(Graphics Edwin) {
          super.paint(Edwin);
          int x = 550;
          int y = 125;
          boolean color = true;


          for (int j = 0; j < 8; j++) {
              for (int i = 0; i < 8; i++) {
                  Edwin.drawRect(x, y, 100, 100);
                  if (color) {
                      Edwin.setColor(Color.BLACK);
                      color = false;
                  } else {
                      Edwin.setColor(Color.WHITE);
                      color = true;
                  }
                  Edwin.fillRect(x, y, 100, 100);
                  x = x + 100;
              }

              if (color){
                  color = false;
              }
              else{
                  color = true;
              }
              y = y + 100;
              x = 550;
          }
      }
}
