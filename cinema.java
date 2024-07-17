package cinema;


import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class cinema extends JFrame {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Theater> theaters = new ArrayList<>();
    private ArrayList<Cinemahall> cinemahalls = new ArrayList<>();
    private ArrayList<Movieshow> movieshows = new ArrayList<>();

    public cinema() {
        setTitle("Cinema Ticketing System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setupGUI();
    }

    private void setupGUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JButton addCustomerButton = new JButton("Add Customer");
        addCustomerButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                addCustomer();
            }

            private void addCustomer() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(addCustomerButton);

        add(panel);
    }
public static void main(String[] args){
    SwingUtilities.invokeLater(() -> {
            cinema cinema = new cinema();
            cinema.setVisible(true);
        });
    
}
        }