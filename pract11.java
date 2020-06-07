class Main {
  public static void main(String[] args) {
    System.out.print("Zadanie 1\n");
    int z1 = 8;
    int[][] f =new int[z1][z1];
    for(int i = 0;i < 8;i++)
    { 
      for(int j = 0;j < 8;j++)
      { 
        if((i + j) % 2 == 0)
        {
          f[i][j] = 1;
        }
        else f[i][j] = 0;
      }
    }
    for (int i = 0;i < f.length;i++,System.out.println())
    {
      for (int j = 0;j < f[i].length;j++)
      {
        System.out.print(f[i][j]+"\t");
      }
    }
    System.out.print("Zadanie 2\n");
    int z2=10;
    int[][] a=new int[z2][z2];
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
       a[i][j]=(int)(Math.round(Math.random()*100) + 0);
      }
    }
    for (int i=0;i < a.length;i++,System.out.println())
    {
      for (int j=0;j < a[i].length;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
    }
    System.out.print("Zadanie 3");
    int z3=0;
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
        z3=z3+a[i][j];
      }
      System.out.print("\nSumma " + (i+1) + " stroki: " + z3);
      z3=0;
    }
    System.out.print("\nZadanie 4\nProstie 4isla: \n");
    int[] z4=new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
    for (int i=0;i < a.length;i++,System.out.println())
    {
      System.out.print("Stroka"+(i+1)+": ");
      for (int j=0;j < a[i].length;j++)
      {
        for (int g=0;g < z4.length;g++)
        {
        if (a[i][j]==z4[g])
        System.out.print(a[i][j]+"; ");
        }
      }
    }
  }
}