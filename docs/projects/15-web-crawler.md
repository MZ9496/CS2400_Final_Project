# 15. Web Crawler

**Difficulty:** Hard

**Primary focus:** BFS/DFS, queues, sets, graphs, URL normalization, parsing, rate limits

## Project description

Build a respectful crawler that starts from one or more URLs, fetches allowed pages, extracts links, normalizes them, and records a crawl report. The required tests must use a local HTML fixture server or checked-in HTML files so the project is reproducible and does not depend on the public internet.

## Learning outcomes

- Model a website as a directed graph of pages and links.
- Use BFS or DFS with a queue/stack and a visited set.
- Normalize URLs and deduplicate equivalent links.
- Parse HTML safely enough to extract links and handle broken pages.
- Apply depth, domain, robots, rate-limit, timeout, and retry policies responsibly.

## Minimum requirements

1. Crawl a deterministic local fixture site with at least eight pages and a cycle.
2. Use BFS or DFS and document the chosen traversal and its effect on crawl order.
3. Track discovered, queued, fetched, skipped, failed, and duplicate URLs separately.
4. Normalize URLs so fragments and equivalent relative links do not cause duplicate visits.
5. Enforce a maximum depth, maximum page count, and same-domain policy.
6. Extract page title, status, links, and a small text summary into a report or local index.
7. Handle missing pages, redirects or redirect-like fixtures, malformed HTML, timeouts, and repeated links without crashing.
8. Include a safe network policy: robots.txt handling where applicable, a descriptive user agent, rate limiting, and an offline test mode.

## Required data structures and algorithms

- Use a queue for BFS or an explicit stack for DFS.
- Use a set for visited/canonical URLs and a separate set or map for failed attempts.
- Use a graph or adjacency map to store observed page-link relationships.
- Implement URL normalization and link extraction as testable functions.

## Detailed implementation instructions

1. Define the canonical URL policy: lowercase host, default ports, path normalization, fragment removal, query-string handling, and relative-link resolution.
2. Use an HTTP client or a local file adapter behind a small fetcher interface. Tests should inject a fixture fetcher so no network is required.
3. Enforce limits before adding work to the frontier. A crawl must terminate even when the fixture contains an infinite-looking cycle.
4. Decide whether redirects count against the page limit and how the final URL is canonicalized.
5. Store only the minimum text needed for the assignment. Do not crawl private sites, bypass access controls, or collect personal information.
6. Test a cycle, duplicate links, fragment-only links, relative links, outside-domain links, depth limits, missing pages, malformed content, and deterministic ordering.
7. Analyze URL normalization, enqueue/dequeue, fetch, parsing, and storage. Define `V` as pages visited, `E` as extracted links, and `L` as page-content size.
8. If you add concurrency, keep a single-threaded reference implementation and explain synchronization, rate limiting, and how the visited set remains safe.

## Acceptance examples

- A cyclic fixture visits each canonical page at most once.
- A link to another domain is skipped under the same-domain policy.
- A fragment-only difference does not create a second page visit when fragments are ignored.
- A failed fetch is reported and does not terminate the entire crawl.

## Stretch goals

Priority crawling, sitemap support, content hashing, duplicate-page detection, a persistent index, polite parallel crawling, or a search interface over the collected fixture content.
