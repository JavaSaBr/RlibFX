# License #
Please see the file called LICENSE.

## How to use

#### Gradle

```groovy
allprojects {
    repositories {
        url  "https://dl.bintray.com/javasabr/maven" 
    }
}

dependencies {
    compile 'com.spaceshift:rlib.fx:5.1.0'
}
```

#### Maven

```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>bintray-javasabr-maven</id>
        <name>bintray</name>
        <url>https://dl.bintray.com/javasabr/maven</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.spaceshift</groupId>
    <artifactId>rlib.fx</artifactId>
    <version>5.1.0</version>
</dependency>
```

## Most interesting parts:
### FxControlUtils
```java

     var textField = new TextField("value");
    
    // original style
    textField.textProperty().addListener((observable, oldValue, newValue) -> {
        System.out.println("new value is:" + newValue);
        if ("hello".equals(newValue)) {
            System.out.println("Say Hello!");
        } else if ("exit".equals(newValue)) {
            System.out.println("Say Exit!");
        }
    });

    // new style
    FxControlUtils.onTextChange(textField, val -> System.out.println("new value is: " + val))
        .onChangeIf("hello"::equals, () -> System.out.println("Say Hello!"))
        .onChangeIf("exit"::equals, () -> System.out.println("Say Exit!"));

    var comboBox = new ComboBox<String>(observableArrayList("one", "two", "three"));

    // old style
    comboBox.getSelectionModel()
        .selectedItemProperty()
        .addListener((observable, oldValue, newValue) ->
            System.out.println("new selected item is: " + newValue));

    // new style
    FxControlUtils.onSelectedItemChange(comboBox,
        val -> System.out.println("new selected item is: " + val));

    var checkBox = new CheckBox();

    // old style
    checkBox.selectedProperty().addListener((observable, oldValue, newValue) ->
        System.out.println("Is selected: " + newValue));

    // new style
    FxControlUtils.onSelectedChange(checkBox,
        val -> System.out.println("Is selected: " + val));
```
### FxUtils
```java
    var container1 = new VBox();
    var container2 = new HBox();

    var control1 = new TextField();
    var control2 = new TextField();
    var control3 = new TextField();
    var control4 = new TextField();
    var control5 = new TextField();

    // old style
    container1.getChildren().addAll(control1, control2, control3);
    container2.getChildren().addAll(control4, control5);
    container1.getChildren().add(container2);

    // new style
    FxUtils.addChild(container1, control1, control2, control3)
        .addChild(container2, control4, control5)
        .addChild(container1, container2);

    // old style
    control1.getStyleClass().addAll("class1", "class2");
    control2.getStyleClass().addAll("class1", "class2");
    control3.getStyleClass().addAll("class1", "class2");
    control4.getStyleClass().add("class3");
    control5.getStyleClass().add("class4");

    // new style
    FxUtils.addClass(control1, control2, control3, "class1", "class2")
        .addClass(control4, "class3")
        .addClass(control5, "class4");

    // old style
    control1.prefWidthProperty().unbind();
    control1.prefWidthProperty().bind(control2.widthProperty());

    // new style
    FxUtils.rebindPrefWidth(control1, control2.widthProperty());
```

### ControlDialogs
```java
    @Override
    public void start(@NotNull Stage stage) {

        var root = new VBox();
        root.setAlignment(Pos.CENTER);

        var scene = new Scene(root);
        scene.getStylesheets()
                .add(CssClasses.CSS_FILE);

        var button = new Button("Create a dialog in scene's center");
        button.setOnAction(event -> openInCenterDialog(scene));

        var button2 = new Button("Create a dialog over this button");
        button2.setOnAction(event -> openOverNode(button2));

        var emptyPane = new Pane();
        emptyPane.setMinHeight(300);

        FxUtils.addChild(root, button, emptyPane, button2);

        ControlDialogSupport.addSupport(scene);

        stage.setScene(scene);
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.show();
    }

    private void openInCenterDialog(@NotNull Scene scene) {
        var dialog = new TestDialog();
        dialog.applySize(200, 200);
        dialog.show(scene);
    }

    private void openOverNode(@NotNull Node node) {
        var dialog = new TestDialog();
        dialog.applySize(200, 200);
        dialog.show(node);
    }
```
![Control Dialogs](https://i.imgur.com/p59nFhV.png)