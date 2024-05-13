This is a snapshot of the core Docker Compose setup at https://github.com/camunda/camunda-platform. It spins a subset of Camunda components:

- Zebee (Camunda's distributed workflow engine)
- [Operate](http://localhost:8081/processes?active=true&incidents=true) (Camunda's process monitor)
- Tasklist
- Connectors (Camunda's out-of-the-box connectors)
- Elasticsearch
- Kibana

Note that the username and password credentials for Camunda's components are `demo` / `demo`.