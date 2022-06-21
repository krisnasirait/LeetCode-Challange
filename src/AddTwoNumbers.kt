//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
//
//Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

class ListNode(var `val`: Int) {
    var next: ListNode? = null



}

class AddTwoNumbers {
    fun addTwoNum(l1: ListNode?, l2: ListNode?): ListNode? {

    }


}

fun main() {
    val node1 = ListNode(12)
    val node2 = ListNode(11)
    val node3 = ListNode(10)

    node1.next = node2
    node2.next = node3
}