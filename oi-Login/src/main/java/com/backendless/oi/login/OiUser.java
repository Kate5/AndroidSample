package com.backendless.oi.login;

import com.backendless.BackendlessUser;

public class OiUser extends BackendlessUser
{
  public String getEmail()
  {
    return super.getEmail();
  }

  public void setEmail( String email )
  {
    super.setEmail( email );
  }

  public String getPassword()
  {
    return super.getPassword();
  }

  public String getAuthData()
  {
    return (String) super.getProperty( "authData" );
  }

  public void setAuthData( String authData )
  {
    super.setProperty( "authData", authData );
  }

  public String getDisplayName()
  {
    return (String) super.getProperty( "displayName" );
  }

  public void setDisplayName( String displayName )
  {
    super.setProperty( "displayName", displayName );
  }

  public String getFacebookId()
  {
    return (String) super.getProperty( "facebookId" );
  }

  public void setFacebookId( String facebookId )
  {
    super.setProperty( "facebookId", facebookId );
  }

  public String getName()
  {
    return (String) super.getProperty( "name" );
  }

  public void setName( String name )
  {
    super.setProperty( "name", name );
  }

  public String getProfilePictureMedium()
  {
    return (String) super.getProperty( "profilePictureMedium" );
  }

  public void setProfilePictureMedium( String profilePictureMedium )
  {
    super.setProperty( "profilePictureMedium", profilePictureMedium );
  }

  public String getProfilePictureSmall()
  {
    return (String) super.getProperty( "profilePictureSmall" );
  }

  public void setProfilePictureSmall( String profilePictureSmall )
  {
    super.setProperty( "profilePictureSmall", profilePictureSmall );
  }

  public String getUsername()
  {
    return (String) super.getProperty( "username" );
  }

  public void setUsername( String username )
  {
    super.setProperty( "username", username );
  }
}