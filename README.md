
- Uses **chaining** for collision handling.
- Inner class `HashNode<K, V>` contains `key`, `value`, and `next`.
- Key methods:
  - `put(K key, V value)`
  - `get(K key)`
  - `remove(K key)`
  - `contains(V value)`
  - `getKey(V value)`
  - `getBucketSizes()` — prints number of items per chain (bucket)


- Custom key class with manually implemented `hashCode()` using **Horner’s method**
- Does **not** use `Objects.hash()` or other built-in helpers


- A simple value object with `name` and `age` fields


- 10,000 random key-value pairs (`MyTestingClass → Student`) were added
- Distribution across 11 buckets was printed

---

- Each node contains: `key`, `val`, `left`, and `right`
- Key methods:
  - `put(K key, V value)`
  - `get(K key)`
  - `delete(K key)`
  - `size()` — returns number of nodes in the tree


- Custom iterator using stack
- Returns objects with `.getKey()` and `.getValue()` methods


- A tree with 5 nodes was created
- Output format: `key is ... and value is ...` (in sorted order)

---



- `MyHashTable.java`
- `MyTestingClass.java`
- `Student.java`
- `Main.java` 
- `BST.java` 

