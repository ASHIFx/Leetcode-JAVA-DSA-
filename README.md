# LeetCode Solutions in Java

[![LeetCode](https://img.shields.io/badge/LeetCode-Kaneki404-FFA116?logo=leetcode&logoColor=white)](https://leetcode.com/u/Kaneki404/)

[![LeetCode Stats](https://leetcode-stats-card.vercel.app/api?username=Kaneki404&theme=dark)](https://leetcode.com/u/Kaneki404/)

Solutions are written in Java and pushed straight from VS Code. Solved count, difficulty split and ranking come live from the LeetCode profile above, so nothing in this README needs updating as the repo grows.

## Repository layout

```
leetcode/
└── P<problem-number>.java
```

- One file per problem, named by its LeetCode number: problem 301 is `P301.java`.
- Each file is only the `Solution` class, exactly as submitted. No `main` method or test code.
- To find a problem, press `t` on GitHub and type its number.

## Patterns and when to reach for them

The recurring techniques behind the solutions, and the signal in a problem that points to each one.

| Pattern | Reach for it when | Core idea |
|---|---|---|
| Stack | Matching or nesting, "most recent unmatched" | Push openers or indices; resolve the top when a closer arrives |
| Running counter | Balance or depth checks, no need to remember positions | One integer replaces the stack when only the count matters |
| Low/high counters | Wildcards that can act as either bracket | Track the minimum and maximum possible open count; clamp the minimum at 0, fail if the maximum goes below 0 |
| Sliding window | Longest or shortest contiguous range under a constraint | Grow the right edge, shrink the left edge only when the constraint breaks; never restart |
| Backtracking | "All" subsets, permutations, combinations, valid arrangements | Choose, recurse, undo; prune a branch as soon as it cannot lead to a valid answer |
| Greedy | A local choice that provably never hurts the final answer | Decide once per step and never revisit; check with a small counter-example first |
| Hash set / map | Membership, frequency, "have I seen this" | Trade O(n) space for O(1) lookup |

## Complexity convention

Time and space follow standard notation over input size `n`. Backtracking solutions are exponential by nature (subsets are O(2^n), permutations O(n!)), so their cost is defined by the output size.