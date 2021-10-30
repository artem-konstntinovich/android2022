package geronuitest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class MyWindow extends JFrame implements ActionListener {
    private JLabel lblMessage;
    private JButton btnCalc;
    private JPanel panel;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    public MyWindow()
    {
        setSize(400,200);
        setTitle("Площадь треугольника по формуле Герона");
        //Задаем общее правило размещения элементов на окне
        this.setLayout( new BorderLayout()    );
        //Сообщение = JLabel
        lblMessage = new JLabel("Введите стороны:");
        this.add(this.lblMessage, BorderLayout.NORTH);
        //Три элемента ввода - стороны (группа),
        //помещаем на Панель JPanel
        panel = new JPanel();
        this.add(this.panel, BorderLayout.CENTER);
        //элементы панели
        txtA = new JTextField();
        txtB = new JTextField();
        txtC = new JTextField();
        panel.setLayout( new BorderLayout()   );
        panel.add(txtA, BorderLayout.NORTH);
        panel.add(txtB, BorderLayout.CENTER);
        panel.add(txtC, BorderLayout.SOUTH);
        //
        //кнопка для вычисления = JButton
        btnCalc = new JButton("Вычислить");
        this.add(this.btnCalc, BorderLayout.SOUTH);
        btnCalc.addActionListener(this);//назначили кнопку ответственной
        //за генерацию действия пользователя для окна
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    //здесь команды, которые выполнить. если кто-то с окном взаимодействует    
           String strA = txtA.getText();
           String strB = txtB.getText();
           String strC = txtC.getText();
           double A = Double.parseDouble(strA);
           double B = Double.parseDouble(strB);
           double C = Double.parseDouble(strC);
           double S = MyMath.calcGeron(A, B, C);
           String RESULT = String.valueOf(S);
           lblMessage.setText("Площадь равна "+RESULT);
    }
    
    
}
