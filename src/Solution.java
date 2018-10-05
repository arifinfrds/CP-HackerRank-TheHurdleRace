public class Solution {

  // Complete the hurdleRace function below.
  static int hurdleRace(int k, int[] height) {
    int doze = 0;

    int highestHeight = height[0];
    for (int i = 0; i < height.length - 1; i++) {
      if (highestHeight < height[i + 1]) {
        highestHeight = height[i + 1];
      }
    }

    if (k > highestHeight) {
      return doze;
    }

    int difference = Math.abs(highestHeight - k);
    if (difference == 0) {
      return doze;
    }

    doze = difference;
    return doze;
  }
}
