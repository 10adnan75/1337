// My solution, 6 ms, beats 99.2%
class Solution {
    public String getEmail(String email) {
        boolean plus = false;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (i=0; i<email.length(); i++) {
            char c = email.charAt(i);
            if (c == '@') {
                break;
            }
            if (c == '.') {
                continue;
            } else if (c == '+') {
                plus = true;
                break;
            }
            sb.append(c);
        }
        if (plus) {
            while (email.charAt(i) != '@') {
                i++;
            }
        }
        sb.append(email.substring(i, email.length()));
        return sb.toString();
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            uniqueEmails.add(getEmail(email));
        }
        // for (String i : uniqueEmails) {
        //     System.out.println(i);
        // }
        return uniqueEmails.size();
    }
}

// Efficient approach, 5 ms, beats 100%
class Solution {
    public String getEmail(String email) {
        StringBuilder sb = new StringBuilder();
        int sep = email.indexOf('@');
        for (int i=0; i<sep; i++) {
            char c = email.charAt(i);
            if (c == '.') {
                continue;
            } else if (c == '+') {
                break;
            }
            sb.append(c);
        }
        sb.append(email.substring(sep, email.length()));
        return sb.toString();
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            uniqueEmails.add(getEmail(email));
        }
        return uniqueEmails.size();
    }
}
