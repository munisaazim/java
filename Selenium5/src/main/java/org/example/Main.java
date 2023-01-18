package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //System.out.println("Hello world!");
        //DropdownStatic object = new DropdownStatic();
        //object.dropDownStatic();
        //object.updatedDropdownStaic();
        //object.dynamicDropdown();

        //object.AutoSuggestiveDropdown();
        //object.SelectRadio();
        //object.quit();

        EndToEnd object = new EndToEnd();
        object.openPage();
        object.selectOneRound();
        object.selectDestination();
        object.checkCalendarDate();
        object.selectCurrency();
        object.selectPassengers();
        object.selectSearch();
        //object.exit();
    }
}