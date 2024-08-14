import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class frame extends JFrame {
    panel p;
    frame(){
        super.setTitle("tic tac toe game");
        p=new panel();
        add(p);
    }
}

class panel extends JPanel implements ActionListener {
    int c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;

    ImageIcon img1,img2,img3,imga,imgb,imgc;

    Image blank,x,o;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    JTextField t1,t2;

    panel(){

        setBackground(Color.BLUE);

        img1=new ImageIcon("blank.png");
        img2=new ImageIcon("x.png");
        img3=new ImageIcon("o.png");

        blank= img1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        x= img2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        o= img3.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);

        imga=new ImageIcon(blank);
        imgb=new ImageIcon(x);
        imgc=new ImageIcon(o);

        setLayout(null);


        b1=new JButton("1");
        b1.setIcon(imga);
        b1.setBounds(200,0,100,100);
        add(b1);
        b1.addActionListener(this);

        b2=new JButton("2");
        b2.setIcon(imga);
        b2.setBounds(300,0,100,100);
        add(b2);
        b2.addActionListener(this);

        b3=new JButton("3");
        b3.setIcon(imga);
        b3.setBounds(400,0,100,100);
        add(b3);
        b3.addActionListener(this);


        b4=new JButton("4");
        b4.setIcon(imga);
        b4.setBounds(200,100,100,100);
        add(b4);
        b4.addActionListener(this);

        b5=new JButton("5");
        b5.setIcon(imga);
        b5.setBounds(300,100,100,100);
        add(b5);
        b5.addActionListener(this);

        b6=new JButton("6");
        b6.setIcon(imga);
        b6.setBounds(400,100,100,100);
        add(b6);
        b6.addActionListener(this);


        b7=new JButton("7");
        b7.setIcon(imga);
        b7.setBounds(200,200,100,100);
        add(b7);
        b7.addActionListener(this);

        b8=new JButton("8");
        b8.setIcon(imga);
        b8.setBounds(300,200,100,100);
        add(b8);
        b8.addActionListener(this);

        b9=new JButton("9");
        b9.setIcon(imga);
        b9.setBounds(400,200,100,100);
        add(b9);
        b9.addActionListener(this);

        b10=new JButton("restart");
        b10.setBounds(200,350,100,20);
        add(b10);
        b10.addActionListener(this);


        t1=new JTextField();
        t1.setText("player1");
        t1.setBounds(50,210,100,20);
        add(t1);

        t2=new JTextField();
        t2.setText("player2");
        t2.setBounds(50,260,100,20);
        add(t2);
    }

    public void checkWin(){
        if((c1==c2&&c1==c3&&c1!=0)||(c4==c5&&c4==c6&&c4!=0)||(c7!=0&&c7==c8&&c7==c9)
                ||(c1!=0&&c1==c4&&c1==c7)||(c2!=0&&c2==c5&&c2==c8)||(c3!=0&&c3==c6&&c3==c9)
                ||(c1!=0&&c1==c5&&c1==c9)||(c3!=0&&c3==c5&&c3==c7)){
            JOptionPane.showMessageDialog(this,"player"+(c+1)+"win the match","game over",JOptionPane.INFORMATION_MESSAGE);
            restart();
        }
    }

    public void restart(){
        c=c1=c2=c3=c4=c5=c6=c7=c8=c9=0;
        b1.setIcon(imga);
        b2.setIcon(imga);
        b3.setIcon(imga);
        b4.setIcon(imga);
        b5.setIcon(imga);
        b6.setIcon(imga);
        b7.setIcon(imga);
        b8.setIcon(imga);
        b9.setIcon(imga);
    }

    public void actionPerformed(ActionEvent e){
        if(c==0){
            if(e.getSource()==b1){
                if(c1==0) {
                    b1.setIcon(imgb);c1+=1;
                    checkWin();
                    c=1;
                }
            }
            if(e.getSource()==b2){
                if(c2==0) {
                    b2.setIcon(imgb);c2+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b3){
                if(c3==0) {
                    b3.setIcon(imgb);c3+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b4){
                if(c4==0) {
                    b4.setIcon(imgb);c4+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b5){
                if(c5==0) {
                    b5.setIcon(imgb);c5+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b6){
                if(c6==0) {
                    b6.setIcon(imgb);c6+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b7){
                if(c7==0) {
                    b7.setIcon(imgb);c7+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b8){
                if(c8==0) {
                    b8.setIcon(imgb);c8+=1;
                    checkWin();
                    c=1;

                }
            }
            if(e.getSource()==b9){
                if(c9==0) {
                    b9.setIcon(imgb);c9+=1;
                    checkWin();
                    c=1;

                }
            }

        }
        else{
            if(e.getSource()==b1){
                if(c1==0) {
                    b1.setIcon(imgc);c1+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b2){
                if(c2==0) {
                    b2.setIcon(imgc);c2+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b3){
                if(c3==0) {
                    b3.setIcon(imgc);c3+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b4){
                if(c4==0) {
                    b4.setIcon(imgc);c4+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b5){
                if(c5==0) {
                    b5.setIcon(imgc);c5+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b6){
                if(c6==0) {
                    b6.setIcon(imgc);c6+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b7){
                if(c7==0) {
                    b7.setIcon(imgc);c7+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b8){
                if(c8==0) {
                    b8.setIcon(imgc);c8+=2;
                    checkWin();
                    c=0;

                }
            }
            if(e.getSource()==b9){
                if(c9==0) {
                    b9.setIcon(imgc);c9+=2;
                    checkWin();
                    c=0;

                }
            }
        }
        if(e.getSource()==b10)
            restart();
        //repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(x,0,200,40,40,this);
        g.drawImage(o,0,250,40,40,this);
    }
}

public class tictactoe {
    public static void main(String[] args){
        frame f=new frame();
        f.setVisible(true);
        f.setBounds(0,0,700,700);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
