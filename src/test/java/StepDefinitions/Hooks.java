package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.time.LocalDateTime;

public class Hooks {


        LocalDateTime startTime;

        @Before // Runs before every scenario
        public void beforeScenario(){
            startTime = LocalDateTime.now();
        }

        @After // Runs after every scenario
        public void afterScenario(Scenario scenario){
            if (scenario.isFailed()) {
             //   final byte[] byteImage = ((TakesScreenshot) BaseDriver.driver.getScreenshotAs(OutputType.BYTES);
             //   scenario.attach(byteImage, "image/png", scenario.getName());
            }
            LocalDateTime endTime = LocalDateTime.now();
            Duration duration = Duration.between(startTime, endTime);
            //scenario name, scenario id, scenario status, start time, end time, duration
            //ExcelMethods.writeScenarioInfoToExcel(scenario, startTime, endTime, duration);
            BaseDriver.driver.quit();
        }

        @BeforeStep // Runs before every step
        public void beforeStep(){
            System.out.println("Step is starting");
        }

        @AfterStep // Runs after every step
        public void afterStep(){
            System.out.println("Step is ended");
        }
    }


