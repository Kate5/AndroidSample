package com.backendless.oi.login;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class RegisterActivity extends Activity
{
  private final static java.text.SimpleDateFormat SIMPLE_DATE_FORMAT = new java.text.SimpleDateFormat( "yyyy/MM/dd" );

  private EditText authDataField;
  private EditText displayNameField;
  private EditText emailField;
  private EditText facebookIdField;
  private EditText nameField;
  private EditText passwordField;
  private EditText profilePictureMediumField;
  private EditText profilePictureSmallField;
  private EditText usernameField;

  private Button registerButton;

  private String authData;
  private String displayName;
  private String email;
  private String facebookId;
  private String name;
  private String password;
  private String profilePictureMedium;
  private String profilePictureSmall;
  private String username;

  private OiUser user;

  public void onCreate( Bundle savedInstanceState )
  {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.register );

    initUI();
  }

  private void initUI()
  {authDataField = (EditText) findViewById( R.id.authDataField );displayNameField = (EditText) findViewById( R.id.displayNameField );emailField = (EditText) findViewById( R.id.emailField );facebookIdField = (EditText) findViewById( R.id.facebookIdField );nameField = (EditText) findViewById( R.id.nameField );passwordField = (EditText) findViewById( R.id.passwordField );profilePictureMediumField = (EditText) findViewById( R.id.profilePictureMediumField );profilePictureSmallField = (EditText) findViewById( R.id.profilePictureSmallField );usernameField = (EditText) findViewById( R.id.usernameField );

    registerButton = (Button) findViewById( R.id.registerButton );

    registerButton.setOnClickListener( new View.OnClickListener()
    {
      @Override
      public void onClick( View view )
      {
        onRegisterButtonClicked();
      }
    } );
  }

  private void onRegisterButtonClicked()
  {
    String authDataText = authDataField.getText().toString().trim();
    String displayNameText = displayNameField.getText().toString().trim();
    String emailText = emailField.getText().toString().trim();
    String facebookIdText = facebookIdField.getText().toString().trim();
    String nameText = nameField.getText().toString().trim();
    String passwordText = passwordField.getText().toString().trim();
    String profilePictureMediumText = profilePictureMediumField.getText().toString().trim();
    String profilePictureSmallText = profilePictureSmallField.getText().toString().trim();
    String usernameText = usernameField.getText().toString().trim();

    if ( emailText.isEmpty() )
    {
      showToast( "Field 'email' cannot be empty." );
      return;
    }

    if ( passwordText.isEmpty() )
    {
      showToast( "Field 'password' cannot be empty." );
      return;
    }

    if( !authDataText.isEmpty() )
    {
      authData = authDataText;
    }

    if( !displayNameText.isEmpty() )
    {
      displayName = displayNameText;
    }

    if( !emailText.isEmpty() )
    {
      email = emailText;
    }

    if( !facebookIdText.isEmpty() )
    {
      facebookId = facebookIdText;
    }

    if( !nameText.isEmpty() )
    {
      name = nameText;
    }

    if( !passwordText.isEmpty() )
    {
      password = passwordText;
    }

    if( !profilePictureMediumText.isEmpty() )
    {
      profilePictureMedium = profilePictureMediumText;
    }

    if( !profilePictureSmallText.isEmpty() )
    {
      profilePictureSmall = profilePictureSmallText;
    }

    if( !usernameText.isEmpty() )
    {
      username = usernameText;
    }

    user = new OiUser();

    if( authData != null )
    {
      user.setAuthData( authData );
    }

    if( displayName != null )
    {
      user.setDisplayName( displayName );
    }

    if( email != null )
    {
      user.setEmail( email );
    }

    if( facebookId != null )
    {
      user.setFacebookId( facebookId );
    }

    if( name != null )
    {
      user.setName( name );
    }

    if( password != null )
    {
      user.setPassword( password );
    }

    if( profilePictureMedium != null )
    {
      user.setProfilePictureMedium( profilePictureMedium );
    }

    if( profilePictureSmall != null )
    {
      user.setProfilePictureSmall( profilePictureSmall );
    }

    if( username != null )
    {
      user.setUsername( username );
    }

    Backendless.UserService.register( user, new DefaultCallback<BackendlessUser>( RegisterActivity.this )
    {
      @Override
      public void handleResponse( BackendlessUser response )
      {
        super.handleResponse( response );
        startActivity( new Intent( RegisterActivity.this, RegistrationSuccessActivity.class ) );
        finish();
      }
    } );
  }

  private void showToast( String msg )
  {
    Toast.makeText( this, msg, Toast.LENGTH_SHORT ).show();
  }
}