package com.ss.rlib.fx.util;

import javafx.beans.value.ObservableValue;
import javafx.css.Styleable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The utility class.
 *
 * @author JavaSaBr
 */
public class FxUtils {

    public static class CssClassAppender {

        /**
         * Add the css class to the styleable object.
         *
         * @param styleable the styleable object.
         * @param className the css class.
         * @return the css class appender.
         */
        public CssClassAppender addClass(@NotNull Styleable styleable, @NotNull String className) {
            styleable.getStyleClass().add(className);
            return this;
        }

        /**
         * Add the css class to the styleable objects.
         *
         * @param first     the first styleable object.
         * @param second    the second styleable object.
         * @param className the css class.
         * @return the css class appender.
         */
        public @NotNull CssClassAppender addClass(
                @NotNull Styleable first,
                @NotNull Styleable second,
                @NotNull String className
        ) {
            first.getStyleClass().add(className);
            second.getStyleClass().add(className);
            return this;
        }

        /**
         * Add the css class to the styleable objects.
         *
         * @param first     the first styleable object.
         * @param second    the second styleable object.
         * @param third     the third styleable object.
         * @param className the css class.
         * @return the css class appender.
         */
        public @NotNull CssClassAppender addClass(
                @NotNull Styleable first,
                @NotNull Styleable second,
                @NotNull Styleable third,
                @NotNull String className
        ) {
            first.getStyleClass().add(className);
            second.getStyleClass().add(className);
            third.getStyleClass().add(className);
            return this;
        }

        /**
         * Add css classes to the styleable object.
         *
         * @param styleable  the styleable object.
         * @param classNames the css classes.
         * @return the css class appender.
         */
        public @NotNull CssClassAppender addClass(@NotNull Styleable styleable, @NotNull String... classNames) {
            styleable.getStyleClass().addAll(classNames);
            return this;
        }

        /**
         * Add css classes to the styleable objects.
         *
         * @param first      the first styleable object.
         * @param second     the second styleable object.
         * @param classNames the css classes.
         * @return the css class appender.
         */
        public @NotNull CssClassAppender addClass(
                @NotNull Styleable first,
                @NotNull Styleable second,
                @NotNull String... classNames
        ) {
            first.getStyleClass().addAll(classNames);
            second.getStyleClass().addAll(classNames);
            return this;
        }

        /**
         * Add css classes to the styleable objects.
         *
         * @param first      the first styleable object.
         * @param second     the second styleable object.
         * @param third      the third styleable object.
         * @param classNames the css classes.
         * @return the css class appender.
         */
        public @NotNull CssClassAppender addClass(
                @NotNull Styleable first,
                @NotNull Styleable second,
                @NotNull Styleable third,
                @NotNull String... classNames
        ) {
            first.getStyleClass().addAll(classNames);
            second.getStyleClass().addAll(classNames);
            third.getStyleClass().addAll(classNames);
            return this;
        }
    }

    public static class ChildrenAppender {

        /**
         * Add the node to the parent.
         *
         * @param parent the parent.
         * @param node   the node.
         * @return the child appender.
         */
        public @NotNull ChildrenAppender addChild(@NotNull Pane parent, @NotNull Node node) {
            parent.getChildren().add(node);
            return this;
        }

        /**
         * Add the node to the parent.
         *
         * @param parent the parent.
         * @param node   the node.
         * @return the child appender.
         */
        public @NotNull ChildrenAppender addChild(@NotNull Group parent, @NotNull Node node) {
            parent.getChildren().add(node);
            return this;
        }

        /**
         * Add the nodes to the parent.
         *
         * @param parent the parent.
         * @param nodes  the nodes.
         * @return the child appender.
         */
        public @NotNull ChildrenAppender addChild(@NotNull Pane parent, @NotNull Node... nodes) {
            parent.getChildren().addAll(nodes);
            return this;
        }

        /**
         * Add the nodes to the parent.
         *
         * @param parent the parent.
         * @param nodes  the nodes.
         * @return the child appender.
         */
        public @NotNull ChildrenAppender addChild(@NotNull Group parent, @NotNull Node... nodes) {
            parent.getChildren().addAll(nodes);
            return this;
        }
    }

    private static final CssClassAppender CLASS_APPENDER = new CssClassAppender();
    private static final ChildrenAppender CHILDREN_APPENDER = new ChildrenAppender();

    /**
     * Add the css class to the styleable object.
     *
     * @param styleable the styleable object.
     * @param className the css class.
     * @return the css class appender.
     */
    public static @NotNull CssClassAppender addClass(@NotNull Styleable styleable, @NotNull String className) {
        styleable.getStyleClass().add(className);
        return CLASS_APPENDER;
    }

    /**
     * Add the css class to the styleable objects.
     *
     * @param first     the first styleable object.
     * @param second    the second styleable object.
     * @param className the css class.
     * @return the css class appender.
     */
    public static @NotNull CssClassAppender addClass(
            @NotNull Styleable first,
            @NotNull Styleable second,
            @NotNull String className
    ) {
        first.getStyleClass().add(className);
        second.getStyleClass().add(className);
        return CLASS_APPENDER;
    }

    /**
     * Add the css class to the styleable objects.
     *
     * @param first     the first styleable object.
     * @param second    the second styleable object.
     * @param third     the third styleable object.
     * @param className the css class.
     * @return the css class appender.
     */
    public static @NotNull CssClassAppender addClass(
            @NotNull Styleable first,
            @NotNull Styleable second,
            @NotNull Styleable third,
            @NotNull String className
    ) {
        first.getStyleClass().add(className);
        second.getStyleClass().add(className);
        third.getStyleClass().add(className);
        return CLASS_APPENDER;
    }

    /**
     * Add css classes to the styleable object.
     *
     * @param styleable  the styleable object.
     * @param classNames the css classes.
     * @return the css class appender.
     */
    public static @NotNull CssClassAppender addClass(@NotNull Styleable styleable, @NotNull String... classNames) {
        styleable.getStyleClass().addAll(classNames);
        return CLASS_APPENDER;
    }

    /**
     * Add css classes to the styleable objects.
     *
     * @param first      the first styleable object.
     * @param second     the second styleable object.
     * @param classNames the css classes.
     * @return the css class appender.
     */
    public static @NotNull CssClassAppender addClass(
            @NotNull Styleable first,
            @NotNull Styleable second,
            @NotNull String... classNames
    ) {
        first.getStyleClass().addAll(classNames);
        second.getStyleClass().addAll(classNames);
        return CLASS_APPENDER;
    }

    /**
     * Add css classes to the styleable objects.
     *
     * @param first      the first styleable object.
     * @param second     the second styleable object.
     * @param third      the third styleable object.
     * @param classNames the css classes.
     * @return the css class appender.
     */
    public static @NotNull CssClassAppender addClass(
            @NotNull Styleable first,
            @NotNull Styleable second,
            @NotNull Styleable third,
            @NotNull String... classNames
    ) {
        first.getStyleClass().addAll(classNames);
        second.getStyleClass().addAll(classNames);
        third.getStyleClass().addAll(classNames);
        return CLASS_APPENDER;
    }


    /**
     * Add the node to the parent.
     *
     * @param parent the parent.
     * @param node   the node.
     * @return the child appender.
     */
    public static @NotNull ChildrenAppender addChild(@NotNull Pane parent, @NotNull Node node) {
        parent.getChildren().add(node);
        return CHILDREN_APPENDER;
    }

    /**
     * Add the node to the parent.
     *
     * @param parent the parent.
     * @param node   the node.
     * @return the child appender.
     */
    public static @NotNull ChildrenAppender addChild(@NotNull Group parent, @NotNull Node node) {
        parent.getChildren().add(node);
        return CHILDREN_APPENDER;
    }

    /**
     * Add the nodes to the parent.
     *
     * @param parent the parent.
     * @param nodes  the nodes.
     * @return the child appender.
     */
    public static @NotNull ChildrenAppender addChild(@NotNull Pane parent, @NotNull Node... nodes) {
        parent.getChildren().addAll(nodes);
        return CHILDREN_APPENDER;
    }

    /**
     * Add the nodes to the parent.
     *
     * @param parent the parent.
     * @param nodes  the nodes.
     * @return the child appender.
     */
    public static @NotNull ChildrenAppender addChild(@NotNull Group parent, @NotNull Node... nodes) {
        parent.getChildren().addAll(nodes);
        return CHILDREN_APPENDER;
    }

    /**
     * Reset pref width property for the region.
     *
     * @param region the region.
     */
    public static <T extends Region> T resetPrefWidth(@NotNull T region) {
        region.prefWidthProperty().unbind();
        region.setPrefWidth(Region.USE_COMPUTED_SIZE);
        return region;
    }

    /**
     * Reset min/max width properties for the region.
     *
     * @param region the region.
     */
    public static <T extends Region> T resetMinMaxWidth(@NotNull T region) {
        region.maxWidthProperty().unbind();
        region.setMaxWidth(Region.USE_COMPUTED_SIZE);
        region.minWidthProperty().unbind();
        region.setMinWidth(Region.USE_COMPUTED_SIZE);
        return region;
    }

    /**
     * Rebind pref width property of the region.
     *
     * @param region the region.
     * @param value  the value.
     * @param <T>    the region's type.
     * @return the region.
     */
    public static <T extends Region> T rebindPrefWidth(
            @NotNull T region,
            @NotNull ObservableValue<? extends Number> value
    ) {

        var width = region.prefWidthProperty();

        if (width.isBound()) {
            width.unbind();
        }

        width.bind(value);


        return region;
    }

    /**
     * Add a random color to background.
     *
     * @param node the node.
     */
    public static void addDebugBackgroundColor(@NotNull Node node) {

        var random = ThreadLocalRandom.current();
        var color = "rgb(" + random.nextInt(255) + "," +
                random.nextInt(255) + ", " + random.nextInt(255) + ")";

        node.setStyle("-fx-background-color: " + color + ";");
    }

    /**
     * Add a debug border to a node..
     *
     * @param node the node.
     */
    public static void addDebugBorderTo(@NotNull Node node) {
        node.setStyle("-fx-border-color: red; -fx-border-width: 3px;");
    }
}
