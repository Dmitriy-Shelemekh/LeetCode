package add_two_numbers;

public class SolutionOne implements Solution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointerOne = l1;
        ListNode pointerTwo = l2;
        ListNode currentNode = result;
        int dozenCarrier = 0;

        while (pointerOne != null || pointerTwo != null) {
            int pointerOneVal = (pointerOne == null) ? 0 : pointerOne.val;
            int pointerTwoVal = (pointerTwo == null) ? 0 : pointerTwo.val;
            int sum = pointerOneVal + pointerTwoVal + dozenCarrier;
            dozenCarrier = sum / 10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (pointerOne != null) {
                pointerOne = pointerOne.next;
            }

            if (pointerTwo != null) {
                pointerTwo = pointerTwo.next;
            }
        }

        if (dozenCarrier > 0) {
            currentNode.next = new ListNode(dozenCarrier);
        }

        return result.next;
    }
}
