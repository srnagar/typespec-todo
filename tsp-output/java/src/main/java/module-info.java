// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.todo {
    requires transitive io.clientcore.core;
    requires transitive io.clientcore.core.json;
    exports com.todo;
    exports com.todo.models;
    opens com.todo.implementation.models to io.clientcore.core;
    opens com.todo.models to io.clientcore.core;
}