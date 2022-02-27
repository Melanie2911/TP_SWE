package fr.tpgroupe20.classes.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "baeldung-realm.json";
    AdminUser adminUser = new AdminUser();

    public String getContextPath() {

        return contextPath;
    }

    public AdminUser getAdminUser() {

        return adminUser;
    }

    public String getRealmImportFile() {

        return realmImportFile;
    }

    // getters and setters


    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public void setAdminUser(AdminUser adminUser) {
        this.adminUser = adminUser;
    }

    public void setRealmImportFile(String realmImportFile) {
        this.realmImportFile = realmImportFile;
    }

    public static class AdminUser {
        String username = "admin";
        String password = "admin";

        public String getUsername() {

            return username;
        }

        public String getPassword() {

            return password;
        }

        // getters and setters

        public void setPassword(String password) {
            this.password = password;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
