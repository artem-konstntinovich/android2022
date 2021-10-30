package accountexample;
import javax.swing.JFrame;
//extends = расширяет (дополняет, делает более сложным)
//наследует (наследуется) JFrame (стандартное окно)
public class MyWindow extends JFrame {
    public MyWindow()
    {
        this.setTitle("Первое окно для теста");
        this.setSize(200, 50);
    }
}
