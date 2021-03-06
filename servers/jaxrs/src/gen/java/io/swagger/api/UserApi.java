package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.Transaction;
import io.swagger.model.UserCommission;
import io.swagger.model.AccessToken;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/user")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your user model.", notes = "", response = User.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })

    public Response userGetMe()
    throws NotFoundException {
        return delegate.userGetMe();
    }
    @PUT
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Update your password, name, and other attributes.", notes = "", response = User.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })

    public Response userUpdateMe(@ApiParam(value = "")@FormParam("firstname")  String firstname,
    @ApiParam(value = "")@FormParam("lastname")  String lastname,
    @ApiParam(value = "")@FormParam("oldPassword")  String oldPassword,
    @ApiParam(value = "")@FormParam("newPassword")  String newPassword,
    @ApiParam(value = "")@FormParam("newPasswordConfirm")  String newPasswordConfirm,
    @ApiParam(value = "Country of residence.")@FormParam("country")  String country,
    @ApiParam(value = "PGP Public Key. If specified, automated emails will be sentwith this key.")@FormParam("pgpPubKey")  String pgpPubKey)
    throws NotFoundException {
        return delegate.userUpdateMe(firstname,lastname,oldPassword,newPassword,newPasswordConfirm,country,pgpPubKey);
    }
    @POST
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Register a new user.", notes = "", response = User.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })

    public Response userNewUser(@ApiParam(value = "Your email address.", required=true)@FormParam("email")  String email,
    @ApiParam(value = "Your password.", required=true)@FormParam("password")  String password,
    @ApiParam(value = "Desired username.", required=true)@FormParam("username")  String username,
    @ApiParam(value = "First name.")@FormParam("firstname")  String firstname,
    @ApiParam(value = "Last name.")@FormParam("lastname")  String lastname,
    @ApiParam(value = "Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).")@FormParam("acceptsTOS")  String acceptsTOS,
    @ApiParam(value = "Optional Referrer ID.")@FormParam("referrerID")  String referrerID,
    @ApiParam(value = "Country of residence.")@FormParam("country")  String country)
    throws NotFoundException {
        return delegate.userNewUser(email,password,username,firstname,lastname,acceptsTOS,referrerID,country);
    }
    @GET
    @Path("/affiliateStatus")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your current affiliate/referral status.", notes = "", response = Affiliate.class, responseContainer = "List", tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Affiliate.class, responseContainer = "List") })

    public Response userGetAffiliateStatus()
    throws NotFoundException {
        return delegate.userGetAffiliateStatus();
    }
    @POST
    @Path("/cancelWithdrawal")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Cancel a withdrawal.", notes = "", response = Transaction.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })

    public Response userCancelWithdrawal(@ApiParam(value = "", required=true)@FormParam("token")  String token)
    throws NotFoundException {
        return delegate.userCancelWithdrawal(token);
    }
    @GET
    @Path("/checkReferralCode")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Check if a referral code is valid.", notes = "If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.", response = Double.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Double.class) })

    public Response userCheckReferralCode(@ApiParam(value = "") @QueryParam("referralCode") String referralCode)
    throws NotFoundException {
        return delegate.userCheckReferralCode(referralCode);
    }
    @GET
    @Path("/commission")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your account's commission status.", notes = "", response = UserCommission.class, responseContainer = "List", tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = UserCommission.class, responseContainer = "List") })

    public Response userGetCommission()
    throws NotFoundException {
        return delegate.userGetCommission();
    }
    @POST
    @Path("/confirmEmail")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm your email address with a token.", notes = "", response = AccessToken.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = AccessToken.class) })

    public Response userConfirmEmail(@ApiParam(value = "", required=true)@FormParam("token")  String token)
    throws NotFoundException {
        return delegate.userConfirmEmail(token);
    }
    @POST
    @Path("/confirmEnableTFA")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.", notes = "", response = Boolean.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })

    public Response userConfirmEnableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true)@FormParam("token")  String token,
    @ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'")@FormParam("type")  String type)
    throws NotFoundException {
        return delegate.userConfirmEnableTFA(token,type);
    }
    @POST
    @Path("/confirmPasswordReset")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm a password reset.", notes = "", response = Boolean.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })

    public Response userConfirmPasswordReset(@ApiParam(value = "", required=true)@FormParam("token")  String token,
    @ApiParam(value = "", required=true)@FormParam("newPassword")  String newPassword)
    throws NotFoundException {
        return delegate.userConfirmPasswordReset(token,newPassword);
    }
    @POST
    @Path("/confirmWithdrawal")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm a withdrawal.", notes = "", response = Transaction.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })

    public Response userConfirmWithdrawal(@ApiParam(value = "", required=true)@FormParam("token")  String token)
    throws NotFoundException {
        return delegate.userConfirmWithdrawal(token);
    }
    @GET
    @Path("/depositAddress")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get a deposit address.", notes = "", response = String.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = String.class) })

    public Response userGetDepositAddress(@ApiParam(value = "", defaultValue="XBt") @QueryParam("currency") String currency)
    throws NotFoundException {
        return delegate.userGetDepositAddress(currency);
    }
    @POST
    @Path("/disableTFA")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Disable two-factor auth for this account.", notes = "", response = Boolean.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })

    public Response userDisableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true)@FormParam("token")  String token,
    @ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)")@FormParam("type")  String type)
    throws NotFoundException {
        return delegate.userDisableTFA(token,type);
    }
    @POST
    @Path("/login")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Log in to BitMEX.", notes = "", response = AccessToken.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = AccessToken.class) })

    public Response userLogin(@ApiParam(value = "Your email address.", required=true)@FormParam("email")  String email,
    @ApiParam(value = "Your password.", required=true)@FormParam("password")  String password,
    @ApiParam(value = "OTP Token (YubiKey, Google Authenticator)")@FormParam("token")  String token)
    throws NotFoundException {
        return delegate.userLogin(email,password,token);
    }
    @POST
    @Path("/logout")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Log out of BitMEX.", notes = "", response = Void.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Request was successful", response = Void.class) })

    public Response userLogout()
    throws NotFoundException {
        return delegate.userLogout();
    }
    @POST
    @Path("/logoutAll")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.", notes = "", response = Void.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Request was successful", response = Void.class) })

    public Response userLogoutAll()
    throws NotFoundException {
        return delegate.userLogoutAll();
    }
    @GET
    @Path("/margin")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your account's margin status.", notes = "", response = Margin.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Margin.class) })

    public Response userGetMargin()
    throws NotFoundException {
        return delegate.userGetMargin();
    }
    @POST
    @Path("/preferences")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Save application preferences.", notes = "", response = User.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })

    public Response userSavePreferences(@ApiParam(value = "", required=true)@FormParam("prefs")  String prefs,
    @ApiParam(value = "If true, will overwrite all existing preferences.", defaultValue="false")@FormParam("overwrite")  Boolean overwrite)
    throws NotFoundException {
        return delegate.userSavePreferences(prefs,overwrite);
    }
    @POST
    @Path("/requestEnableTFA")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.", notes = "", response = Boolean.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })

    public Response userRequestEnableTFA(@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)")@FormParam("type")  String type,
    @ApiParam(value = "If Yubikey, send one output from the key.")@FormParam("token")  String token)
    throws NotFoundException {
        return delegate.userRequestEnableTFA(type,token);
    }
    @POST
    @Path("/requestPasswordReset")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Request a password reset.", notes = "", response = Boolean.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })

    public Response userRequestPasswordReset(@ApiParam(value = "", required=true)@FormParam("email")  String email)
    throws NotFoundException {
        return delegate.userRequestPasswordReset(email);
    }
    @POST
    @Path("/requestWithdrawal")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Request a withdrawal to an external wallet.", notes = "This will send a confirmation email to the email address on record, unless requested via an API Key with the \"withdraw\" permission.", response = Transaction.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })

    public Response userRequestWithdrawal(@ApiParam(value = "Currency you're withdrawing. Options: \"XBt\"", required=true, defaultValue="XBt")@FormParam("currency")  String currency,
    @ApiParam(value = "Amount of withdrawal currency.", required=true)@FormParam("amount")  BigDecimal amount,
    @ApiParam(value = "Destination Address.", required=true)@FormParam("address")  String address,
    @ApiParam(value = "2FA token. Required if 2FA is enabled on your account.")@FormParam("otpToken")  String otpToken,
    @ApiParam(value = "Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.")@FormParam("fee")  Double fee)
    throws NotFoundException {
        return delegate.userRequestWithdrawal(currency,amount,address,otpToken,fee);
    }
    @GET
    @Path("/resendVerificationEmail")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Re-send verification email.", notes = "", response = Boolean.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })

    public Response userSendVerificationEmail(@ApiParam(value = "",required=true) @QueryParam("email") String email)
    throws NotFoundException {
        return delegate.userSendVerificationEmail(email);
    }
    @GET
    @Path("/walletHistory")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get a history of all of your wallet transactions (deposits and withdrawals).", notes = "", response = Transaction.class, responseContainer = "List", tags={ "User" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class, responseContainer = "List") })

    public Response userGetWalletHistory()
    throws NotFoundException {
        return delegate.userGetWalletHistory();
    }
}

