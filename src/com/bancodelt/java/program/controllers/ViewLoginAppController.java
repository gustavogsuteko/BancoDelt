package com.bancodelt.java.program.controllers;

import com.bancodelt.java.program.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ViewLoginAppController implements Initializable {

    @FXML
    private ImageView btnVoltar;
    @FXML
    private TextField txtFCPF;
    @FXML
    private TextField txtFSenha;
    @FXML
    private Button btnEntrar;
    @FXML
    private HBox hboxlogin;
    
    Main m = new Main();
    ViewOpenAppController voac = new ViewOpenAppController();
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MouseBarEvents();
        txtFCPF.setText(ViewOpenAppController.getCPFinput());
        txtFSenha.setEditable(true);
    }   

    @FXML
    private void AcaoBtnEntrar(ActionEvent event) throws IOException {
        LoginApp();
    }
    
    @FXML
    private void btnVoltarClick(MouseEvent event) throws IOException {
        Main.getProgram().close();
        m.switchTelas(new Stage(), "ViewOpenApp.fxml");
    }
    
    private boolean LoginApp() throws IOException{
        if(txtFCPF.getText().equals("1234") && txtFSenha.getText().equals("1234")){
            Main.getProgram().close();
            m.switchTelas(new Stage(), "ViewPrincipalApp.fxml");
            return true;
        } else {
            return false;
        }
    }
    
    private void MouseBarEvents() {
        btnVoltar.setOnMouseEntered((event) -> {
            btnVoltar.setFitWidth(25);
            btnVoltar.setFitHeight(25);
        });
        btnVoltar.setOnMouseExited((event) -> {
            btnVoltar.setFitWidth(20);
            btnVoltar.setFitHeight(20);
        });
    }
}
