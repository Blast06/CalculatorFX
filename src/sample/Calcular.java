package sample;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Calcular implements Initializable{

    @FXML
    private TextField resultadoPantalla;

    @FXML
    private Button siete;

    @FXML
    private Button nueve;

    @FXML
    private Button tres;

    @FXML
    private Button cinco;

    @FXML
    private Button ocho;

    @FXML
    private Button seis;

    @FXML
    private Button cuatro;

    @FXML
    private Button dos;

    @FXML
    private Button one;

    @FXML
    private Button zero;

    @FXML
    private Button punto;

    @FXML
    private Button igual;

    @FXML
    private Button ac;

    @FXML
    private Button division;

    @FXML
    private Button multiplicacion;

    @FXML
    private Button resta;

    @FXML
    private Button suma;

    double resultado = 0;
    double input1,input2;

    int identificadorNumeral,point = 0;


    @FXML
    void Calcular(ActionEvent event) {

        if (event.getSource() == one)
        {
            resultadoPantalla.appendText("1");

        }

        else if (event.getSource() == dos)
        {
            resultadoPantalla.appendText("2");

        }

        else if (event.getSource() == tres)
        {
            resultadoPantalla.appendText("3");


        }

        else if (event.getSource() == cuatro)
        {
            resultadoPantalla.appendText("4");

        }

        else if (event.getSource() == cinco)
        {
            resultadoPantalla.appendText("5");

        }

        else if (event.getSource() == seis)
        {
            resultadoPantalla.appendText("6");

        }

        else if (event.getSource() == siete)
        {
            resultadoPantalla.appendText("7");

        }

        else if (event.getSource() == ocho)
        {
            resultadoPantalla.appendText("8");

        }

        else if (event.getSource() == nueve)
        {
            resultadoPantalla.appendText("9");

        }

        else if (event.getSource() == zero)
        {
            resultadoPantalla.appendText("0");

        }

        else if (event.getSource() == punto && point ==0)
        {

            resultadoPantalla.appendText(".");
            point = 1;

        }

        else if (event.getSource() == ac)
        {
            resultadoPantalla.setText("");

        }

        else if (event.getSource() == suma){
            input1 = Double.parseDouble(resultadoPantalla.getText());
            resultadoPantalla.setText("");
            identificadorNumeral = 1;
            point = 0;
        }

        else if (event.getSource() == resta){
            input1 = Double.parseDouble(resultadoPantalla.getText());
            resultadoPantalla.setText("");
            identificadorNumeral = 2;
            point = 1;
        }

        else if (event.getSource() == multiplicacion){
            input1 = Double.parseDouble(resultadoPantalla.getText());
            resultadoPantalla.setText("");
            identificadorNumeral = 3;
            point = 0;
        }

        else if (event.getSource() == division){
            input1 = Double.parseDouble(resultadoPantalla.getText());
            resultadoPantalla.setText("");
            identificadorNumeral = 4;
            point = 0;
        }

        else if (event.getSource() == igual && identificadorNumeral > 0){

            input2 = Double.parseDouble(resultadoPantalla.getText());

            DecimalFormat decimalFormat = new DecimalFormat("#.00");

            switch (identificadorNumeral){

                case 1:
                    resultado = input1+input2;
                    resultadoPantalla.setText(String.valueOf(decimalFormat.format(resultado)));
                    break;

                case 2:
                    resultado = input1-input2;
                    resultadoPantalla.setText(String.valueOf(decimalFormat.format(resultado)));
                    break;

                case 3:
                resultado = input1*input2;
                    resultadoPantalla.setText(String.valueOf(decimalFormat.format(resultado)));
                break;

                case 4:
                    resultado = input1/input2;
                    resultadoPantalla.setText(String.valueOf(decimalFormat.format(resultado)));
                    break;

            }
            identificadorNumeral = 0;


        }


        }











    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
