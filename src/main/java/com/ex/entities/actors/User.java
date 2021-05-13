package com.ex.entities.actors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/**
 * @author IonToncu
 */
abstract class User implements UserDetails {

    private String username;
    protected String role;
    private String password;
    public User(){

    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



    public void setPassword(String password) {
        this.password = password;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Role> roles=new HashSet<>();
        roles.add(new Role("DESIGNER"));
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }



}
