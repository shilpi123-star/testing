package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostSteps {
  /*  private WebDriver driver;
   @Given("User is on Home Pages")
    public void user_is_on_home_pages() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
   }
    @When("User Navigate to LogIn Page")
    public void user_navigate_to_log_in_page() {
       System.out.println("user_navigate_to_log_in_page");
   }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("User name is "+ username + "password");
        driver.findElement(By.xpath("//input[@id='user-name'] ")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
       driver.findElement(By.xpath("//input[@id='login-button']")).click();
   }
    @Then("Message displayed Login Successfully")
   public void message_displayed_login_successfully() throws Throwable {
       System.out.println("Successfully logged in");
        Thread.sleep(2000);
       driver.close();
   }
*/
//    }
    @Given("User should be logged in and should be present on his wall")
   public void user_should_be_logged_in_and_should_be_present_on_his_wall() {
       System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
        System.out.println("This is commit from feature into master");
     System.out.println("This demo is for git rebase from eclips");
     System.ouuut.println("This is my first github commit integrating with jenkins");
   }
  @When("I type the message in the box")
  public void i_type_the_message_in_the_box() {
       System.out.println("i_type_the_message_in_the_box");
      System.out.println("I type the message in the box");
      System.out.println("Today is Teacher's day");

   }
   @When("Click on Post button")
   public void click_on_post_button() {
       System.out.println("click_on_post_button");

   }
   @Then("The message should get posted.")
  public void the_message_should_get_posted() {
      System.out.println("the_message_should_get_posted");

   }
   @Given("User should be logged in and should be present at its own wall")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() {
       System.out.println("user_should_be_logged_in_and_should_be_present_at_its_own_wall");

  }
   @When("User supply the youtube link in the text box")
   public void user_supply_the_youtube_link_in_the_text_box() {
        System.out.println("user_supply_the_youtube_link_in_the_text_box");

  }
   @Then("Video should get posted on the user wall")
    public void video_should_get_posted_on_the_user_wall() {
       System.out.println("video_should_get_posted_on_the_user_wall");

   }
   @Then("The video should have proper thumbnail.")
    public void the_video_should_have_proper_thumbnail() {
       System.out.println("the_video_should_have_proper_thumbnail");

    }
    @When("I type the message as {string} in the text box")
   public void i_type_the_message_as_in_the_text_box(String string) {
       System.out.println(string);

    }
    @When("User supply the youtube link as {string} in the text box")
    public void user_supply_the_youtube_link_as_in_the_text_box(String string) {
        System.out.println(string);

   }
    @Then("Then video should get posted on the user wall")
   public void then_video_should_get_posted_on_the_user_wall() {
        System.out.println("then_video_should_get_posted_on_the_user_wall");

   }

   @Then("the message should get posted.")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");

    }


   }
