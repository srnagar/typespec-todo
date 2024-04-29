// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.todo.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;

/**
 * Initializes a new instance of the TodoClient type.
 */
public final class TodoClientImpl {
    /**
     * Server parameter.
     */
    private final String endpoint;

    /**
     * Gets Server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The UsersImpl object to access its operations.
     */
    private final UsersImpl users;

    /**
     * Gets the UsersImpl object to access its operations.
     * 
     * @return the UsersImpl object.
     */
    public UsersImpl getUsers() {
        return this.users;
    }

    /**
     * The TodoItemsImpl object to access its operations.
     */
    private final TodoItemsImpl todoItems;

    /**
     * Gets the TodoItemsImpl object to access its operations.
     * 
     * @return the TodoItemsImpl object.
     */
    public TodoItemsImpl getTodoItems() {
        return this.todoItems;
    }

    /**
     * The TodoItemsAttachmentsImpl object to access its operations.
     */
    private final TodoItemsAttachmentsImpl todoItemsAttachments;

    /**
     * Gets the TodoItemsAttachmentsImpl object to access its operations.
     * 
     * @return the TodoItemsAttachmentsImpl object.
     */
    public TodoItemsAttachmentsImpl getTodoItemsAttachments() {
        return this.todoItemsAttachments;
    }

    /**
     * Initializes an instance of TodoClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Server parameter.
     */
    public TodoClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this.endpoint = endpoint;
        this.httpPipeline = httpPipeline;
        this.users = new UsersImpl(this);
        this.todoItems = new TodoItemsImpl(this);
        this.todoItemsAttachments = new TodoItemsAttachmentsImpl(this);
    }
}
