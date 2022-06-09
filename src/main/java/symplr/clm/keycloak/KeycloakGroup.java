package symplr.clm.keycloak;

import java.util.List;
import java.util.Map;

import com.tm.keycloak.KeycloakHelper;

public class KeycloakGroup {
	public static Object export() {

		try {
			// ESTANCIATE HELPER CLASS WITH Keycloak Host, REALM, ACCOUNT AND SECRET
			// RESPECTIVELY)
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");

			/**
			 * EXPORT GROUPS EXAMPLE (currently only exports 1st tier groups needs to be
			 * modified)
			 */
			System.out.println("export group");
			// List<Map<String, Object>> export = uh.exportGroups();
			// System.out.println(export);
			List<Map<String, Object>> export = uh.exportSubGroups("customers");
			System.out.println(export);
			return export;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String createKeycloakGroup(String groupName) {

		try {

			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");

			// Map<String,Object> createGroup = uh.createGroup(groupName);
			Map<String, Object> createGroup = uh.createGroup(groupName, "customers");
			System.out.println(createGroup);
			return (String) createGroup.get("result");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String clearIdentityProvierbyEmail(String userName) {
		try {
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			Map<String, Object>  response =uh.clearUserIdentityProviders(userName);
			System.out.println(response);
			return (String) response.get("result");
		} catch (Exception e) {
			return null;
		}
	}

	public static String purgeProviderByGroup(String groupName) {
		try {
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			List<Map<String, Object>>  response =uh.purgeInvalidUserIdentityProviderByGroup(groupName);
			System.out.println(response);
			return  (String)response.get(0).get("result");
		} catch (Exception e) {
			return null;
		}
	}
	public static Object clearCredentials(String userName) {
		try {
			
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			
			List<Map<String, Object>>  response =uh.clearUsersCredentials(userName);
			
			System.out.println(response);
			return  response;
		} catch (Exception e) {
			return null;
		}
	}

	
	public static Object removeUser(String groupName,String userName) {
		try {
			
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			
			Map<String, Object> response =uh.removeUserFromGroup(groupName, userName);
			
			System.out.println(response);
			return  response;
		} catch (Exception e) {
			return null;
		}
	}
	public static Object addUser(String groupName,String userName) {
		try {
			
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			
			Map<String, Object> response =uh.addUserToGroup(groupName, userName);
			
			System.out.println(response);
			return  response;
		} catch (Exception e) {
			return null;
		}
	}
	public static Object createUser(String email,String fullName) {
		try {
			
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			
			Map<String, Object> response =uh.createUser(email, fullName);
			
			System.out.println(response);
			return  response;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Object createUserAndAssignGroup(String email,String fullName,String groupName) {
		try {
			
			KeycloakHelper uh = new KeycloakHelper("https://sso.tractsoft.io/auth", "tractmanager-dev", "mule-connect",
					"c23c9eea-83e7-4abc-96b9-1f04b2d7a711");
			
			Map<String, Object> response =uh.createUser(email, fullName);
			Map<String, Object> response2 =uh.addUserToGroup(groupName, email);
			
			System.out.println(response);
			System.out.println(response2);
			return  response;
		} catch (Exception e) {
			return null;
		}
	}
}
