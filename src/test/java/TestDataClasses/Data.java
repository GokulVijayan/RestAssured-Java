package TestDataClasses;

public class Data
{
   private User user;

   private String accessToken;

   private String refreshToken;

   public void setUser(User user){
       this.user = user;
   }
   public User getUser(){
       return this.user;
   }
   public void setAccessToken(String accessToken){
       this.accessToken = accessToken;
   }
   public String getAccessToken(){
       return this.accessToken;
   }
   public void setRefreshToken(String refreshToken){
       this.refreshToken = refreshToken;
   }
   public String getRefreshToken(){
       return this.refreshToken;
   }
}