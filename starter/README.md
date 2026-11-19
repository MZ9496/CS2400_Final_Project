# Java starter scaffold

This folder is a minimal Java 17/Maven scaffold. Copy it into a separate repository before implementing one of the project specifications.

## Commands

```bash
mvn test
mvn package
mvn exec:java -Dexec.mainClass="edu.cpp.cs2400.starter.Main"
```

The scaffold intentionally contains only a harmless entry point and one test. Replace or extend them with your selected project’s model, data structures, algorithms, CLI, and tests.

Recommended next steps:

1. Rename the package and application entry point.
2. Create separate classes for domain records, core data structures, algorithms, persistence, and user interaction.
3. Add the selected project’s synthetic fixtures under `data/`.
4. Add `docs/DESIGN.md`, `docs/COMPLEXITY.md`, and `docs/TEST_PLAN.md`.
5. Update the root README with exact setup and run instructions.
