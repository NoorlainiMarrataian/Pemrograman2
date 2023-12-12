package com.example.demo;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private final TableView<Mahasiswa> table = new TableView<>();
    private final ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
            new Mahasiswa(1, "123", "John"),
            new Mahasiswa(2, "123", "Jane"),
            new Mahasiswa(3, "124123", "Jono"),
            new Mahasiswa(4, "1241234", "Agus"),
            new Mahasiswa(5, "1242603", "Xiumin"),
            new Mahasiswa(6, "1242004", "Luhan"),
            new Mahasiswa(7, "1240611", "Kris"),
            new Mahasiswa(8, "1242205", "Suho"),
            new Mahasiswa(9, "1240710", "Lay"),
            new Mahasiswa(10, "1240605", "Baekhyun"),
            new Mahasiswa(11, "1242109", "Chen"),
            new Mahasiswa(12, "1242709", "Chanyeol"),
            new Mahasiswa(13, "1241201", "Kyungsoo"),
            new Mahasiswa(14, "1240205", "Tao"),
            new Mahasiswa(15, "1241401", "Kai"),
            new Mahasiswa(16, "1241204", "Sehun")
    );

    @Override
    public void start(Stage stage) {
        TableColumn<Mahasiswa, String> nimMahasiswaCol = createColumn("NIM", "nimMahasiswa", 100);
        TableColumn<Mahasiswa, String> nameMahasiswaCol = createColumn("Nama", "nameMahasiswa", 100);

        table.setItems(data);
        table.getColumns().addAll(nimMahasiswaCol, nameMahasiswaCol);

        VBox vbox = createVBox(table);

        Scene scene = new Scene(vbox, 300, 500);
        stage.setTitle("Table View Sample");
        stage.setScene(scene);
        stage.show();
    }

    private TableColumn<Mahasiswa, String> createColumn(String title, String propertyName, double width) {
        TableColumn<Mahasiswa, String> column = new TableColumn<>(title);
        column.setMinWidth(width);
        column.setCellValueFactory(new PropertyValueFactory<>(propertyName));
        return column;
    }

    private VBox createVBox(TableView<Mahasiswa> table) {
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.getChildren().addAll(table);
        return vbox;
    }

    public static class Mahasiswa {
        private final SimpleStringProperty nimMahasiswa;
        private final SimpleStringProperty nameMahasiswa;

        private Mahasiswa(int idMhs, String nimMhs, String nameMhs) {
            this.nimMahasiswa = new SimpleStringProperty(nimMhs);
            this.nameMahasiswa = new SimpleStringProperty(nameMhs);
        }

        public String getNimMahasiswa() {
            return nimMahasiswa.get();
        }

        public String getNameMahasiswa() {
            return nameMahasiswa.get();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
