public class loginType {
  public boolean admin;

  public loginType(boolean admin)
  {
      this.admin = admin;
  }
  public void getFeaturesCar()
  {
      if(admin)
      {
          System.out.println("Tüm araçlar listelendi");
      }
      else {
          System.out.println("Hatchback listelendi");
      }

  }

}
