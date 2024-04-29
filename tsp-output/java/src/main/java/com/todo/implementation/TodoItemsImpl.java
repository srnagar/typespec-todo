// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.todo.implementation;

import io.clientcore.core.annotation.ServiceInterface;
import io.clientcore.core.http.RestProxy;
import io.clientcore.core.http.annotation.BodyParam;
import io.clientcore.core.http.annotation.HeaderParam;
import io.clientcore.core.http.annotation.HostParam;
import io.clientcore.core.http.annotation.HttpRequestInformation;
import io.clientcore.core.http.annotation.PathParam;
import io.clientcore.core.http.annotation.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * An instance of this class provides access to all the operations defined in TodoItems.
 */
public final class TodoItemsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final TodoItemsService service;

    /**
     * The service client containing this operation class.
     */
    private final TodoClientImpl client;

    /**
     * Initializes an instance of TodoItemsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    TodoItemsImpl(TodoClientImpl client) {
        this.service = RestProxy.create(TodoItemsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for TodoClientTodoItems to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "TodoClientTodoItems", host = "{endpoint}")
    public interface TodoItemsService {
        @HttpRequestInformation(method = HttpMethod.GET, path = "/items", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<BinaryData> listSync(@HostParam("endpoint") String endpoint, @HeaderParam("accept") String accept,
            RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.POST, path = "/items", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<BinaryData> createSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData request, RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/items/{id}", expectedStatusCodes = { 200, 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<BinaryData> getSync(@HostParam("endpoint") String endpoint, @PathParam("id") long id,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.PATCH, path = "/items/{id}", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<BinaryData> updateSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @PathParam("id") long id,
            @HeaderParam("accept") String accept, @BodyParam("application/merge-patch+json") BinaryData patch,
            RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.DELETE, path = "/items/{id}", expectedStatusCodes = { 204, 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<Void> deleteSync(@HostParam("endpoint") String endpoint, @PathParam("id") long id,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);
    }

    /**
     * The list operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>The limit to the number of items</td></tr>
     * <tr><td>offset</td><td>Integer</td><td>No</td><td>The offset to start paginating at</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     items (Required): [
     *          (Required){
     *             id: long (Required)
     *             title: String (Required)
     *             createdBy: long (Required)
     *             assignedTo: Long (Optional)
     *             description: String (Optional)
     *             status: String(NotStarted/InProgress/Completed) (Required)
     *             createdAt: OffsetDateTime (Required)
     *             updatedAt: OffsetDateTime (Required)
     *             completedAt: OffsetDateTime (Optional)
     *             labels: BinaryData (Optional)
     *             _dummy: String (Optional)
     *         }
     *     ]
     *     pagination (Required): {
     *         pageSize: int (Required)
     *         totalSize: int (Required)
     *         prevLink: String (Optional)
     *         nextLink: String (Optional)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<BinaryData> listWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listSync(this.client.getEndpoint(), accept, requestOptions);
    }

    /**
     * The create operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     item (Required): {
     *         id: long (Required)
     *         title: String (Required)
     *         createdBy: long (Required)
     *         assignedTo: Long (Optional)
     *         description: String (Optional)
     *         status: String(NotStarted/InProgress/Completed) (Required)
     *         createdAt: OffsetDateTime (Required)
     *         updatedAt: OffsetDateTime (Required)
     *         completedAt: OffsetDateTime (Optional)
     *         labels: BinaryData (Optional)
     *         _dummy: String (Optional)
     *     }
     *     attachments (Optional): [
     *         BinaryData (Optional)
     *     ]
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: long (Required)
     *     title: String (Required)
     *     createdBy: long (Required)
     *     assignedTo: Long (Optional)
     *     description: String (Optional)
     *     status: String(NotStarted/InProgress/Completed) (Required)
     *     createdAt: OffsetDateTime (Required)
     *     updatedAt: OffsetDateTime (Required)
     *     completedAt: OffsetDateTime (Optional)
     *     labels: BinaryData (Optional)
     *     _dummy: String (Optional)
     * }
     * }</pre>
     * 
     * @param request The request parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<BinaryData> createWithResponse(BinaryData request, RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.createSync(this.client.getEndpoint(), contentType, accept, request, requestOptions);
    }

    /**
     * The get operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: long (Required)
     *     title: String (Required)
     *     createdBy: long (Required)
     *     assignedTo: Long (Optional)
     *     description: String (Optional)
     *     status: String(NotStarted/InProgress/Completed) (Required)
     *     createdAt: OffsetDateTime (Required)
     *     updatedAt: OffsetDateTime (Required)
     *     completedAt: OffsetDateTime (Optional)
     *     labels: BinaryData (Optional)
     *     _dummy: String (Optional)
     * }
     * }</pre>
     * 
     * @param id An integer that can be serialized to JSON (`−9007199254740991 (−(2^53 − 1))` to `9007199254740991 (2^53
     * − 1)` ).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<BinaryData> getWithResponse(long id, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), id, accept, requestOptions);
    }

    /**
     * The update operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     title: String (Optional)
     *     assignedTo: Long (Optional)
     *     description: String (Optional)
     *     status: String(NotStarted/InProgress/Completed) (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: long (Required)
     *     title: String (Required)
     *     createdBy: long (Required)
     *     assignedTo: Long (Optional)
     *     description: String (Optional)
     *     status: String(NotStarted/InProgress/Completed) (Required)
     *     createdAt: OffsetDateTime (Required)
     *     updatedAt: OffsetDateTime (Required)
     *     completedAt: OffsetDateTime (Optional)
     *     labels: BinaryData (Optional)
     *     _dummy: String (Optional)
     * }
     * }</pre>
     * 
     * @param id An integer that can be serialized to JSON (`−9007199254740991 (−(2^53 − 1))` to `9007199254740991 (2^53
     * − 1)` ).
     * @param patch The patch parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<BinaryData> updateWithResponse(long id, BinaryData patch, RequestOptions requestOptions) {
        final String contentType = "application/merge-patch+json";
        final String accept = "application/json";
        return service.updateSync(this.client.getEndpoint(), contentType, id, accept, patch, requestOptions);
    }

    /**
     * The delete operation.
     * 
     * @param id An integer that can be serialized to JSON (`−9007199254740991 (−(2^53 − 1))` to `9007199254740991 (2^53
     * − 1)` ).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<Void> deleteWithResponse(long id, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteSync(this.client.getEndpoint(), id, accept, requestOptions);
    }
}
