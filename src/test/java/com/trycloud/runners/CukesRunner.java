package com.trycloud.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",// store the failed scenario into rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",  // fancy report
        },
        features = "src/test/resources/features",
        glue = "com/trycloud/step_definitions",
        dryRun = true,
        tags = "",
        publish = false






)
public class CukesRunner {
}
