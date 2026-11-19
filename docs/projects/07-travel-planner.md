# 7. Graph Travel Planner

**Difficulty:** Medium

**Primary focus:** weighted graphs, adjacency lists, BFS/DFS, Dijkstra, priority queues

## Project description

Build a route planner that represents locations as vertices and travel connections as weighted edges. Given a source, destination, and optimization preference, the application should find a route and explain its total distance, time, cost, or another selected weight. Use a small synthetic map or a clearly licensed public dataset.

## Learning outcomes

- Represent directed, undirected, weighted, and disconnected graphs.
- Traverse a graph with BFS or DFS and explain when each traversal is useful.
- Implement Dijkstra’s algorithm with a priority queue for nonnegative edge weights.
- Reconstruct and display the actual route, not only its total cost.
- Validate graph input and reason about unreachable locations and tie-breaking.

## Minimum requirements

1. Load or create a graph of at least 10 locations and 15 connections.
2. Support directed or undirected connections and document the choice.
3. Implement BFS or DFS to answer reachability or route-existence questions.
4. Implement Dijkstra’s algorithm for the shortest route under nonnegative weights.
5. Reconstruct the path from source to destination and display total weight and each step.
6. Report an unreachable destination cleanly.
7. Allow the user to select at least two weight modes, such as distance and travel time, or explain why one mode is sufficient for the baseline.
8. Include tests for a direct route, a cheaper multi-hop route, ties, cycles, and disconnected vertices.

## Required data structures and algorithms

- Use an adjacency list as the primary graph representation unless a matrix is justified.
- Use a queue for BFS or an explicit stack/recursion for DFS.
- Use a min-priority queue for Dijkstra’s frontier.
- Store predecessor information to reconstruct the selected route.

## Detailed implementation instructions

1. Define a location identifier and an edge record containing destination and nonnegative weight(s).
2. Decide whether parallel edges are allowed. If they are, define how the algorithm handles them.
3. For Dijkstra, ignore stale priority-queue entries or use a decrease-key strategy. Document the chosen approach.
4. Keep route-finding independent of file loading and user input. This allows graph algorithms to be tested with tiny hand-built graphs.
5. Make tie-breaking deterministic, for example by location ID, so repeated runs produce comparable output.
6. Do not use live maps or APIs as a requirement. Provide an offline fixture and make external data an optional adapter.
7. Test zero-length routes, missing vertices, negative-weight rejection, cycles, multiple optimal routes, and no-path cases.
8. Analyze graph construction, BFS/DFS, Dijkstra, and path reconstruction. Define `V` as locations and `E` as connections; explain adjacency-list space.

## Acceptance examples

- The planner chooses a 2-hop route when its total weight is less than a direct edge.
- BFS identifies reachability even when the graph contains a cycle.
- A negative edge is rejected or clearly disallowed before Dijkstra runs.
- The displayed path’s edge weights add up to the displayed total.

## Stretch goals

A* with an admissible heuristic, transfer limits, budget constraints, Pareto routes, k-shortest paths, graph visualization, or comparison of adjacency lists and matrices.
