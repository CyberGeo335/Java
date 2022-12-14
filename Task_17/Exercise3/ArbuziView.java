package Exercise3;

import javax.swing.*;
import java.awt.*;

public class ArbuziView extends JFrame
{

    private TextField textName;
    private TextField textSpeed;
    private TextField textDisplacement;
    private JButton buttonName;
    private JButton buttonSpeed;
    private JButton buttonDisplacement;

    private JButton buttonShow;
    ArbuziView()
    {
        setSize(560, 190);
        setLayout(null);
        setTitle("Ваш личный боевой арбуз");
        JLabel name = new JLabel("Введите имя арбуза: ");
        JLabel speed = new JLabel("Введите боевую мощь: ");
        JLabel spaceDisplacement = new JLabel("Введите номер типа попки: ");
        name.setBounds(20, 20, 150, 20);
        speed.setBounds(20, 50, 150, 20);
        spaceDisplacement.setBounds(20, 80, 180, 20);
        setTextName(new TextField());
        setTextSpeed(new TextField());
        setTextDisplacement(new TextField());
        getTextName().setBounds(230, 20, 100, 20);
        getTextSpeed().setBounds(230, 50, 100, 20);
        getTextDisplacement().setBounds(230, 80, 100, 20);
        setButtonName(new JButton("Сохранить имя"));
        setButtonSpeed(new JButton("Сохранить мощь"));
        setButtonDisplacement(new JButton("Сохранить номер"));
        setButtonShow(new JButton("Показать параметры боевого арбуза"));
        getButtonName().setBounds(350, 18, 200, 24);
        getButtonSpeed().setBounds(350, 48, 200, 24);
        getButtonDisplacement().setBounds(350, 78, 200, 24);
        getButtonShow().setBounds(150, 110, 290, 30);
        setLocationRelativeTo(null);
        add(name);
        add(speed);
        add(spaceDisplacement);
        add(getTextName());
        add(getTextSpeed());
        add(getTextDisplacement());
        add(getButtonName());
        add(getButtonSpeed());
        add(getButtonDisplacement());
        add(getButtonShow());
        setVisible(true);
    }

    public TextField getTextName() {
        return textName;
    }

    public void setTextName(TextField textName) {
        this.textName = textName;
    }

    public TextField getTextSpeed() {
        return textSpeed;
    }

    public void setTextSpeed(TextField textSpeed) {
        this.textSpeed = textSpeed;
    }

    public TextField getTextDisplacement() {
        return textDisplacement;
    }

    public void setTextDisplacement(TextField textDisplacement) {
        this.textDisplacement = textDisplacement;
    }

    public JButton getButtonName() {
        return buttonName;
    }

    public void setButtonName(JButton buttonName) {
        this.buttonName = buttonName;
    }

    public JButton getButtonSpeed() {
        return buttonSpeed;
    }

    public void setButtonSpeed(JButton buttonSpeed) {
        this.buttonSpeed = buttonSpeed;
    }

    public JButton getButtonDisplacement() {
        return buttonDisplacement;
    }

    public void setButtonDisplacement(JButton buttonDisplacement) {
        this.buttonDisplacement = buttonDisplacement;
    }

    public JButton getButtonShow() {
        return buttonShow;
    }

    public void setButtonShow(JButton buttonShow){
        this.buttonShow = buttonShow;
    }
}
