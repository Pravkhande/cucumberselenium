package com.automatedtest.sample;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/sample"},
        strict = false, plugin = {"pretty",
        "json:target/reports/index.json",
        "html:target/reports"},
        glue = {"com.automatedtest.sample.infrastructure.driver",
                "com.automatedtest.sample.homepage",
                "com.automatedtest.sample.searchresultpage"})
public class SearchTest {
}
