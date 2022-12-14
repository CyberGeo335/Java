package Exercise3;

import javax.swing.*;

public class ArbuziController
{
    private Arbuzi model;
    private ArbuziView view;

    ArbuziController(Arbuzi model, ArbuziView view)
    {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView()
    {
        view.getTextName().setText(model.getName());
        view.getTextSpeed().setText(String.valueOf(model.getSpeed()));
        view.getTextDisplacement().setText(String.valueOf(model.getSpaceDisplacement()));
    }

    public void initController()
    {
        view.getButtonName().addActionListener(e -> setArbuziName());
        view.getButtonSpeed().addActionListener(e -> setArbuziSpeed());
        view.getButtonDisplacement().addActionListener(e -> setArbuziSpaceDisplacement());
        view.getButtonShow().addActionListener(e -> printDetails());
    }

    public void setArbuziName()
    {
        model.setName(view.getTextName().getText());
        JOptionPane.showMessageDialog(null, "Имя сохранено",
                "Инфа", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setArbuziSpeed()
    {
        model.setSpeed(Integer.parseInt(view.getTextSpeed().getText()));
        JOptionPane.showMessageDialog(null, "Мощь сохранена",
                "Инфа", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setArbuziSpaceDisplacement()
    {
        model.setSpaceDisplacement(Integer.parseInt(view.getTextDisplacement().getText()));
        JOptionPane.showMessageDialog(null, "Номер попки сохранен",
                "Инфа", JOptionPane.INFORMATION_MESSAGE);
    }

    public void printDetails()
    {
        JOptionPane.showMessageDialog(null,
                "Арбузик: " + model.getName() + ", Мощь: " + model.getSpeed() + ", Номер попки: " + model.getSpaceDisplacement(),
                "Фотокарточка боевого арбуза", JOptionPane.INFORMATION_MESSAGE);
    }
}
