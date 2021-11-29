import javax.swing.*;

class Square{
    int x;
    int y;
    int width;
    int height;

    Square(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        JButton square = new JButton();
        square.setText("Placeholder");
        square.setBounds(x, y, width, height);
        square.setVisible(true);
    }
}