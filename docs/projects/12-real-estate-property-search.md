# 12. Real-Estate Property Search

**Difficulty:** Hard

**Primary focus:** spatial indexing, range queries, nearest neighbors, heaps, multi-criteria filtering

## Project description

Create an offline property-search engine over a synthetic or clearly licensed dataset. Each property should contain a location, price, area, bedrooms, and other documented fields. Users should be able to filter by attributes, perform a spatial range or nearest-neighbor query, sort or rank results, and inspect the index’s performance relative to a full scan.

## Learning outcomes

- Index multidimensional records rather than treating every query as a linear scan.
- Implement or carefully explain an R-tree, k-d tree, or approved spatial index.
- Combine spatial predicates with ordinary filters and ranking criteria.
- Use a heap or priority queue for top-`k` nearest or best-ranked results.
- Evaluate index correctness and performance on synthetic datasets of increasing size.

## Minimum requirements

1. Load at least 500 synthetic property records with coordinates, price, area, bedroom count, and a stable ID.
2. Support numeric filters such as price range, area range, and bedroom range.
3. Support a rectangular spatial range query and a nearest-neighbor or radius query.
4. Implement an R-tree or instructor-approved spatial index. A full-scan implementation must also be available as a correctness baseline.
5. Return results sorted by a selected criterion and support top-`k` results with a heap or priority queue.
6. Validate invalid ranges, missing values, impossible coordinates, and empty result sets.
7. Compare indexed results with the baseline scan on the same queries and report mismatches.
8. Include a reproducible benchmark or operation-count table as dataset size grows.

## Required data structures and algorithms

- Use a spatial index whose bounding regions can be searched for overlap; an R-tree is the preferred structure.
- Use a list or map for property records and ID lookup.
- Use a heap for top-`k` ranking or nearest-neighbor maintenance.
- Implement range filtering and result verification against a full scan.

## Detailed implementation instructions

1. Use a consistent coordinate system. Synthetic `x/y` coordinates are acceptable and often easier to test than real addresses.
2. Define the bounding rectangle for each point or property footprint. Document whether a property is a point, rectangle, or polygon.
3. For an R-tree, document node capacity, split policy, insertion, overlap search, and whether deletion is supported. If using a k-d tree, document the splitting dimension and balance policy.
4. Apply ordinary filters after spatial candidate retrieval and state this in the design. A query must never return a property outside any requested constraint.
5. Use a deterministic random seed for generated records and benchmark queries.
6. Keep full-scan code simple and trusted; it is the oracle for index correctness.
7. Test boundary-inclusive ranges, point on a rectangle edge, no matches, duplicate coordinates, top-`k` ties, and malformed records.
8. Analyze build, insertion, range query, nearest-neighbor, filtering, ranking, and memory. Discuss average behavior and worst-case degradation rather than promising a universal bound for an unbalanced index.

## Acceptance examples

- Indexed range results match full-scan results as sets of property IDs.
- A property exactly on an inclusive query boundary is handled according to the documented rule.
- A top-`k` query never returns more than `k` records and uses a deterministic tie-breaker.
- Benchmark results identify index-build cost and query-time trade-offs.

## Stretch goals

Polygon intersection, map visualization, incremental updates, disk-backed indexing, cached queries, or Pareto ranking across price, area, and distance.
