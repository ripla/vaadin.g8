package $package$;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;

public class $classname$UI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout view = new VerticalLayout();
        view.addComponent(new Label("Hello Vaadin!"));
        setContent(view);
    }
}