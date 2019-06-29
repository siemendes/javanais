module api{
    exports com.sm.poleemploi.api;

    requires spring.context;
    requires slf4j.api;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires spring.beans;

    requires service ;
}