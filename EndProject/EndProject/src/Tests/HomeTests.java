package Tests;

import org.junit.Test;
import Pages.HomePage;

public class HomeTests extends BaseTest{

    public HomePage homePage;

    String emailAdress = "darkobonaparta@gmail.com";
    String password = "AniMatke1";
    int numberOfPopularItems = 7;
    int numberOfBestSellerItems = 7;

    @Test
    public void NumberOfPopularItems(){
        homePage =  new HomePage(driver);
        homePage.basePage();
        homePage.numberOfPopularItems(numberOfPopularItems);


        try{
            Thread.sleep(10000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void NumberOfBestSellerItems(){
        homePage =  new HomePage(driver);
        homePage.basePage();
        homePage.clickOnBestSellerButton();
        homePage.numberOfBestSellerItems(numberOfBestSellerItems);


        try{
            Thread.sleep(10000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}