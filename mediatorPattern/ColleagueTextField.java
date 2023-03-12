package mediatorPattern;
import java.awt.*;
import java.awt.event.*;


public class ColleagueTextField extends TextField implements Colleague {
    private Mediator mediator;
    public ColleagueTextField(String caption, int columns) {
        super(caption, columns);
    }
	public void setMediator(Mediator mediator) {
        this.mediator = mediator;
	}
	public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
	}
    public void addTextListener(ColleagueTextField textFiled) {
        this.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                mediator.colleagueChanged(textFiled);
            }
        });
    }
}