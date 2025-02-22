package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.User;
import java.util.*;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/v2/user")


@io.swagger.annotations.Api(value = "/user", description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T18:51:39.623-08:00")
public class UserApi  {

   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    public Response createUser(@ApiParam(value = "Created user object" ) User body)
    throws NotFoundException {
        return delegate.createUser(body);
    }
    @POST
    @Path("/createWithArray")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    public Response createUsersWithArrayInput(@ApiParam(value = "List of user object" ) List<User> body)
    throws NotFoundException {
        return delegate.createUsersWithArrayInput(body);
    }
    @POST
    @Path("/createWithList")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    public Response createUsersWithListInput(@ApiParam(value = "List of user object" ) List<User> body)
    throws NotFoundException {
        return delegate.createUsersWithListInput(body);
    }
    @GET
    @Path("/login")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Logs user into the system", notes = "", response = String.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = String.class) })

    public Response loginUser(@ApiParam(value = "The user name for login") @QueryParam("username") String username,
    @ApiParam(value = "The password for login in clear text") @QueryParam("password") String password)
    throws NotFoundException {
        return delegate.loginUser(username,password);
    }
    @GET
    @Path("/logout")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    public Response logoutUser()
    throws NotFoundException {
        return delegate.logoutUser();
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get user by user name", notes = "", response = User.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = User.class) })

    public Response getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true) @PathParam("username") String username)
    throws NotFoundException {
        return delegate.getUserByName(username);
    }
    @PUT
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })

    public Response updateUser(@ApiParam(value = "name that need to be deleted",required=true) @PathParam("username") String username,
    @ApiParam(value = "Updated user object" ) User body)
    throws NotFoundException {
        return delegate.updateUser(username,body);
    }
    @DELETE
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })

    public Response deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathParam("username") String username)
    throws NotFoundException {
        return delegate.deleteUser(username);
    }
}

