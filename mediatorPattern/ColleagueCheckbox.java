package mediatorPattern;
import java.awt.*;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements Colleague {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup checkboxgroup, boolean enabled) {
        super(caption, checkboxgroup, enabled);
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
    public void addItemListener(ColleagueCheckbox checkbox) {
        this.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                mediator.colleagueChanged(checkbox);
            }
        });
    }
}