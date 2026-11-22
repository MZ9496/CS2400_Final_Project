# Assignment overview

## Purpose

The DSA Project Studio asks you to use data structures and algorithms to build a small, testable application around a realistic problem. The goal is not to produce the largest application. The goal is to make deliberate design choices, implement them correctly, measure or analyze them honestly, and explain the trade-offs.

Choose one project from the fifteen-project menu. A project may be completed individually or in a team of two.

## Required technology baseline

- Java 17 or older.
- Maven or another documented build system.
- JUnit 5.
- A command-line interface is sufficient. A graphical or web interface is optional.
- Core data structures and algorithms must be implemented by the team unless the specification explicitly permits a library. You may use Java collections for ordinary application plumbing, but your report must identify which structure performs the central algorithmic work.

## Development phases

### Phase 1: Understand and scope

Read the selected specification, identify users and inputs, list required outputs, and write down assumptions. Reduce the scope before adding optional features.

### Phase 2: Model the data

Define the record types and relationships. Choose an initial data structure for each operation. Draw a small diagram and include it in `docs/DESIGN.md`.

### Phase 3: Implement the core

Implement the smallest correct version of the required operations. Keep input/output code separate from the data-structure and algorithm classes so that the core can be tested without a user interface.

### Phase 4: Test and analyze

Write tests before the final demo. Include empty input, one-element input, duplicate values, invalid values, and a realistic multi-record case when applicable. Complete `docs/COMPLEXITY.md` using variables that describe the input size.

### Phase 5: Package and communicate

Update the README, add sample data, record a demo, review the clean-clone instructions, and complete the submission checklist.

## Minimum quality bar

A project is ready to submit when a reviewer can clone it, run the documented commands, execute the main workflow, inspect the central data structure or algorithm, and run the automated tests without hidden setup steps.

## Team expectations

Each team member must make identifiable contributions. The repository README should list each member’s responsibilities, and `docs/CONTRIBUTIONS.md` should summarize commits, features, tests, and documentation completed by each member. Every member must be able to explain the complete design during the demo and final presentation.
