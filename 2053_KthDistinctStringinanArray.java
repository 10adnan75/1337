// class Solution {
//     public String kthDistinct(String[] arr, int k) {
//         Map<String, Integer> map = new HashMap<>();
//         for (String s : arr) {
//             map.put(s, map.getOrDefault(s, 0) + 1);
//         }
//         int size = 0;
//         for (Map.Entry entry : map.entrySet()) {
//             if ((int)entry.getValue() == 1) {
//                 size++;
//             }
//         }
//         if (k > size) {
//             return "";
//         }
//         String[] ans = new String[size];
//         int idx = 0;
//         for (Map.Entry entry : map.entrySet()) {
//             if ((int)entry.getValue() == 1) {
//                 ans[idx++] = entry.getKey().toString();
//             }
//         }
//         for (String s : ans) {
//             System.out.print(s + " ");
//         }
//         return ans[k-1];
//     }
// }

// Using map and list
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> ans = new ArrayList<>();
        for (String s : arr) {
            if (map.get(s) == 1) {
                ans.add(s);
            }
        }
        return k > ans.size() ? "" : ans.get(k - 1);
    }
}

// Optimized
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (map.get(s) == 1) {
                if (--k == 0) {
                    return s;
                }
            }
        }
        return "";
    }
}
