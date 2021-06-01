package com.shaikkh.custom.sonar.java.plugin;

import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/*********************************
 * Entry point of the sonar plugin
 ********************************/
public class CustomJavaRulesEntry extends SonarPlugin {

    @Override
    public List getExtensions() {
        return Arrays.asList(
                // server extensions -> objects are instantiated during sonarqube startup
                CustomRulesDefinition.class,

                // batch extensions -> objects are instantiated during the code analysis
                CustomJavaFileCheckRegistrar.class);
    }
}