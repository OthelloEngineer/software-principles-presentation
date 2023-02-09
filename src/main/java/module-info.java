module com.example.presentation {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.presentation2022 to javafx.fxml;
    exports com.example.presentation2022.Liskov;
    exports com.example.presentation2022.builderpattern;
    exports com.example.presentation2022.builderpattern.sandwich;
    exports com.example.presentation2022.builderpattern.sandwich.toppings;
    opens com.example.presentation2022.Liskov to javafx.fxml;
}