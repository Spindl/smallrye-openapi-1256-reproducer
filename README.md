# smallrye-openapi-1256-reproducer

A minimal reproducer for bug https://github.com/smallrye/smallrye-open-api/issues/1256

It uses the latest available version `3.1.2`.

## How to run the reproducer
1) Build the openapi.json by running `mvn clean install`
2) Check out the generated openapi documentation under `impl/target/generated-openapi/openapi.yaml|json`