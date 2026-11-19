# CS 2400 Data Structures and Algorithms Project Studio

This repository is a course-ready project menu and implementation guide for **CS 2400 – Data Structures and Advanced Programming**. It turns fifteen DSA project ideas into clearly scoped, GitHub-ready project specifications for Java students.

The repository is intentionally designed as an **assignment guide and starter scaffold**. Students select one project, implement it in their own repository, and submit the required source code, tests, analysis, and demonstration evidence. This repository does not provide completed solutions.

## Quick start

1. Read [`docs/assignment-overview.md`](docs/assignment-overview.md).
2. Review the project menu below and select a project with your instructor or team.
3. Copy the contents of [`starter/`](starter/) into your implementation repository.
4. Read the complete specification for the selected project in [`docs/projects/`](docs/projects/).
5. Complete the required repository structure and submission checklist.
6. Run the tests and package the project before submitting the GitHub URL.

The starter scaffold uses Java 17 and Maven:

```bash
cd starter
mvn test
mvn package
```

## Project menu

| # | Project | Difficulty | Main DSA focus |
|---:|---|---|---|
| 1 | [To-Do List](docs/projects/01-todo-list.md) | Easy | Lists, sorting, searching, persistence |
| 2 | [Phonebook](docs/projects/02-phonebook.md) | Easy | Arrays/lists, hashing, sorting, searching |
| 3 | [Expression Calculator](docs/projects/03-calculator.md) | Easy | Stacks, parsing, operator precedence |
| 4 | [Student Grade Checker](docs/projects/04-student-grade-checker.md) | Easy | Hash maps, aggregation, sorting |
| 5 | [Plagiarism Detection System](docs/projects/05-plagiarism-detection.md) | Medium | Hashing, string matching, similarity |
| 6 | [Banking Management System](docs/projects/06-banking-management.md) | Medium | Lists, maps, queues, transactions |
| 7 | [Graph Travel Planner](docs/projects/07-travel-planner.md) | Medium | Graphs, BFS/DFS, Dijkstra, priority queues |
| 8 | [Cash-Flow Minimizer](docs/projects/08-cash-flow-minimizer.md) | Medium | Graphs, heaps, greedy optimization |
| 9 | [Crossword Puzzle Game](docs/projects/09-crossword-puzzle.md) | Medium | Matrices, tries, backtracking, constraints |
| 10 | [Library Management System](docs/projects/10-library-management.md) | Medium | CRUD, maps, trees, queues, persistence |
| 11 | [File Zipper](docs/projects/11-file-zipper.md) | Medium | Huffman trees, priority queues, bit/byte I/O |
| 12 | [Real-Estate Property Search](docs/projects/12-real-estate-property-search.md) | Hard | Spatial indexing, range queries, ranking |
| 13 | [Real-Time Traffic Analysis](docs/projects/13-traffic-analysis.md) | Hard | Graphs, segment trees, streams, concurrency |
| 14 | [Email Spam Filter](docs/projects/14-email-spam-filter.md) | Hard | Bloom filters, hashing, classification |
| 15 | [Web Crawler](docs/projects/15-web-crawler.md) | Hard | BFS/DFS, queues, sets, URL normalization |

The project titles and broad difficulty levels are adapted from the Codegnan resource listed in [Sources](#source-and-adaptation-note). The specifications, acceptance criteria, safety constraints, and submission workflow in this repository are original course materials.

## Common learning outcomes

After completing one project, a student should be able to:

- Translate a real-world problem into an implementable specification.
- Select data structures based on required operations and constraints.
- Implement and explain at least one nontrivial algorithm.
- Analyze time and space complexity using meaningful input-size variables.
- Design tests for normal cases, boundary cases, invalid input, and failure behavior.
- Persist, validate, and report data responsibly when the project requires it.
- Use GitHub, Maven, documentation, and issue tracking as part of a professional workflow.
- Communicate design decisions with diagrams, examples, benchmarks, and a short demo.

## Required submission

Every project repository must contain the following before submission:

```text
your-project/
├── README.md
├── pom.xml (or an approved build file)
├── src/main/java/        # implementation
├── src/test/java/        # automated tests
├── data/                 # small synthetic fixtures only
├── docs/
│   ├── DESIGN.md
│   ├── COMPLEXITY.md
│   └── TEST_PLAN.md
├── demo/                 # screenshots or a short demo link
└── .gitignore
```

The repository must include:

1. A clear problem statement and list of implemented features.
2. A data-model or architecture diagram and an explanation of each important data structure.
3. Pseudocode or a written explanation for the core algorithm(s).
4. Big-O time and space analysis for the required operations.
5. Automated tests with meaningful assertions and a short test plan.
6. Setup, run, and test instructions that work from a clean clone.
7. Synthetic sample data and at least one reproducible example session or output.
8. A short demo video or 4–8 screenshots showing the main workflow.
9. A contribution log if the project is completed by a team.
10. A statement identifying any generative-AI assistance and what was reviewed or changed by the authors.

See [`docs/submission-requirements.md`](docs/submission-requirements.md) for the complete checklist and [`docs/grading-rubric.md`](docs/grading-rubric.md) for the evaluation criteria.

## Recommended project workflow

```text
Choose a problem
      ↓
Write requirements and data model
      ↓
Build a small correct baseline
      ↓
Add the required DSA algorithm
      ↓
Test edge cases and invalid input
      ↓
Measure or reason about complexity
      ↓
Document, demo, and submit
```

Do not begin with a graphical interface. First make the core data structures and algorithms correct and testable; then add a CLI or interface around them.

## Scope and safety

- Use Java 17 unless your instructor approves another language or version.
- Prefer the Java standard library for the core implementation. If a third-party library is used, document why and list its license.
- Use synthetic or public-domain data. Do not commit real student records, bank credentials, private email, personal addresses, API keys, or scraped personal information.
- The banking, spam-filter, traffic, property-search, and crawler projects are educational simulations. They are not production security, financial, transportation, or compliance systems.
- For networked projects, use an offline fixture mode for tests and respect site terms, robots.txt, rate limits, and instructor-approved domains.
- Commit regularly with meaningful messages. Do not commit generated build output, secrets, or IDE metadata.

## Source and adaptation note

The project menu was developed from Codegnan’s **“15 Data Structure and Algorithm (DSA) Project Ideas”** page, accessed November 19, 2026: <https://codegnan.com/data-structure-and-algorithm-project-ideas/>.

This repository paraphrases and expands the ideas for a CS 2400 assignment. It is not affiliated with or endorsed by Codegnan. Any external code, data, images, or libraries used by a student must be credited in that student’s repository.

## License and classroom use

This repository is an instructor-created educational template. Add the course’s preferred license or classroom-use notice before publishing it outside the course.
