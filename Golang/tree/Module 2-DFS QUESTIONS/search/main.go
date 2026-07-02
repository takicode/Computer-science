package main


import (
	"fmt"
)

type TreeNode struct{
	value int
	left *TreeNode
	right *TreeNode
}


func NewNode(value int) *TreeNode{
    return &TreeNode{
		value:value,
	}
}

func search(node *TreeNode,target int)bool{
     if node == nil{
		return false
	 }

	 if node.value == target{
		return true
	 }

	 return search(node.left, target) || search(node.right,  target)


}


func main(){
	root := NewNode(5);

	root.left = NewNode(3)
	root.right = NewNode(8)


	root.left.left = NewNode(1)
	root.left.right = NewNode(4)
	root.right.left = NewNode(7)
	root.right.right = NewNode(9)

	fmt.Println(search(root, 13)) // false
}
