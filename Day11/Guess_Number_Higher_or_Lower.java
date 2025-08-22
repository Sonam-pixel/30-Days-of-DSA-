package Day11;

class Guess_Number_Higher_or_Lower {
    private int pick;  

    public  Guess_Number_Higher_or_Lower(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        if (num == pick) return 0;
        else if (num > pick) return -1;
        else return 1;
    }
}

class Solution extends  Guess_Number_Higher_or_Lower {
    public Solution(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) return mid;       
            else if (res == -1) right = mid - 1; 
            else left = mid + 1;               
        }
        return -1; 
    }

    public static void main(String[] args) {
    int n = 100;     
    int pick = 73;    

    Solution game = new Solution(pick);
    System.out.println("Picked number: " + game.guessNumber(n));
    }
}



