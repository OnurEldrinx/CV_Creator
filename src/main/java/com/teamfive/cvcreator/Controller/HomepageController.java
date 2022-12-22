package com.teamfive.cvcreator.Controller;

import com.teamfive.cvcreator.Model.Person;
import io.github.palexdev.materialfx.controls.MFXTableColumn;
import io.github.palexdev.materialfx.controls.MFXTableView;
import io.github.palexdev.materialfx.controls.cell.MFXTableRowCell;
import io.github.palexdev.materialfx.filter.IntegerFilter;
import io.github.palexdev.materialfx.filter.StringFilter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {


    public TableView<Person> table;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //createTable();

    }


    /*public void createTable() {

        MFXTableColumn<Person> idColumn = new MFXTableColumn<>("ID", true, Comparator.comparing(Person::getId));
        MFXTableColumn<Person> nameColumn = new MFXTableColumn<>("Name", true, Comparator.comparing(Person::getName));
        MFXTableColumn<Person> surnameColumn = new MFXTableColumn<>("Surname", true, Comparator.comparing(Person::getSurname));
        MFXTableColumn<Person> dateOfBirthColumn = new MFXTableColumn<>("Birthdate", true, Comparator.comparing(Person::getBirthdate));
        MFXTableColumn<Person> emailColumn = new MFXTableColumn<>("Email", true, Comparator.comparing(Person::getEmail));
        MFXTableColumn<Person> phoneColumn = new MFXTableColumn<>("Phone", true, Comparator.comparing(Person::getPhone));
        MFXTableColumn<Person> educationColumn = new MFXTableColumn<>("Education", true);
        MFXTableColumn<Person> experiencesColumn = new MFXTableColumn<>("Experiences", true);
        MFXTableColumn<Person> publicationsColumn = new MFXTableColumn<>("Publications", true);
        MFXTableColumn<Person> interestsColumn = new MFXTableColumn<>("Interests", true);
        MFXTableColumn<Person> skillsColumn = new MFXTableColumn<>("Skills", true);
        MFXTableColumn<Person> tagsColumn = new MFXTableColumn<>("Tags", true);

        idColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getId));
        nameColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getName));
        surnameColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getSurname));
        dateOfBirthColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getBirthdate));
        emailColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getEmail));
        phoneColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getPhone));
        educationColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getEducations));
        experiencesColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getExperiences));
        publicationsColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getPublications));
        interestsColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getInterests));
        skillsColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getSkills));
        tagsColumn.setRowCellFactory(person -> new MFXTableRowCell<>(Person::getTags));

        table.getTableColumns().addAll(idColumn, nameColumn, surnameColumn, dateOfBirthColumn, emailColumn, phoneColumn, educationColumn, experiencesColumn, publicationsColumn,
                interestsColumn, skillsColumn, tagsColumn);

        table.footerVisibleProperty().set(true);

        table.getFilters().addAll(
                new IntegerFilter<>("ID", Person::getId),
                new StringFilter<>("Name", Person::getName),
                new StringFilter<>("Surname", Person::getSurname),
                new StringFilter<>("Date of birth", Person::getBirthdate),
                new StringFilter<>("Email", Person::getEmail),
                new StringFilter<>("Phone", Person::getPhone)
        );

        ObservableList<Person> personList = FXCollections.observableArrayList();

        for (int i=0;i<100;i++){

            personList.add(new Person("a","b","c","d","e"));

        }
        table.setItems(personList);


    }*/

}
