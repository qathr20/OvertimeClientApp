package id.co.mii.overtimeclientapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;

import id.co.mii.overtimeclientapp.models.Role;
import id.co.mii.overtimeclientapp.models.User;
import id.co.mii.overtimeclientapp.models.dto.requests.UserRequest;



public class UserService {

    private RestTemplate restTemplate;

    @Autowired
    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${server.baseUrl}/user")
    private String url;

    public List<User> getAll() {
        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() {
                }).getBody();
    }

    public User getById(int id) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User create(UserRequest userRequest) {
        return restTemplate.exchange(
                url,
                HttpMethod.POST,
                new HttpEntity(userRequest),
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User update(int id, User user) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.PUT,
                new HttpEntity(user),
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User delete(int id) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User addRole(int id, Role role) {
        return restTemplate.exchange(
                url + "/add/" + id,
                HttpMethod.POST,
                new HttpEntity(role),
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }

    public User removeRole(int id, Role role) {
        return restTemplate.exchange(
                url + "/remove/" + id,
                HttpMethod.POST,
                new HttpEntity(role),
                new ParameterizedTypeReference<User>() {
                }).getBody();
    }
    
}
