package api.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibrarySearchStepDefinition {

    public LibrarySearchStepDefinition(){

    }
    @Given("^I have the following books in the store$")
    public void i_have_the_following_books_in_the_store(DataTable dataTable) {

        dataTable.cells();
    }
    @Then("^I find (\\d+) books$")
    public void i_find_books(int bookCount) {

    }
    @When("^I search for books by author \"([^\"]*)\"$")
    public void iSearchForBookByAuthor(String args0){

    }
}
