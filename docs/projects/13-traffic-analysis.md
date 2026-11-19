# 13. Real-Time Traffic Analysis

**Difficulty:** Hard

**Primary focus:** streams, queues, segment trees, graphs, shortest paths, concurrency

## Project description

Build an offline traffic-monitoring simulator that ingests timestamped speed or vehicle-count events and produces interval queries, congestion alerts, and route recommendations. Model a road network as a graph and use a range-query structure such as a segment tree to answer aggregate questions over time windows. “Real-time” means simulated event arrival; an external sensor feed is optional.

## Learning outcomes

- Process events in timestamp order using queues or priority queues.
- Use a segment tree or another documented range-query structure for interval aggregates.
- Combine changing traffic weights with graph shortest-path algorithms.
- Reason about stale data, out-of-order events, concurrency, and reproducibility.
- Evaluate latency and correctness rather than presenting a dashboard alone.

## Minimum requirements

1. Represent a synthetic road network with intersections as vertices and road segments as weighted edges.
2. Ingest timestamped events such as speed, occupancy, or vehicle count from a file or deterministic generator.
3. Maintain a time-window query such as minimum, maximum, sum, or average speed using a segment tree or approved range-query structure.
4. Detect a documented congestion condition and emit an alert with location and time window.
5. Recalculate a route using Dijkstra’s algorithm or A* with traffic-adjusted nonnegative weights.
6. Handle out-of-order, duplicate, missing, and invalid events according to a stated policy.
7. Include a replay mode that produces the same results from the same fixture and seed.
8. Report a small benchmark or operation-count table for event updates and range queries.

## Required data structures and algorithms

- Use a graph representation and a shortest-path algorithm.
- Use a queue or priority queue for event arrival/reordering.
- Use a segment tree for interval queries, unless an approved alternative is justified.
- Use a map or index from road segment to its time-series storage.

## Detailed implementation instructions

1. Choose a fixed time resolution or event-time model. Explain how a timestamp maps to a segment-tree leaf.
2. Define how missing time slots are represented and how they affect averages and alerts.
3. Make event updates and queries separate operations. Test the segment tree against a naive scan on the same window.
4. Convert traffic observations into edge weights with a documented formula. Do not allow negative weights.
5. Keep simulation deterministic. If concurrency is implemented, provide a single-threaded reference mode for verification.
6. For a hard-project report, state what “real time” means in the simulation and what would be needed for production deployment.
7. Test empty windows, one event, full-range queries, boundary indices, out-of-order input, congestion threshold equality, disconnected roads, and route changes.
8. Analyze event update, interval query, route recalculation, memory, and optional concurrency overhead. Define `N` as time slots, `E` as events, and `V/R` as graph vertices/roads.

## Acceptance examples

- A segment-tree query matches a naive scan for every tested window.
- An event at a threshold produces the documented alert behavior.
- A route changes when a segment becomes slower, and the route report explains the updated weights.
- Replaying the same fixture produces identical alerts and route outputs.

## Stretch goals

Sliding-window eviction, parallel event ingestion, incident propagation, multiple route objectives, visualization, or a comparison of segment trees with Fenwick trees and naive scans.
