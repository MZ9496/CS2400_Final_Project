# Submission requirements

Submit one GitHub repository for the selected project. The URL must be accessible to fzj0007 as a collaborator.

## Required repository contents

- `README.md` with the project title, problem statement, features, requirements, setup, run commands, test commands, sample output, limitations, and team members.
- Build configuration such as `pom.xml`.
- Source code under `src/main/java/`.
- Automated tests under `src/test/java/`.
- `docs/DESIGN.md` containing the data model, architecture diagram, invariants, and the justification for each central data structure.
- `docs/COMPLEXITY.md` containing Big-O analysis for every required operation and a doubling-ratio or operation-count discussion when measurement is feasible.
- `docs/TEST_PLAN.md` containing test categories, representative cases, expected behavior, and a record of test execution.
- `data/` containing only small synthetic or clearly licensed fixtures.
- `demo/` containing a short video link, screenshots, or both. Do not commit large generated files.
- A `.gitignore` that excludes build output, secrets, IDE files, and local configuration.
- A generative-AI disclosure, if any AI tool was used. Explain what was generated, how it was checked, and what the team changed.


## Demonstration and Presentation requirements

The demonstration must show:

1. The application starting from the documented command.
2. A normal successful workflow.
3. At least one boundary or invalid-input case.
4. The central data structure or algorithm producing a meaningful result.
5. Tests passing or a clearly labeled test report.

## Clean-clone check

Before submitting, use a fresh directory:

```bash
git clone <your-repository-url>
cd <your-repository>
mvn test
mvn package
```

Then follow the README exactly. If the project requires environment variables, provide a safe `.env.example` with fake values and explain the setup without committing secrets.

## Final checklist

- [ ] The repository URL is correct and accessible.
- [ ] The required features in the selected project specification are implemented.
- [ ] The core data structures and algorithms are visible, documented, and tested.
- [ ] Invalid input and important edge cases are handled.
- [ ] Complexity analysis names the input-size variables.
- [ ] Tests pass from a clean clone.
- [ ] Sample data contains no private or sensitive information.
- [ ] README instructions are complete and accurate.
- [ ] Demo evidence is present and easy to find.
- [ ] Team contributions and AI assistance are disclosed.
