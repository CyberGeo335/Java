package Exercise2;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;

    EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeWages(int wages) {
        model.setWages(wages);
    }

    public int getEmployeeWages() {
        return model.getWages();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getWages());
    }
}
