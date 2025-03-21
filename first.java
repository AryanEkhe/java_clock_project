import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel; 


class first extends JFrame{
    Calendar calendar; 
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date; 

    first(){ 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program"); 
        this.setSize(350,200);
        this.setLayout(new FlowLayout());
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN, 50));
        // timeLabel.setForeground(new Color(0x00FF00));
        // timeLabel.setBackground(Color.BLACK);
        // timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana",Font.PLAIN, 20));
        
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana",Font.PLAIN, 20));
        
        this.add(timeLabel); 
        this.add(dayLabel); 
        this.add(dateLabel); 
        this.setVisible(true);

        setTime();
         
    }

    public void setTime(){
        while(true){
        time = timeFormat.format(Calendar.getInstance().getTime()); 
        timeLabel.setText(time);

        
        day = dayFormat.format(Calendar.getInstance().getTime()); 
        dayLabel.setText(day);

        
        date = dateFormat.format(Calendar.getInstance().getTime()); 
        dateLabel.setText(date);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        }
    }
}