public static int diagonalDifference(List<List<Integer>> arr) {
  // Write your code here
  int leftd = 0;
  int rightd = 0;

  for(int i = 0; i < arr.size(); i++){
    leftd += arr.get(i).get(i);
    rightd += arr.get(arr.size()-1-i).get(i);
  }

  int diag = Math.abs(leftd - rightd);
  return diag;

}
