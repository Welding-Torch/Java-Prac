import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
 
public class Main extends JFrame {
 
    JLabel message;
    JLabel nameLabel, dobLabel, genderLabel, dobFormat;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
 
    JLabel mailIdLabel, mobileNoLabel;
    JTextField mailIdField, mobileNoField;
 
    JLabel passwordLabel, rePasswordLabel;
    JPasswordField passwordField, rePasswordField;
 
    JLabel programLabel;
    JComboBox<String> programList;
 
    JLabel branchLabel, semesterLabel;
    JComboBox<String> branchList;
    JComboBox<Integer> semesterList;
 
    JButton registerButton;
    Container container;
 
    public Main() {
        message = new JLabel("Register a new Student");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        nameLabel = new JLabel("Name");
        nameField = new JTextField();
 
        dobLabel = new JLabel("DOB");
 
        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
 
        mailIdLabel = new JLabel("Mail Id");
        mailIdField = new JTextField();
 
        mobileNoLabel = new JLabel("Mobile No");
        mobileNoField = new JTextField();
 
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
 
        rePasswordLabel = new JLabel("Re Password");
        rePasswordField = new JPasswordField();
 
        programLabel = new JLabel("Courses");
        programList = new JComboBox<String>();
 
        programList.addItem("ME/M Tect");
        programList.addItem("BE/B Tect");
        programList.addItem("Diploma");
 
        branchLabel = new JLabel("Branch");
        branchList = new JComboBox<String>();
 
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Telecommunications");
        branchList.addItem("Information Technology");
        branchList.addItem("Electrical Engineering");
        branchList.addItem("Electrical and Electronics Engineering");
        branchList.addItem("Civil Engineering");
 
        semesterLabel = new JLabel("Semester");
        semesterList = new JComboBox<>();
        semesterList.addItem(1);
        semesterList.addItem(2);
        semesterList.addItem(3);
        semesterList.addItem(4);
        semesterList.addItem(5);
        semesterList.addItem(6);
        semesterList.addItem(7);
        semesterList.addItem(8);
 
        registerButton = new JButton("Register");
        container = getContentPane();
        container.setLayout(null);
        setBounds();
        addComponents();
 
    }
 
    public void setBounds() {
        message.setBounds(50, 10, 600, 30);
        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);
 
        dobLabel.setBounds(50, 110, 100, 30);
 
        genderLabel.setBounds(50, 160, 100, 30);
        genderMale.setBounds(130, 160, 100, 30);
        genderFemale.setBounds(240, 160, 100, 30);
 
        mailIdLabel.setBounds(50, 210, 100, 30);
        mailIdField.setBounds(130, 210, 200, 30);
 
        mobileNoLabel.setBounds(50, 260, 100, 30);
        mobileNoField.setBounds(130, 260, 200, 30);
 
        passwordLabel.setBounds(50, 310, 100, 30);
        passwordField.setBounds(130, 310, 200, 30);
 
        rePasswordLabel.setBounds(50, 360, 100, 30);
        rePasswordField.setBounds(130, 360, 200, 30);
 
        programLabel.setBounds(50, 410, 100, 30);
        programList.setBounds(130, 410, 200, 30);
 
        branchLabel.setBounds(50, 460, 100, 30);
        branchList.setBounds(130, 460, 200, 30);
 
        semesterLabel.setBounds(50, 510, 100, 30);
        semesterList.setBounds(130, 510, 200, 30);
 
        registerButton.setBounds(130, 550, 200, 30);
    }
 
    public void addComponents() {
        container.add(message);
        container.add(nameLabel);
        container.add(nameField);
        //container.add(dobLabel);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(mailIdLabel);
        container.add(mailIdField);
        container.add(mobileNoLabel);
        container.add(mobileNoField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(rePasswordLabel);
        container.add(rePasswordField);
        container.add(programLabel);
        container.add(programList);
        container.add(branchLabel);
        container.add(branchList);
        container.add(semesterLabel);
        container.add(semesterList);
        container.add(registerButton);
    }
 
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setBounds(500, 100, 500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
 
}