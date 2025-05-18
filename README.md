# Graph Algorithms: BFS and Dijkstra (Vertex-based Implementation)

## Overview

This project implements **Breadth-First Search (BFS)** and **Dijkstra's Algorithm** on a weighted graph using a **Vertex-centric design**.

Unlike traditional implementations with an explicit `Edge` class, this design stores edges as part of each `Vertex` object via an `adjacentVertices` map.

---

## Features

- Generic `Vertex<V>` class with support for adjacent vertices and edge weights
- `WeightedGraph<V>` for building the graph
- `BreadthFirstSearch<V>` traversal algorithm
- `DijkstraSearch<V>` shortest path algorithm
- Clean and simple `Main.java` for demonstration
- Fully uses Java Generics and Standard Collections

---

## Project Structure

```bash
├── Vertex.java             # Represents a graph node and its neighbors
├── WeightedGraph.java      # Graph data structure using Vertex objects
├── BreadthFirstSearch.java # BFS traversal algorithm
├── DijkstraSearch.java     # Dijkstra's algorithm for shortest paths
├── Main.java               # Test graph with example BFS and Dijkstra output
└── README.md               # This file
