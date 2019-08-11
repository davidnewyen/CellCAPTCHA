package controller;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class Application {

    public view.Start view_start;
    public view.Login view_login;
    public view.Register view_register;
    public view.Home view_home;
    
    Application () throws UnsupportedLookAndFeelException {
        BasicLookAndFeel darcula = new DarculaLaf();
        UIManager.setLookAndFeel(darcula);
        
        view_start = new view.Start();
        view_start.setVisible(true);
        view_login = new view.Login();
        view_register = new view.Register();
        view_home = new view.Home();
    }
    
}
