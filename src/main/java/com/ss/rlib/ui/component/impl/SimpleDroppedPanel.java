package com.ss.rlib.ui.component.impl;

import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import org.jetbrains.annotations.NotNull;

/**
 * The simple implementation of droppable element.
 *
 * @author JavaSaBr
 */
public class SimpleDroppedPanel extends Pane {

    /**
     * Instantiates a new Simple dropped panel.
     */
    public SimpleDroppedPanel() {
        setOnDragOver(this::processOnDragOver);
        setOnDragEntered(this::processOnDragEntered);
        setOnDragExited(this::processOnDragExited);
        setOnDragDropped(this::processOnDragDropped);
    }

    /**
     * Accept a transfer mode.
     *
     * @param event the event
     */
    protected void acceptTransfersMode(@NotNull final DragEvent event) {
        event.acceptTransferModes(TransferMode.COPY);
    }

    /**
     * Handle finishing dropping.
     *
     * @param event the event
     */
    protected void processOnDragDropped(@NotNull final DragEvent event) {
        event.setDropCompleted(true);
        event.consume();
    }

    /**
     * Handle entering to a drop area.
     *
     * @param event the event
     */
    protected void processOnDragEntered(@NotNull final DragEvent event) {
        event.consume();
    }

    /**
     * Handle exiting from a drop area.
     *
     * @param event the event
     */
    protected void processOnDragExited(@NotNull final DragEvent event) {
        event.consume();
    }

    /**
     * Handle dragging over element.
     *
     * @param event the event
     */
    protected void processOnDragOver(@NotNull final DragEvent event) {

        final Object source = event.getGestureSource();
        if (source != this) acceptTransfersMode(event);

        event.consume();
    }
}