package com.guigarage.demos.flow;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.action.BackAction;
import io.datafx.controller.flow.action.LinkAction;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * <p>
 * This class defines the controller for the second view of this example. The @FXMLController annotation defines that the
 * view2.fxml file contains the definition of the UI of this view.
 * As described in the Tutorial2Main class this example will show how you can navigate between several views in flow. In
 * this example there are only two views that are defined by its controller classes: View1Controller and View2Controller.
 * </p>
 * <p>
 * How the navigation is working can be found in the View1Controller class. The only different between this class and the
 * View1Controller class is that in this case the @LinkAction annotation defines a navigation to the view that is defined
 * by the View1Controller class.
 * </p>
 */
@FXMLController("view2.fxml")
public class View2Controller {

    @FXML
    @BackAction
    private Button actionButton;
}
