## Gradle nested modules example

An example project which demonstrates to have nested modules using gradle. The (made out complex) structure as follows,

```
- schema
    - shared
    - schema1 (uses shared)
    - schema2 (uses shared)
- core (uses schema1 and schema2)
- apps
    - app1 (uses core)
    - app2 (uses core)
```

It also demonstrates the following,

* Have more than 1 app and shared libraries under one repo (for whatever good reason you need that)
* Apply specific plugin for selected modules from root build
* Use shared test utilities in other modules
* Aggregate test results
* Code coverage using JaCoCo
* Aggregate code coverage and generate report (by default code coverage is done per module, the report generation is still per module though)

**Note:** These demonstrations are for experimental purpose and opinionated.
