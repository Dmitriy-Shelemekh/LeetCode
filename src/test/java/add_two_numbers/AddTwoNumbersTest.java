package add_two_numbers;

import org.junit.jupiter.api.Test;

//    Example 3:
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//
//    Example 2:
//Input: l1 = [0], l2 = [0]
//Output: [0]
//
//    Example 3:
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

class AddTwoNumbersTest {
    private Solution solution;

    @Test
    public void solutionOneTest() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        solution = new SolutionOne();
        System.out.println(solution.addTwoNumbers(l1, l2));
    }
}