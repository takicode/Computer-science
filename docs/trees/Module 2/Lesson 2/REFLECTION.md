
A = 0
C = 1
E = 2
G = 3

G = 0
E = 1
B = 2
A = 3

D and G = 3
G and F =5

if you say
"cos search is done down the tree, the search check the value of the node down the tree".
i will say that is weak cos

Imagine these two trees contain the same values.

Tree 1
     50
    /  \
  25    75
 / \    / \
10 40  60 90

Searching for 90:

50
↓
75
↓
90

Only 3 nodes are visited.

Now imagine this tree.

50
 \
  60
   \
    70
     \
      80
       \
       90

Searching for 90:

50
↓
60
↓
70
↓
80
↓
90

Now we visited 5 nodes.

Notice something?

We never visited every node.

We only visited nodes along one path.


Instead of saying:

Search goes down the tree.

A more precise engineering answer is:

Searching follows a single root-to-node path. The number of nodes on that path is determined by the tree's height, so the running time is O(height).