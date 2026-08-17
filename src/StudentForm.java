import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm implements ActionListener {

    JFrame jFrame;
    JLabel l1,l2;
    JTextField name,email;
    JButton save;

    StudentForm(){
        jFrame = new JFrame("Student Form");
        l1 = new JLabel("Student Name");
        l2 = new JLabel("Student Email");
        name = new JTextField();
        email = new JTextField();
        save = new JButton("save");

        l1.setBounds(50,50,100,30);
        l2.setBounds(50,90,100,30);
        name.setBounds(160,50,150,30);
        email.setBounds(160,90,150,30);
        save.setBounds(100,120,100,30);

        jFrame.add(l1);
        jFrame.add(name);
        jFrame.add(l2);
        jFrame.add(email);
        jFrame.add(save);

        save.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
    public static void main(String[] args){
        new StudentForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name1 = name.getText();
        String email1 = email.getText();
        JOptionPane.showMessageDialog(jFrame,"Student Name is "+name1+ "Student Email :"+email1);
    }
}