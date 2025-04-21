import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SignupForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Username
        Label lblUser = new Label("Username:");
        TextField txtUser = new TextField();

        // Password
        Label lblPass = new Label("Password:");
        PasswordField txtPass = new PasswordField();

        // Gender (Radio Buttons)
        Label lblGender = new Label("Gender:");
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton rbMale = new RadioButton("Male");
        RadioButton rbFemale = new RadioButton("Female");
        rbMale.setToggleGroup(genderGroup);
        rbFemale.setToggleGroup(genderGroup);

        // Branch (ComboBox)
        Label lblBranch = new Label("Branch:");
        ComboBox<String> cmbBranch = new ComboBox<>();
        cmbBranch.getItems().addAll("Computer Science", "Mechanical", "Electrical", "Civil", "Electronics");

        // Address (TextArea)
        Label lblAddress = new Label("Address:");
        TextArea txtAddress = new TextArea();

        // Hobbies (CheckBox)
        Label lblHobbies = new Label("Hobbies:");
        CheckBox chkReading = new CheckBox("Reading");
        CheckBox chkSports = new CheckBox("Sports");
        CheckBox chkMusic = new CheckBox("Music");

        // Signup and Clear buttons
        Button btnSignup = new Button("Signup");
        Button btnClear = new Button("Clear");

        // Label to display user data
        Label lblResult = new Label();

        // Signup button action
        btnSignup.setOnAction(e -> {
            String username = txtUser.getText();
            String password = txtPass.getText();
            String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Not Selected";
            String branch = cmbBranch.getValue() != null ? cmbBranch.getValue() : "Not Selected";
            String address = txtAddress.getText();
            String hobbies = "";
            if (chkReading.isSelected()) hobbies += "Reading ";
            if (chkSports.isSelected()) hobbies += "Sports ";
            if (chkMusic.isSelected()) hobbies += "Music ";

            lblResult.setText("User: " + username + "\nGender: " + gender + "\nBranch: " + branch +
                              "\nAddress: " + address + "\nHobbies: " + hobbies);
        });

        // Clear button action
        btnClear.setOnAction(e -> {
            txtUser.clear();
            txtPass.clear();
            genderGroup.selectToggle(null);
            cmbBranch.setValue(null);
            txtAddress.clear();
            chkReading.setSelected(false);
            chkSports.setSelected(false);
            chkMusic.setSelected(false);
            lblResult.setText("");
        });

        // Layout (GridPane)
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        grid.add(lblUser, 0, 0);
        grid.add(txtUser, 1, 0);
        grid.add(lblPass, 0, 1);
        grid.add(txtPass, 1, 1);
        grid.add(lblGender, 0, 2);
        grid.add(rbMale, 1, 2);
        grid.add(rbFemale, 2, 2);
        grid.add(lblBranch, 0, 3);
        grid.add(cmbBranch, 1, 3);
        grid.add(lblAddress, 0, 4);
        grid.add(txtAddress, 1, 4, 2, 1);
        grid.add(lblHobbies, 0, 5);
        grid.add(chkReading, 1, 5);
        grid.add(chkSports, 2, 5);
        grid.add(chkMusic, 3, 5);
        grid.add(btnSignup, 1, 6);
        grid.add(btnClear, 2, 6);
        grid.add(lblResult, 0, 7, 3, 1);

        // Scene
        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setTitle("Signup Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
