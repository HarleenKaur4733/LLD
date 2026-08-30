# Low Level Design & Design Patterns in Java

This repository documents my journey of learning and practicing **Low Level Design (LLD)**, **Object-Oriented Design**, and **Design Patterns using Java**.

The goal is to go beyond just understanding the theory and focus on actually designing and implementing systems while improving the design iteratively.

## What I'm Practicing

* Object-Oriented Programming principles
* SOLID principles
* Creational Design Patterns
* Structural Design Patterns
* Behavioral Design Patterns
* Low Level Design of real-world systems
* Object relationships and responsibilities
* Identifying design issues and improving existing designs
* Applying feedback and iteratively refining system designs

---

# Design Patterns

This repository contains Java implementations and exercises for various design patterns.

The focus is on understanding:

* **Why** a particular pattern is needed
* What problem it solves
* How objects interact with each other
* When to prefer composition over inheritance
* How to write clean, extensible, and maintainable designs

Patterns being practiced include:

### Creational Patterns

* Singleton
* Factory
* Builder

### Structural Patterns

* Decorator

### Behavioral Patterns

* Strategy
* Observer

More patterns and implementations will be added as I continue learning.

---

# Low Level Design Exercises

Along with individual design patterns, I am also practicing complete object-oriented designs for common real-world systems.

## 1. Tic-Tac-Toe Game

A console-based Tic-Tac-Toe game implemented in Java with a focus on clean Low Level Design.

### Core Objects & Relationships

* **Game** → Controls the overall game flow and manages player turns.
* **Board** → Manages the board state and validates moves.
* **Player** → Owns a `PlayingPiece` and decides the move.
* **PlayingPiece** → Represents the player's symbol, such as `X` or `O`.
* **Move** → Holds the selected row and column.

The focus of this implementation is on keeping responsibilities separated and ensuring that each object has a clear role in the system.

<img width="835" height="657" alt="Tic Tac Toe Design" src="https://github.com/user-attachments/assets/f08c05c6-fbdf-48b2-8379-d66a2b7eb33c" />

---

## 2. Elevator System

**Status: Rough Design — needs further refinement and improvements.**

Currently working on designing an Elevator System by identifying the core entities, their responsibilities, and their interactions.

This design is still under refinement. Future improvements may include:

* Better separation of responsibilities
* Improved request handling
* Elevator scheduling and selection strategies
* Handling internal and external requests
* Elevator states and movement
* Support for multiple elevators
* Applying appropriate design patterns where required

<img width="1105" height="696" alt="Elevator System Design" src="https://github.com/user-attachments/assets/c528458c-0e6d-498f-a9c5-c86ef4b2f578" />

---

## 3. Car Rental System (ZoomCar)

**Status: Rough Design — needs further refinement and improvements.**

Currently working on the Low Level Design of a car rental system inspired by platforms such as ZoomCar.

### Feedback and Improvements Identified

**Feedback 1:** The source of car data is not clearly defined in the current design.

To address this, an **Inventory Management System** needs to be introduced.

The Inventory Management System should be responsible for managing vehicle inventory and supporting CRUD operations for car providers.

Possible responsibilities include:

* Adding vehicles
* Updating vehicle details
* Removing vehicles
* Managing vehicle availability
* Fetching available vehicles
* Managing inventory provided by different car providers

This design will continue to evolve as more edge cases, responsibilities, and design improvements are identified.

```text
More improvements and feedback to be added...
```

<img width="896" height="638" alt="Car Rental System Design" src="https://github.com/user-attachments/assets/14f945ca-3fa2-4c48-80b1-e5e9e4f35130" />

---

# Approach

For each design exercise, my current approach is:

1. Understand the problem and requirements.
2. Identify the core entities.
3. Define the responsibilities of each entity.
4. Establish relationships between objects.
5. Identify places where abstraction is needed.
6. Apply suitable design patterns where they genuinely solve a problem.
7. Implement the design in Java.
8. Review the design and identify issues.
9. Incorporate feedback and refine the design.

The designs in this repository are not intended to be considered final on the first attempt.

A major part of this repository is the **iterative learning process**:

> Design → Implement → Review → Receive Feedback → Refactor → Improve

Some designs may intentionally remain marked as **rough designs** while I continue refining them and documenting the improvements.

---

# Work in Progress

This repository is actively evolving.

I will continue adding:

* More Design Pattern implementations
* More Low Level Design problems
* Improved versions of existing designs
* Refactoring based on feedback
* Edge cases and additional requirements
* UML/Class diagrams
* Notes explaining important design decisions

The primary goal is to build a strong practical understanding of **Low Level Design and scalable object-oriented systems**, rather than simply memorizing design patterns.
