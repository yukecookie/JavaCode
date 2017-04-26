## 一些编程题

#### 好笨啊，每次都不能完全通过测试用例...

***
1. [洗牌问题](./src/Shuffle/test.java)  通过测试用例按格式输入输出有点烦   
2. [斐波那契](./src/Fibonacci/test.java) 还有一种复杂度更少的进阶没写
3. [从尾打印链表](./src/PrintListFromEnd/test.java) 比起用C++避免操作指针，java还是省了很多
4. [旋转数组]() 这题很简单
5. [栈模拟队列](./src/TwoStackRealizeQueue/test.java) 两个栈操作逻辑细节要考虑全,左神书上的进阶还没写
6. [重建二叉树](./src/RebuildBinaryTree/test.java) 递归求解
7. [最长公共字串](./src/LongestCommonSubstring/test.java) 动态规划，额外空间复杂度为O(1)的方法暂未完成
8. [求整除个数](./src/ExactDivision/test.java) 裸暴在规定时间内通不过测试用例，调整到可以被整除的位置按除数步长再暴力
9. [最大差值](./src/Maximus/test.java) 初做完全想多了，蠢得用递归而且没完全通过测试用例，高分代码十几行贪心简直完美
10. [构造队列](./src/QueueOrder/test.java) 逆向思维推导或观察规律，但在限定时间内做不出来...
11. [组成三角形方法数](./src/AssemblyTriangle/test.java) 蛮简单
12. [最小矩形面积](./src/TheSmallestRectangle/test.java) 同样暴力
13. [平衡数](./src/BalanceNumber/test.java) 没啥好说的
14. [全排列算法](./src/PokerSequence/test.java) 交换再递归有点绕脑子...
15. [字符串分类](./src/ClassifyString/test.java) 栽在了错误的思路上，把字符串转ascii码再丢hash去重忘记考虑有不一样但ascii和相等的情况了
16. [调整奇数偶数顺序](./src/SetArrayItemProcedure/test.java) 想了很多但觉得能以空间换时间的事情就懒得思考了，觉得没必要上各种排序算法，申请个ArrayList就可以了。 17.4.12 update：更新不申请空间的解法，注意交换后数组要整体移动以确保顺序未变
17. [打印链表倒数第k个节点](./scr/InvertedNode/test.java) 先遍历一遍长度再走到第n-k+1个节点或者用栈?
18. [合并链表](./src/MergeLinkedList/Main.java) 递归和非递归实现，这题递归开销测试时好像更小
19. [TwoSum](./src/TwoSum/Main.java) 首先还是想到暴力所有值匹配...心疼抱抱自己
20. [树的子结构](./src/TreeSubstructure/Main.java) 多写了个else,逻辑出现严重漏洞
21. [镜像二叉树](./src/BinaryTreeMirror/Main.java) 回头补上非递归版本
22. [顺时针打印矩阵](./src/ClockwisePrintMatrix/Main.java) 我竟然码了好久...哭
23. [包含min函数的栈](./src/StackWithGetMinFunction/Main.java)
24. [根据栈压入序列判断弹出序列](./src/IsPopOrder/Main.java)
25. [按层打印二叉树](./src/PrintBinaryTreeByLayer/Main.java) 没过测试用例，根节点为空返回空，我让它返回null了
26. [后序遍历序列判断搜索树](./src/IsBinarySearchTree/Main.java)
27. [二叉树中和为某值的路径](./src/BinaryTreePath/Main.java) 看了参考答案...唉
28. [复制复杂链表](./src/ComplexLinkedList/Main.java) 不会entryset遍历哈希桥接
29. [二叉搜索树转双向链表](./src/BinarySearchTreeToLinkedList/Main.java) 二叉树这种东西太适合递归了
30. [字符串的排列](./src/StringRank/Main.java) 
31. [数组中超过的一半版本](./src/NumCountHigherThanArrayHalfLength/Main.java) 表示只能想到排序后计数的解法
32. [最小k的个数](./src/TheMinNumberCount/Main.java) 快排一下
33. [最大子数组的和](./src/SumOfChildArray/Main.java) 题目有点岑人，看了半天恍然这不就是最简单的dp嘛
34. [1出现的个数](./src/CountNumberOne/Main.java) 没循环取余计数，转成字符数组匹配1了，应该用stringBuffer更升内存但是不知道再怎么调toCharArray转成字符
35. [把数组排成最小的数](./src/GetMaxByCombineArrayItem/Main.java) 别人家孩子的思路真是太赞了！好扎心
36. [丑数](./src/UglyNumber/Main.java) O(n^2)的复杂度运行超时，果然还是要发现规律
37. [第一个只出现一次的字符](./src/FirstOnlyAppearOnceChar/Main.java) 中规中矩用HashMap
38. [数组中的逆序对](./src/InvertedCoupleInArray/Main.java) 除了暴力完全不会想到归并排序
39. [链表第一个公共节点](./src/FIrstPublicNode/Main.java)
40. [二叉树最大深度](./src/BinaryTreeDepth/Main.java)

持续更新中...