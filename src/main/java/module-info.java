module br.com.aledelima.javafx_navigation {
    requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	opens br.com.aledelima.javafx_navigation.view.controllers to javafx.fxml;
    exports br.com.aledelima.javafx_navigation;
    exports br.com.aledelima.javafx_navigation.view.controllers;
}