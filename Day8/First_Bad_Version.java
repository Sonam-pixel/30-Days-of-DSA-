package Day8;

class VersionControl {
    private int bad;

    public VersionControl(int bad) {
        this.bad = bad;
    }

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class First_Bad_Version extends VersionControl {

    public First_Bad_Version(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; 
            if (isBadVersion(mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int n = 10;
        int bad = 6; 
        First_Bad_Version obj = new First_Bad_Version(bad);

        System.out.println("First Bad Version: " + obj.firstBadVersion(n));
    }
}
