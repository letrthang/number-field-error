package com.example.application.views.visualviewbuilder;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Visual View Builder")
@Route(value = "visual-view-builder", layout = MainLayout.class)
@Uses(Icon.class)
public class VisualViewBuilderView extends Composite<VerticalLayout> {

    private NumberField numberField = new NumberField();

    public VisualViewBuilderView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        numberField.setLabel("Number field");
        getContent().add(numberField);
    }
}
