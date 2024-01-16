package co.edu.uptc.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.view.MyFrame;

public class Presenter implements ActionListener {

    private MyFrame view;

    public Presenter() {
        view = new MyFrame(this);
    }

    public static void main(String[] args) {
        new Presenter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("login"))
            view.showLoginDialog();
        else if (e.getActionCommand().equals("register"))
            System.out.println("Register");
    }
}
