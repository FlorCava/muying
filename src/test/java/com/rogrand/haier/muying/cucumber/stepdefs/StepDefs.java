package com.rogrand.haier.muying.cucumber.stepdefs;

import com.rogrand.haier.muying.MuyingApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MuyingApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
