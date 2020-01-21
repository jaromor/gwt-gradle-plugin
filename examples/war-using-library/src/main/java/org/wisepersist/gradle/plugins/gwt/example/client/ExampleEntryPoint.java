/**
 * Copyright (C) 2013-2017 Steffen Schaefer
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wisepersist.gradle.plugins.gwt.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import lombok.Data;
import org.wisepersist.gradle.plugins.gwt.example.library.client.HelloWorldWidget;

@Data
public class ExampleEntryPoint implements EntryPoint {

    private String something = "something";

    @Override
    public void onModuleLoad() {
        final HelloWorldWidget helloWorldWidget = new HelloWorldWidget();
        // access a Lombok-generated getter and a setter method
        helloWorldWidget.setSomeValue(getSomething());
        RootPanel.get().add(helloWorldWidget);
    }
}
