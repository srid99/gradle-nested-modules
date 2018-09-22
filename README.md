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
* Apply plugin for selected modules from root
* Shared test utilities as dependency
* Code coverage using JaCoCo
* Gather code coverage and generate report (by default it does per module)

**Note:** These demonstrations are for experimental purpose and opinionated.
