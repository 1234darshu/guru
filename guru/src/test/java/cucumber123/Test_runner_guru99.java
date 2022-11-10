package cucumber123;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/guru/guru.feature"},dryRun=false,glue= {"defination4"},tags= "@PositiveTesting",plugin = {"html:darshna/dar.html"})
public class Test_runner_guru99   {

}