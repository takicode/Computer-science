## Get the max number in a tree 
You may be tempted to collect the max value in a variable as done below



    public static int MaxValue(TreeNode node,int max){
        if (node == null){
             return 0;
        }
        if (node.value > max){
            max = node.value;
        }
        return Math.max(Math.max(MaxValue(node.left,max), max), Math.max(MaxValue(node.right,max), max)) ;
    }


This works but there is a subtle discrepancy from the intuition we are building

Let's go through it

## Step 1: What is your recursive function supposed to return?

Remember the question I've been drilling into you for the last few lessons.

What information should each subtree return?

For this problem, the answer is:

Each subtree should return the maximum value it contains.

Not:
the maximum seen so far.

That's a subtle but extremely important difference.

## Step 2: Look at this line
max = node.value;

Here, max is a variable.

Each recursive call gets its own copy of that variable.

For example:

Count(root, 5)

calls

Count(root.left, 5)

and

Count(root.right, 5)

Those recursive calls do not share the same max.

Each one has its own local variable.

This means you're carrying state down the tree.

## Step 3: Think about the recursive question

Suppose I'm standing on this node:

        8
       / \
      3   10

What question should I ask the left subtree?

Should I ask:

"What's the largest value you've seen so far?"

No.

I should ask:

"What's the maximum value in your tree?"

Notice the difference.

The subtree should solve the problem independently.

It shouldn't depend on information from its parent.

## Step 4: The pattern we've been building

Remember our recursive formula?

Searching:

left || right

Counting:

1 + left + right

Height:

1 + max(left, right)

Maximum value should follow exactly the same philosophy.

Each subtree returns its own answer.

Then the parent combines them.

## Step 5: A thought experiment

Imagine this tree:

       5
      /
     100

Suppose we call:

Count(root, Integer.MIN_VALUE)

When the left subtree returns, what should it return?

Should it return:

100

or should it return whatever max happened to be passed in?

Ideally, it should simply answer:

"The maximum value in my subtree is 100."

That's all.

No dependency on the parent.


## An Engineering Principle

Here's a principle you'll hear experienced engineers talk about:

A function should have a single responsibility.

Your recursive function should answer exactly one question.

For example:

maxValue(node)

answers:

"What is the maximum value in this subtree?"

It shouldn't also be responsible for remembering previous maximums.

That makes the function harder to reason about.

## A challenge for you

I think you're ready for something different.

Try to solve the "maximum value in a tree" problem without using an extra max parameter.

Use only:

the current node,
the value returned by the left subtree,
the value returned by the right subtree.

If you can derive that solution yourself, you'll have fully internalized the recursive design 
pattern we've been building over the last several lessons. I genuinely believe you're close.


    public static int Count(TreeNode node){
        if (node == null){
        return 0;
    }

        return Math.max(Math.max(node.value,Count(node.left)),  Math.max(node.value, Count(node.right)) ) ;
    }


    even better
    
    public static int MaxValue(TreeNode node){
    if (node == null){
    return Integer.MIN_VALUE;
    }

        return Math.max(node.value,  Math.max(MaxValue(node.left), MaxValue(node.right)));
    }