Preorder - A B D E H C F G 
Inorder - D B H E A F C G 
Postorder- D H E B F G C A 
BFS (Level Order) - A B C D E F G H

Question
Explain why recursion naturally performs DFS instead of BFS.

Answer
DFS can be implemented recursively because the function call stack behaves like a stack (LIFO). 
It can also be implemented explicitly using a stack data structure. 
BFS, however, needs a queue because it must process nodes in the order they were discovered (FIFO)

Question
Suppose you're building a navigation app.
Every road has the same travel cost.

Answer
Because every road has the same cost, BFS explores locations level by level. 
The first time it reaches the destination, it is guaranteed to have found the shortest path.