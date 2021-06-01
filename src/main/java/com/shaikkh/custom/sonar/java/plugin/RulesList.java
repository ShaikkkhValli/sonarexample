package com.shaikkh.custom.sonar.java.plugin;

import org.sonar.plugins.java.api.JavaCheck;

import com.shaikkh.custom.sonar.java.rules.AvoidSmallerLengthVariableNameRule;
import com.google.common.collect.ImmutableList;

import java.util.List;

public final class RulesList {

    private RulesList() {
    }

    public static List<Class> getChecks() {
        return ImmutableList.<Class>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
    }

    public static List<Class<? extends JavaCheck>> getJavaChecks() {
        return ImmutableList.<Class<? extends JavaCheck>>builder()
                .add(AvoidSmallerLengthVariableNameRule.class)
                .build();
    }

    public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
        return ImmutableList.<Class<? extends JavaCheck>>builder()
                .build();
    }
}
