// brute-force
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> folders = new ArrayList<>();

        Arrays.sort(folder);

        for (int i=0; i<folder.length; i++) {
            String currFolder = folder[i];

            if (currFolder != "") {
                folders.add(currFolder);

                for (int j=i+1; j<folder.length; j++) {
                    String thisFolder = folder[j];

                    if (thisFolder != "" && folder[j].startsWith(currFolder) && thisFolder.charAt(currFolder.length()) == '/') {
                        folder[j] = "";
                    }
                }
            }
        }
        
        return folders;
    }
}
