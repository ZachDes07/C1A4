package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txfMin;
    public TextField txfMax;
    public TextField txfMoyenne;
    public ListView <Integer> lsvListe;
    public CheckBox chbMulti;
    public Button btnSelect;

    /**
     * Initialize les valeurs du ListView lsvListe
     */
    public void initialize(){
        lsvListe.getItems().addAll(1, 2, 3, 4, 5, 6);
    }

    public int[] convertTOArray(ObservableList<Integer> list){
        ObservableList<Integer> listSelect = lsvListe.getSelectionModel().getSelectedItems();

        return listSelect;
    }

    /**
     * Ajoute min/max/moyenne aux bon txf
     * @param actionEvent
     */
    public void btnGOActionEvent(ActionEvent actionEvent) {

    }

    public void btnSelectActionEvent(ActionEvent actionEvent) {
        lsvListe.getSelectionModel().getSelectedItems();
    }

    public void chbMutliActionEvent(ActionEvent actionEvent) {
        btnSelect.setDisable(false);
    }
}
