import javax.swing.*;

public class TestGubbe extends JButton {
    int x;
    int y;
    int width;
    int height;

    TestGubbe(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        JButton gubbe = new JButton(new ImageIcon("src/2561211_circle_x_icon.png"));
        //JButton gubbe = new JButton("Hej min mamma");

        gubbe.setBounds(x,y,width,height);
        gubbe.setBorder(BorderFactory.createEmptyBorder());
        gubbe.setContentAreaFilled(false);
    }

}
