class Solution {
    public int[] reverseArray(int[] a) {
        int j = a.length-1, temp = 0;
        for (int i=0; i<a.length/2; i++) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
        return a;
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i=0; i<n; i++) {
            image[i] = reverseArray(image[i]);
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}

// More optimized
class Solution {
    public int[] reverseArray(int[] a) {
        int j = a.length-1, temp = 0;
        for (int i=0; i<a.length/2; i++) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
        return a;
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i=0; i<n; i++) {
            image[i] = reverseArray(image[i]);
            for (int j=0; j<n; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
