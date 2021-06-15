package The_property_management.view;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import The_property_management.dao.UserDao;
import The_property_management.database.dome;
import The_property_management.model.User;
import The_property_management.util.StringUtil;

public class LogOnFrm extends JFrame {

    private JPanel contentPane;
    private JTextField userName;
    private JPasswordField passWord;
    private dome dm= new dome();
    private UserDao userdao = new UserDao();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogOnFrm frame = new LogOnFrm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LogOnFrm() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(LogOnFrm.class.getResource("/img/\u5C4F\u5E55\u622A\u56FE 2021-06-07 193031.png")));
        setTitle("\u5355\u4F4D\u623F\u4EA7\u7BA1\u7406\u7CFB\u7EDF");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 555, 390);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("\u5355\u4F4D\u623F\u4EA7\u7BA1\u7406\u7CFB\u7EDF");
        lblNewLabel.setFont(new Font("宋体", Font.BOLD, 21));
        lblNewLabel.setIcon(new ImageIcon(LogOnFrm.class.getResource("/img/\u5C4F\u5E55\u622A\u56FE 2021-06-07 194052.png")));

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(LogOnFrm.class.getResource("/img/\u5C4F\u5E55\u622A\u56FE 2021-06-07 194415.png")));

        JLabel lblNewLabel_2 = new JLabel("\u7528\u6237\u540D\uFF1A");
        lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 14));

        JLabel lblNewLabel_3 = new JLabel("\u5BC6  \u7801\uFF1A");
        lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 14));

        userName = new JTextField();
        userName.setColumns(10);

        passWord = new JPasswordField();

        JButton loginBut = new JButton("\u767B\u5F55");
        loginBut.setFont(new Font("宋体", Font.BOLD, 14));
        loginBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });

        JButton resetBut = new JButton("\u91CD\u7F6E");
        resetBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                resetActionPerformed(e);

            }
        });
        resetBut.setFont(new Font("宋体", Font.BOLD, 14));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(154, Short.MAX_VALUE)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                                .addGap(33)
                                .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                .addGap(21))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(121)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel_3))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(passWord)
                                        .addComponent(userName, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addContainerGap(159, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(134)
                                .addComponent(loginBut, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addGap(53)
                                .addComponent(resetBut, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(150, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(31)
                                                .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(77)
                                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                                .addGap(49)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_2)
                                        .addComponent(userName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(passWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(41)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(resetBut)
                                        .addComponent(loginBut))
                                .addContainerGap(52, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
        //设置剧中显示
        this.setLocationRelativeTo(null);
    }


    private void loginActionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        String userName = 	this.userName.getText();
        String passWord =new  String(this.passWord.getPassword());
        if(StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(null,"用户名不能为空");
            return;
        }
        if(StringUtil.isEmpty(passWord)) {
            JOptionPane.showMessageDialog(null,"密码不能为空");
            return;
        }
        User user = new User(userName,passWord);

        Connection con = null;
        try {
            con = dm.getCon();
            User currentUser = userdao.login(con,user);
            if(currentUser != null) {
                JOptionPane.showMessageDialog(null,"登录成功");
            }
            else{
                JOptionPane.showMessageDialog(null,"用户名或者密码错误");
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                dm.closeCon(con);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    //重置密码操作
    private void resetActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        this.userName.setText("");
        this.passWord.setText("");
    }
}
