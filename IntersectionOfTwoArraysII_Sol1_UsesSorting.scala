/*
 * Intersection of two arrays using sorting
 */
object Solution {
    def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        val a = nums1.sorted
        val b = nums2.sorted

        var (i, j) = (0, 0)
        var res = List[Int]()
        while(i < a.length && j < b.length) {
            if(a(i) == b(j)) {
                res ::= a(i)
                i += 1
                j += 1
            }
            else if(a(i) < b(j)) i += 1
            else j += 1
        }
        res.toArray
    }
}