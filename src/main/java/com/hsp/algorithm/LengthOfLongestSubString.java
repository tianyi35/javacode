package com.hsp.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:无重复字符的最长子串长度
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * Related Topics
 * 哈希表
 * 字符串
 * 滑动窗口
 * Author: Lixp
 * Date: 2023-04-20 11:18
 * Version 1.0
 */
public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(getLengthOfLongestSubString(str));
    }

    public static int getLengthOfLongestSubString(String str) {

        /**
         * 输入: s = "pwwkew"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
         */

        int n = str.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = str.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(str.charAt(end), end + 1);
        }
        return ans;


       /* if (" ".equals(str)) {
            return 1;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        char s = 0;
        String temStr = new String();
        Integer length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 ||temStr.contains(str.charAt(i)+"")) {
                s = str.charAt(i);
                if (i == 0 || hashMap.containsKey(temStr)) {
                    temStr = str.charAt(i) + "";
                }
            }

            if (i > 0) {
                if (s == str.charAt(i)) {
                    hashMap.put(temStr, temStr.length());
                    temStr = str.charAt(i) + "";
                } else {
                    temStr += str.charAt(i);
                }
            }
            if (i == str.length() - 1) {
                hashMap.put(temStr,temStr.length());
            }
        }
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) > length) {
                length = hashMap.get(key);
            }
        }
        if (hashMap.size() < 1) {
            return str.length();
        }
        return length;*/
    }

}
