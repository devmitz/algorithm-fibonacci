# Fibonacci Algorithm

This repository contains an implementation of the Fibonacci algorithm in Python. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. This algorithm efficiently computes the nth number in the Fibonacci sequence.

## Getting Started

To get started with this algorithm, follow the instructions below.

### Prerequisites

Make sure you have the following prerequisites installed on your system:

- Java

### Installation

1. Clone this repository to your local machine or download the ZIP file and extract it.

```shell
git clone https://github.com/devmitz/fibonacci-algorithm.git
```

2. Change into the project directory.

```shell
cd fibonacci-algorithm
```

## Usage

To use the Fibonacci algorithm, follow these steps:

1. Open a terminal or command prompt.
2. Navigate to the project directory.
3. Run the Java script.

```shell
java -jar .\algorithm-fibonacci.jar
```


## Algorithm Explanation

The Fibonacci algorithm implemented in this repository uses a recursive approach. It takes advantage of the fact that the Fibonacci sequence follows a specific pattern. The algorithm calculates the nth Fibonacci number by recursively summing the (n-1)th and (n-2)th Fibonacci numbers until it reaches the base case of 0 or 1.

The algorithm has a time complexity of O(2^n) due to the recursive nature of its implementation. However, the use of memoization can significantly improve its performance by avoiding redundant calculations.

## Contributing

Contributions to this repository are welcome. If you have any ideas or improvements, feel free to open an issue or submit a pull request.

## Acknowledgments

- The Fibonacci sequence is a classic mathematical concept.
- Special thanks to the open-source community for their contributions to the field of algorithms and data structures.

## References

For more information on the Fibonacci sequence and related algorithms, refer to the following resources:

- [Fibonacci number - Wikipedia](https://en.wikipedia.org/wiki/Fibonacci_number)
- [Fibonacci Numbers - Math Is Fun](https://www.mathsisfun.com/numbers/fibonacci-sequence.html)